# Resiliência muito além do Retry
Quais são as principais técnicas utilizadas pelos times da AWS e também por times envolvidos em construção de sistemas que rodam em aviões para aumentar a resiliência do software? Este curso é um mergulho profundo sobre este tema.

Link: https://plataforma.deveficiente.com/cursos/design-de-codigo/aulas/ideia-basica-do-modulo-e-como-ele-foi-projetado


## Ideia básica do módulo e como ele foi projetado
- definição sobre resiliência
- será focado na resiliência a nível de código
- terão exercícios de código e imaginação (identificando as técnicas mentalmente)


<details>
<summary>Gerado por IA</summary>
Aqui está um resumo bem conciso do módulo de **Resiliência**:

* **Objetivo:** Ensinar a tratar a resiliência como prioridade no projeto, adaptando o nível de exigência à natureza de cada software.
* **Foco:** Práticas focadas estritamente a **nível de código** (deixando de lado infraestrutura e requisitos).
* **Estrutura:** Separação entre **Princípios** (estratégias sólidas e duradouras) e **Técnicas** (formas de implementação que podem evoluir).
* **Inspiração:** Baseado não apenas em gigantes da tecnologia, mas em sistemas críticos onde falhas custam vidas (aviação, foguetes, UTIs) e em exemplos do mundo real (engenharia antisísmica no Japão).
* **Dinâmica:** Prática por meio de códigos e **exercícios de imaginação** (como desenhar a resiliência de sistemas complexos como o Uber).
</details>



## Estabelecendo uma definição para resiliência
- o autor compara a resiliência com uma frase do filme Rock, lutador
- o sistema precisa ser capaz de continuar funcionando em momentos não esperado
- uma outra forma de resiliência é informar o cliente de um problema e avisá-lo quando o sistema estiver normalizado

<details>
<summary>Gerado por IA</summary>
Aqui está o resumo sucinto desta nova transcrição:

* **A analogia (e o limite) do Rocky Balboa:** O instrutor cita a famosa frase de *Rocky Balboa* sobre "tomar porrada e continuar andando para frente". Embora seja uma boa base, para software isso não basta, pois o sistema não pode continuar andando de forma "capenga", entregando um serviço sem qualidade.
* **Definição de Resiliência para o módulo:** É a capacidade de um sistema **continuar operando em níveis aceitáveis** e entregando o esperado para o usuário, mesmo quando enfrentar problemas (previsíveis ou inesperados).
* **Manutenção de Habilidades:** Resiliência também significa a capacidade do sistema de não perder suas funções principais diante de uma falha.
* **Exemplo prático (Checkout de Pagamento):** Se o emissor de boletos cai, um sistema resiliente não quebra o checkout inteiro; ele se adapta, oferecendo uma alternativa (como capturar o e-mail do cliente para processar o boleto quando o serviço voltar).
* **Foco:** O foco total continua sendo em como implementar essas estratégias de adaptação **diretamente no código**.

</details>



## Resiliência em outros contextos
- vai além do desenvolvimento de software, existem caso s de resiliência em cidades para casos de desastres como terremoto etc.
- uma casa de show que utiliza geradores em casos de queda de enrgia elétrica
- numa UTI onde os equipamentos precisam permanecer ligados permanentemente para manter uma pessoa em vida
- o autor explica sobre a necessidade de entender o processo de resiliência fora do contexto da engenharia de software




## Referência literária
- Resilient4J - https://resilience4j.readme.io/docs/getting-started
- RFC sobre Idempotência - https://www.rfc-editor.org/rfc/rfc7231#page-23
- Um pouco sobre outbox pattern - https://medium.com/@egorponomarev/outbox-pattern-in-spring-boot-8e8cf116f044
- Advanced error handling na Stripe - https://stripe.com/docs/error-low-level#idempotency
- Idempotência na Stripe - https://stripe.com/docs/api/idempotent\_requests
- Towards a Conceptual Framework for Resilience Engineering - https://www.researchgate.net/profile/Scott-Jackson-13/publication/224436791\_Towards\_a\_Conceptual\_Framework\_for\_Resilience\_Engineering/links/542b0b7f0cf29bbc126a7db7/Towards-a-Conceptual-Framework-for-Resilience-Engineering.pdf
- An Architecture, System Engineering, and Acquisition Approach for Space System Software Resiliency - https://www.sciencedirect.com/science/article/abs/pii/S0950584917300575
- Introducing Retry Throttling - https://aws.amazon.com/blogs/developer/introducing-retry-throttling/
- Token bucket - https://en.wikipedia.org/wiki/Token\_bucket
- Timeouts, retries, and backoff with jitter - https://aws.amazon.com/builders-library/timeouts-retries-and-backoff-with-jitter/?did=ba\_card&trk=ba\_card
- Avoiding fallback in distributed systems - https://aws.amazon.com/builders-library/avoiding-fallback-in-distributed-systems/?did=ba\_card&trk=ba\_card
- Avoiding overload in distributed systems by putting the smaller service in control. - https://aws.amazon.com/builders-library/avoiding-overload-in-distributed-systems-by-putting-the-smaller-service-in-control/?did=ba\_card&trk=ba\_card
- Making retries safe with idempotent APIs - https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/?did=ba\_card&trk=ba\_card
- Minimizing correlated failures in distributed systems - https://aws.amazon.com/builders-library/minimizing-correlated-failures-in-distributed-systems/?did=ba\_card&trk=ba\_card
- Reliability, constant work, and a good cup of coffee - https://aws.amazon.com/builders-library/reliability-and-constant-work/?did=ba\_card&trk=ba\_card
-  Principle Of Least Astonishment - https://web.archive.org/web/20140508144540/http://c2.com/cgi-bin/wiki?PrincipleOfLeastAstonishment
- Zalando RESTful API and Event Guidelines - https://opensource.zalando.com/restful-api-guidelines/#
- Bulkhead pattern - https://learn.microsoft.com/en-us/azure/architecture/patterns/bulkhead
- Quality Attribute Workshops (QAWs), Third Edition - https://insights.sei.cmu.edu/library/quality-attribute-workshops-qaws-third-edition/
- How Complex Systems Fail - https://www.adaptivecapacitylabs.com/HowComplexSystemsFail.pdf
- Improved resiliency with backpressure and admission control for Amazon OpenSearch Service - https://aws.amazon.com/blogs/big-data/improved-resiliency-with-backpressure-and-admission-control-for-amazon-opensearch-service/
- Beyond five 9s: Lessons from our highest available data planes - https://aws.amazon.com/builders-library/beyond-five-9s-lessons-from-our-highest-available-data-planes/?did=ba\_card&trk=ba\_card
- Amazon's approach to building resilient services - https://aws.amazon.com/builders-library/amazon-approach-to-building-resilient-services/?did=ba\_card&trk=ba\_card




## Quando suportar resiliência
- erro: deixar para implementar algo importante no final. Quanto antes identificar a resiliência, melhor.


<details>
<summary>Gerado por IA</summary>

* **A regra de ouro:** Quanto mais importante for a resiliência para o fluxo do software, **mais cedo** ela deve ser pensada.
* **O maior erro:** Deixar para implementar mecanismos de resiliência (como *retries*) no meio ou no fim do desenvolvimento. Isso aumenta o custo financeiro, exige mais alterações no código e impede uma reflexão profunda.
* **Reflexão profunda vs. Over Engineering:** Planejar cedo não gera excesso de engenharia (*over engineering*). Pelo contrário: refletir com antecedência ajuda a equipe a entender onde investir em robustez e onde adotar estratégias mais simples (como o *Let it Crash* — deixar quebrar e avisar o usuário).
* **Exemplo real (Software Aeroespacial):** O instrutor cita estudos sobre sistemas espaciais onde deixar para implementar a resiliência tardiamente gerou custos altíssimos e retrabalho, mostrando que até projetos críticos erram nisso.
* **Análise de Criticidade (Exemplos práticos):**
* **Alta criticidade (Pensar desde o início):** Fluxos financeiros (pagamentos, Pix) ou o carregamento de um vídeo em uma plataforma de streaming.
* **Baixa criticidade (Abordagem simples):** O sistema de dar "curtir" ou "nota" em um filme na Netflix. Se esse serviço cair, o front-end simplesmente não mostra nada, sem prejudicar a experiência principal (ver o vídeo).
</details>




## Como vamos implementar a resiliência?
- serviço de envio de e-mail:
- tipo de técnicas
- princípios
* **Por que separar Princípios de Técnicas?** O instrutor reforça a importância dessa divisão antes de detalhar o conteúdo:
* **Princípios:** São estáveis e servem como diretrizes arquiteturais para a equipe guiar o desenvolvimento.
* **Técnicas:** São voláteis (como uma biblioteca nova que surgiu). Elas mudam, mas sempre devem se encaixar nos princípios definidos pela equipe.





## Constant Work Pattern: Definição
- primeiro princípo: Constant Work Pattern (padrão do trabalho constante)
- serviço de email:
  a. utiliza diversos proverdores de email, caso um falhe, utiliza outro. As falahas são chamadas de fallback
  b. provedor A falhou, tlvez o provedor não atenda totalmente o trabalho.
- o princípio diz que todos os caminhos camnhos devem ser estressados de forma constante. Não deixar um provedor como principal, mas deixar todos como principal e em constante utilização.

<details>
<summary>Gerado por IA</summary>

## 🏗️ O Princípio do Trabalho Constante (*Constant Work Pattern*)

Este princípio consiste em projetar o sistema para que ele execute a mesma quantidade de trabalho ou utilize os mesmos caminhos de forma contínua, eliminando modos de operação exclusivos para "emergências".

### O Problema do *Fallback* Tradicional
* Em uma arquitetura comum de alta disponibilidade (ex: três provedores de e-mail: A, B e C), o desenvolvedor define o Provedor A como principal e os outros como *fallbacks* (planos de contingência).
* **O risco:** O caminho A é exaustivamente testado, estressado e monitorado. Se o Provedor A falhar em um momento crítico, o sistema acionará os caminhos B ou C, que foram pouco explorados em produção. Isso pode revelar comportamentos inesperados, delays desconhecidos ou falhas ocultas justamente na hora da crise.

### A Solução pelo Trabalho Constante
* Em vez de tratar B e C como caminhos secundários acionados apenas na falha, o sistema distribui a carga igualmente entre todos o tempo todo (ex: se houver 99 chamadas, 33 vão para o provedor A, 33 para o B e 33 para o C).
* **Vantagem:** **Previsibilidade**. Como todos os caminhos são executados de forma constante, a equipe ganha sabedoria real sobre o comportamento de cada um deles sob carga normal e estresse. Se um provedor falhar, o sistema apenas deixa de enviar requisições para ele, mantendo a operação nos outros caminhos que já estão aquecidos e validados.
</details>







## Constant Work Pattern: Exemplo com execução síncrona e assíncrona
Parte 2 do trabalho constante
- front-end de pagamento de forma assíncrona. As vezes a chamada falha e manda a mensagem para um fila e envia uma resposta de sucesso para o cliente. Isso quebra o contant work pattern (padrão do trabalho constante)
- para resolver podemos assumir o serviço como assincrono. A tela do usuário recebe a informação que será notificado quando finalizar ou o usuário pode voltar na tela do sistema para consultar futuramente.


<details>
<summary>Gerado por IA</summary>

