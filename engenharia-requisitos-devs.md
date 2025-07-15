# Engenharia de Requisitos para Devs
Engenharia requisito é fundamental para maximizar a qualidade da entrega, tanto do ponto de vista de geração de valor para clientes quanto do ponto de vista de impacto no código desenvolvido. Este curso traz uma abordagem totalmente acionável no dia a dia se inspirando em práticas formais, ágeis e também no Shape Up.

## Introdução
### Motivo da Existência deste Curso
- Requisitos bem refinados e validados aumentam a eficiência do desenvolvimento.
- Diminuem retrabalho e o tempo de codificação.
- Reduzem o custo operacional de transformar ideias em código.

### Autoavaliação de Confiança sobre Engenharia de Requisitos
Antes de começar, antes de tudo mesmo, é importante que você responda um formulário onde você vai realizar uma autoavaliação sobre seu conhecimento no tema deste curso. 

Para acessar o formulário siga este link

Como você avalia este conteúdo?

### É um curso de Engenharia de Requisitos formal?
- entender o máximo possível sobre o que vai ser feito
- tudo começa com um requisito validado
- Quanto melhor for esse trabalho prévio, mais rápido e com maior qualidade será o processo de codificação.
- A entrega de valor vem da clareza, validação e planejamento — e não apenas da velocidade na hora de escrever o código.

### É um curso de Requisitos Ágeis?
- estudo global "Naming the Pain in Requirements Engineering" (nomeando as dores na engenharia de requisitos).
- Estudo mostra que empresas que se dizem ágeis enfrentam os mesmos problemas:
  - Requisitos mal refinados.
  - Comunicação insuficiente com stakeholders.
  - Histórias mal escritas no backlog, gerando retrabalho.

