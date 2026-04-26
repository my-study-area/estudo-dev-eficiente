# Clean Architecture na prática e não no Hype
Curso focado em explorar as ideias compartilhadas pela arquitetura limpa e arquiteturas em camadas no geral. Vamos ser bem pragmáticos, tratar este estilo arquitetural como mais uma opção no seu cinto de ferramentas.


## Outros assuntos discutidos nas aulas
- O que é uma Invariante?
De forma simples, uma invariante é uma condição ou regra que deve ser **sempre verdadeira** durante a execução de um programa (ou de uma parte específica dele). Pense nela como uma "lei absoluta" que o seu código não pode quebrar.

- Por que isso é importante?    
Imagine que você está criando um sistema para um banco. Uma regra (invariante) seria: "O saldo de uma conta nunca pode ser negativo". Se o seu código permitir um saldo de -R$ 50,00, a invariante foi quebrada e o sistema está em um estado inválido (bug).

- O que é a Indireção na Prática?
Em vez de o seu código de negócio chamar diretamente uma ferramenta (como um serviço de envio de e-mails ou um banco de dados específico), você insere um intermediário (geralmente uma Interface ou uma classe abstrata).

Sem Indireção: FluxoNegocio —> BibliotecaEmailEspecifica (Acoplamento forte).

Com Indireção: FluxoNegocio —> InterfaceEnvioEmail <— ImplementacaoConcreta (Acoplamento fraco).



## Por que eu criei um módulo de arquitetura em camadas?
Página do Bob Martin usado como referência durante o curso: https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html


## O que é arquitetura em camadas e o que esperamos de resultados
- o autor dá exemplos de usos de frameworks e bibliotecas que são iniciais ou ainda não estão definidas. Neste cenário a arquitetura em camada pode isolar por meio de contratos (interfaces) e não "amarrarmos" (acomplarmos) essas bilioteca/frameworks. Desde que o contrato seja seguido, evitamos que as mudanças afetem o design do nosso código e caso seja necessário podemos alterar adiconar novas implementações das atualizações ou novas dependências.

Este resumo sintetiza os pontos principais da aula sobre **Arquitetura em Camadas**, focando nas motivações, na filosofia de "indireção" e nos resultados esperados ao aplicar esse padrão.


**O Conceito Central: Indireção e Proteção**    
A arquitetura em camadas é vista como a inserção de **indireções** (camadas intermediárias) no código. O objetivo não é apenas organizar, mas sim:
* **Proteger o Domínio:** Isolar a regra de negócio de partes instáveis ou externas (bancos de dados, frameworks, bibliotecas).
* **Postergar Decisões:** Permitir que o desenvolvimento comece mesmo sem ter decidido qual serviço de e-mail ou banco de dados será usado, utilizando interfaces e implementações "fake".
* **Estabilidade:** Criar uma interface pública estável para o seu negócio, de modo que mudanças em ferramentas de terceiros não gerem um efeito cascata de alterações no seu software.


**Conclusão e Provocação**    
O instrutor ressalta que a arquitetura deve **suportar os interesses do negócio**. No exemplo prático demonstrado, o código apresentado é funcional e atende ao negócio, mas falha em seguir estritamente os resultados da "Arquitetura Limpa" por estar acoplado ao Spring e JPA. A reflexão final é sobre o equilíbrio entre seguir princípios puristas e a velocidade/necessidade da entrega.



## Princípios importantes de uma arquitetura em camadas
**A Regra da Dependência (Dependency Rule)**    
Este é o princípio visual da Clean Architecture: as dependências devem apontar sempre para dentro.

- Camadas Externas: Podem conhecer e usar tudo o que está nas internas. (Ex: O Controller pode usar a Entidade).
- Camadas Internas: Nunca podem mencionar algo que está nas camadas externas. A Entidade ou o Caso de Uso não devem saber que existe um banco de dados MySQL ou uma API REST.



## Dando nome as camadas pela Clean Arch
Nesta aula, o foco é traduzir os conceitos teóricos da **Clean Architecture** para nomes e responsabilidades reais no código, utilizando o famoso diagrama de círculos de Robert Martin como guia, mas mantendo o pragmatismo.