## 🏗️ O Princípio do Trabalho Constante — Parte 2: Consistência de Contratos
O princípio do trabalho constante também se aplica ao **modelo de processamento** e à previsibilidade dos contratos entre sistemas (Back-end e Front-end/API Cliente).

### A Quebra do Princípio (Misturando Síncrono e Assíncrono)
* **Cenário Comum:** Um sistema processa pagamentos de forma **síncrona** (o cliente aperta o botão, espera o gateway responder e recebe a confirmação). Quando o gateway falha, o desenvolvedor cria um *fallback*: joga o pagamento em uma fila para ser processado de forma **assíncrona** em background.
* **O problema:** Isso quebra o princípio porque muda o comportamento do fluxo. A API cliente agora precisa lidar com um `if`: se o pagamento foi processado na hora, mostra sucesso; se caiu na fila, precisa exibir uma mensagem dinâmica explicando que "está processando e o resultado irá por e-mail". Isso gera complexidade no código e brechas para o usuário achar que a operação falhou quando na verdade está na fila.

### A Solução pelo Trabalho Constante
* Se a falha é uma possibilidade real, o design do sistema deve assumir o pior cenário como o padrão definitivo.
* **Abordagem Correta:** O processamento passa a ser **assíncrono por padrão (*by default*)**. Quem chama a API sempre recebe a mesma resposta: *"Recebido, estamos processando"*.
* **Vantagem:** O Front-end/Cliente é desenhado de uma única forma estável (ex: uma tela de espera que atualiza sozinha ou avisa que a confirmação irá por e-mail). Não importa se o Back-end processou o pagamento em 1 segundo ou se precisou usar uma fila de contingência devido a uma instabilidade; para quem consome, o comportamento e o código permanecem rigorosamente os mesmos.
</details>





## Constant Work Pattern: Exemplo com failover vs fallback
Parte 3
- Utilizar um fallback fere ou não o princípio do padrão do trabalho contante? R: sim, fere o princípio
- E uma Aplicação com deploy em mais de uma zona de disponibilidade numa cloud pública? R: Não, não fere o princípio


<details>
<summary>Gerado por IA</summary>

## 🏗️ O Princípio do Trabalho Constante — Parte 3: Failover e Infraestrutura Idêntica
Nesta etapa final, o instrutor consolida o entendimento sobre o que fere ou não o princípio e introduz o conceito de resiliência por réplicas idênticas.

* **O veredito sobre o *Fallback* tradicional:** Usar um *fallback* (um plano B com mecânica diferente) **fere** o princípio do trabalho constante. Ele só deixa de ferir se passar a ser usado o tempo todo (deixando de ser um fallback e virando um caminho padrão).
* **Failover vs. Fallback (A mesma mecânica em locais diferentes):**
* Se o seu sistema consome um serviço interno que está implantado (*deployed*) em múltiplas zonas de disponibilidade (ex: Zona A e Zona B da AWS);
* Se a chamada para a Zona A falhar e o sistema direcionar a requisição para a Zona B, isso **não fira o princípio**.


* **Por que isso respeita o princípio?** Porque o código, a API, o contrato e a mecânica de processamento são rigorosamente os mesmos. Trata-se de uma estratégia de **Failover** na mesma infraestrutura. O sistema continua realizando exatamente o mesmo tipo de trabalho, mudando apenas o endereço físico da réplica que vai responder à chamada.
</details>







## Constant Work Pattern: Reflexão
- o autor pede para realizar uma pausa e fazer uma flexão sobre o assunto e o entendimento:
  - o que é o padrão do trabalho contante?
  - vc se sente confortável em explicar para uma pessoa?
  - em que situação poderia ter aplicado essa técnica em seu local de trabalho?
  - se tivesse aplicado o que teria acontecido?





## Princípio Idempotência: Definição
- cliente pode passar uma chave de idempotência
- idempotência no site da strip
- idempotência na aws
- idempotência na RFC: https://www.rfc-editor.org/info/rfc7231/#page-23
- idempotência na wikipédia, relacionada na matemática:
> Em matemática e ciência da computação, a idempotência é a propriedade que algumas operações têm de poderem ser aplicadas várias vezes sem que o valor do resultado se altere após a aplicação inicial.

Numa requisição HTTP ocorre quando uma método HTTP sempre tem como "resultado" o mesmo valor, por exemplo, o verbo HTTP GET.

Tabela com método HTTP safe e idempotent: https://www.rfc-editor.org/info/rfc7231/#section-8.1.3

<details>
<summary>Gerado por IA</summary>

## 🔒 O Princípio da Idempotência
O instrutor define a **Idempotência** como um princípio arquitetural essencial para a resiliência (especialmente em cenários de *retry*), cujo foco principal deve ser o **resultado entregue ao cliente**, e não os detalhes internos da implementação.

### Definição (Matemática e Computação)
> Idempotência é a propriedade que algumas operações têm de poderem ser aplicadas várias vezes sem que o valor do resultado se altere após a aplicação inicial.

* **O Efeito Pretendido (*Intended Effect*):** Citando a RFC do HTTP, o instrutor destaca que uma requisição é idempotente se o efeito pretendido no servidor for o mesmo, seja para uma ou múltiplas chamadas idênticas.
* **Foco no Valor/Retorno:** Mais importante do que o comportamento interno do servidor (se ele salvou logs duplicados, alterou um *timestamp* ou disparou uma *exception*) é garantir que o cliente receba uma **resposta consistente**. Se a primeira requisição deu certo, as repetições (com os mesmos parâmetros e contexto) devem permitir que o cliente continue confiando no sucesso da operação.

### Análise dos Métodos (Teoria vs. Mercado)
* **GET:** É idempotente por definição, pois consultas repetidas não deveriam alterar o estado do sistema.
* **POST:** Pela especificação oficial do HTTP (RFC), o POST **não** é idempotente. No entanto, o mercado (como a API da Stripe) amplamente adota **POSTs idempotentes** (enviando uma *Idempotency-Key*) para fluxos sensíveis como a criação de pagamentos, evitando cobranças duplicadas em caso de *retry*.
* **DELETE (O exemplo do Status 200):** O `DELETE` é nativamente idempotente. Se um cliente tenta deletar o recurso `ID: 1` e a rede cai antes de receber a resposta, o *retry* chamará o `DELETE` novamente. O servidor, ao notar que o recurso já foi removido (ou ao receber `0 linhas alteradas` do banco), deve responder com sucesso (`200 OK`) em vez de erro. Isso simplifica drasticamente a lógica do cliente, que não precisa tratar um erro para algo que ele mesmo já havia solicitado com sucesso.
</details>


## Princípio Idempotência: Exemplos pelo mundo
- o autor fala sobre cenário de uma segunda requisição não ser realizada com sucesso duas vezes. Na api da strpe é utilizado um header passando uma Idempotency-Key. Ao receber uma segunda requisição com mesma Idempotency-Key, somente a primeira é processada e a segunda é somente retornada a mesma resposta.
- explicação sobre o assunto na Zalando: https://opensource.zalando.com/restful-api-guidelines/#149

<details>
<summary>Gerado por IA</summary>

## 🔒 Casos de Uso e Idempotência no Mercado (Stripe, AWS e Zalando)
Neste trecho, o instrutor compara a documentação de grandes empresas para demonstrar como o conceito de idempotência se traduz na prática.

### 💳 Stripe (Idempotency-Key)
* **Caso de Uso:** Evitar cobranças duplicadas geradas acidentalmente por cliques seguidos ou *retries* automáticos de rede.
* **Implementação:** O cliente envia um cabeçalho HTTP com uma **chave de idempotência única** (geralmente um UUID). A Stripe vincula essa chave à identificação daquele cliente. Se uma segunda requisição `POST` chegar com a mesma chave, a Stripe simplesmente **não reprocessa o pagamento** e devolve a resposta guardada.

### ☁️ AWS (Console e Recursos)
* **Caso de Uso:** Criação ou destruição de infraestrutura (ex: provisionar servidores).
* **Conexão com o Trabalho Constante:** A AWS busca maximizar a previsibilidade. Quando ocorre um *retry*, ela tenta **retornar exatamente o mesmo código HTTP de status e resposta**, mesmo que por debaixo dos panos o corpo da mensagem precise sofrer alguma variação pretendida. Isso impede que o console crie duas máquinas idênticas por erro de timeout.

### 👟 Zalando (Teoria vs. Alinhamento de Design)
* A documentação de APIs da Zalando traz uma exceção explícita: ela diz que a idempotência exige o mesmo efeito no servidor, mas **não obriga a retornar o mesmo código HTTP** (`does not require matching HTTP status codes`). Ela abre brecha para retornar, por exemplo, um erro `409 Conflict` na segunda tentativa.
* **Reflexão:** Embora o instrutor prefira a abordagem da AWS/Stripe (que mantém as respostas constantes para facilitar a vida do cliente), o caso da Zalando prova que design de software é sobre **seguir os combinados da equipe**, desde que fiquem explícitos na documentação.


## 💡 Bônus: O Cabeçalho `should-retry`
O instrutor destaca um recurso elegante encontrado na API da Stripe: o cabeçalho de resposta `should_retry: true/false`.

* **Como funciona:** O servidor guia dinamicamente o cliente. Em caso de falha, se o servidor souber que o erro é transiente (temporário), ele envia `should_retry: true`.
* **Vantagem:** Permite criar bibliotecas de *retry* inteligentes no cliente, que tentam novamente de forma automatizada e dinâmica, sem precisar atualizar o código manualmente a cada novo *end point* resiliente lançado pelo back-end.
</details>




## Princípio Idempotência: Reflexão
- explique para você o que é a idempotência?
- onde poderia ser aplicado no seu trabalho?
- O que vc acha sobre idempotência e trabalho constante?





## Princípio Não faça sofrer quem já está sofrendo: Definição
- um sistema A interno é acessado por diversos sistemas. Caso o sistema A receba um erro 500 de uma de suas integrações e o sistema não tem um sistema de retry com backoff e jitter, pode receber uma quantidade crescente de requisições que não seja possível suportar a carga.


<details>
<summary>Gerado por IA</summary>

## 🛑 O Princípio de "Não Faça Sofrer Quem Já Está Sofrendo"
Este princípio foca na empatia arquitetural e na proteção do ecossistema. Ele dita que **uma aplicação cliente não deve sobrecarregar um serviço que já está instável ou fora do ar**, evitando o efeito dominó que derruba sistemas inteiros.

### O Risco do Comportamento Egoísta
* **Cenário Comum:** O Sistema A depende do Sistema B. Se o Sistema B começa a falhar (erro 500) devido a um gargalo no banco ou estouro de memória, o Sistema A aciona sua política de *retry* de forma agressiva.
* **A Armadilha:** Fazer retentativas em massa sem o espaçamento correto é uma atitude "egoísta" do cliente (focada apenas em resolver o seu próprio problema). Se 1.000 requisições decidirem retentar 5 vezes cada uma, o serviço que já estava cambaleando receberá uma avalanche de **5.000 requisições**, impedindo-o completamente de se recuperar e respirar.
* **Exemplo Real:** O instrutor cita um caso onde um cliente fez *retries* exagerados e sem controle contra um recurso da AWS que passava por instabilidade. A AWS aplicou um bloqueio severo (*ban/throttling*) contra esse cliente, o que acabou derrubando a aplicação inteira por falta daquele recurso.

### Mecanismos de Proteção e Técnicas Derivadas
Para aplicar esse princípio e buscar a **previsibilidade** do ecossistema, utilizam-se técnicas consagradas:

