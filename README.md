# estudo-dev-eficiente
estudo-dev-eficiente

Link: https://dev-eficiente.memberkit.com.br/
Google doc: https://docs.google.com/document/d/18j3Z5PUNkN1zMayhOvj2wgp7v5u97hBHyEXxKv2HuuA/edit?tab=t.0

Repositórios: https://github.com/asouza?tab=repositories


# Jornada Dev Eficiente
## Bem vindo(a) à jornada Dev Eficiente
### Bem vindo(a) à jornada!
- Práticas e princípios técnicos
- Modelo didático guiado no treino
- Constância nos estudos

### Sobre os materiais de apoio
- juntar teoria com a prática
- vídeos como sugestões de resolução dos problemas nos desafios
- artigos no medium

### Como escolher entre os desafios existentes?
- praticar todos os desafios


## Qualidade de código e software em aplicações modernas: Nova Versão
### Boas Vindas
- O módulo irá mostrar o processo para entregar um software de qualidade

### Intenção de escrever código com qualidade vem antes de seguir qualquer prática
- código manutenível
  - solid
  - testabilidade
  - camadas lógicas
  - legibilidade
- entregar código que faz o que deveria e ser mantido por qualquer pessoa

### Seja uma pessoa crítica
- olhar crítico nas teorias e conhecimentos aprendidos

### A relação entre tempo e código de qualidade
- relação de tempo nem sempre é reflexo de melhor qualidade de código
- o quanto vc conhece a sua IDE?
- quanto conhece a sua biblioteca para requisição HTTP?
- o quanto domina o negócio?

### Fluidez na utilização dos conceitos
- identificar os pontos de melhoria ao analisar um código
- mapear visualmente a qualidade do código

### Profundidade nas tecnologias do projeto
- conhecer as tecnologia fazem você tirar o máximo de proveito

### Domine sua IDE
- diversas items podem ajudar na qualidade do código (um conjunto de pontos) e a  IDE é uma delas
- não ficar pensando em outra coisa que não seja o problema a resolver
- criação de excptions, refatoração e etc
- estudar IDE assim como estudamos assuntos técnicos. Usando anotações para estimular o aprendizado

### Triturar Requisitos: Ponto de Vista de Negócio
- entender os conceitos iniciais da fucnionalidade e participar da inception
- fazer double check com a pessoa que escreveu a história

### Triturar Requisitos: Ponto de Vista de Pessoa Dev
- refletir sobre os passos antes do desemvolimento (checklist)
- validar com as pessoas envolvidas os seus passos planejados

### A importância de aprofundar-se no negócio
- conhecer sobre o negócio do nicho do software (educação, financeiro, etc)

### Vamos entrar em mais detalhes sobre Design?
- design de código do dia a dia
- enriquecer gradualmente a qualidade do código
- entregar um código de fácil manutenção pelo pares da equipe

### Cognitive Driven Development(CDD) para facilitar entendimento do código
- CDD é uma teoria que te apoia a pensar na complexidade de código. Baseado na teoria de carga cognitiva. Ex:
  - if/else/ternário/switch/loops: 1 ICP (intrinsic complex point)
  - acomplamento com classes do projeto: 1 ICP
  - bloco de código try/catch/funções: 1 ICP
  - definir limite, exemplo, 40 ICP por arquivo