| Camada | O que é? | Exemplo no código |
| :--- | :--- | :--- |
| **Entities** | Regras de Negócio Globais | Classe `Compra`, `Usuario` |
| **Use Cases** | Regras de Negócio da Aplicação | Classe `RegistrarNovaCompra` |
| **Interface Adapters** | Tradutores | `CompraController`, `CompraRequest` |
| **Frameworks/Drivers** | Ferramentas | Banco de Dados, Spring Boot, Filas |


**Ponto de Atenção: O Objeto a seu Favor**    
O instrutor encerra com uma dica valiosa: **Não crie Casos de Uso vazios.** Se a lógica pode ser resolvida dentro da Entidade (como validar um cupom), faça lá. O Caso de Uso serve para orquestrar o que a Entidade sozinha não consegue (como persistência e notificações).



## Continue fugindo de classes anêmicas
- referência da aula: https://martinfowler.com/bliki/AnemicDomainModel.html

Esta aula é um manifesto contra o **Modelo de Domínio Anêmico** (*Anemic Domain Model*), um antipadrão onde as entidades são apenas sacos de dados (getters e setters) e toda a lógica de negócio é jogada para camadas de "Serviço" ou "Casos de Uso".


**O que é uma Classe Anêmica?**    
É uma classe que tem os dados, mas não tem o comportamento. No exemplo da aula, se a classe `Compra` tivesse apenas um `setCupom(cupom)`, ela seria anêmica. A lógica de validade do cupom e a regra de "não permitir dois cupons" acabaria indo para uma classe externa (ex: `AplicaCupomUseCase`).

**Por que isso é ruim?**
* **Lógica Espalhada:** Você precisa abrir dois ou três arquivos para entender uma única regra de negócio.
* **Falta de Encapsulamento:** Se o método `setCupom` é público e não tem validação, qualquer parte do sistema pode corromper o estado da compra (ex: aplicar um cupom inválido por erro).
* **Duplicação de Código:** Você acaba checando a mesma regra no Caso de Uso e, às vezes, na Entidade para garantir, gerando manutenção dobrada.