* **No lado do Cliente (Quem consome):**
* **Backoff Exponencial com Jitter:** Aumentar o tempo de espera entre cada tentativa de forma exponencial (e com variações aleatórias) para não bombardear o servidor.
* **Circuit Breaker (Disjuntor):** Se o número de falhas seguidas passar de um limite, o circuito abre e o cliente **para imediatamente** de enviar requisições para o servidor caído, retornando um erro local ou *fallback* temporário.


* **No lado do Servidor (Quem atende):**
* **Rate Limiting / Throttling / Back Pressure:** O servidor estabelece um teto máximo de requisições suportadas (ex: 3.000/min). Qualquer requisição acima disso é rejeitada de imediato com um erro rápido (ex: HTTP 429), protegendo sua própria saúde.



### Curiosidade Técnica: Proteção a Nível de JVM
O instrutor menciona que em ambientes Java modernos (como os SDKs da AWS), existem mecanismos nativos capazes de monitorar a taxa de falha diretamente nas conexões de *socket*. Se a jvm perceber que as chamadas para determinado endereço estão falhando consecutivamente (ex: >60% de erro), ela barra a saída da requisição antes mesmo de gastar recursos de rede, protegendo o destino instantaneamente.
</details>




## Princípio Não faça sofrer quem já está sofrendo: Reflexão
- consegue identificar um cenário de uso no ambiente de trabalho?
- alguma aplicação que vc construiu poderia utilizar?
- o que é esse princípio?




## Princípio Let It Crash (Fail Fast): Definição
- se algo der errado e não ter o que fazer, deixe o erro acontecer naturalmente, mas não deixe de avisar o cliente
- se vc for o cliente e receber o erro 400 (erro gerado por informação inválida do cliente), deve-se evitar as retentativas porque o erro irá continuar acontecendo.

<details>
<summary>Gerado por IA</summary>

## 💥 O Princípio do *Let It Crash* (Deixe Falhar)
O princípio do **Let It Crash** aborda a importância de aceitar a falha inevitável em vez de tentar criar códigos excessivamente complexos e "arrumadinhos" que tentam mitigar todo e qualquer erro sem um alinhamento prévio.

### A Filosofia do "Deu Ruim? Avise e Pronto"
* **Sem Tratamentos Mágicos:** Se o sistema encontrou uma falha para a qual não foi explicitamente projetado para se recuperar (como uma indisponibilidade repentina do banco de dados), a melhor abordagem é **deixar a exceção estourar**. Deixe-a atravessar a *stack* de chamadas e se transformar no retorno de protocolo adequado (ex: um erro `HTTP 500`).
* **Resiliência Não é Adivinhar Soluções:** Encher o código de *retries* e blocos de captura de erro para cenários não discutidos **não** é tratar a resiliência como um cidadão de primeiro nível. Decisões de resiliência devem envolver debates de negócio e arquitetura. Se você tenta mascarar o erro sozinho no código, está implementando algo que não foi combinado com ninguém.

### Aplicação no Lado do Cliente vs. Servidor
* **Na Aplicação Servidora:** Se você atingiu o limite de requisições toleráveis ou violou o seu modelo de previsibilidade, aplique o *throttling* e simplesmente avise que o sistema está indisponível naquele momento.
* **Na Aplicação Cliente (Quem consome):** Se o servidor de destino retornar um erro da faixa `400` (Erro do Cliente), o problema está na requisição ou nos dados enviados. Fazer novas tentativas automáticas não surtirá efeito. O correto é falhar imediatamente, invalidar o estado atual (como um token expirado) e avisar o usuário.
* **Status Não Mapeados:** Se surgir um comportamento ou código de status completamente inesperado e não mapeado, adote a postura básica: avise que ocorreu um problema inesperado e sugira uma ação manual ou espera por parte do usuário.
</details>





## Princípio Desacoplamento: Definição
- sistemas desacoplados devem conhecer somente a interface pública e não ter acesso nas complexidades internas
- um desenvolvedor conhece a equipe que fornece um serviço utilizado num sistema e aproveita desse conhecimento, por exemplo, que uma aplicação externa existe uma política de retry, e se aproveita desse conhecimento para utilizar na arquitetura do sistema desenvolvido pela squad.
- acomplamento mental: vc tem um conhecimento não declarado num sistema e se aproveita do conhecimento. Futuramente o sistema externo deixa de suportar essa funcionalidade não declarada oficalmente de forma publicamente.

<details>
<summary>Gerado por IA</summary>

## 🔌 O Princípio do Desacoplamento e o "Acoplamento Mental"
O princípio do desacoplamento dita que a comunicação entre sistemas (sejam locais ou distribuídos) deve se basear **única e exclusivamente nos contratos públicos e documentados** de uma função ou API, ignorando qualquer conhecimento informal sobre como as coisas funcionam "por debaixo dos panos".

### O que é o Acoplamento Mental?
O instrutor define **Acoplamento Mental** como o ato de materializar em forma de código um conhecimento de bastidores ou de contexto que não está formalmente declarado na documentação pública do serviço que está sendo consumido.

* **Exemplo de Retries:** Você precisa consumir o Endpoint X. A documentação não diz que ele suporta retentativas, mas como você conhece o time que desenvolveu, você sabe que o sistema deles aguenta a pressão. Você vai lá e configura uma política agressiva de *retry* no seu código.
* **Exemplo de Validações Ocultas:** Passar parâmetros que você sabe "no boca a boca" que o outro lado aceita ou ignora, mesmo sem isso fazer parte do contrato oficial.

### Por que isso destrói a resiliência?
Esse comportamento é uma armadilha invisível. Como o comportamento que você explorou não faz parte do combinado oficial, o outro time se sente livre para mudar a qualquer momento. Bastam pequenas alterações do outro lado — como remover um parâmetro oculto, alterar uma regra de validação ou desativar o suporte a retentativas — para que **a sua aplicação quebre imediatamente**.

### Impacto em Grandes Organizações
Em cenários locais (mesmo arquivo ou projeto), isso já gera insegurança no código quando novos desenvolvedores entram no time. Em sistemas distribuídos e grandes empresas (como bancos, onde serviços cruzam diferentes unidades de negócio), o acoplamento baseado no "boca a boca" vira uma bola de neve gigante, tornando a arquitetura frágil e impossível de rastrear.

### A Boa Prática
* **Siga estritamente o contrato:** Só envie dados, trate retornos e configure *retries* se o contrato público e a documentação oficial permitirem explicitamente.
* **Se o conhecimento existe, formalize:** Se você descobriu uma particularidade de um serviço terceiro que é vital para o seu fluxo, mas que não está documentada pelo provedor, **crie uma documentação local para a sua equipe** justificando aquela implementação temporária até que o contrato oficial seja atualizado.
</details>






## Princípio Desacoplamento: Reflexão
- o que vc consome sabendo como o serviço trabalha internamente?
- o que podemos fazer para melhorar?




## Resumo dos princípios
- trabalho constante
- idempotência
- não fazer sofrer quem já está sofrendo
- deixe quebrar
- desacoplamento entre os módulos da sua aplicação (mental)





## Constant Work Pattern Técnica #1: Melhore o caminho principal
> Agora iniciamos com as técnicas. Princípios são mais estáticos e técnicas são mais dinâmicas
- uma api que possui 3 serviços de email com backup em caso de instabilidade e usa de forma distribuídas entre os serviços de email: trabalho contante
- Técnica: melhore seu caminho principal antes pensar num caminho alternativo

<details>
<summary>Gerado por IA</summary>

## 🛠️ Técnica 1: Melhore o Caminho Principal Antes de Criar Alternativas
O instrutor inicia a transição dos princípios teóricos para as técnicas práticas, demonstrando que as técnicas são dinâmicas, enquanto os princípios são estáveis. Esta primeira técnica deriva diretamente do **Princípio do Trabalho Constante**.

### O Custo Oculto da Redundância (Múltiplos Provedores)
* **O Cenário:** É comum pensar em resiliência adicionando redundância. Por exemplo, contratar três gateways de pagamento ou três provedores de envio de e-mail e distribuir as requisições igualmente entre eles (via *Round-Robin* ou API Gateway) para garantir que, se um cair, os outros assumam.
* **A Armadilha da Complexidade:** Embora isso garanta que todos os caminhos sejam testados constantemente (o que evita usar um provedor B "bambão" só na hora da crise), adicionar múltiplos parceiros **aumenta drasticamente a complexidade calculada** do sistema. Há mais contratos, mais APIs para integrar, mais pontos de falha e mais elementos que precisam interoperar.

### A Técnica: Fortaleça a sua Principal Dependência
Antes de gastar energia arquitetural criando caminhos alternativos e lidando com múltiplos fornecedores para a mesma função, a melhor engenharia dita: **tente melhorar e esgotar as possibilidades do seu caminho principal**.

* **Negocie e Ajuste:** Em vez de codificar uma lógica complexa para gerenciar três provedores de e-mail, verifique se é possível melhorar o contrato com o seu provedor atual (Provedor A). Busque aumentar os níveis de SLA, o tempo de resposta ou a robustez da infraestrutura dele.
* **A Filosofia do Simples:** Ter apenas um caminho altamente confiável traz muito mais **previsibilidade** e menor taxa de surpresas do que gerenciar uma malha complexa de alternativas. Se o caminho principal não puder ser melhorado e não houver alternativas simples, aceite a falha através do princípio do *Let It Crash*.

> **Resumo da ópera:** Prefira investir esforços em tornar o que você já tem excelente e robusto, em vez de focar imediatamente em construir soluções complexas para lidar com a ausência dele.
</details>






## Princípio Idempotência Técnica #1: Chave de idempotência
- pensar no caso que  uma request duplicada pode causar danos ou prejuízo para o negócio
- o autor mostra um exemplo de idempotency key o desafio do checkout da Hotmart
Exemplo da aula:
```java
package com.deveficiente.desafiocheckouthotmart.compartilhado.idempotencia;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.deveficiente.desafiocheckouthotmart.checkout.pagamentos.cartao.PagaComCartaoCreditoController.Retorno;
import com.deveficiente.desafiocheckouthotmart.compartilhado.JsonHelper;
import com.deveficiente.desafiocheckouthotmart.compartilhado.Log5WBuilder;

import jakarta.persistence.EntityManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Optional;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//@Aspect
//@Component
public class PostMappingAspect {

	@Autowired
	private HttpServletRequest httpServletRequest;
	@Autowired
	private HttpServletResponse httpServletResponse;
	@Autowired
	private IdempotencyValueFinder idempotencyValueFinder;
	
	private static final Logger log = LoggerFactory
			.getLogger(PostMappingAspect.class);


	@Around("within(@org.springframework.web.bind.annotation.RestController *) && @annotation(org.springframework.web.bind.annotation.PostMapping)")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {

		String idempotencyKey = httpServletRequest.getHeader("Idempotency-Key");
		
		if(!StringUtils.hasText(idempotencyKey)) {
			return joinPoint.proceed();
		}
		
		return  
				
		idempotencyValueFinder.execute(idempotencyKey)					
		.map(pair -> {			
			Log5WBuilder
				.metodo("PostMappingAspect#execute")
				.oQueEstaAcontecendo("Returning idempotent value")
				.adicionaInformacao("idempontentKey", idempotencyKey)
				.info(log);		
			
			httpServletResponse.setHeader("idempotent-response", "true");
			return pair;
		})
		.orElseGet(() -> {
			
			Log5WBuilder
				.metodo("PostMappingAspect#execute")
				.oQueEstaAcontecendo("Let the request flows")
				.adicionaInformacao("idempontentKey", idempotencyKey)
				.info(log);
			
			try {
				return joinPoint.proceed();
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		});
	}
}
```
Fonte: [github](https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/compartilhado/idempotencia/PostMappingAspect.java)