- [PDF sobre CDD](https://arxiv.org/pdf/2206.10655)

### Evoluir via modificação pode ser mais fácil do que por extensão. Será?
- Nem toda modificação precisa entrar no código como um adição, alguns casos podem entrar por modificação.
- Aguardar um tempo para decidir se realmente é interessante aplicar o OCP: open-closed principal

### Acoplamento com Frameworks: Ainda é um problema?
- Alguns frameworks como Spring utilizam anotações (metadados) e a migração para um outro framework com algumas semelhanças como o Micronaut pode ser um processo não tão complexo.
- Alguns casos, adicionar complexidade como implementações para uma interface imaginando num cenário de substituição de frameworks, pode trazer mais complexidade ao projeto.
- Refletir sobre solução de problema e arquitetura de sofware prematura.

### Desafiando o senso comum: Classes estilo DTO podem ter métodos?
- Poupar criação de nova classe para somente uma conversão de um DTO para um entidade pode ser vantojoso
- Exemplo:
```java
Class UserDTO {
  //propriedades

  public User toModel() {
      return new User(this.id, this.name, this.email);
  }
}
```

### Preciso mesmo de um monte de camadas?
- Cenário: projeto com uma classe Usuario para o negócio, UsuarioEntity para persistência e UsuarioDTO para transferência de dados.
- Camadas intermediarias pensando em problemas do futuro, fazem sentido?
- Trazem melhorias em identificar bugs? Aumenta a velocidade de desenvolvimento? Diminui o acoplamento?

### Acoplamento Mental: O pior que pode existir
- É aquele acomplamento que temos a necessidade de visualizar uma implementação para entender o que o método está fazendo. Por exemplo, uma método que recebe um objeto que retorna string com palavras separadas por espaço. Ao utilizar este método devemos entender como é esse retorno de string, por exemplo, separado por espaços.

Referência sobre o assunto: https://dev.to/asouza/acoplamento-mental-o-pior-acoplamento-que-existe-2p59

### Abrace o legado
- Legado = conhecimentos anteriores
- O legado pode nos ajudar a entender o problema e a solução

### Testes de qualidade para aumentar confiabilidade e confiança da equipe
- testes trazem confiabilidade
- adicionar novas funcionalidades com testes automatizados garatem que os sitema funcione como esperado e a nova funcoinalidade não traga efeitos colaterais
- testes que revelam bugs

### Ter um guideline pode ser mais importante do que as práticas em si
- utilizar guideline para te guiar durante o processo de entrega de código

### Possível Item Guideline #1: Métrica CDD
- Métricas de complexidade utilizando o CDD 
  - condicionais 1 ICP
  - bloco de codigo (try, switch, funcoes como argumento) 1 ICP
  - acoplamento clases especificas 1 ICP
  - limite de ICPs por arquivo 10

### Possível Item Guideline #2: Testes automatizados
- Testes com compotamentos reais, minimizar o uso de mocks
- 90% ou mais de cobertura
- escrever testes mais integrados
- dar importancia ao tempo de execução
- utilizar a técnica de MC / DC em condições com mais de duas comparações
- utilizar boudary test (fronteiras)
- utilizar property-base testing
- CDD nos testes

### Possível Item Guideline #3: Logar de maneira sistemática
O 5 W:
Quem (Who): Refere-se ao sujeito da ação. Em logs, isso pode ser um usuário, um processo, um sistema, etc.
O quê (What): Descreve a ação realizada. Por exemplo, um login, uma requisição, uma atualização de dados.
Quando (When): Indica o momento exato em que a ação ocorreu, geralmente com data e hora precisas.
Onde (Where): Especifica o local onde a ação aconteceu, como um servidor, um módulo de software, um banco de dados.
Por quê (Why): Explica o motivo da ação, fornecendo contexto para a ocorrência.


#### Guia para logar
##### Quando logar e qual nível de severidade usar
Sempre que tiver alteração de estado no sistema, realize o log em nível de info antes e depois da realização da alteração do estado.

Sempre que for consumir serviços externos, realize o log em nível de info antes e depois da chamada de api.

Sempre que você realizar um tratamento de erro, cujo problema permite que o fluxo da aplicação continue, realize o log em nível de error. Lembrando de evitar logar em nível de erro e relançar o problema para cima.

Realize log em nível de debug quando o código tiver caminhos de decisão, como ifs, loops etc. Faça isso com

##### Como logar?
Todas as aplicações devem realizar o log utilizando a biblioteca padrão da empresa que já obriga a passagem de relevantes assim como já serializa o log no formato adequado.

O assunto principal é um guia sobre como fazer log em uma aplicação. O guia descreve em quais situações diferentes níveis de severidade (info, error, debug) devem ser usados ao registrar logs, e também especifica que deve ser usada a biblioteca padrão da empresa para realizar o log.

Links sobre logs:
1. https://youtu.be/KEjteewlBJY (Revisão sobre as práticas de logging)
2. https://youtu.be/gRrDUKxcqLM (Exemplo de código para maximizar a chance do log sair da melhor maneira)

### Possível Item Guideline #4: Maximize a coesão
Constantemente analise se o código que você está escrevendo tem conexão com os outros códigos já escritos. Tente manter tudo que faz sentido ficar junto, realmente próximo. Alguns exemplos da aplicação dessa ideia:

1. Se você tem uma classe que tem um atributo de data e você precisa saber se determinado objeto tem um valor antes ou depois daquela data, você deveria criar um método dentro daquela classe para operar sobre o atributo.
2. Se você decidiu criar um novo serviço, maximize a chance que todo código daquele serviço realmente tenha conexão.

### Possível Item Guideline #5: Postergue generalizações
A prática de postergar generalizações é uma abordagem importante para o desenvolvimento de software de qualidade. A ideia central é evitar decisões prematuras sobre a generalização de comportamentos e reuso de código, garantindo que essas decisões sejam fundamentadas em uma compreensão mais completa e madura do problema e do domínio do software.

Decidir precocemente sobre generalizações e códigos reutilizáveis pode fazer com que você extraia algo que não é de fato reaproveitável. Simplesmente pelo fato de você não ter esperado coletar mais variáveis de entendimento sobre o problema que estava sendo resolvido.

O título indica que o ideal é adiar decisões sobre generalizações e reuso de código. A justificativa é que tomar tais decisões precocemente pode levar à criação de código generalizado que não se mostra útil ou reutilizável, pois não se considerou profundamente o problema original.

### Possível Item Guideline #6: Controllers e Servies 100% coesos
O conceito de "Controller 100% Coeso" foca em maximizar a coesão e minimizar a complexidade no desenvolvimento de software, garantindo código mais claro, organizado e de fácil manutenção. A ideia central é criar controllers (ou classes similares) em que todos os atributos sejam usados por todos os métodos, reforçando a relevância e a unidade funcional de cada componente.

### Possível Item Guideline #7: Request Value Object
**Value Object**

Um **Value Object** é um padrão de design usado para representar conceitos definidos pelos **valores de seus atributos**, sem identidade própria. Eles são:

- **Imutáveis**: seus atributos não podem ser alterados após a criação.
- **Comparados por valores**: a igualdade é baseada nos atributos, não na referência.
- **Representativos do domínio**: usados para conceitos como **endereço**, **dinheiro** ou **intervalos de tempo**.

**Diferenças entre Value Object e Entidade**

| **Aspecto**       | **Value Object**                 | **Entidade**                  |
|--------------------|----------------------------------|--------------------------------|
| Identidade         | Baseado nos atributos           | Identidade única (ex.: ID)    |
| Imutabilidade      | Sempre imutável                 | Geralmente mutável            |

Value Objects são úteis para clareza e segurança no modelo de domínio.

Service 100% Coeso e o DTO (Data Transfer Object) inspirado no conceito de Value Object.

Service 100% Coeso:

A ideia é que os serviços e casos de uso (use cases) devem ser coesos e independentes, evitando que métodos e atributos sejam desnecessariamente misturados. Isso evita acoplamento excessivo e dificuldade de entendimento do código. Um serviço deve ter uma única responsabilidade, e seus métodos devem utilizar apenas uma parte dos atributos, garantindo maior clareza e menor complexidade.
DTO inspirado no Value Object:

Normalmente, as classes DTO (Data Transfer Object) são usadas apenas para transportar dados e não possuem comportamento. No entanto, inspirado no conceito de Value Object (onde um objeto é definido pelos seus valores), o autor propõe que os DTOs possam conter comportamentos simples relacionados aos seus dados.
Exemplo: em vez de simplesmente transportar dados de uma oferta, o DTO pode ter métodos para validar ou processar esses dados, como verificar se o número de parcelas é válido. O autor acredita que essa abordagem torna o código mais coeso e evita a necessidade de classes auxiliares para mapeamento, tornando o processo mais simples e direto.

## Práticas de design de código para o seu dia a dia
### Introdução
2 tipos de conteúdos:
  1. clean code de forma sistemática
  2. direcionamentos (intenção) de código de qualidade

### Direcionamento 1: Qualidade não é negociável
Qualidade não é negociável. O código deve ser feito com o design proporcional a complexidade considerando os conhecimentos que temos no momento da produção.

1. **Qualidade não é negociável**:  
   - O código deve sempre refletir o melhor esforço possível, dentro das limitações e variáveis existentes.  
   - Priorize práticas que garantam confiabilidade e clareza, mesmo em prazos apertados. A qualidade nunca deve ser sacrificada de forma deliberada.

2. **Design proporcional à complexidade**:  
   - O design deve ser simples e adequado à complexidade do problema, evitando abstrações ou generalizações desnecessárias.  
   - Considere os conhecimentos disponíveis no momento para criar soluções específicas e eficientes, priorizando clareza e legibilidade.  

### Direcionamento 2: Aceite, tomamos decisões ruins
Você vai deixar decisões ruins pelo caminho, não importa o seu nível.

### Direcionamento 3: Fazemos o que foi combinado
A prioridade máxima é funcionar de acordo com o caso de uso.

### Prática 1. - Parte 1: Implemente de de fora para dentro
Execute o seu código o mais rápido possível. Priorize implementar de fora para dentro, dessa forma você visualiza o que realmente precisa e usa uma abordagem mais incremental. O "fora" aqui pode ser o endpoint que vai receber uma chamada, pode ser seu teste automatizado

Por exemplo, criar o endpoint primeiro, depois implementar as entidade e serviços. Trazer um resultado de forma incremental e sempre testando as fucionalidades.

### Prática 1. - Parte 2: Implemente de de fora para dentro
Descreva os passos necessários para executar a tarefa antes da implementação do código.

```java
* Neste endpoint eu preciso receber a pessoa logada que gerará o convite e também a conta daquele convite.
    * A pessoa logada vai vir via header
    * a conta pode vir via parametro combinado na própria url (path variable)
    * Também preciso receber os dados do convite: Email e dias de expiração
* Carregar a pessoa logada e verificar se ela existe mesmo (use o getOrThrow e lance ResponseStatusException)
* Carregar a conta e verificar se ele existe mesmo (use o getOrThrow e lance ResponseStatusException)
* A pessoa logada precisa ser dona da conta (lance ResponseStatusException)
* Eu crio o novo convite para aquele email com aquela data de expiração
    * Crie um método chamado toModel na classe de request
* Salvo este convite
    * Utilize o EntityManager
* Preciso mandar um email para a pessoa que vai receber o convite
    * Deixe fake por enquanto
```

### Prática 1. - Parte 3: Implemente de de fora para dentro
- termos o passo a passo de implementação desejada
- No lugar de inicar o desenvolvimento das classes pelas entidades e repositórios, iniciar pelo controller e ir avançando passo a passo. Você define o nível de granularidade.
- Maximizar as chances de ikdentificar os problema com mais antecedência.
- Testar granularmente ajuda a identificar os problemas com mais facilidade.

**Resumo - Implementação "De Fora Para Dentro"**

1. **Definição**: A prática "de fora para dentro" consiste em implementar funcionalidades começando pelo comportamento externo, validando cada parte progressivamente.  
2. **Testes Incrementais**: Após cada etapa implementada, testar funcionalidades pequenas para localizar problemas rapidamente.  
3. **Granularidade**: Dividir a execução em passos menores e iterar sobre eles, garantindo que cada um funcione antes de seguir.  
4. **Validação Contínua**: Confirmar a correta passagem de parâmetros, headers e dados da requisição, verificando se o comportamento está alinhado.  
5. **Refinamento**: Ajustar e corrigir cada parte à medida que o processo avança, evitando retrabalho maior no final.  
6. **Origem do Problema**: Atuar próximo à origem das falhas facilita a resolução e mantém o processo mais ágil e preciso.  

### Prática 2: Maximize a coesão
- Deixar o comportamento próximo do estado. O comportamento é o método e o estado são as classes com as propriedades de um domínio de informação (entidade).
- Como decidir quando realizar ou não? R: está realizando uma lógica baseada no estado

**Princípios Fundamentais**

1. Encapsular Comportamentos Próximos ao Estado
  - Evite implementar lógica fora da entidade que contém o estado.
  - Promova a responsabilidade dentro da classe que contém os atributos.
2. Evitar Código Anêmico
  - Use entidades ricas (Rich Domain Models) para encapsular lógica relacionada ao domínio.
  - Deixe comportamentos relevantes no modelo, ao invés de espalhá-los por controladores ou serviços.

Exemplo 1:
```java
//RUIM
if (conta.getProprietario().equals(usuarioLogado)) {
    // lógica de sucesso
} else {
    throw new ResponseStatusException(HttpStatus.FORBIDDEN);
}

//BOM
public class Conta {
    private Usuario proprietario;

    public boolean pertenceAoUsuario(Usuario usuario) {
        return this.proprietario.equals(usuario);
    }
}
```

Exemplo 2:
```java
//RUIM
Convite convite = new Convite(request.getEmail(), request.getDiasParaExpirar());

//BOM
public class ConviteRequest {
    private String email;
    private int diasParaExpirar;

    public Convite toConvite() {
        return new Convite(this.email, this.diasParaExpirar);
    }
}
```

Exemplo de **code Smells**:
```java
//RUIM
if (conta.getProprietario().getEmail().equals(usuario.getEmail())) { ... }
```

### Prática 3: Proteja as bordas do sistema
- Proteja as bordas do sistema, iniciando pela camada mais externa
- Evita que dados invalidos percorram pelo sistema

### Prática 4: Não retorne nulo
- **Problema com retorno nulo:** Retornar nulo em métodos quebra a confiança no código e pode causar erros como NullPointerException.  
- **Garantir retorno:** Métodos devem sempre retornar um valor válido ou usar abstrações (ex.: `Optional` no Java) para indicar ausência de valor.  
- **Exemplo prático:** O uso de métodos como `findById` no Spring Data JPA, que retorna um `Optional`, ajuda a tratar situações em que o valor pode estar ausente.  
- **Alternativa segura:** Caso o retorno não possa ser garantido, lançar exceções ou usar abstrações para sinalizar ausência é mais adequado.  
- **Benefício geral:** A abordagem melhora a clareza, previne erros e mantém a consistência no código.

Exmeplo:
```java
Pessoa pessoaLogada = pessoaRepository.findById(IdPessoaLogada)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
Conta conta = contaRepository.findById(idConta)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
```

### Prática 5: Não ligamos parâmetros de borda externa com entidades
-Evitar o uso de classes de entidades na borda expondo propriedades que não devem estar expostas ao usuários. 
- Use DTO somente com os dados necessários
- Evite criar método de mapeamento nas entidades, eles tedem a crecer em quantidade. Utileze métodos específicos no DTO.

### Prática 6: Informação obrigatória entra pelo construtor
- Usar construtor para criar um objeto válido e obrigatórios
- Utilizar setters para atualizar valores pode aumentar o acomplamento mental e permite a criação de um objeto sem os valores obrigatórios

### Prática 7: Deixe pistas quando a compilação não resolver
- Utilize anotações nos arâmetros dos métodos para guiar a pessoa que irá utilizar o método. Esas anotações não disparam erros, mas direcionam o usuário otipo de valor esperado.
- [Precise_Documentation_The_Key_To_Better](./materiais/Precise_Documentation_The_Key_To_Better.pdf)

### Prática 8: Utilize o que está pronto
- Usamos tudo que conhecemos que está pronto.
Antes:
```java
public class Convite {
    
    public Convite(Conta conta, @Email @NotBlank String email, @Future LocalDate dataExpiracao) {

        if(conta == null) {
            throw new IllegalArgumentException("A conta não pode ser nula");
        }
    
        if(email == null || email.trim().equals("")) {
           throw new IllegalArgumentException("O email precisa estar preenchido");
        }

        if(dataExpiracao.compareTo(LocalDate.now()) <= 0) {
            throw new IllegalArgumentException("A data de expiracao do convite tem que ser no futuro");
        }
    }
}
```
Depois:
```java
public class Convite {
    private LocalDate dataExpiracao;

    public Convite(Conta conta, @Email @NotBlank String email, @Future LocalDate dataExpiracao) {
        Assert.notNull(conta, message: "A conta não pode ser nula");
        Assert.hasText(email, message: "O email precisa estar preenchido");
        Assert.isTrue(expression: dataExpiracao.compareTo(LocalDate.now()) <= 0, message: "A data de expiração deve ser no futuro");


        this.conta = conta;
        this.email = email;
        this.dataExpiracao = dataExpiracao;
    }
}
```

### Prática 9: Utilize o CDD
Foi utilizado como guideline:
```java
/**
 * - acoplamento com classes especificas do projeto - 1 ICP
 * - condicionais - 1 ICP
 * - blocos extras de código - 1 ICP
 */
```

### Prática 10: Só alteramos referências que criamos
- só alterar estados de objetos que criamos em nossas classes.
- objetos criados externamente devem ser alterados em sua classe de origem.

### Prática 11: Derive testes de maneira sistemática
- cobrir os casos essenciais iniciamente, cobrindo os caminhos e branchs de decisão
- somente depois partir para outras aboragens

## Usando carga cognitiva pra diminuir a complexidade do código (Cognitive-Driven Development)
### Introdução oficial ao CDD