**O Princípio "Diga, não Pergunte" (*Tell, Don't Ask*)**    
Em vez de o Caso de Uso perguntar à compra: *"Você tem cupom? O cupom é válido?"* e depois decidir o que fazer, o Caso de Uso deve apenas **mandar** a compra fazer algo:
> `compra.aplicaCupom(cupom);`

A própria entidade `Compra` conhece seu estado e se defende. Se o cupom for inválido, ela lança uma exceção ou retorna um erro. Isso é **orientação a objetos real**.

> **Regra de Ouro:** Se você tem o dado e o comportamento que opera sobre esse dado, mantenha-os juntos. Use a orientação a objetos a seu favor.



## Você pode continuar usando o CDD para controlar a complexidade das unidades de
Na aula é realizado um passo a passo da utilização do CDD no clean Architecture. É realizada a contagem dos ICP (os pontos de complexidade que fazem parte do CDD).



## E quais são as diferenças para a Arquitetura Hexagonal?
- referência oficial sobre o hexagonal: https://alistair.cockburn.us/hexagonal-architecture
- na aula é realizada uma explicação sobre o hexagonal e sua relação com a arquitetura limpa





## Relacionando arquitetura em camadas e DDD
Este resumo explora a relação entre o **Domain-Driven Design (DDD)** e a **Arquitetura em Camadas**, destacando como essas duas abordagens se complementam na materialização de software de alta qualidade.

**1. DDD: Além da Estrutura de Código**    
O instrutor enfatiza que o DDD é um conceito muito mais amplo do que apenas a organização de arquivos.
* **A Essência:** O DDD foca em entender o **domínio** e o **contexto de negócio**. Se o desenvolvedor não entende o desejo do cliente, o software será uma materialização errada desse desejo.
* **O Software como Desejo:** O código deve refletir fielmente as regras e processos da empresa.

**2. Onde o DDD e as Camadas se Encontram?**    
A conexão ocorre na **implementação técnica** sugerida pelo DDD para suportar o design orientado ao domínio. Os padrões táticos do DDD vivem, majoritariamente, nas camadas mais internas de arquiteturas como a *Clean* ou a *Hexagonal*:

* **Entidades:** Classes com identidade única (ex: um `Usuario` identificado por e-mail ou ID), onde o estado pode mudar, mas a identidade persiste.
* **Objetos de Valor (Value Objects):** Objetos definidos por seus atributos. Se todos os campos forem iguais, são o mesmo objeto (ex: `Endereço`, `CPF`, `Moeda`). Eles não têm identidade própria e são imutáveis.
* **Serviços de Domínio (Domain Services):** Lógicas que não pertencem naturalmente a uma única entidade, mas fazem parte do negócio. No Spring, costumam ser identificados pelo estereótipo `@Service`.
* **Repositórios:** Interfaces que definem como o domínio acessa a persistência de dados. No DDD, o domínio define a interface do repositório, e a infraestrutura (camada externa) a implementa.

**3. A Materialização no Hexágono**    
Na **Arquitetura Hexagonal (Ports & Adapters)**, quase tudo o que o DDD define como "coração" do negócio fica dentro do hexágono central (o *Core*).
* As **Entidades** e **Value Objects** ficam na parte mais profunda.
* Os **Domain Services** orquestram essas entidades ainda dentro do núcleo.
* Os **Repositórios** (interfaces) servem como portas de saída para que o domínio se comunique com o mundo externo sem se acoplar a ele.

**4. Conclusão: Flexibilidade e Objetivo**    
O ponto fundamental da aula é que o DDD fornece a **linguagem e os modelos de negócio**, enquanto a Arquitetura em Camadas fornece a **proteção e a estrutura**.

> **Nota de Pragmatismo:** É perfeitamente possível aplicar DDD sem usar uma arquitetura de muitas camadas (como a Clean Architecture). Você pode ter um design orientado ao domínio em um sistema simples, desde que a lógica de negócio esteja bem expressa e protegida. A escolha da arquitetura deve ser sempre condizente com os **objetivos de negócio**.


## Passo a passo refatorando o cadastro de novo autor para Clean Arch
- Exemplo de código: https://github.com/asouza/jornada-deveficiente-casa-do-codigo/commits/arquitetura-camadas/
- Código fonte antes da refatoração: https://github.com/asouza/jornada-deveficiente-casa-do-codigo/commit/1e4a9c737f69063f411528b2c72ae721f61fda4f


Análise da funcionalidade pelo olhar das regras da arquitetura em camadas descritas por Bob Marting:
- Independent of Frameworks - Não (depende da JPA e também do Spring)
- Testable. The business rules can be tested without the UI, Database... Não (depende da injecao do Spring de atributo privado)
- Independent of UI - Não(só funciona por enquanto se for via web)
- Independent of Database - Não (depende da JPA)
- Independent of any external agency - Não (depende do banco de dados, dado que está acoplada a JPA)

---
> Resumo gerado por IA:
Este resumo foi elaborado para facilitar a compreensão dos conceitos de **Clean Architecture** (Arquitetura Limpa), conectando a teoria do blog de Uncle Bob com a prática de refatoração apresentada na transcrição da aula.


### 1. Análise da Teoria: O que diz o Blog de Uncle Bob

A Clean Architecture propõe a divisão do software em camadas concêntricas. O objetivo principal é criar sistemas que sejam:

* **Independentes de Frameworks:** O núcleo do seu sistema não deve depender de bibliotecas como Spring ou Hibernate.
* **Testáveis:** Você deve conseguir testar as regras de negócio sem precisar de um banco de dados ou servidor web.
* **Independentes da Interface de Usuário (UI):** A lógica deve ser a mesma, seja a entrada via Web, Console ou App Mobile.
* **A Regra de Dependência:** Esta é a regra de ouro. **As dependências de código só podem apontar para dentro.** As camadas internas (como as Entidades e Casos de Uso) nunca devem saber nada sobre as camadas externas (como o Banco de Dados ou a Web).




### 2. Contexto da Aula: Aplicando a Teoria na Prática

A transcrição detalha a transformação de um código comum (acoplado) em um código seguindo a Clean Arch. O foco é o **Cadastro de um Novo Autor**.

#### O Problema Inicial
O código começou com um `Controller` que fazia tudo: recebia os dados da web, falava direto com o banco de dados via JPA e dependia totalmente do framework Spring. Isso viola a regra de que o "núcleo" deve ser isolado.

#### O Passo a Passo da Refatoração

**Passo 1: Tornar o código Testável (Design para Testabilidade)**
* **O que foi feito:** Substituiu-se a injeção de dependência direta no atributo (com `@Autowired` privado) por um **construtor**.
* **Por que importa:** Agora você pode criar uma instância da classe manualmente em um teste unitário, passando um "mock" (simulação) do banco de dados, sem precisar subir todo o framework Spring.

**Passo 2: Independência de Banco de Dados**
* **O que foi feito:** Criação de uma interface de repositório própria do projeto.
* **Por que importa:** O sistema passa a depender de uma "abstração" que você controla, e não diretamente de uma tecnologia específica (como JPA ou MongoDB).

**Passo 3: Criação do Caso de Uso (Use Case)**
* **O que foi feito:** Criou-se a classe `CadastroNovoAutor`. Ela representa uma funcionalidade de negócio pura.
* **Por que importa:** Se amanhã você decidir que o cadastro de autor pode ser feito via terminal ou processamento de arquivo, a lógica já está isolada nesta classe, pronta para ser reutilizada sem depender da Web.

**Passo 4: Inversão de Dependência (A "Cola" entre as camadas)**
* Este é o ponto mais complexo. O Caso de Uso (camada interna) não pode depender do objeto de "Request" que vem da Web (camada externa).
* **A solução:** Criou-se uma **Interface** dentro da camada de Caso de Uso. O objeto da Web (o DTO) agora implementa essa interface.
* **Resultado:** O Caso de Uso agora aponta para uma interface que ele mesmo possui. A regra de dependência foi respeitada (o de fora aponta para dentro).


### Exemplo visual das camadas
1.  **Framework (Azul/Web)** recebe o JSON.
2.  **Controller (Verde)** transforma o JSON em um objeto que o Use Case entende.
3.  **Use Case (Rosa)** processa a regra usando a **Entity (Amarelo)**.
4.  **Use Case (Rosa)** manda salvar através de uma interface (**Gateway**).
5.  O **Framework (Azul/DB)** executa o SQL no banco.


## Refatore o cadastro de nova categoria para seguir a clean arch
Agora começou o jogo real. Você deve refatorar a funcionalidade de cadastro de nova categoria para buscar os objetivos desejados pela Clean Arch.

Você pode verificar a solução sugerida na seção de mídias de apoio: https://github.com/asouza/jornada-deveficiente-casa-do-codigo/tree/464dbe37ee1865083cac7d64516590c9e5418bdf



## Refatore o detalhe do livro para seguir a Clean Arch
Quarta refatoração! Espero que tudo seja bem mais fluido e que você até já comece a enxergar oportunidades de uso no seu dia a dia(se for necessário) ou também já se sinta mais preparado(a) para uma próxima entrevista.

Refatore o código relativo a funcionalidade de detalhe de um livro para buscar os objetivos descritos na Clean Arch.

Você pode verificar a solução sugerida na seção de mídias de apoio: https://github.com/asouza/jornada-deveficiente-casa-do-codigo/tree/daa7becb9a0e972b901f9238d0bdbd768a1aa43e




## Refatore a funcionalidade de cadastro de país e estado para seguir a Clean Arch
Aqui é para ser mamão com açúcar em! Refatoração parecida com as anteriores e é muito esperado que você esteja mais tranquilo(a).

Refatore o código relativo a funcionalidade de cadastros de país e estado para buscar os objetivos descritos na Clean Arch.


Você pode verificar a solução sugerida na seção de mídias de apoio: https://github.com/asouza/jornada-deveficiente-casa-do-codigo/blob/eeb0430475d199a35e65a519e1c649b725999bbf/src/main/java/com/deveficiente/casadocodigov2/paisestado/CriaEstadoController.java


## Refatore o cadastro de cupom para seguir a Clean Arch
Aqui é para ser mamão com açúcar de novo! Refatoração parecida com as anteriores e é muito esperado que você esteja mais tranquilo(a).

Refatore o código relativo a funcionalidade de cadastro de cupom para buscar os objetivos descritos na Clean Arch.

Você pode verificar a solução sugerida na seção de mídias de apoio: https://github.com/asouza/jornada-deveficiente-casa-do-codigo/tree/67468eb24a2aee924ddbd90f54003998fea96667/src/main/java/com/deveficiente/casadocodigov2/fechamentocompra