<details>
<summary>Gerado por IA</summary>

## 🔒 Técnica: Idempotência Baseada em Chaves do Cliente (*Idempotency-Key*)
Esta técnica transfere parte da responsabilidade da identificação para a **aplicação cliente**, permitindo que o servidor identifique de forma inequívoca se duas ou mais requisições fazem parte do mesmo fluxo operacional (por exemplo, um mecanismo de *retry*).

### 🎯 Onde Aplicar? (Critério de Priorização)
Não é necessário ou eficiente aplicar idempotência estrita em todos os pontos do sistema. O foco inicial deve ser em **operações altamente sensíveis**, onde uma duplicação causa prejuízos financeiros ou operacionais graves:
* Processamento de pagamentos em gateways de cartão de crédito.
* Solicitações de reembolso (ex: planos de saúde ou e-commerce).
* Agendamentos de serviços, reservas ou compras de ingressos.


### 🛠️ Dinâmica da Implementação (Arquitetura por Aspectos)
A implementação ideal no back-end isola essa lógica da regra de negócio, tratando-a como uma preocupação transversal através de **Programação Orientada a Aspectos (AOP)** ou *Middlewares/Filters*.

#### 1. O Cabeçalho da Requisição (`Idempotency-Key`)
* A aplicação cliente gera um identificador único universal (preferencialmente um **UUID/GUID**) para a ação que deseja realizar e o anexa ao cabeçalho HTTP (ex: `Idempotency-Key: 123e4567-e89b-12d3-a456-426614174000`).
* **Validação de Força:** O back-end pode validar se a chave enviada é realmente um UUID válido. Chaves fracas ou sequenciais aumentam o risco de colisões e devem ser rejeitadas imediatamente.

#### 2. Evitando Colisões Autenticadas (O Contexto do Cliente)
Para mitigar o risco de dois usuários ou clientes diferentes gerarem o mesmo UUID por uma coincidência rara (ou ataque malicioso), o servidor nunca deve usar a chave isoladamente.

* **Chave Composta:** A chave real de validação no banco de dados ou cache (como o Redis) deve ser a combinação do **Token de Autenticação (JWT/User ID)** + a **Idempotency-Key**.

$$\text{Chave Final} = f(\text{User ID}, \text{Idempotency-Key})$$



#### 3. O Fluxo de Interoperabilidade no Servidor
O componente de aspecto intercepta as requisições (geralmente focando no método `POST`) e executa o seguinte fluxo:
1. **Verificação:** Busca a `Chave Final` no mecanismo de armazenamento temporário.
2. **Cenário A (Chave Existe):** Significa que a requisição é um dublê (duplicada). O servidor interrompe o fluxo de negócio, recupera a resposta original armazenada e a devolve ao cliente.
* *Boa Prática:* Adicionar um cabeçalho customizado na resposta (ex: `X-Cache-Idempotency: true`) para que o cliente saiba que aquela resposta veio de um reprocessamento evitado.
3. **Cenário B (Chave Não Existe):** Significa que é a primeira tentativa. O aspecto permite que a requisição siga para os controladores de negócio. No fim da execução, ele captura a resposta gerada com sucesso, associa-a àquela `Chave Final` e a armazena antes de responder ao cliente.


### 📦 Aplicação Fora do HTTP (Mensageria e Filas)
Essa mesma mecânica se aplica perfeitamente a consumidores de mensageria (*Message Listeners* em filas como RabbitMQ ou SQS). Se um *broker* entregar a mesma mensagem duas vezes (comportamento comum em sistemas *at-least-once*), o consumidor verifica o ID de idempotência no corpo ou nos metadados da mensagem para descartar o reprocessamento caso o status já conste como processado.
</details>




## Princípio Idempotência Técnica #2: Hash de parâmetros (muuuita parcimônia)
- derivar um hash com um conjunto de informações, podemos fazer isso? Ela assume que informações iguais, são requisições iguais e numa range de tempo próximo. É possível ser único, mmas tem chances de serem requisiçoes diferentes.
- o autor indica que devemos assumit essa condição de forma explícita e que as pessoas que atuam na aplicação tenham esse conhecimento.

<details>
<summary>Gerado por IA</summary>

## 🛠️ Técnica 2: Idempotência por Inferência de Dados (*Request Hashing*)

Esta técnica consiste em deduzir a duplicidade de uma requisição analisando o seu conteúdo, em vez de exigir que o cliente envie uma chave explícita.

### 🧬 Como Funciona?
O servidor intercepta a requisição, coleta múltiplos dados do envio (como o corpo do JSON, parâmetros da URL, headers do navegador e o ID do usuário autenticado) e os concatena para gerar um identificador único por meio de uma função de criptografia (gerando um **Hash**).

* Se um segundo *request* chegar em um intervalo de tempo muito curto e gerar o **mesmo hash**, o sistema assume automaticamente que se trata de uma duplicata e bloqueia o reprocessamento.

---

### ⚠️ O Perigo de "Assumir" a Duplicidade
O instrutor faz um alerta crítico sobre essa abordagem: ela se baseia em uma **suposição** (*assumpção mental*), o que pode gerar sérios problemas de negócio.

* **Falsos Positivos:** O sistema assume que dados idênticos significam a mesma requisição. Porém, o cliente pode legitimamente querer realizar duas operações idênticas em sequência.
* **O Exemplo das Compras Iguais:** Se um usuário compra um produto de R$ 8,00 e, logo em seguida, decide comprar exatamente o mesmo produto de R$ 8,00 para um amigo, os payloads serão idênticos. Se o servidor aplicar o *hashing* estrito, a segunda compra legítima será rejeitada ou retornará o recibo da primeira, gerando atrito.
* **Contorno Comum no Mercado:** É por causa desse comportamento de bloqueio (muito usado também em motores de fraude) que o mercado desenvolveu a cultura informal de "mudar o valor em 1 centavo" para forçar o sistema a aceitar duas transações parecidas.

### 💡 Recomendação Arquitetural
Evite deduzir a intenção do cliente no escuro. Se for obrigado a usar a técnica de *Request Hashing* por limitações do cliente (que não consegue enviar um cabeçalho customizado), certifique-se de que:

1. **O intervalo de tempo (TTL) do Hash seja curtíssimo** (questão de poucos segundos) apenas para mitigar cliques duplos acidentais (*double-click*).
2. **O time de produto e negócio esteja alinhado** com o risco de falsos positivos e o impacto disso na experiência do usuário.
</details>






## Princípio Idempotência Técnica #3: Idempotência em fluxos mais complexos
- cenários complexos são aqueles que realizam diversos passo para a conclusão da requisição. Um exemplo seria um sistema de pagamento que se integração com um sistema de pagamento, atualiza o status da compra, atualiza o estoque e envia uma menagem de sucesso ou falha.
- mecanismo de workflow que gerencia camunga e outras tecnologias semelhantes

