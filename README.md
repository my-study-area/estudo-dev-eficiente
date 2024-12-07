# estudo-dev-eficiente
estudo-dev-eficiente

Link: https://dev-eficiente.memberkit.com.br/
Google doc: https://docs.google.com/document/d/18j3Z5PUNkN1zMayhOvj2wgp7v5u97hBHyEXxKv2HuuA/edit?tab=t.0

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
