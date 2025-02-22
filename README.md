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
https://github.com/asouza/pilares-design-codigo/blob/master/ICSME-2020-cognitive-driven-development.pdf

https://drive.google.com/file/d/1jJjf3JL-IXBEKVEVXKp0E9tlhKW2f2mC/view

[Link do ebook local](./materiais/praticas-de-codigo-para-devs-eficientes.pdf)

### Um exemplo real sobre complexidade em um projeto open source
- analise do código do [Feign](https://github.com/OpenFeign/feign)

### Analisando o incremento de complexidade de modo visual
- Projeto para analisar a complexidade de uma classe a partir de vários commits: [complexity-tracker Public](https://github.com/asouza/complexity-tracker)

### Experimento CDD x Convencional
- comparação entre as técnicas CDD e convencionais
- [youtube.com/watch?v=VqqIqA8cwCw](youtube.com/watch?v=VqqIqA8cwCw)
- https://arxiv.org/pdf/2206.10655

### Métrica derivada do CDD sugerida na jornada
- explicação do guideline para o CDD
- aplicação do CDD com solução

### Derivando métricas do CDD para outros cenários
```
/**
 *
 *  * metrica alberto do cdd
 *  * 1 ponto - acoplamento contextual
 *  * 1 ponto - branch
 *  * 1 ponto - funcao como argumento
 *
 *  * limite 7 classes com atributos de dependencia
 *  * limite 9 classes com atributos de estado
 *
 *
 *
 *  * metrica padrao industria do cdd
 *
 *  * 1 ponto - qualquer acoplamento
 *  * 1 ponto - branch
 *  * 1 funcao - como argumento
 *
 *  * limite 7 classes com atributos de dependencia
 *  * limite 9 classes com atributos de estado *
 **/
```

### CDD aplicado para cenários de código legado
- Em classe com uma grande quantidade de pontos de complexidade, tente diminuir em porcentagem. POr exemplo, dimnuir para 90%, depois 80% e etc.

### Design escalável e sustentável
- utilizar a técnica para tornar o código manutenível

### A relação do CDD com tudo que você já conhece
- SOLID, Clean Code e inspirações arquiteturais como MVC, Clean Architecture e Arquitetura Hexagonal podem continuar sendo utilizadas, caso você ache necessário. As métricas derivadas do CDD limitam a complexidade, não impõem uma forma de programar. 

### Como derivar métricas com CDD
- definir as unidades de itens
- identificar os ponto de complexidades (if, switch, implementação de interfaces, etc)
- votar cadas unidades e selecionar alguns através de votação.

### Duas formas diferentes de tentar resolver o mesmo desafio
Enquanto as práticas inspiradas no SOLID, Clean Code, Domain Driven Design etc tentam acomodar mudar mudanças de tecnologia e se antecipar para possíveis mudanças de escopo, o CDD abraça a mudança de escopo e de pessoas. 

Na opinião de Alberto o que mais muda num projeto, principalmente da indústria, é o escopo e as pessoas. Então a aposta é que um código mais fácil de entender vai ser mais fácil de manter e evoluir. A flexibilidade do código vai ser simplesmente uma resposta a especificação. Dado que, no fim, um código é uma automação do desejo de alguém :). 

## Desafios
- [desafio-1: Casa do código](https://github.com/forks-projects/seed-desafio-cdc)

## Testes automatizados: revelando bugs de maneira eficiente
### Unindo academia e indústria no mundo dos testes automatizados
- conteúdo inspirado no livro de Maurício Aniche
- visão de industria vs academia. Na academia tentam revelar os bugs e na indústria verica se o código feito está correto.

### Testes: Mitos x Realidade
- A industria indica o uso de TDD
- Não existe uma evidência que TDD traz mais qualidade para o código

### Vamos focar em testes de unidade
- Uma unidade é um ponto de entrada
- combinação de testes de unidade, sistema e integrados

### Técnica \#1: Specification Based Testes
- pensar em testes pensando na especificação
- Regras:
  - identificar os parâmetros de entrada das funções classes e métodos

### Técnica \#2: Boundary Testing
- identificar os valores limites/fronteiras
- Regras:
  - utilizar valores extremos para uma lógica de uma idade, por exemplo 18. Testar com os valores menores e maiores que 18. Utilize com os valores: 10,17, 18, 19 e 30 no mínimo.

### Técnica #3: Começando com structural testing
- Cobertura de código (linha, branch, branch com condições). Testar a estrutura de um código.

### Structural testing: Cobertura por linhas de código
- não utilizaremos esse tipo de testes em nossos estudos

### Structural testing: Cobertura por branches
- branches são: if, switch, loops, etc.
- jacoco utiliza testes por condicional
- utilizar branch cobrindo todas combinações de valores como em: "se condicao1 OU condicao2". Criar testes com combinações de valores. TRUE/FALSE, FALSE/TRUE, TRUE/TRUE, FALSE/FALSE.

### Structural testing: Cobertura por condicionais
- cobrir as condicionais e as branchs.
Cobertura por branch testa se todos os caminhos de decisão (true/false) foram percorridos.
Cobertura por condição testa se cada condição dentro da decisão assumiu true e false pelo menos uma vez.

Exemplo:

```
if (A && B):  # Decisão com duas condições
```

- Branch coverage garante que o if foi testado para true e false.
- Condition coverage garante que A e B foram testados separadamente como true e false.

### Structural testing: Cobertura por branch + condicional

### Structural testing: Cobertura por todos os caminhos e MC/DC
Explicação da técnica: https://www.youtube.com/watch?v=bwtALQVx86w

### Técnica #4: Self testing
Realizar verificações dentro do próprio código.
```java
public void aplicaCupom(Cupom cupom) {
  Assert.isTrue(cupom.valido(),"Olha o cupom que está sendo aplicado não está mais válido");
  Assert.isNull(cupomAplicado,"Olha você não pode trocar um cupom de uma compra");
  this.cupomAplicado = new CupomAplicado(cupom);
}
```

Comentário da aula:

No "Design by Contract" (DbC), conceito introduzido por Bertrand Meyer (criador da linguagem Eiffel), as pré-condições, pós-condições e invariantes formam o "contrato" de um método ou classe.


- As pré-condições devem ser verdadeiras antes da execução de um método.
- As pós-condições devem ser verdadeiras após a execução de um método.
- As invariantes devem ser verdadeiras antes e depois da execução de um método.


A linguagem Eiffel suporta DbC nativamente. Em contraste, Java não tem suporte nativo para DbC, mas podemos implementar algo semelhante usando asserções (ou exceções). Ao utilizar asserções em Java, com a técnica de "Design by Contract" em mente, podemos simplificar o processo de detecção e correção de bugs.

Referência sobre o assunto: https://martinfowler.com/bliki/SelfTestingCode.html

### Técnica #5: Property Based Testing
Property-Based Testing (Teste Baseado em Propriedades) verifica se um código funciona corretamente gerando vários casos de teste automaticamente, em vez de testar apenas exemplos específicos.

```java
import net.jqwik.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PropertyBasedTest {

    // Método a ser testado
    int calcular(int a, int b) {
        return a + b; // Simples soma, pode ser alterado para outras operações
    }

    @Property(tries = 100) // Executa 100 testes automáticos
    void somaSempreMenorQue200(@ForAll @IntRange(min = 0, max = 100) int a,
                                @ForAll @IntRange(min = 0, max = 100) int b) {
        int resultado = calcular(a, b);
        assertTrue(resultado <= 200, "A soma deve ser no máximo 200");
    }

    @Property(tries = 100) // Executa 100 vezes
    void multiplicacaoDentroDosLimites(@ForAll @IntRange(min = 0, max = 100) int a,
                                       @ForAll @IntRange(min = 0, max = 100) int b) {
        int resultado = a * b;
        assertTrue(resultado >= 0 && resultado <= 10000, "O produto deve estar entre 0 e 10.000");
    }
}
```
Exemplo de uso de Rafael Pontes do [Linkedin](https://www.linkedin.com/posts/rponte_jqwik-activity-7290355568723042306--9Nc/?utm_source=share&utm_medium=member_desktop&rcm=ACoAAAfm0E8BHZBHyafH5dJvcNZWg08QZfPcTMc): https://gist.github.com/rponte/cb1f027f89f964a3def81978eb3f25bc

### Pragmatismo e estratégia de testes
- gerar testes com pouca "dor"
- utilização de mocks em equilibrio
- escrever código para facilitar a escrita de testes?

### 0015 testes pirâmide de testes
- **teste de unidade**: pode ser um método ou uma classe e são rápidos de executar
- **teste integrados**: mais custuzo e temos que popular e genrênciar os registro na base de dados
- **testes de sitema**: subir um sistema e suas dependências e validar.
- teste manuais durante o desenvolvimento

### Testes de unidade o mais integrado possível
- evitar o uso de mocks para casos em que a criação da instância seja simples. Ex: criação de excetions lançadas pelo framework.
- nos casos complexos que trazem mais carga cognitiva utilizar bibliotecas como Mockito

### Mocks: Como, quando e até onde usar
- testes de unidade estão distantes do uso real em um sistema por representarem uma pequena parte do comportamento de uma funcionalidade
- procure criar as instâncias usando o new da linguagem e ter os estados reais de um objeto. O uso de mock nos testes de unidade pode deixar os testes de unidade mais distante do comportamento real

### Combinando testes de API com Property Based Testing
- combinação de testes de API com a técnica Property Based Testing para conseguir explorar os fluxos da nossa aplicação com valores gerados automaticamente
- use testes de api com o comportamento completo e complemente com uso de uma biblioteca como jqwik para gerar variações dos valores de entrada

```java
package com.deveficiente.casadocodigov2.fechamentocompra;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import com.deveficiente.casadocodigov2.cadastrocupom.Cupom;
import com.deveficiente.casadocodigov2.paisestado.Estado;
import com.deveficiente.casadocodigov2.paisestado.Pais;

public class CupomValidoValidatorTest {

	private CupomRepository cupomRepository  = Mockito.mock(CupomRepository.class);
	private List<NovoPedidoItemRequest> itens = List.of(new NovoPedidoItemRequest(1l, 10));
	private NovoPedidoRequest pedidoRequest = new NovoPedidoRequest(BigDecimal.TEN, itens);
	private NovaCompraRequest request = new NovaCompraRequest("email@email.com", "nome",
			"sobrenome", "8967548654", "endereco", "complemento", "cidade",
			1l, "987454778", "54534534", pedidoRequest);
	
	@Test
	@DisplayName("deveria parar caso o cupom esteja invalido")
	void teste1() throws Exception {
		Cupom cupom = new Cupom("codigo", BigDecimal.TEN, LocalDate.now().plusDays(1));
		//o cupom precisa ficar com uma validade para trás do dia de hoje
		ReflectionTestUtils.setField(cupom, "validade", LocalDate.now().minusDays(1));
		
		request.setCodigoCupom("codigo");
		Mockito.when(cupomRepository.getByCodigo("codigo")).thenReturn(cupom);
		
		
		Errors errors = new BeanPropertyBindingResult(request , "target");
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertTrue(errors.getAllErrors().size() == 1);
		Assertions.assertEquals("Este cupom não é mais válido",errors.getFieldError("codigoCupom").getDefaultMessage());
	}
	
	@Test
	@DisplayName("deveria passar caso o cupom esteja válido")
	void teste2() throws Exception {
		Cupom cupom = new Cupom("codigo", BigDecimal.TEN, LocalDate.now().plusDays(1));
		
		request.setCodigoCupom("codigo");
		Mockito.when(cupomRepository.getByCodigo("codigo")).thenReturn(cupom);
		
		
		Errors errors = new BeanPropertyBindingResult(request , "target");
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertFalse(errors.hasErrors());
	}
	
	@Test
	@DisplayName("deveria passar caso nao tenha codigo de cupom")
	void teste3() throws Exception {
		Errors errors = new BeanPropertyBindingResult(request , "target");
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertFalse(errors.hasErrors());
	}
	
	@Test
	@DisplayName("deveria parar caso já tenha erro")
	void teste4() throws Exception {
		Errors errors = new BeanPropertyBindingResult(request , "target");
		errors.reject("codigo");
		
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertTrue(errors.getAllErrors().size() == 1);
		Assertions.assertEquals("codigo",errors.getGlobalErrors().get(0).getCode());
	}	
	
}
```

### Design de código voltado para testabilidade
- Usar CDD nas classes de testes

### Sugestão de como realizar testes dentro da Jornada
- boundary test
- structural testing (MCDC)
- property base testing
- self testing
- prioridade nos testes de unidade mais integrado o possível
- testes de apis

```java
// testar campos privados
ReflectionTestUtils.saetField(objeto, "propriedade", "novo valor");

// evitar testes logicos usando recursos da linguagem. NO exemplo para evitar NullPointerException
Optional.ofNullable(nome).orElse("Nome Padrão");
```

exemplo: https://github.com/forks-projects/pilares-design-codigo/blob/master/playbook-testes-automatizados-jornada-4.md

### Reforçando: Vamos buscar testes de unidade mais integrados
- testes de unidade integrados, utilizandos os objetos reais, sem mock ou stubs

### Você precisa ser fluente com as tecnologias de testes
- dominar a ferramenta de testes

## Testes de Software para Devs: Princípios, Práticas, e Dicas Direto das Trincheiras
### Bem vindo ao curso!
- voltado para pessoas que já escrevem testes e querem um próximo passo

### Por que testar?
- explica sobre um caso real de um sistema sem uso de testes automatizados

### Leis do teste de software
- teste exaustível é impossível (executar todas as situações)
- variação nos testes de software. Iniciar com unitário em certo tempo deixar de encontrar problemas e chega o momento de usar outros tipos de testes como integrados e sitema
- não existe uma maneira unica de testar um software
- verificação vs validação (aqui está mais focado na verificação)
  - verificação: garantir que o funciona como esperadmos
  - validação: se atende as necessidades que um cliente espera do sistema

### O que são testes que acham bugs?
- testes baseados em especificação (domain tests)
- fronteira
- cobertura de testes

### Testes de código de maneira sistemática
- testes baseados em especificação (domain Testing)
- testar de forma sistemática

Exemplo de lista com intersecção:
*   List1
    *   Null
    *   0 elementos
    *   1 elemento
    *   Múltiplos elementos
*   List2
    *   Null
    *   0 elementos
    *   1 elemento
    *   Múltiplos elementos
*   List1 e List2 tem elementos em comum
    *   1 elemento
    *   Mais de 1 elemento
*   List1 e List2 não tem elementos em comum

Criando casos de teste
*   Casos excepcionais
    *   List1 null
    *   List1 zero elementos
    *   List2 null
    *   List2 zero elementos
*   Elementos em comum
    *   Um elemento na lista
        *   List1 = [1], List2=[1]
        *   List1 = [1], List2=[1,2]
        *   List1 = [1,2], List2=[1]
    *   Múltiplos elementos
        *   List1 = [1,2,3], List2=[1,3,5]
        *   List1 = [1,2,3], List2=[1,2,3] (necessário?)
    *   Sem elementos em comum
        *   List1=[1], List2=[2] (necessário?)
        *   List1=[1,2,3], List2=[4,5,6]

### Bugs amam fronteiras
- visa encontrar os limites das classes de entradas. _Por - exemplo, na maioridade, os valores que são igual ou maiores que de 18, como: 18, 19, 25, 34 e 76 e sem maioridade, os valores que por natureza são menores que 18, como: 1, 2, 3, 16 e 17_
- para encontrar os limites utilizams alguns conceitos como: `point, offpoint, inpoints e offpoints`
  - `point`: valor exato do limite. Ex: 18 anos
  - `offpoint`: valor mais próximo que invalida. ex: 17 anos
  - `inpoints`: são todos os valores válidos. Ex: 18, 19, 20, 21 ... anos
  - `offpoints`: são todos os valores inválidos. Ex: 17, 16 ... 2 anos e etc 

### Cobertura de código da maneira certa!
- ajuda a decidir se já cobrimos o código suficiente
- estudo aponta a relação de suite de testes e a cobertura de teste que revelam bugs
  - 90% cobertura: são melhores na detecção
  - 100% cobertura: não é um indicador confiável
- história de um mestre, seu pupilos e três pessoas: https://www.artima.com/weblogs/viewpost.jsp?thread=204677

### Testes que dão bom feedback
- introdução sobre o tema levantando dúvida entre testes unitário, integrados, rápidos e etc.

### Testes de unidade ou integração
- testes de unidade: fácil de ser escrito e diferente do seu uso real
- testes de integracao: dificil de ser escrito, mais lentos e trazem o comportamento real do sistema
- numa aplicação complexa que a lógica pesada não depende do sistema em si o teste de unidade pode trazer mais feedback.
- num sistema padrão usando CRUD que bate no banco de dados e somente deve testar o fluxo, um teste integrado pode trazer mais valor

### Testes devem ser simples e rápidos
- testes simples são fáceis de ser multiplicados
- testes rápidos são fáceis de executar a suite de testes a cada novo teste adicionado. Rápido feedback

### Você não acharia esse bug mesmo se escrevesse testes de integração!
- falácia que somente os testes de integração acham bugs reais
- não é porque a equipe usa testes integrados que a suite de testes vai reveler o bug com mais facilidade

### Você precisa dividir para conquistar!
- dividir e testar componente de forma individual

### Foque nos casos de uso
- testar por casos de uso

### Infraestrutura para escrita de testes é a chave do negócio
- Infraestrutura neste cenário pode ser uma biblioteca para te ajudar a realizar os testes
- facilitar a escrita de testes aumenta a adoção de testes numa equipe

### É preciso ver valor em todos os tipos de testes
- é importante ver valor em todos os tidpos de testes. Não é o testes de integração melhor que o teste de unidade, mas um conjunto corretos desses tetes.

### Por que mockar, eis a questão!
- mock como ferramenta de design é conhecido pela galera do TDD
- mock como ferramenta para criação de testes

### O que mockar, e o que não mockar?
- mockar coisas que dificultam a escrita de testes como um gateway de pagamento como dependência. Neste cenário o gateway de pagamento é um processo apartado do restante do sistema. Lembre-se de um serviço de e-mail neste cenário tbm
- mockar banco de dados? somente o BD se não for essencial para a funcionalidade
- não mockar entidades, dtos e classes de domínio em geral
- não mockar metodos utilitários que fazem manipulação e conversão
- mockar aquilo que pode dar trabalho

### Internal ou peer, uma ótima maneira de classificar dependências
- dependências internal ou peer. 
- peer: um carrinho de compra que dpende de um repositório (banco de dados)
- internal: regra de negócio complicada onde a lógica é dividida em diversas classes. A regra de claculo de imposto, por exemplo.
- mockamos somente dependências do tipo peer, internal nã queremo mockar.

### Stubs, fakes ou mocks?
- stubs: burro, com um valor fixo
- fakes: um banco de dados em memória ou uma classe com um array que simula o comportamento de banco de dados.
- mock: você pode fazer asserção sobre as interações. No final vc consegue identificar se foi executada, quantas vezes foi executada e os tipos de dados dos parâmetros de entrada de um método.

### Calma lá, mocks também tem suas desvantagens
- acoplamento: um mock não deveria estar acoplado com código de produção. Deveriamos alterar o código de produção sem impactar um mock nos testes.
- quando se mocka um componente, contrato do mock e do componenete precisam evoluir juntos

### O que design para testabilidade?
- introdução sobre design para testabilidade que deve-se basear em teste fácil e barato.

### Arquitetura hexagonal para nos salvar
- separar infraestrutura de regra de negócio
- arquitetura heagaxonal faz essa separação

### Controlabilidade e observabilidade são fundamentais!
- Controlabilidade: tem que ser fácil controlar e colocar o componente em qualquer estado
- observabilidade: tem que ser fácil observar como o estado do componente se comportou para realizar asserção.

### Na dúvida, escreva classes pequenas
- pequenas classes que colaboram entre si do que um classe grande
- fácil de mudar pequenos componentes
- pequenas classes são mais testáveis

### Por que se importar com qualidade do código de testes?
- codigo teste também é código

### As características de um bom código de testes
- Livros: 
- testes coeso: testar uma funcionalidade sem depender de outros testes
- teste deve ter uma boa razão para existir
- teste deve ser repetitível e não flaky. Deve executar diversas vezes e ter o mesmo resultado
- teste tem que quebrar quando o seu sistema muda
- deve ter uma razão clara para falhar
- deve ser fácil de ler
- seja fácil de mudar e evoluir

### Testes sem asserção: Um grande pecado
- código sem asserção

### Testes podem dificultar refatoração?
- sim
- **Testes de unidade muito específicos podem dificultar a refatoração**: Quanto mais focado em uma unidade, maior o risco de acoplamento com detalhes internos do código.  

- **Mocks podem aumentar o acoplamento**: Testes que dependem fortemente de mocks tornam mudanças estruturais mais difíceis.  

- **Monitorar a fragilidade dos testes**: Se pequenas mudanças no código quebram muitos testes, é necessário reavaliar a abordagem de testes.  

- **Testes mais abrangentes (casos de uso) reduzem a dependência de detalhes internos**: Testes que validam funcionalidades completas são mais resistentes a refatorações.  

- **Equilíbrio entre granularidade e confiabilidade**: Testes devem ser detalhados o suficiente para detectar erros, mas sem impedir a evolução do código.  


### Testes estúpidos são bons
- estúpidos: igual a testes simples que testam pequenas coisas e parecem irrelevantes
- trazem esse sentimento porque eles testam somente a unidade de um "componente"
- teste estúpidos pode ser aquele que duplicam o código de produção. Aquele código de produção que verifica um valor maior que 1000 e no testes também realiza a mesma lógica. Cada alteração neste código de produção gera uma alteração do teste de unidade.

### Haja dilema!
Introdução sobre o assunto.

### Flaky testes: O que são, onde vivem e o que comem
- [Paper: An Empirical Analysis of UI-based Flaky Tests](https://arxiv.org/abs/2103.02669)
- são testes que passam algumas vezes e outras vezes falham. Intermitentes.
- concorrência, assincronismo, dependências externas são algumas causas
- limpar a bagunça é uma maneira de evitar o problema
- mover testes que já foram flaky em uma classe/arquivo separado
- um testes flaky deve ser executado uma serie de vezes para garantir que ele não falhe novamente
- testes flaky é um sinal de código de produção ou testes com muita complexidade, classes grandes

### Devs e QAs: Uma relação complementar

### Sendo pragmático na hora de testar microserviços
- testar o serviço isolados das dependências externas
- testes integrados com os caminhos fundamentais do sistema

### Como testar sistemas legados: Não me vem com essa de refatorar
- são sistemas difíceis de testar porque não foram criados pensado em testes
- livro sobre a refatoração de sistemas legados: working effectivelly with Legacy code (Robert C. Martin Series)
- criar ferramentas para testar o seu sistema legado (framework interno)
- Preocupações:
  - colocar o sistema no estado que você precisa
  - executar os casos de uso de maneira fácil
  - como observar o comportamento do sistema (fácil de fazer assertions)

### Ah, eu não tenho tempo de testar
- testes não garante que uma palicação não tenha bugs
- testes automatizados são mais baratos que tests manuais que precisam de bancos de dados e serviços externos

### Até a próxima

### Agora escreva todos os testes para o desafio da Casa do Código
- lembrete para voltar ao [desafio da Casa do Código](#desafios) e escrever os testes