```java
package com.deveficiente.desafiocheckouthotmart.checkout.pagamentos.cartao;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.deveficiente.desafiocheckouthotmart.checkout.Compra;
import com.deveficiente.desafiocheckouthotmart.checkout.CompraBuilder.CompraBuilderPasso3;
import com.deveficiente.desafiocheckouthotmart.checkout.pagamentos.CompraId;
import com.deveficiente.desafiocheckouthotmart.checkout.CompraRepository;
import com.deveficiente.desafiocheckouthotmart.checkout.EmailsCompra;
import com.deveficiente.desafiocheckouthotmart.checkout.FluxoEnviaEmailSucesso;
import com.deveficiente.desafiocheckouthotmart.clientesremotos.gateway1cartao.CartaoGateway1Client;
import com.deveficiente.desafiocheckouthotmart.compartilhado.Erro500Exception;
import com.deveficiente.desafiocheckouthotmart.compartilhado.ExecutaTransacao;
import com.deveficiente.desafiocheckouthotmart.compartilhado.ICP;
import com.deveficiente.desafiocheckouthotmart.compartilhado.Log5WBuilder;
import com.deveficiente.desafiocheckouthotmart.compartilhado.PartialClass;
import com.deveficiente.desafiocheckouthotmart.compartilhado.RemoteHttpClient;
import com.deveficiente.desafiocheckouthotmart.compartilhado.Result;
import com.deveficiente.desafiocheckouthotmart.compartilhado.steps.BusinessFlowRegister;
import com.deveficiente.desafiocheckouthotmart.compartilhado.steps.BusinessFlowSteps;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.decorators.Decorators;
import io.github.resilience4j.retry.Retry;

/**
 * Aqui está concentrado todo fluxo de criacao de uma {@link Compra} utilizando
 * o cartão de credito como meio de pagamento.
 * 
 * @author albertoluizsouza
 *
 */
@ICP(10)
@PartialClass(PagaComCartaoCreditoController.class)
@Component
public class FluxoRealizacaoCompraCartao {

	private ExecutaTransacao executaTransacao;
	@ICP
	private CompraRepository compraRepository;
	private RemoteHttpClient remoteHttpClient;
	@ICP
	private CartaoGateway1Client cartaoGatewayClient;
	private Retry retryCartao;
	@ICP
	private ProximoGatewayPagamento proximoGatewayPagamento;
	@ICP
	private EmailsCompra emailsCompra;
	private CircuitBreaker circuitBreakerCartao;
	@ICP
	private FluxoEnviaEmailSucesso fluxoEnviaEmailSucesso;
	private BusinessFlowRegister businessFlowRegister;

	public FluxoRealizacaoCompraCartao(ExecutaTransacao executaTransacao,
			CompraRepository compraRepository,
			RemoteHttpClient remoteHttpClient,
			CartaoGateway1Client cartaoGatewayClient, Retry retryCartao,
			ProximoGatewayPagamento proximoGatewayPagamento,
			EmailsCompra emailsCompra, CircuitBreaker circuitBreakerCartao,
			FluxoEnviaEmailSucesso fluxoEnviaEmailSucesso,
			BusinessFlowRegister businessFlowRegister) {
		super();
		this.executaTransacao = executaTransacao;
		this.compraRepository = compraRepository;
		this.remoteHttpClient = remoteHttpClient;
		this.cartaoGatewayClient = cartaoGatewayClient;
		this.retryCartao = retryCartao;
		this.proximoGatewayPagamento = proximoGatewayPagamento;
		this.emailsCompra = emailsCompra;
		this.circuitBreakerCartao = circuitBreakerCartao;
		this.fluxoEnviaEmailSucesso = fluxoEnviaEmailSucesso;
		this.businessFlowRegister = businessFlowRegister;
	}

	private static final Logger log = LoggerFactory
			.getLogger(FluxoRealizacaoCompraCartao.class);

	/**
	 * 
	 * @param oferta
	 * @param conta
	 * @param request
	 * @param chaveIdempotencia 
	 */
	public Result<RuntimeException, CompraId> executa(CompraBuilderPasso3 basicoDaCompra,
			NovoCheckoutCartaoRequest request, String chaveIdempotencia) {
		/*
		 * Essa ideia aqui morre com múltiplos gateways. Vai ser necessário
		 * inverter a decisão... Passa a request para construir o dto específico
		 * da integração.
		 * 
		 * É preciso identificar quem é o "maior" e quem é o "menor". O menor
		 * aqui é a request web, então ela não pode conhecer todas
		 * implementações de dto de integração com o cartão.
		 * 
		 * O código tende a seguir a dependencia do maior para o menor.
		 */
//		@ICP
//		NovoPagamentoGatewayCartao1Request requestGateway = request
//				.toPagamentoGatewayCartaoRequest(oferta);

		BusinessFlowSteps businessFlow = businessFlowRegister.execute(
				"compraCartao", chaveIdempotencia);

		String idNovaCompra = businessFlow.executeOnlyOnce("criaCompra", () -> {
			return executaTransacao.comRetorno(() -> {
				/*
				 * O builder aqui é pq eu já sei que vai ter maneiras diferentes
				 * de criar uma nova compra em função da forma de pagamento.
				 * Então já tentei criar um mecanismo pode ser evoluido. O
				 * basico é sempre relacionar com uma conta e uma oferta e
				 * depois complementar com o tipo de pagamento específico.
				 */

				return compraRepository.save(basicoDaCompra.comCartao(request))
						.getId();
			});
		});

		Compra novaCompra = compraRepository
				.findById(Long.valueOf(idNovaCompra)).get();

		Result<RuntimeException, String> resultadoIntegracao = remoteHttpClient
				.execute(() -> {
					
					return businessFlow.executeOnlyOnce("integraGatewayPagamento", () -> {
						/*
						 * Aqui antes eu tava recebendo uma request e uma oferta. Só
						 * que eu tenho um padrão que preciso documentar, se eu já
						 * computei uma variavel em função de outras, eu não posso
						 * mais usar aquelas variaveis no mesmo fluxo. Se eu uso,
						 * pode ser um sinal que alguma coisa ficou mal desenhada.
						 */
						Supplier<String> proximoGateway = proximoGatewayPagamento
								.proximoGateway(novaCompra);

						return Decorators.ofSupplier(() -> {
							Log5WBuilder.metodo()
									.oQueEstaAcontecendo(
											"Vai processar o pagamento")
									.adicionaInformacao("compra",
											novaCompra.toString())
									.info(log);

							return proximoGateway.get();
						})
						/*
						 * A ordem aqui importa. O primeiro decorator é
						 * aplicado primeiro.. Então aqui, se a chamada
						 * falha, o circuitBreaker é incrementado e depois
						 * rola o retry. Isso quer dizer que se tiver
						 * chegado no limte ele nem vai tentar a próxima.
						 * 
						 * Só que não rola fazer a política aqui do token
						 * bucket estilo amazon, para isso acontecer cada
						 * falha deveria ser contabilizar no circuitbreaker.
						 */
						.withCircuitBreaker(circuitBreakerCartao)
						.withRetry(retryCartao).get();						
					});


				});

		// @ICP ifSucess
		// @ICP e ifProblem
		return resultadoIntegracao.ifSuccess(idTransacao -> {

			Log5WBuilder.metodo().oQueEstaAcontecendo("Processou o pagamento")
					.adicionaInformacao("request", idTransacao)
					.adicionaInformacao("codigoConta",
							novaCompra.getCodigoConta().toString())
					.info(log);

			// deveria logar que vai atualizar a compra. Já que isso aqui vai
			// parar no banco de dados.
			// so que cansa mesmo hehe. Como melhorar?

			businessFlow.executeOnlyOnce("finalizaTransacaoComCartao", () -> {
				System.out.println("Finalizando a compra...");
				return executaTransacao.comRetorno(() -> {
					novaCompra.finaliza(idTransacao);
					return novaCompra.getId();
				});				
			});
			

			businessFlow.executeOnlyOnce("enviaEmailSucesso", () -> {
				System.out.println("Enviando o email...");
				fluxoEnviaEmailSucesso.executa(novaCompra);
				return "";
			});
			

			return Result.successWithReturn(new CompraId(novaCompra.getId()));
		}).ifProblem(Erro500Exception.class, (erro) -> {

			emailsCompra.enviaEmailFalha(novaCompra);

			// retorna a compra mesmo assim, afinal de contas ela foi criada.
			return Result.failWithProblem(erro);
		}).ifProblem(Exception.class, e -> {
			Log5WBuilder.metodo().oQueEstaAcontecendo(
					"Aconteceu um problema inesperado na integracao com o cartao de credito")
					.adicionaInformacao("codigoCompra",
							novaCompra.getCodigo().toString())
					.debug(log);
			return Result.failWithProblem(e);
		}).execute().get();
	}

}
```

[Fonte](https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/checkout/pagamentos/cartao/FluxoRealizacaoCompraCartao.java)


<details>
<summary>Gerado por IA</summary>

## 🔒 Técnica 3: Idempotência em Fluxos Multietapas (Mecanismos de Workflow)
Quando a idempotência é aplicada a uma única operação isolada (como enviar um e-mail), a validação por um aspecto ou interceptor simples resolve o problema. No entanto, em **fluxos de negócio extensos, compostos por várias etapas síncronas ou assíncronas**, uma falha no meio do caminho exige que o sistema seja capaz de realizar um *retry* inteligente, executando **apenas o que falta**.

### 🛒 O Cenário de Exemplo: Checkout de Venda

Imagine um fluxo síncrono inspirado no checkout de plataformas digitais (como a Hotmart), composto por 5 etapas sequenciais:

1. **Criar a compra** no banco de dados (Estado Inicial).
2. **Integrar com o Gateway** de cartão de crédito (Operação de terceiros).
3. **Finalizar a compra** mudando seu estado (Com base no retorno do cartão).
4. **Enviar e-mail de sucesso** (Se paga).
5. **Enviar e-mail de falha** (Se recusada).

#### O Problema do *Retry* Cego
Se o cliente envia a requisição e o sistema executa a **Etapa 1** (Cria a compra) com sucesso, mas a rede oscila e sofre um *timeout* na **Etapa 2** (Integração com o cartão), o cliente disparará um *retry*.

* Se você aplicar um interceptor simples na entrada, ele impedirá o reprocessamento, mas deixará a compra "travada" no estado inicial.
* Se você não aplicar nada, o sistema tentará criar uma **segunda compra duplicada** do mesmo produto para o mesmo usuário.

---

### 🛠️ A Solução: Arquitetura de Workflow (*Stateful Retry*)
Para lidar com isso, a chave de idempotência do cliente (ou uma chave composta derivada do contexto de negócio, como `User_ID + Product_ID`) passa a atuar como um **Identificador de Workflow**.

Em vez de bloquear a requisição inteira, o sistema utiliza um motor de fluxo (que pode ser uma ferramenta de mercado como *Camunda* ou *Temporal/Cadence*, ou uma implementação customizada em código) baseado em blocos protegidos (como o método conceitual `runOnce()`).

```
[Requisição Cliente] -> [ID de Workflow]
                              │
             ┌────────────────┴────────────────┐
             ▼                                 ▼
      [Etapa 1: Compra]                [Etapa 2: Cartão]
    Já foi executada? ✅              Já foi executada? ❌
   (Pula e recupera o ID)            (Executa AGORA e salva)

```

#### Como a engrenagem funciona por dentro:
1. **Abstração dos Passos:** Cada etapa do fluxo de negócio é encapsulada em uma função que obrigatoriamente retorna um estado ou valor necessário para a etapa seguinte (ex: a Etapa 1 retorna o `Compra_ID`; a Etapa 2 retorna o `Transacao_ID`).
2. **Verificação de Progresso:** Ao receber uma requisição repetida, o motor de workflow intercepta cada linha e pergunta ao banco de estado: *"A Etapa 1 já foi concluída com sucesso para esta chave de idempotência?"*.
* Se **sim**, ele pula a execução do código de negócio e recupera o resultado gravado anteriormente de forma imediata.
* Se **não**, ele executa o bloco pela primeira vez e persiste o progresso.


3. **Resiliência Incremental:** Se o fluxo falhar na Etapa 4 (envio do e-mail), o próximo *retry* enviado pelo cliente passará batido pelas etapas 1, 2 e 3 (recuperando os dados salvos) e tentará disparar o e-mail novamente. O fluxo avança incrementalmente até que o objetivo final seja atingido.

---

### 🎯 Preservando a Intenção do Código
O instrutor reforça seu ponto principal: **idempotência não é uma regra rígida de "nunca duplicar dados", mas sim sobre preservar a intenção do fluxo.** Se em um cenário hipotético de negócio a especificação ditar que requisições idênticas enviadas em um intervalo de tempo devem gerar dois registros distintos ligados a um nó pai, e o seu código faz exatamente isso de forma previsível e controlada, ele continua sendo idempotente. O sistema falha no quesito resiliência quando um comportamento técnico imprevisto (como uma oscilação de rede) corrompe o resultado esperado pelo usuário ou pelo negócio.
</details>




## Princípio Constant Work Pattern Técnica #2: Pense muito bem antes de colocar um cache
- tem que ter um motivo muito forte para utilizar o cache
  - saber o que colocar no cache
  - se não está no cache, procura no banco de dados
- essa implementação de cache realmente traz um resultado significativo como resultado?
- um otimização na busca do banco de dados não pode trazer maiores resultados?
- a utilização do cache deve ser um definição de negócio e não uma decisão técnica
- o uso do cache quebra o princípio do trabalho constante já que não será utilizado num fluxo comum, mas num fluxo de exceção, ou seja, dois caminhos

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A adoção de estratégias de *caching* deve ser rigorosamente deliberada e evitada a menos que haja um ganho de performance substancial que impacte diretamente o negócio, priorizando-se a otimização da fonte de dados original para manter a simplicidade do sistema através do Princípio do Trabalho Constante.

---

### Pontos-Chave
* **Complexidade e Falta de Padronização:** O uso de *cache* adiciona múltiplos caminhos de execução (*fallbacks*, políticas de *warmup*, invalidação), o que quebra o Princípio do Trabalho Constante e eleva exponencialmente a complexidade da arquitetura, especialmente em ambientes distribuídos.
* **Questionamento do Ganho Real:** É fundamental avaliar se a redução do tempo de resposta (ex: de 500ms para 250ms) traz um impacto real e bizarro na experiência do usuário final ou se o ganho é irrelevante para o contexto.
* **Otimização da Fonte Original:** Antes de introduzir uma camada de suporte como o *cache*, deve-se buscar exaustivamente a otimização da busca na fonte original (banco de dados) para que ela atenda aos requisitos de velocidade aceitáveis de forma uniforme e previsível.
* **Decisão de Negócio Relativa à Performance:** A implementação de *cache* não é estritamente uma decisão técnica; ela deve ser orientada por perguntas de negócio sobre o quão rápido o sistema realmente precisa ser e qual valor essa velocidade agrega.

---

### Conclusão/Recomendação
O autor recomenda que, antes de estabelecer qualquer estratégia de *caching*, a equipe de engenharia e de negócio avalie rigorosamente a real necessidade de latência e busque aplicar o Princípio do Trabalho Constante através da técnica mais simples: fazer o fluxo atual (busca direta no banco) funcionar de forma otimizada e performática.
</details>






## Princípio Não faça sofrer quem já está sofrendo Técnica #1 - Parte 1: O Básico sobre retries
- retry é uma tecnica utilizada na resiliência
- resilienty for J: https://resilience4j.readme.io/docs/getting-started

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A técnica de *retry* visa aumentar a resiliência do software ao reexecutar chamadas automáticas que falharam devido a instabilidades temporárias, devendo ser configurada criteriosamente com base em políticas de intervalos e no tipo de erro retornado.