### Referência bibliográfica
- [Requirements Engineering and Agile Software Development Versão 1](https://dev-eficiente.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6Mzg4ODM1MywicHVyIjoiYmxvYl9pZCJ9fQ==--dfda9930877f3f20579372468a3fd452bbac5eef/Agile_requirements.pdf)
- [Requirements Engineering and Agile Software Development Versão 2](https://dev-eficiente.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6Mzg4ODM1MiwicHVyIjoiYmxvYl9pZCJ9fQ==--81d891d750419c0cf78eb22ec3850a910e46bf57/agile-requirements-2.pdf)
- [Agile Requirements Engineering: A systematic literature review](https://dev-eficiente.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6Mzg4ODM1MSwicHVyIjoiYmxvYl9pZCJ9fQ==--31e4c1370c3f0adc2204f5508b2d0723a32eada0/Agile_Requirements_Engineering_A_systema.pdf)
- [Naming the Pain in Requirements Engineering Contemporary Problems, Causes, and Effects in Practice](https://elib.uni-stuttgart.de/bitstream/11682/8847/3/EMSE-D-15-00239_postprint.pdf)
- [Status Quo in Requirements Engineering: A Theory and a Global Family of Surveys](https://arxiv.org/abs/1805.07951)
- [A systematic literature review on agile requirements engineeringpractices and challenges](https://ris.utwente.nl/ws/portalfiles/portal/6414697/1-s2.0-S074756321400569X-main.pdf)
- [Software Engineering Sommerville](https://engineering.futureuniversity.com/BOOKS%20FOR%20IT/Software-Engineering-9th-Edition-by-Ian-Sommerville.pdf)
- [Shape Up](https://basecamp.com/shapeup/0.3-chapter-01)


Materiais complementares:
- [Agile_Requirements_Engineering_A_systema](./materiais/Agile_Requirements_Engineering_A_systema.pdf)
- [agile-requirements-2](./materiais/agile-requirements-2.pdf)
- [Agile_requirements](./materiais/Agile_requirements.pdf)

O autor sugere a leitura de Naming the Pain in Requirements Engineering Contemporary Problems, Causes, and Effects in Practice e depois Shape Up.

## Motivação e conceitos fundamentais
### O impacto da Engenharia de Requisitos mal feita
- Pesquisa: Naming the Pain in Requirements Engineering Contemporary Problems, Causes, and Effects in Practice
- Pesquisa realizada com empresas que se declaram ágeis
- baseada em perguntas abertas de multiplas escolhas
- Dores:
  - requisitos incompletos
  - falha de comunicação entre equipe e clientes
  - mudanças de objetivos e requisitos
  - requisito mal especificado e abstrato
  - falta de tempo
 
 ### Possíveis Benefícios de Triturar muito bem um Requisito
- deixa mais nítido o entendimento do que precisa ser feito
- entregar o que realmente é necessário e sem falhas
- diminui o custo de de implementação
- Revelar problemas com antecedência
- Testes mais eficazes

### Por que triturar requisitos é importante para a empresa?
- entregar mais rápido o possível
- reduzir o máximo do custo operacional

### Inspiração no método Shape Up para Triturar Requisitos
- minimizar surpresas, diminuir os bugs e retrabalho. Encontrar o mais próximo do esperado da funcionalidade.
- Parte 1: Shapping, do livro Shape Up, principal inspiração no treinamento. Entender se realmente vale a pena. A etapa de Shaping é destaque e base do conteúdo do vídeo — ela se conecta diretamente ao conceito de “triturar requisitos”.
- Parte 2: Betting (aposta faz sentido)
- Parte 3: Building: construção do software pelos membros da equipe de desenvolvimento

Gerado por IA:

O livro é dividido em três partes principais, além de uma introdução, conclusão e apêndices:

- Parte Um: Moldar (Shaping): Detalha o trabalho de pré-projeto. Aborda como definir o apetite, esboçar uma solução ("breadboarding" e "fat-marker sketches"), identificar e resolver "buracos de coelho" (riscos), e como escrever o "pitch" – um documento que apresenta a ideia moldada.
- Parte Dois: Apostar (Betting): Explica como os projetos são escolhidos para os ciclos de seis semanas. Apresenta o conceito de "apostas, não backlogs" e descreve a "mesa de apostas" (betting table) – uma reunião onde as partes interessadas decidem em quais pitches apostar. Inclui o conceito de "cool-down" (uma pausa de duas semanas entre os ciclos para tarefas ad-hoc e correção de bugs).
- Parte Três: Construir (Building): Discute as expectativas e práticas das equipes durante o ciclo. Explora como as equipes se orientam, descobrem tarefas, integram design e programação ("get one piece done"), mapeiam o escopo ("scope map"), mostram progresso ("hill chart") e decidem quando parar ("scope hammering").

O Que é "Shaping"?

- É o processo de definir os elementos-chave de uma solução antes de um projeto ser "apostado" (comprometido com uma equipe).
- Envolve tornar uma ideia de projeto abstrata mais concreta, estabelecendo limites e reduzindo riscos.
- A solução é definida no nível certo de abstração: concreta o suficiente para as equipes saberem o que fazer, mas abstrata o suficiente para terem espaço para trabalhar os detalhes interessantes por si mesmas.

> O "Shaping" é o processo de tornar uma ideia de projeto abstrata mais concreta, mas sem ir longe demais nos detalhes. É como fazer um esboço bem claro, em vez de um desenho técnico completo. Esse trabalho é feito por um pequeno grupo sênior da empresa, que trabalha em paralelo às equipes de desenvolvimento.

### Um pouco sobre Requisitos Funcionais e Não Funcionais
- shapping vale tanto para requisitos funcionais quanto não funcionais
- Conceitos baseados no livro "Software Engineering" de Ian Sommerville. Capitulo 4.1 **Functional and non-functional requirements**
- Funcionais: é algo que possui um input e um output. São declarações sobre serviços que o sistema deve oferecer.
- Não Funcionais: São restrições ou exigências técnicas sobre o sistema como um todo. Envolvem fatores como:
  - Desempenho (ex: tempo de resposta ≤ 200ms).
  - Escalabilidade (ex: suportar milhares de usuários simultâneos).
  - Disponibilidade (ex: uptime garantido).

## Passos práticos para refinar (tritura) um requisito
### Passo #1 - Busque acesso a quem idealizou o requisito
- descobrir a pessoa que gerou a ideia do requisito. Ter acesso a pessoa que teve a ideia, a fonte de maior confiança no requisito
- é comentado sobre o uso de IA generativa que gera aluscinações e de forma confiante no assunto. Algumas pessoas que dominam o produto, mas não são as "donas" da criação do requisito podem causar o mesmo problema.

### Passo #2 - Interrogando quem pediu o requisito
- Antes de codar, é essencial compreender o motivo do surgimento do requisito.
- A ideia é identificar buracos que possam gerar retrabalho ou falhas no software.
- O objetivo é reduzir surpresas na implementação, não apenas com testes, mas com clareza sobre o propósito do que está sendo desenvolvido.
- 5 porquês: técnica de questionamento que ajuda a chegar na raiz do problema. Pergunte "por que" cinco vezes para aprofundar o entendimento.

🛠️ Exemplo prático

```
Requisito: “Usuário deve informar o telefone no cadastro.”
Perguntas que revelam o porquê:
Por que pedir o telefone?
Porque será usado para enviar mensagens.
Por que enviar mensagens é importante?
Porque amplia canais de comunicação e potencializa vendas.
Por que mais canais são necessários?
Porque os existentes estão saturados ou limitados.
```

### Passo #3.1 - Faça double e triple check
- aprendizagem negativa
- aprendizagem parcial
- usar feedback para saber de forma mais rápida possível. Descreva o passo a passo da solução para a pessoa dona da funcionalidade.
- é preciso de um triplo check ou mais para evitar um entendimento equivocado do requisito.
- gap no processo de desenvolvimento: pessoa não está disponível para receber um feedback

Gerado por IA com base na transcrição e minhas anotações:


#### 🎯 **Objetivo**
- Garantir que o entendimento do requisito esteja **correto e validado** antes da implementação.
- Evitar erros originados por **aprendizado negativo** ou **parcial**.
- Utilizar o feedback como ferramenta essencial para validar e refinar.

---

#### 🔎 **Conceitos-chave**
- **Aprendizagem negativa**: quando se pensa que entendeu, mas na verdade entendeu errado.
- **Aprendizagem parcial**: quando se entende apenas parte do conteúdo necessário.
- **Feedback rápido**: ajuda a corrigir o entendimento o quanto antes, evitando desperdício de esforço.

---

#### 🔁 **Técnica de validação**
- Realize o **Double Check ou Triple Check** com quem solicitou a funcionalidade:
  - Explique, com suas palavras, o que você entendeu sobre o requisito.
  - Pergunte: *“É isso mesmo que você precisa?”*
  - Só siga adiante quando receber um **“É exatamente isso!”**

---

#### ⚠️ **Cenários de risco**
- **Falta de disponibilidade da fonte de feedback**:
  - Indica um **gap no processo de desenvolvimento**.
  - Reduz confiabilidade da entrega.
- Mesmo quem participou da concepção do requisito deve **rever o entendimento final** antes da codificação.

---

#### 🧠 **Cultura de validação como prática**
- Assim como o código exige testes automatizados, o requisito exige **confirmação explícita de entendimento**.
- Criar uma cultura onde nenhum código vai para produção sem que o **requisito esteja validado** pela pessoa que o pediu.
- Se não for possível validar, seguir com um **alerta de risco de confiabilidade** registrado pela equipe.

### Passo #3.2 - Materialize o entendimento com desenhos de alto nível
Aqui fala sobre as formas de materializar o entendimento da solução.

- no livro de shape up: capitulo 4 - Breadboarding: uma ideia fluxo somente com escrita no lugar de usar imagens. Através do fluxo textual é possível identificar os fluxos que fazem sentido, por exemplo, permitir um pagamento no momento de uma compra ou em ummomento futuro.
- fat marker sketcher: aborda de uma forma diferente, usa algo visual (rascunhos da telas).

Gerado por IA:

#### 🛠️ Técnicas para Materializar o Entendimento de Requisitos

##### 🔡 Breadboarding (Desenho em Protoboard)

- **O que é**  
  Técnica inspirada na engenharia elétrica, usada para descrever o fluxo de uma ideia **apenas com palavras**, sem elementos visuais elaborados.

- **Como funciona**  
  Lista-se os **componentes importantes e suas conexões** lógicas para visualizar o comportamento da funcionalidade. Permite "brincar" com o fluxo e verificar se ele atende ao caso de uso proposto.

- **Exemplo**  
  Imagine um recurso de *pagamento automático*:  
  `Menu de fatura → Opção 'Ligar Pagamento Automático' → Tela de Configuração (campos de cartão) → Ação 'Enviar Dados' → Pedido de Confirmação`  
  Durante o processo, pode surgir uma reflexão útil como:  
  “O usuário deve definir se quer pagar agora ou futuramente?”

- **Benefício**  
  Ajuda a identificar **fluxos lógicos, gargalos e dúvidas** rapidamente sem distrações visuais.


#### 🖍️ Fat Marker Sketches (Esboços com Caneta Grossa)
- **O que é**  
  Técnica visual que usa **rascunhos de baixa fidelidade**, feitos com caneta de ponta grossa para priorizar estrutura em vez de estilo.

- **Como funciona**  
  A caneta grossa obriga foco nos **elementos essenciais**, descartando microdetalhes como cores ou perfeição de layout. Ideal para representar rapidamente telas e interações.

- **Exemplo**  
  Para uma funcionalidade de agrupar *to-dos*:
  - Esboços mostram **blocos de tarefas agrupadas e não agrupadas**.
  - Discussão: “Teremos um botão ‘Adicionar’ em cada grupo ou um botão único?”

- **Benefício**  
  Testa visualmente a **viabilidade de layouts e interações**, facilitando o diálogo entre devs, designers e product owners — com rapidez e custo mínimo.



### Passo #4 - Especifique cenários de testes
- especificações dos testes de cenários, desenhando os fluxos que deveria ser executado par atender o requisito
- o fato de conseguir os cenário já demonstra que os requisitos foram bem "triturados"
- este e os outros passos anteriores são trabalhosos, mas são fundamentais para evitar retrabalho e falhas no software. É muito mais fácil corrigir neste moento do que depois que o código já foi escrito.


### Passo #5 - Descreva o passo a passo de implementação antes de codar de fato
Até este momento já passamos pelo passos:
  - entender os requitos
  - criar uma interpretação dos requisitos com feedbacks
  - materalizar a solução de duas formas distintas
  - mapear os cenários de testes

Agora vamos aos passos que precedem a implementação da solução:
- criar um esboço do passo a passo tomando com base as restrições definidas nos requisitos, assim como as informaçoes de entrada.
- a descrição dos cenários de testes também auxiliam a guiar este passo a passo

> Se você nã consegue imaginar o passo a passo, como é que você vai conseguir construir a solução?

Sobre Cognitive walkthrough: [link](./materiais/walkthrough.pdf)

### Um exemplo de template de requisito bem triturado
Exemplo de template: 
- original: https://gist.github.com/asouza/a51faabb54de507a22025ee64227fda2 
- ou no fork: https://gist.github.com/adrianoavelino/2b6eba7e86171a3aae1b3dce82afd054

Template:
- descrição incial
- Quem pediu ou é responsável essa ideia?
- Descrição detalhada do entendimento das pessoas que vão pegar este requisito para fazer
- Nosso entendimento foi validado?
- materalizar o entendimento com desenhos de alto nível
- rascunhos foram validados?
- Especificação dos cenários de testes
- Estes cenários foram validados?
- criação histórias/tarefas
- lista de passo a passo para implementação de cada história

### Como exercitar ?
- Utilizar em tarefas que já foram realizadas no passado em usa squad. Não é necessário fazer exercícios artificiais ou templates genéricos para treinar o refinamento de requisitos.

O melhor exercício é usar tarefas reais do seu trabalho, que já estão registradas no backlog.

🛠️ Como praticar de forma eficaz
- Analise requisitos já existentes em backlog, sejam novos ou antigos.
- Aplique as técnicas de trituração de requisitos aprendidas no módulo.
- Faça uma análise qualitativa com base nos conceitos do treinamento.

### Vamos verificar sua confiança mais uma vez?
Formulário para autoavaliação após o consumo do material.

### Até a próxima
Agradecimento e finalização do curso
