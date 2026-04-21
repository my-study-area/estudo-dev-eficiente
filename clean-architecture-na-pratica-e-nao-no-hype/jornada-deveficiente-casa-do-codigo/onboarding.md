# Onboarding - Projeto Casa do Código

## Visão Geral do Projeto
O projeto **Casa do Código v2** é uma API REST para um e-commerce de livros. O objetivo principal é permitir o cadastro de autores, categorias, livros, cupons e gerenciar o fluxo de fechamento de compra (checkout).

### Tecnologias Utilizadas
- **Java 11**
- **Spring Boot 2.3.1.RELEASE** (Web, Data JPA, Validation)
- **Banco de Dados**: H2 Database (em memória, ideal para testes rápidos)
- **Testes**: JUnit 5, Jacoco e Jqwik (Property-Based Testing)

## Arquitetura e Padrões
Ao navegar pelo projeto, você notará que ele **não segue a estrutura tradicional de camadas técnicas** (onde teríamos pacotes como `controller`, `service`, `repository`). 

Em vez disso, ele utiliza um padrão focado em **Package by Feature** (Pacotes por Funcionalidade), uma abordagem muito presente no **CDD (Cognitive Driven Development)** promovido na *Jornada Dev Eficiente*. 

Cada funcionalidade da aplicação está encapsulada e isolada em seu próprio pacote, por exemplo:
- `novoautor`: Controladores, Entidades e DTOs para o cadastro de autores.
- `cadastrocategoria`: Tudo relacionado à criação de categorias.
- `cadastrolivro`: Regras e fluxos de criação de novos livros (associando a autores e categorias).
- `fechamentocompra`: O núcleo transacional (checkout), com validações complexas.

Os validadores genéricos e globais da aplicação (como as anotações customizadas do Bean Validation: `@UniqueValue`, `@ExistsId`, `@Documento`) e o manipulador de exceções (`ValidationErrorHandler`) ficam centralizados no pacote `compartilhado`.

## Modelo de Domínio (DDD)
Abaixo está um diagrama de classes simplificado contendo as principais entidades (Aggregates) identificadas e como elas se relacionam.

```mermaid
classDiagram
    class Autor {
        +String nome
        +String email
        +String descricao
        +LocalDateTime instanteCriacao
    }
    class Categoria {
        +String nome
    }
    class Livro {
        +String titulo
        +String resumo
        +BigDecimal preco
        +int numeroPaginas
        +String isbn
        +Autor autor
        +Categoria categoria
    }
    class Compra {
        +String email
        +String nome
        +String documento
        +String endereco
        +Pedido pedido
        +CupomAplicado cupomAplicado
    }
    class Pedido {
        +Compra compra
        +List~ItemPedido~ itens
    }
    class Cupom {
        +String codigo
        +BigDecimal percentualDesconto
        +LocalDate validade
    }
    
    Livro --> Autor : "escrito por"
    Livro --> Categoria : "pertence à"
    Compra --> Pedido : "gera um"
    Compra --> Cupom : "pode aplicar"
```

## Fluxo de Fechamento de Compra
Para exemplificar a interação das classes dentro de um pacote (funcionalidade), elaboramos o diagrama de sequência do principal fluxo de negócio do sistema: o fechamento da compra.

Nesta arquitetura, geralmente o DTO de requisição (Request) contém um método `toModel` (ou similar) que converte diretamente a requisição para a Entidade, injetando as dependências necessárias, como o `EntityManager` ou `Repository`, eliminando a necessidade de classes `@Service` intermediárias para fluxos simples de CRUD.

```mermaid
sequenceDiagram
    participant Cliente as Cliente (App/Web)
    participant Controller as FechaCompraParte1Controller
    participant Validator as Bean Validation (Custom Validators)
    participant RequestDTO as NovaCompraRequest
    participant EntityManager as EntityManager (JPA)
    participant Database as H2 DB
    
    Cliente->>Controller: POST /api/compras (JSON)
    Controller->>Validator: Valida DTO (@Valid)
    
    Note over Validator: Valida Documentos, @ExistsId (País/Estado)<br/>e regras do CupomValidoValidator
    
    alt Validação Falha
        Validator-->>Cliente: 400 Bad Request (ValidationErrorHandler intercepta)
    else Validação Ok
        Controller->>RequestDTO: toModel(EntityManager, CupomRepository)
        Note over RequestDTO: Busca no BD as instâncias de País,<br/>Estado, Livros e Cupom informados
        RequestDTO-->>Controller: Entidade 'Compra' instanciada
        Controller->>EntityManager: persist(compra)
        EntityManager->>Database: INSERT na tabela de compras, pedidos e itens
        Controller-->>Cliente: 200 OK (idCompra)
    end
```

## Como Rodar Localmente
1. **Pré-requisitos**: Ter a versão correta do Java instalada (no caso, o Maven solicitará compatibilidade com Java 11).
2. Pelo terminal, na raiz do projeto, você pode subir a aplicação utilizando o Maven Wrapper que já vem embutido:
   ```bash
   ./mvnw spring-boot:run
   ```
3. A aplicação estará disponível na porta padrão do Spring Boot.
4. **Banco de Dados**: Sendo o banco `H2`, a cada restart da aplicação, a base é limpa. Isso facilita muito os testes isolados e desenvolvimento rápido.

**Links de Acesso Rápido**
- **API Base**: [http://localhost:8080/](http://localhost:8080/)
*(O projeto atualmente não exige dependências de infraestrutura, como o Docker, pois o banco de dados H2 roda embutido na aplicação na memória.)*