---

### Pontos-Chave
* **Conceito de Retry:** Trata-se de um mecanismo que monitora uma execução e, em caso de falha, repete a tentativa por um número determinado de vezes (seja de forma manual e rudimentar ou via bibliotecas robustas).
* **Uso de Bibliotecas Prontas:** O ecossistema de desenvolvimento possui soluções consolidadas para implementar resiliência (como *retries*, *fallbacks* e *circuit breakers*), sendo o Resilience4j o exemplo destacado para a stack Java.
* **Filtragem de Erros de Negócio:** As políticas de retentativa devem ser aplicadas apenas a erros intermitentes ou de servidor (como o HTTP Status 500) e evitadas em erros de requisição do cliente (como o HTTP Status 400), onde repetir a chamada produzirá o mesmo erro.
* **Estratégia de Backoff:** É recomendável configurar o tempo de espera entre as retentativas de forma crescente (como o *backoff* exponencial) para evitar sobrecarregar o sistema de destino durante períodos de instabilidade.

---

### Conclusão/Recomendação
O autor recomenda utilizar bibliotecas de resiliência consolidadas para decorar as funções do sistema e gerenciar falhas de rede, definindo políticas claras de erro elegível (ex: focar em erros 500) e tempos de intervalo crescentes para garantir que as retentativas ajudem a aplicação a se recuperar sem agravar o problema no serviço consumido.
</details>




## Princípio Não faça sofrer quem já está sofrendo Técnica #1 - Parte 2: Exponential Backoff
- relação do retry com o Princípio Não faça sofrer quem já está sofrendo
- backoff exponencial com uma quantidade máxima de retentativa. Serve para darmos um tempo para o sistema de destino conseguir se estabilizar novamente


<details>
<summary>Gerado por IA</summary>

## Ideia Central
A implementação de políticas de *retry* deve ser balanceada com a saúde do ecossistema de software, utilizando o *exponential backoff* para evitar o esgotamento e a queda de serviços que já se encontram instáveis.

---

### Pontos-Chave
* **Efeito Cascata em Falhas:** O *retry* sem critérios age de forma egoísta pelo lado do cliente e pode derrubar definitivamente um serviço parceiro que está sofrendo instabilidades temporárias devido ao bombardeio de requisições consecutivas.
* **Mecanismo de Exponential Backoff:** Esta técnica mitiga a sobrecarga ao aumentar progressivamente o tempo de espera entre cada tentativa falha (ex.: 1s, 2s, 4s, 8s), dando margem e tempo para o sistema alvo se recuperar.
* **Controle de Tentativas Máximas:** O *backoff* exponencial deve obrigatoriamente ser limitado por um número máximo de retentativas para evitar que a aplicação gaste recursos em um loop infinito de chamadas fadadas ao fracasso.
* **Alinhamento entre Sistemas:** Os parâmetros de tempo e multiplicadores idealmente nascem de acordos técnicos com a equipe que mantém o serviço integrado, calibrando a agressividade do *retry* de acordo com a criticidade do negócio (como fluxos de pagamentos).

---

### Conclusão/Recomendação
O autor recomenda rejeitar o uso de retentativas em intervalos de tempo constantes e adotar o *exponential backoff* combinado com um limite rígido de tentativas, respeitando a capacidade de recuperação do sistema integrado e garantindo a resiliência global da arquitetura.
</details>






## Princípio Não faça sofrer quem já está sofrendo Técnica #1 - Parte 3: Jitter
- serviço de e-mail interno que é utilizado por outros sistema da empresa utiliza o mesmo sistema. Um dos sistemas que consome o serviço de e-mail é um sistema de grande escala e pode estar realizando um sistema de retry. Somando a aplicação de alta escala e as demais aplicações menores podem estar realizando retry no mesmo sistema de serviço de e-mail
- para evitar o Princípio Não faça sofrer quem já está sofrendo, pode-se utiliza a técnica do jitter
- explicação sobre o retry com jitter na AWS: https://builder.aws.com/content/3EumjoZascWd1oZiEgL8ORlv3qE/timeouts-retries-and-backoff-with-jitter?trk=ba\_card

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A utilização da técnica de *jitter* adiciona uma variação randômica aos intervalos de *exponential backoff*, evitando que múltiplas aplicações concorrentes sobrecarreguem simultaneamente um serviço centralizado em processo de recuperação.

---

### Pontos-Chave
* **Gargalo em Serviços Centralizados:** Um microsserviço menor de suporte (como um motor de envio de e-mails), quando consumido por múltiplos sistemas de grande escala, torna-se um ponto crítico de falha e um potencial gargalo arquitetural.
* **Sincronização de Retries:** Mesmo utilizando o *exponential backoff*, se diversos sistemas clientes experimentarem falhas ao mesmo tempo, suas retentativas tendem a se sincronizar nos mesmos segundos exatos (1s, 2s, 4s, etc.), gerando ondas consecutivas de picos de carga.
* **O Conceito de Jitter:** A introdução de um elemento de aleatoriedade (*jitter*) no cálculo do tempo de espera dispersa o momento exato das requisições de *retry*, distribuindo a carga de forma fluida ao longo do tempo.
* **Apoio em Padrões de Mercado:** Essa abordagem é amplamente documentada e recomendada em arquiteturas de alta disponibilidade (como nas práticas recomendadas da AWS) para mitigar o impacto de indisponibilidades transientes.

---

### Conclusão/Recomendação
O autor recomenda a inclusão do *jitter* na caixa de ferramentas dos desenvolvedores para refinar as políticas de resiliência, garantindo que sistemas interdependentes deem o espaço necessário para que serviços centrais e sobrecarregados se recuperem de falhas sem sofrerem ataques acidentais de negação de serviço (DoS).
</details>







## Princípio Não faça sofrer quem já está sofrendo Técnica #1 - Parte 4: Retry Throttle
- limites de retry
- https://aws.amazon.com/blogs/developer/introducing-retry-throttling/

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A técnica de *retry throttling* protege ecossistemas de software contra a sobrecarga de componentes instáveis ao centralizar e bloquear globalmente novas tentativas de requisição diretamente no lado do cliente quando um limite crítico de falhas é atingido.

---

### Pontos-Chave
* **Gargalo Global por Retries:** Mesmo com políticas de *backoff* exponencial e *jitter*, o acúmulo de requisições concorrentes disparando retentativas simultâneas pode penalizar severamente a saúde geral da arquitetura de microsserviços.
* **Mecanismo de Retry Throttling:** Baseado no algoritmo de *token bucket*, o padrão monitora a taxa global de sucesso do cliente; se as falhas superam um patamar crítico (ex.: acima de 50%), o mecanismo corta novas tentativas antes mesmo que elas saiam do cliente, atuando de forma análoga a um *circuit breaker*.
* **Suporte Nativo em SDKs:** Grandes provedores de nuvem, como a AWS, oferecem essa funcionalidade integrada nativamente em seus SDKs, permitindo a ativação e configuração do estrangulamento de *retries* programaticamente ou via propriedades do sistema no *startup* da aplicação.
* **Desafio em Bibliotecas Padrão:** Embora seja um recurso nativo em SDKs de nuvem, bibliotecas populares de resiliência de mercado (como o Resilience4j para Java) podem não suportar esse comportamento global de forma nativa por padrão, exigindo soluções customizadas.

---

### Conclusão/Recomendação
O autor recomenda que os desenvolvedores integrem o conceito de *retry throttling* em suas estratégias de resiliência, explorando recursos nativos dos SDKs de nuvem de seus provedores ou buscando bibliotecas compatíveis em suas respectivas *stacks* tecnológicas para evitar que requisições sabidamente fadadas ao fracasso onerem os serviços servidores.
</details>





## Princípio Não faça sofrer quem já está sofrendo Técnica #2 - Não sufoque o sistema menor
- um sistema central de cadastro que é utilizados por todos os outros serviços de uma empresa, em caso de uma falha, os serviços maiores podem sobrecarregar esse serviço em um caso de falha
- o sistema menor pode fornecer uma informação no header informando que a informação pode ser cacheável durante um tempo. Obs: não esqueça do problema do cache no princípio do trabalho contante.
- o sistema menor pode fornecer essas informações num serviço de pub/sub informando quando um dado foi atualizado

<details>
<summary>Gerado por IA</summary>

## Ideia Central
Para evitar que serviços centrais e específicos sejam sufocados por picos de requisições de sistemas maiores em arquiteturas distribuídas, devem-se adotar estratégias de desacoplamento, distribuição de carga ou delegação de leitura para componentes altamente escaláveis.

---

### Pontos-Chave
* **Gargalo de Serviços Centrais:** Microsserviços que concentram dados compartilhados por toda a empresa (como cadastros de usuários) são vulneráveis a picos de tráfego concorrente, tornando-se pontos únicos de falha e sufocamento arquitetural.
* **Uso de Headers de Cache:** Uma abordagem técnica inicial é fazer o serviço provedor injetar instruções de cacheabilidade no cabeçalho (*header*) HTTP da resposta, delegando e autorizando o cliente a reter o dado localmente por um tempo determinado.
* **Delegação para Armazenamento Escalável:** O serviço menor pode exportar periodicamente suas informações de consulta para uma camada intermediária projetada para escala massiva (como o Amazon S3), transferindo o fluxo de leitura dos sistemas clientes para essa infraestrutura.
* **Sincronização via Broadcast:** Como alternativa, o serviço centralizador pode realizar o envio ativo de dados atualizados em lotes (*batches*) para os sistemas assinantes por meio de mensageria, permitindo que cada consumidor armazene sua própria cópia local de consulta.

---

### Conclusão/Recomendação
O especialista recomenda mapear os serviços centrais com alta dependência de leitura e implementar soluções de proteção de tráfego — como o uso de caches baseados em *headers*, delegação para buckets altamente escaláveis ou sincronização assíncrona por eventos — mitigando o risco de colapso de componentes menores sob a carga de ecossistemas de grande escala.
</details>




## Princípio Let it Crash Técnica #1 - Self testing
- entrada de dados de uma aplicação: grpc, api rest, mensagem numa fila, evento num tópico ou num sistema analítico. Um sistema externo
- outra parte do sistema que faz chamadas internas. Numa api interna, por exemplo. Uma classe interna ou um método.
- deixe a chamada interna falhar explicitamente no caso de uma ação não esperada

```java
	public void finaliza(String idTransacao) {
		Assert.state(!temTransacaoComStatus(StatusCompra.finalizada),
				"Uma compra finalizada não deveria ser finalizada novamente =>"
						+ this.codigo);

		this.transacoes.add(new TransacaoCompra(this, StatusCompra.finalizada,
				idTransacao));
	}
```
[fonte](https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/checkout/Compra.java)

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A aplicação do princípio *Let it Crash* (*Fail Fast*) em chamadas internas do sistema consiste em lançar exceções imediatamente ao detectar violações de pré-condições ou estados inválidos, permitindo a identificação e correção proativa de bugs em vez de mascará-los com tratamentos lenientes.

---

