
## Testes de Software para Devs: Princípios e Práticas Sistemáticas
### Bem vindo ao curso!
- voltado para pessoas que já escrevem testes e querem um próximo passo

### Por que testar?
- explica sobre um caso real de um sistema sem uso de testes automatizados

### Leis do teste de software
- teste exaustível é impossível (executar todas as situações)
- variação nos testes de software. Iniciar com unitário em certo tempo deixar de encontrar problemas e chega o momento de usar outros tipos de testes como integrados e sitema
- não existe uma maneira unica de testar um software
- verificação vs validação (aqui está mais focado na verificação)
  - verificação: garantir que o funciona como esperamos
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

- [Essa aula pode ser consumida por aqui.](https://www.youtube.com/watch?v=Dw0W3zAUAzw&list=PPSV)
- [Estudo: How Developers Engineer Test Cases: An Observational Study](https://arxiv.org/pdf/2103.01783)

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
- dependências internal ou peer. (Livro Growing Object-Oriented Software Guided by Tests: Steve Freeman e Nat Pryce)
- peer: um carrinho de compra que dpende de um repositório (banco de dados)
- internal: regra de negócio complicada onde a lógica é dividida em diversas classes. A regra de claculo de imposto, por exemplo.
- mockamos somente dependências do tipo peer, internal não queremos mockar.

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

Links:
- (test desiderata kent beck)[https://testdesiderata.com/]
- https://medium.com/@kentbeck_7670/test-desiderata-94150638a4b3

### Testes sem asserção: Um grande pecado
- evite código sem asserção

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