### Pontos-Chave
* **Distinção de Fronteiras:** O fluxo de dados possui duas origens distintas: a borda externa, que lida com entidades desconhecidas e não confiáveis (requisições web, mensageria, arquivos), e as chamadas internas, operadas por componentes conhecidos da própria aplicação.
* **Abordagem Restritiva (*Fail Fast*):** Em componentes internos, se um método recebe uma chamada que viola uma regra de negócio ou pré-condição (como tentar finalizar uma compra já finalizada), deve-se lançar uma exceção de runtime (ex: `IllegalStateException`). Isso gera um erro 500, gera logs e dispara alertas para correção imediata do bug na raiz.
* **Abordagem Leniente (*Soft*):** Alternativas que mitigam o erro retornando valores booleanos (`false`) ou códigos de status delegam a responsabilidade de tratamento ao ponto chamador, correndo o risco de silenciar anomalias e perpetuar bugs ocultos no sistema por anos.
* **Proatividade e Transparência:** Falhar rapidamente e de forma transparente é uma estratégia de resiliência arquitetural que evita a execução de softwares com comportamentos imprevisíveis e estados corrompidos.

---

### Conclusão/Recomendação
O especialista recomenda adotar a abordagem mais restritiva de *Fail Fast* no desenvolvimento de lógica interna, instruindo o sistema a interromper a execução e lançar exceções explícitas assim que um estado inválido for detectado, garantindo visibilidade total aos erros e acelerando o ciclo de correção por parte da equipe de engenharia.
</details>




## Princípio Let it Crash Técnica #1 - Self Testing: Explicação adicional
- chamador conhecido (método interno)
- chamador desconhecido (um controller que recebe informações do cliente numa api REST)
- Exemplo de código utilizado na aula: 
https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/checkout/pagamentos/cartao/PagaComCartaoCreditoController.java

<details>
<summary>Gerado por IA</summary>

## Ideia Central
O objetivo principal do vídeo é diferenciar o tratamento de falhas e validações em uma aplicação dependendo se a origem da requisição provém de um ponto chamador conhecido (interno ao sistema) ou desconhecido (externo).

---

## Pontos-Chave
* **Pontos Chamadores Desconhecidos (Externos):** Requisições vindas de clientes HTTP, frontends ou aplicativos móveis estão fora do controle da aplicação, exigindo uma abordagem mais flexível ("soft") para lidar com parâmetros inválidos ou incorretos.
* **Erros de Cliente como Falhas de Protocolo:** Parâmetros malformados ou inválidos enviados por chamadores externos não configuram bugs no sistema, devendo ser respondidos com códigos de status HTTP apropriados da faixa 4xx (Ex: `400 Bad Request`, `422 Unprocessable Entity`).
* **Pontos Chamadores Conhecidos (Internos):** Quando a própria aplicação invoca um método interno (ex: `finaliza`), o fluxo é previsível, permitindo a adoção de posturas mais restritivas ou o uso de abstrações para garantir a consistência do estado.
* **Flexibilidade no Design de Código:** Não há uma regra absoluta para o tratamento interno; o desenvolvedor pode optar por lançar exceções estritas ou retornar estruturas de falha detalhadas para que o chamador interno trate o cenário.

---

## Conclusão/Recomendação
A ação prática sugerida é analisar a arquitetura do sistema e a origem das chamadas para definir a estratégia de validação ideal: adote respostas HTTP padronizadas e informativas para erros de clientes externos, e estabeleça contratos claros e restritivos para interações entre componentes internos da própria aplicação.
</details>




## Princípio Desacoplamento Técnica #1 - Módulos com propósitos completamente diferentes não devem gerar impactos cruzado
- caso de uso explicado é o cenário de uma empresa pequena e teve o seu produto com um crescimento considerável de clientes/alunos.
- relatório de acessos das pessoas de uma plataforma de educação, estilo a dev eficiente.
- numa aplicação monolítica, ao gerar um relatório complexo pode custar o tempo de processamento no sistema e causar problemas em outras funcionalidades do sistema, por exemplo, concluir uma atividade ou outra ativiadde simples do sistema. Esse é preço de uma aplicação monolítica, dependendo da forma de como foi projetado.
- 

<details>
<summary>Gerado por IA</summary>

## Ideia Central
O princípio do desacoplamento e o isolamento de infraestrutura aumentam a resiliência do sistema, prevenindo que operações pesadas de um único grande cliente impactem a experiência dos demais usuários.

---

## Pontos-Chave
* **Impacto da Escala:** Operações custosas em cenários de alta escala — como a geração de relatórios volumosos para corporações — podem sufocar recursos e indisponibilizar funcionalidades críticas em sistemas acoplados.
* **Estratégias de Isolamento:** Para mitigar riscos e garantir estabilidade, é recomendável usar técnicas como *deployments* dedicados para grandes clientes ou implementar mecanismos de tolerância a falhas (*timeouts* e *Circuit Breakers*).
* **Vantagens de Sistemas Distribuídos:** Isolar recursos de processamento (ex: relatórios) impede que gargalos em um módulo interfiram em fluxos transacionais essenciais, mantendo o ecossistema operacional mesmo sob estresse.
* **Granularidade Arquitetural:** O modelo ideal para o início de grandes projetos não são os microsserviços de granularidade fina, mas sim múltiplos serviços de granularidade mais grossa (SOA), estruturados em torno de contextos de negócio bem delimitados.

---

## Conclusão/Recomendação
A ação prática recomendada é adotar uma arquitetura orientada a serviços com contextos delimitados e aplicar o princípio do desacoplamento em operações pesadas, isolando o consumo de recursos para proteger as regras de negócio críticas e elevar o nível de resiliência da aplicação.




No contexto da aula, a expressão **"balear"** (ou "o sistema está baleando") é uma gíria técnica do ecossistema de software inspirada na famosa imagem da **"Fail Whale"** (a baleia que o Twitter exibia nos seus anos iniciais quando a plataforma ficava sobrecarregada).

Em termos de arquitetura de software, o termo significa que **o sistema entrou em estado de degradação severa, lentidão extrema ou indisponibilidade temporária** devido ao esgotamento de recursos (como memória ou processamento CPU).

---

## O Mecanismo por trás do "Balear"

O instrutor utiliza o exemplo de um serviço de relatórios pesados sendo executado por uma grande corporação para ilustrar como o fenômeno acontece:

```
[Requisição Extremamente Pesada] 
              │
              ▼
 ┌─────────────────────────┐
 │   Serviço Acoplado      │ ──► Consome toda a CPU / Memória RAM
 └─────────────────────────┘
              │
              ▼
 ┌─────────────────────────┐
 │  Impacto em Cascata     │ ──► Usuários comuns não conseguem fazer 
 └─────────────────────────┘     operações simples (ex: responder exercícios)
              │
              ▼
    "O Sistema Baleou" (Indisponibilidade)

```

---

## Como Mitigar o Problema

Para evitar que o sistema "baleie" por completo e prejudique a experiência de todos os usuários, a aula propõe as seguintes estratégias de engenharia:

* **Desacoplamento Arquitetural:** Isolar recursos computacionais pesados (como geração de relatórios) em serviços ou *deployments* separados. Se o serviço de relatórios "balear", as funcionalidades críticas do ecossistema continuam operando normalmente.
* **Mecanismos de Tolerância a Falhas:** Configurar *timeouts* agressivos no *load balancer* para interromper requisições que demoram muito para responder.
* **Circuit Breaker (Disjuntor):** Interromper o fluxo de chamadas para um componente instável, dando tempo para o serviço se recuperar antes de aceitar novas requisições.
* **Transparência:** Aceitar que curtos períodos de instabilidade (ex: 5 a 10 minutos) podem acontecer sob estresse e comunicar a falha de forma clara ao usuário, em vez de derrubar a aplicação inteira de forma silenciosa.
</details>




## Princípio Constant Work Pattern Técnica #3 - Parte 1: Transforme fallback em fluxo padrão
- evitar fallbacks porque é um caminho alternativo e não realizada ou nem tem o domínio no fluxo alternativo como já existe no caminho padrão
- failover e fallback (um caminho alternativo em caso de problema no serviço principal)
- Exemplo de código: https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/checkout/pagamentos/cartao/FluxoRealizacaoCompraCartao.java
- utilizar Round-Robin, enviando cada requisição para uma forma de pagamento diferente, uma para cada uma das 3 opções, por exemplo.
- Exemplo de código: https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/checkout/pagamentos/cartao/ProximoGatewayPagamento.java


<details>
<summary>Gerado por IA</summary>

## Ideia Central
A transformação de mecanismos de *fallback* em caminhos de execução padrão (através de algoritmos como *Round Robin*) evita caminhos alternativos pouco testados e garante maior resiliência sob o princípio do trabalho constante.

---

## Pontos-Chave
* **Failover vs. Fallback:** Enquanto o *failover* lida com a substituição por falha, o *fallback* cria um fluxo alternativo (ex: mudar de síncrono para assíncrono). Caminhos alternativos raramente acionados tendem a ser menos confiáveis em ambiente de produção.
* **Princípio do Trabalho Constante:** Manter a aplicação executando os mesmos fluxos e rotinas com consistência previne surpresas operacionais, sendo ideal padronizar comportamentos (como assumir uma lógica sempre como assíncrona).
* **Estratégia de Distribuição (Round Robin):** Ao rotacionar requisições de forma contínua e igualitária entre múltiplos provedores (ex: gateways de pagamento), todos os caminhos permanecem validados, aquecidos e com capacidade de vazão homologada em tempo real.
* **Isolamento de Falhas com Retry:** A lógica de escolha do provedor deve ocorrer antes e fora do bloco de retentativas (*retry*). Isso garante que, se uma requisição falhar, as tentativas ocorram no mesmo gateway escolhido para aquela transação, em vez de rotacionar a cada falha e inflar a complexidade do estado.

---

## Conclusão/Recomendação
Para elevar o nível de resiliência, evite caminhos de *fallback* que fiquem ociosos. Desenhe a arquitetura para distribuir a carga de forma homogênea entre os parceiros/serviços integrados, tratando fluxos concorrentes com travas adequadas (como *locks*) e utilizando IA generativa para acelerar a escrita de algoritmos estruturais e padronizados.
</details>




## Princípio Constant Work Pattern Técnica #3 - Parte 2: Exemplo envio de email
- um exemplo de fallback para envio de e-mail
<details>
<summary>Código apresentado na aula:</summary>

```
package com.deveficiente.desafiocheckouthotmart.checkout;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.deveficiente.desafiocheckouthotmart.compartilhado.ICP;
import com.deveficiente.desafiocheckouthotmart.compartilhado.Log5WBuilder;

import io.github.resilience4j.decorators.Decorators;

@Component
public class FluxoEnviaEmailSucesso {

	@ICP
	private EmailsCompra emailsCompra;
	private JmsTemplate jmsTemplate;

	private static final Logger log = LoggerFactory
			.getLogger(FluxoEnviaEmailSucesso.class);

	public FluxoEnviaEmailSucesso(@ICP EmailsCompra emailsCompra,
			JmsTemplate jmsTemplate) {
		super();
		this.emailsCompra = emailsCompra;
		this.jmsTemplate = jmsTemplate;
	}

	public CompletableFuture<Object> executa(@ICP Compra novaCompra) {
		Optional<String> possivelIdTransacao = novaCompra.buscaIdTransacao();
		Assert.isTrue(possivelIdTransacao.isPresent(),
				"Só pode enviar email de sucesso para compra que já foi finalizada. Id = "
						+ novaCompra.getCodigo());

		return Decorators.ofSupplier(() -> {
			emailsCompra.enviaSucesso(novaCompra);
			return CompletableFuture.completedFuture(null);
		}).withFallback(exception -> {
			Map<String, String> parametrosEmail = Map.of("codigoConta",
					novaCompra.getCodigoConta().toString(), "codigoCompra",
					novaCompra.getCodigo().toString());

			Log5WBuilder.metodo().oQueEstaAcontecendo(
					"Colocando o email de sucesso para ser disparado via fila")
					.adicionaInformacao("codigoCompra",
							novaCompra.getCodigo().toString())
					.adicionaInformacao("codigoConta",
							novaCompra.getCodigoConta().toString())
					.info(log);

			/*
			 * O fallback aqui quebrou o constant work pattern. O fluxo normal é
			 * síncrono e o fluxo alternativo assíncrono. O que vai ser mostrado
			 * para o cliente? Email foi enviado? Email ainda vai ser enviado?
			 */
			jmsTemplate.convertAndSend("envia-email-sucesso-compra",
					parametrosEmail);

			Log5WBuilder.metodo().oQueEstaAcontecendo(
					"Enviou o email de sucesso para ser disparado via fila")
					.adicionaInformacao("codigoCompra",
							novaCompra.getCodigo().toString())
					.adicionaInformacao("codigoConta",
							novaCompra.getCodigoConta().toString())
					.info(log);
			return CompletableFuture.completedFuture(null);
		}).get();
	}

}
```

Fonte: https://github.com/asouza/jornada-desafio-checkout-hotmart/blob/master/src/main/java/com/deveficiente/desafiocheckouthotmart/checkout/FluxoEnviaEmailSucesso.java
</details>

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A conversão de um fluxo de *fallback* assimétrico (mudar de síncrono para assíncrono em caso de erro) em um fluxo homogêneo e padronizado garante a previsibilidade do sistema e respeita o Princípio do Trabalho Constante.

---

## Pontos-Chave
* **Problema da Assimetria de Fluxo:** Utilizar um método síncrono que muda repentinamente para o modo assíncrono (como enviar para uma fila apenas quando o envio direto de e-mail falha) quebra a consistência interna e confunde a entidade chamadora sobre o estado real da operação.
* **Padronização com `CompletableFuture`:** Para manter o trabalho constante, se o processamento puder ser assíncrono em algum cenário, a assinatura do método deve refletir isso desde o início. Retornar um `CompletableFuture<Void>` força o chamador a sempre esperar um comportamento assíncrono, mesmo que o resultado seja resolvido imediatamente em condições normais.
* **A "Gambiarra" do Void no Java:** Ao utilizar tipos genéricos assíncronos no Java (como `CompletableFuture`), a ausência de um tipo nativo para retorno vazio obriga o desenvolvedor a passar `Void` e retornar `null` (via `completedFuture(null)`), um contorno técnico comum na linguagem.
* **Alternativas para Trabalho Constante:** Caso queira evitar o modelo assíncrono, o desenvolvedor pode manter o fluxo 100% síncrono utilizando múltiplos provedores de e-mail em regime de *Round Robin* (idêntico ao exemplo dos gateways de pagamento) ou aguardar a confirmação de recebimento (*ACK*) de um sistema de mensageria de forma bloqueante.

---

## Conclusão/Recomendação
A ação prática recomendada é separar o conceito do princípio arquitetural da sua implementação física: escolha uma interface de comunicação que seja uniforme (ou totalmente síncrona ou totalmente assíncrona) para blindar quem consome o método contra variações inesperadas de comportamento em momentos de falha.
</details>




## Um pouco sobre observabilidade: Padronize momento e escrita dos logs
- é ser observável: emite sinais que pode ser observado. Emitir um sinal:
  - um sinal do tempo médio de uma requisição
  - um sinal dos erros 500 de uma api
  - um sinal dos erro 400
  - um sinal informando que uma busca não retornou nenhum dado
- com base nos sinais criam-se alertas para informar a equipe
- o autor fala sobre a importância no uso de log padronizado seguinte o padrão 5Ws do Logging: Quem (Who), O quê (What), Quando (When), Onde (Where) e Por que (Why)

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A observabilidade é um pilar fundamental da resiliência, exigindo que a aplicação emita sinais estruturados e padronizados para viabilizar um monitoramento proativo e investigações eficientes (*troubleshooting*).

---

## Pontos-Chave
* **Observabilidade vs. Monitoramento:** Observabilidade refere-se à capacidade da aplicação de emitir seus estados internos por meio de sinais (métrica de vivacidade, tempos de resposta, taxas de erro 4xx/5xx). O monitoramento é a ação de analisar esses sinais por meio de ferramentas para disparar alertas com base em desvios de comportamento.
* **Padronização de Logs (Abordagem 5W):** Para que um log funcione como um objeto real de investigação, recomenda-se o uso de uma estrutura padronizada (como o padrão investigativo dos 5W: *Who, What, Where, When, Why*), que pode ser implementada via padrões de projeto (*Builder*) para forçar a coleta de dados mínimos essenciais.
* **Diretrizes Mínimas de Registro:** Em vez de depender do bom senso individual, as equipes de engenharia devem estabelecer regras rígidas e claras nos *guidelines* sobre os momentos obrigatórios para gerar logs em nível `INFO`.
* **Gargalos Clínicos e Ruídos:** O registro obrigatório deve focar em pontos de mutação crítica, como comunicações com sistemas externos (saídas) e alterações de estado em armazenamentos (*storages*). Logs excessivos ou sem critérios geram ruído visual e computacional, prejudicando a eficiência das ferramentas de análise.

---

## Conclusão/Recomendação
A ação prática sugerida é definir formalmente na aplicação um padrão e um formato único de escrita de logs, criando políticas claras que diferenciem dados informativos (`INFO`) de dados de depuração (`DEBUG`). Isso blinda o ambiente produtivo contra ruídos desnecessários e prepara a infraestrutura para atuar de forma preditiva perante anomalias.
</details>




## Uma ideia simples sobre classificação de necessidade de resiliência
- como decidir quando ou não aplicar a resiliência
- leitura recomendada: Quality Attribute Workshops (QAWs), Third Edition - https://insights.sei.cmu.edu/library/quality-attribute-workshops-qaws-third-edition/

Exemplo de uma classificação simplificada apresentada pelo autor:
- no cenário critico: pagar, resposnder uma prova, enviar uma prova, hospital validar se o plano de saúde cobre um atendimento. Ser fiel ao trabalho constante utilizando fallback 
- caminho não crítico e quero recuperar: tentar enviar umas 3 vezes com retry
- caminho não crítivo e não quero recuperar do problema, pode-se utiliza o **let it Crash**

<details>
<summary>Gerado por IA</summary>

## Ideia Central
A definição antecipada do nível de resiliência de um software, idealmente na fase de arquitetura por meio de um sistema de classificação de criticidade dos componentes, direciona o uso correto de padrões como *Workshops de Atributos de Qualidade* e o *Princípio do Trabalho Constante*.

---

## Pontos-Chave
* **Sinalização e Planejamento Prévio:** A definição de resiliência deve ocorrer no início do design de software (ex: rodando um *Quality Attribute Workshop*), evitando que a tolerância a falhas seja tratada como um mero detalhe de implementação posterior.
* **Componentes Críticos e Recuperáveis:** Para fluxos de altíssimo impacto no negócio (como checkout, validação de planos de saúde ou envio de provas), deve-se aplicar rigorosamente o princípio do trabalho constante, maximizar políticas de *retry* eficientes e mascarar eventuais *fallbacks* sob abstrações uniformes.
* **Componentes Não Críticos e Recuperáveis:** Cenários com menor impacto imediato (como o envio tardio de um e-mail informativo) aceitam estratégias assíncronas mais simples, como o uso do *Outbox Pattern* acoplado a uma política básica de retentativas.
* **Componentes Não Críticos e Não Recuperáveis:** Para fluxos secundários onde a falha é aceitável, a melhor abordagem é o *Let it Crash* / *Fail Fast*, confiando na transparência do erro e na alta observabilidade (logs e *health checks* padronizados) para agilizar o diagnóstico técnico (*troubleshooting*).

---

## Conclusão/Recomendação
A ação prática sugerida é estabelecer uma matriz de classificação de quatro quadrantes (Cruzando Criticidade vs. Recuperabilidade) para todos os componentes do sistema. Com base nessa classificação, crie diretrizes arquiteturais que determinem onde investir em redundância síncrona/assíncrona e onde aplicar o tratamento simplificado de falhas.


# Explicação sobre Outbox Pattern
O **Outbox Pattern** (ou Padrão de Caixa de Saída) é uma solução de arquitetura de software criada para resolver um problema muito comum em sistemas distribuídos (como microsserviços): **como garantir que uma alteração no banco de dados e o envio de uma mensagem para uma fila (Message Broker) aconteçam de forma segura, sem que um falhe e o outro funcione.**

Para entender por que ele é necessário, imagine o cenário clássico de uma compra:

1. O sistema salva o pedido no **Banco de Dados**.
2. O sistema envia um evento "Pedido Criado" para uma **Fila/Broker** (como RabbitMQ ou Kafka) para que o serviço de estoque seja notificado.

Se o banco de dados salvar o pedido, mas a rede oscilar e a mensagem para a fila falhar, o cliente terá pago, mas o estoque nunca saberá. Se você inverter a ordem e a mensagem for enviada, mas o banco falhar, o estoque vai separar um produto que legalmente não foi vendido.

O Outbox Pattern resolve isso usando o conceito de **Transação de Banco de Dados**.

---

## Como o Outbox Pattern funciona?
Em vez de tentar falar com o banco de dados e com a fila ao mesmo tempo, a sua aplicação fala **apenas com o banco de dados** em um único passo atômico.

### Passo 1: A Gravação Atômica
Dentro do seu banco de dados relacional, além da tabela de `Pedidos`, você cria uma tabela extra chamada **`Outbox`** (Caixa de Saída).

Quando o cliente faz uma compra, a aplicação salva o pedido na tabela de `Pedidos` e, **na mesma transação**, salva a mensagem/evento que precisa ser enviado na tabela `Outbox`.

> 💡 *Como as duas ações estão na mesma transação do banco, ou as duas dão certo, ou as duas dão errado. Não há meio-termo.*

### Passo 2: O Processador de Mensagens (Message Relay)
Agora que o dado está salvo com segurança no banco, um componente separado (pode ser uma thread na aplicação, um serviço leve ou uma ferramenta de CDC como o Debezium) fica lendo a tabela `Outbox` de tempos em tempos.

1. Ele lê as mensagens que ainda não foram enviadas.
2. Publica essas mensagens na **Fila/Message Broker**.
3. Após receber a confirmação da fila de que a mensagem foi entregue, ele **marca a mensagem na tabela `Outbox` como enviada** (ou a deleta).

---

## Resumo dos Componentes
* **Tabela Outbox:** Uma tabela no seu banco que funciona como uma fila temporária de mensagens pendentes.
* **Message Relay (Repetidor):** O processo que lê o banco de dados e empurra as mensagens para o Broker real (Kafka, RabbitMQ, AWS SQS).

## Principais Vantagens

* **Consistência Garantida:** Você elimina o risco de o banco de dados e a fila ficarem desalinhados.
* **Resiliência (At-Least-Once Delivery):** Se o Message Broker cair, as mensagens ficam guardadas com segurança na tabela Outbox. Assim que o broker voltar, o *Message Relay* retoma o envio de onde parou.
* **Independência de Rede:** A requisição do usuário final não fica lenta caso o sistema de mensageria esteja instável ou demore para responder.
</details>
