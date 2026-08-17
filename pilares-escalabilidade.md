# Pilares da Escalabilidade: Os 3 pilares para escalar sistemas distribuídos
Link: https://plataforma.deveficiente.com/cursos/arquitetura/aulas/sobre-o-que-discutiremos

Aprenda como arquitetos(as) desenham sistemas distribuídos e microservices para alta-performance e alta-escalabilidade fundamentados nos 3 pilares da escalabilidade: Caching, Async Processing e Load Balancing.

## Sobre o que discutiremos
- Estágios da escalabilidade
- princípios e fundamentos (performace e escalabilidade)
- vamos focar no nível de aplicação e deixa a infraestrutura de lado
- foca na linguagem de programação Java
- aplicações
- três pilares da esclabilidade:
  - cache
  - assincrono
  - distribuição de cargas




## Visão geral dos conteúdos das aulas
Blink recomendado com leitura antes do consumo das aulas:
https://plataforma.contrateumdeveficiente.com/arquivos-aulas/blink-pilares-escalabilidade.pdf

Os três pilares – caching, processamento assíncrono e balanceamento de carga:
- caching
- processamento assíncrono
- balanceamento de cargas

<details>
  <summary>Gerado por IA - sobre latência e throughput</summary>
  Entender termos técnicos pode parecer um desafio no início, mas o conceito por trás de **latência** e **throughput** fica super simples quando usamos situações do dia a dia.

  Imagine um **restaurante** ou uma **rodovia**:

  ---

  ### 1. Latência (O Tempo de Espera)

  * **O que é em palavras simples:** É o tempo que leva para uma única ação começar e ser concluída. É o **atraso** ou a **demora**.
  * **Exemplo do restaurante:** Você senta no restaurante e faz o pedido de um hambúrguer às **12:00**. O prato chega à sua mesa às **12:15**.
  * A **latência** do seu pedido foi de **15 minutos**.


  * **Na programação/internet:** É o tempo que leva desde o momento em que você clica em um botão até a página carregar na sua tela.
  * **Diminuir a latência** significa fazer com que a resposta chegue o mais rápido possível (por exemplo, reduzir o tempo do hambúrguer de 15 minutos para 5 minutos).

  ---

  ### 2. Throughput (A Quantidade de Trabalho por Tempo)

  * **O que é em palavras simples:** É a **quantidade de coisas** que o sistema consegue entregar dentro de um determinado período (por hora, por segundo, etc.). É a **capacidade de produção** ou **vazão**.
  * **Exemplo do restaurante:** A cozinha do restaurante consegue preparar e entregar **100 hambúrgueres por hora**.
  * O **throughput** da cozinha é de **100 hambúrgueres/hora**.


  * **Na programação/internet:** É quantas requisições, fotos ou arquivos o seu programa ou servidor consegue processar em 1 segundo.
  * **Maximizar o throughput** significa aumentar a capacidade para entregar o máximo de tarefas possível no mesmo intervalo de tempo (por exemplo, fazer a cozinha passar de 100 para 300 hambúrgueres por hora).

  ---

  ### O resumo da frase: *"Diminuir a latência, maximizar o throughput"*

  Em termos simples, essa frase significa:

  > **"Queremos que cada resposta seja entregue o mais rápido possível (menor tempo de espera) e que o sistema consiga atender o maior número de pessoas/tarefas ao mesmo tempo (maior volume)."**

  ---

  ### Como isso se aplica na prática (Exemplo de Código/Sistemas)?

  | Conceito | Meta | Analogia do Pedágio | Exemplo na Programação |
  | --- | --- | --- | --- |
  | **Latência** | Diminuir (quanto menor, melhor) | O tempo que **um carro** leva para passar pela cabine do pedágio. | Fazer uma consulta ao banco de dados responder em **10 milissegundos** em vez de 2 segundos. |
  | **Throughput** | Maximizar (quanto maior, melhor) | O número total de **carros que cruzam a praça de pedágio** por minuto. | Fazer o seu site conseguir atender **10.000 usuários ao mesmo tempo** sem cair. |

</details>


## Os 3 pilares da escalabilidade: caching, async e load balancing
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMwOCwicHVyIjoiYmxvYl9pZCJ9fQ==--1497dd382d8cdcbdbb41e9e895f3904d0a3b2a28/2025-06-09%20-%20Slides%20-%20Cap%2002%20-%20Os%203%20pilares%20para%20escalar%20sistemas%20distribuidos.pdf

[Slides da aprsentação local](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2002%20-%20Os%203%20pilares%20para%20escalar%20sistemas%20distribuidos.pdf)

- arquitetura é sobre contextos, requisitos e restrições
- Diminuir a latência: o tempo entre o envio da request e a resposta
- aumentar o throughput: número de requisições por segundo
- diminuir a cordination: diminuir a coordenação, tempo de espera, assíncrono
- 3 pilares:
  - cache
  - processamento assíncrono: postegar o processamento usando um broker como Kafka
  - balanceamento de carga



## Abraçando microsserviços e sistemas distribuídos
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMxNSwicHVyIjoiYmxvYl9pZCJ9fQ==--0c738bda82f0d9224be9bb0138ca5d9c271947c1/2025-06-09%20-%20Slides%20-%20Cap%2003%20-%20O%20hype%20venceu%20-%20abrac%CC%A7ando%20microsservic%CC%A7os.pdf

[Slides da aprsentação local](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2003%20-%20O%20hype%20venceu%20-%20abraçando%20microsserviços.pdf)

- 8 falácias da computação distribuída
- chamadas locais (monolito)
- chamadas distribuídas (microsserviços)
- um bom arquiteto escolhe tecnologia por sua DESVANTAGENS
- microsserviços não é uma decisão técnica

<details>
  <summary>Gerado por IA</summary>

  ## Resumo Executivo

  ### Ideia Central

  A escolha entre arquiteturas centralizadas e altamente distribuídas deve ser pautada pelo contexto organizacional e pela escala de equipes, evitando que o *hype* impulsione a adoção precoce e dispendiosa de microsserviços.

  ### Pontos-Chave

  * **Resistência ao *Hype Driven Development*:** A atração por arquiteturas de Big Techs (como Netflix) frequentemente induz empresas a adotar microsserviços sem necessidade real, ignorando a alta complexidade inerente aos sistemas distribuídos.
  * **Chamadas Locais vs. Chamadas Remotas:** Enquanto sistemas centralizados utilizam chamadas locais em memória (praticamente isentas de falhas de comunicação), sistemas distribuídos dependem de redes inerentemente não confiáveis e sujeitas a falhas intermitentes de *hardware* e *software*.
  * **A Primeira Lei dos Sistemas Distribuídos e as 8 Falácias:** Martin Fowler preconiza "não distribua seus objetos", pois tratar chamadas remotas como se fossem locais degrada *throughput* e latência ao tentar camuflar as oito falácias da computação distribuída.
  * **Microsserviços como Solução Organizacional:** A arquitetura de microsserviços serve precipuamente para escalar a autonomia e o ritmo de entrega (*Continuous Delivery*) de centenas ou milhares de desenvolvedores, e não para resolver problemas técnicos puramente pontuais de tráfego.

  ### Conclusão/Recomendação

  Avalie a arquitetura pelas suas desvantagens e pela viabilidade financeira/operacional de reverter a decisão. Se a empresa não possui gargalos de *throughput* ou equipes massivas, deve-se abraçar a simplicidade do monolito e focar a engenharia no aprimoramento de testes, processos de *deploy* e na aplicação dos três pilares clássicos de escalabilidade: *caching*, processamento assíncrono e balanceamento de carga.

  ---

  ## Análise Detalhada Ponto a Ponto da Palestra

  ### 1. O Impacto do *Hype Driven Development*

  * **A Pressão das Big Techs:** Rafael identifica que o mercado de desenvolvimento é fortemente influenciado por tendências criadas por empresas como a Netflix (FAANG/MAMAA). Esse movimento de "desenvolvimento orientado à modinha" induz times a replicar arquiteturas complexas por vaidade ou desejo de parecimento técnico.
  * **A Venda do Microsserviço como Panaceia:** Nas últimas duas décadas, difundiu-se a falsa premissa de que a única maneira viável de escalar qualquer aplicação seria fragmentando-a em sistemas altamente distribuídos.

  ### 2. A Complexidade Inerente dos Sistemas Distribuídos

  * **O Alerta de Martin Kleppmann:** Com base na obra *Designing Data-Intensive Applications*, o palestrante reforça que sistemas distribuídos envolvem múltiplas máquinas executando processos distintos e trocando mensagens sobre redes instáveis, sujeitas a atrasos e falhas parciais.
  * **As 8 Falácias da Computação Distribuída:** Toda a arquitetura distribuída precisa considerar rigorosamente que:
  1. A rede **não** é confiável.
  2. A latência **não** é zero.
  3. A largura de banda **não** é infinita.
  4. A rede **não** é segura.
  5. A topologia de rede **muda**.
  6. **Não** existe apenas um administrador.
  7. O custo de transporte **não** é zero.
  8. A rede **não** é homogênea.



  ### 3. Anatomia da Comunicação: Chamadas Locais vs. Chamadas Remotas

  * **Chamadas Locais (Sistemas Centralizados):** Dois componentes em memória (ex: classe Cliente chamando classe Serviço gerenciada pelo Spring Boot na mesma JVM) trocam chamadas de métodos. Podem ocorrer erros de código, mas é impossível haver falha no meio físico de transmissão da chamada. Se falhar, toda a infraestrutura local (CPU/HD/Memória) ruiu.
  * **Chamadas Remotas (Sistemas Distribuídos):** Processos rodando em máquinas/ambientes distintos que se comunicam via rede (HTTP/Mensageria). Introduzem-se pontos de falha externos às aplicações:
  * **Falhas de Hardware:** Switches com defeito, perda de pacotes em *datacenters*, rompimento física de cabos (ex: o caso real de 2015 em que um tubarão danificou cabos submarinos por interferência eletromagnética).
  * **Falhas de Software:** Problemas com *multitenancy* (um *tenant* consumindo recursos excessivos) ou pausas de execução do Garbage Collector (*Stop the World*), cujos travamentos geram efeitos análogos ao particionamento de rede.


  * **O Exemplo da Monzo:** Uma topologia de mais de 1.500 microsserviços gera uma teia de dependências (apelidada de "Estrela da Morte") onde os pontos potenciais de falha remota multiplicam-se exponencialmente.

  ### 4. A Primeira Lei de Design e o Erro Histórico dos Anos 2000

  * **A Lição de Martin Fowler:** Formada no início dos anos 2000, a Primeira Lei do Design de Objetos Distribuídos decreta: *"Não distribua seus objetos"*.
  * **A Falsa Promessa dos Servidores de Aplicação:** Grandes fornecedores de software (como IBM e Oracle) vendiam a ideia de que desenvolvedores poderiam programar sistemas como se fossem locais, enquanto os servidores abstrairiam e distribuiriam a carga na rede "magicamente".
  * **Consequência:** Iterações locais (como *loops* operando milhares de dados em memória) tornaram-se chamadas de rede lentas, provocando queda drástica de *performance*, aumento de latência e dependência de coordenação distribuída.

  ### 5. O Espectro Arquitetural e a Escolha por *Tradeoffs*

  * **A Falsa Dicotomia Monolito vs. Microsserviços:** A decisão arquitetural não é binária. Existe um amplo espectro entre simplicidade (monolito) e flexibilidade (sistemas altamente distribuídos).
  * **Decisão baseada nas Desvantagens:** Um arquiteto experiente não escolhe uma tecnologia apenas pelos benefícios divulgados em blogs e conferências, mas avalia se consegue suportar as suas **desvantagens** a curto, médio e longo prazo.
  * **O Custo de Reversão:** Citando o conceito do Tech Lead "Maddo", a pergunta fundamental ao adotar uma arquitetura é: *"Quão caro será reverter ou remover esta tecnologia se descobrirmos que estivemos errados?"* Decisões arquiteturais são exponencialmente mais caros de refatorar do que mudanças pontuais em código.

  ### 6. O Verdadeiro Papel dos Microsserviços: Escala Organizacional

  * **Microsserviços Não São para Escalar Tráfego Padrão:** Sair do monolito não resolverá magicamente falhas de código ou falta de requisitos técnicos básicos de desempenho. Se não há gargalo claro de *throughput*, a complexidade do microsserviço é um investimento inútil.
  * **Resolução de Problemas de Pessoas e Times:** Como aponta Sam Newman e James Lewis, a arquitetura de microsserviços existe prioritariamente para resolver **gargalos organizacionais**. Ela permite que centenas de desenvolvedores trabalhem de forma paralela, isolada e autônoma, reduzindo a necessidade de coordenação cruzada e acelerando o ciclo de *Continuous Delivery*.

  ### 7. Escalabilidade sem *Hype*: Os Três Pilares Fundamentais

  Para escalar aplicações de forma eficiente sem incorrer na complexidade excessiva de microsserviços não justificados, os sistemas devem ser estruturados com base em três pilares clássicos da computação:

  1. **Caching:** Redução do processamento redundante e da latência de busca de dados.
  2. **Processamento Assíncrono:** Desacoplamento da execução pesada em segundo plano para liberar as chamadas principais.
  3. **Distribution/Load Balancing:** Distribuição uniforme de carga entre nós de processamento.
</details>





## Arquitetura Web, performance e escalabilidade
- https://plataforma.contrateumdeveficiente.com/arquivos-aulas/slides-cap4-arquitetura-escalabilidade.pdf

[Slides da apresentação](./pilares-escalabilidade/slides-cap4-arquitetura-escalabilidade.pdf)

- Contexto: java, spring boot, postgreSQL, API REST
- Performance (latência): tempo de resposta
- scale (throughput): número de operação / unidade tempo
- limites, distribuição, qualidade

### Limites
- Quando começa aumentar a latência
- objetivo:
  - diminuir perf (latência)
  - aumentar scale (throughput)
- ao realizar um teste de performance conseguimos identificar o limite quando a latência aumenta e o throughput diminui

Ferramentas de testes de carga:
  - jmeter
  - gatling
  - k6
  - grafana
  - AWS Cloudwatch


### Distribuição
- 1 milhão de requisições por dia é muito ou pouco? Com pico num horário específico? Distribuído durante o dia? Somente em horário comercial das 08h as 18h?
- Não confie na média. No mundo real os pico podem ocorrer com uma quantidade maior durante um período do tempo.
- histoorygrama para analisar


### Qualidade
- latência: tempo entre request e resposta
- não confie na média: podem ocorrer picos com valores fora do padrõa e que podem interferir no resultado final da média.
- percentil em histogram
- verificar taxas de erro
- benchmarking é uma tarefa difícil

Links:
- https://bravenewgeek.com/everything-you-know-about-latency-is-wrong/ ou em [pdf](./pilares-escalabilidade/Everything%20You%20Know%20About%20Latency%20Is%20Wrong%20_%20Brave%20New%20Geek.pdf)




## Distribuindo a carga em multiplas máquinas distribuidas na rede
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMyMiwicHVyIjoiYmxvYl9pZCJ9fQ==--6695b0ec1fd9a10f99814c1f86018b587e94b32f/2025-06-09%20-%20Slides%20-%20Cap%2005%20-%20Primeiro%20pilar%20-%20balanceamento%20de%20carga.pdf
- [Slides da apresentação](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2005%20-%20Primeiro%20pilar%20-%20balanceamento%20de%20carga.pdf)

- de uma máquina para centenas

### Passo 01 - tunando aplicação
- configurar a quantidade de memória para a JVM (heap, memória permanente e garbage collector)
- Optimizing Java Applications on Kubernetes: beyond the Basics https://www.infoq.com/presentations/optimizing-java-app-kubernetes/

### Passo 02 - melhorando a máquina
- escalar vertical (scale up)

### Passo 03 - adicionando máquinas
- escalar horizontal em conjunto com um balanceador de cargas com apache ou NGINX
- utilização de cluster
- stick session para manter um usuário num mesma máquina em requisições diferentes

### Passo 04 - replicando estado
- replicar os estados
- alta disponibilidade

### Passo 05 - remover o estado
- replicar etados com muitas máquina fica caro
- um máquina apartada para manter todos os estados (cache distribuída com memcache ou redis)
- stateless (shared nothing architecture)

<details>
  <summary>Gerado por IA</summary>

  Aqui está o resumo detalhado do vídeo ministrado por Rafael Ponte sobre como escalar aplicações distribuindo a carga entre múltiplas máquinas:

  ---

  ## 1. Tunar a Aplicação (JVM)

  Antes de adicionar novas máquinas ou infraestrutura, o primeiro passo é otimizar a aplicação na máquina atual.

  * **Ajuste de Memória (Heap Size):** Configurar adequadamente parâmetros como `-Xms` (mínimo) e `-Xmx` (máximo). Em ambientes de produção, o ideal é definir o mínimo e o máximo com o mesmo valor para evitar desperdício de tempo da JVM redimensionando a memória em picos de acesso.
  * **Sistemas e Contêineres:** Garantir que sobre memória para o sistema operacional. Em versões modernas do Java (Java 11/17+ em Docker ou Kubernetes), é preferível usar suporte nativo a contêineres e definir percentuais de memória (ex: utilizar 75% da RAM alocada ao contêiner).
  * **Garbage Collector e Modo Server:** Selecionar e ajustar o coletor de lixo ideal (como o G1 GC) e garantir a execução em modo Server.

  ---

  ## 2. Melhora da Máquina Atual (Escalabilidade Vertical / *Scale-Up*)

  Quando a aplicação otimizada atinge o limite do hardware, aumenta-se o poder computacional do servidor existente.

  * **Aumento de Recursos:** Adição de mais memória RAM, mais processadores (CPUs) e núcleos.
  * **Vantagem:** Não exige alterações no código ou na arquitetura da aplicação.
  * **Desvantagem e Limites:** Custo financeiro exponencial (crescimento não linear entre custo e capacidade) e limites físicos de expansão do próprio hardware.

  ---

  ## 3. Adicionar Mais Máquinas (Escalabilidade Horizontal / *Scale-Out*)

  Em vez de investir em um único servidor extremamente caro, distribui-se a carga entre várias máquinas menores organizadas em um *cluster*.

  * **Balanceador de Carga (*Load Balancer*):** Centraliza o ponto de entrada das requisições (usando ferramentas como Nginx ou Apache) e distribui o tráfego entre os servidores do *backend*.
  * **Sessão Fixa (*Sticky Session*):** Para manter o contexto do usuário (como um carrinho de compras em memória), o balanceador redireciona o usuário sempre para o mesmo servidor.
  * **Problema:** Falta de redundância. Se a máquina com a sessão do usuário falhar, os dados mantidos apenas na memória daquele servidor são perdidos.

  ---

  ## 4. Replicar Estado (Alta Disponibilidade / *High Availability*)

  Para evitar a perda de dados com a queda de um nó do cluster, adota-se a replicação de estado.

  * **Funcionamento:** O estado (sessão) criado em um nó é continuamente copiado/sincronizado para todas as outras máquinas do cluster. Se uma máquina cai, o balanceador de carga pode enviar a requisição para qualquer outra sem perda de dados.
  * **Gargalo:** Conforme o número de instâncias no cluster cresce, o custo de rede, processamento e memória para sincronizar o estado entre todas as máquinas torna-se proibitivo e prejudica a escalabilidade.

  ---

  ## 5. Remover Estado das Máquinas (Arquitetura *Stateless* / *Shared-Nothing*)

  A solução definitiva para grandes escalas é remover completamente o estado interno dos servidores do cluster.

  * **Arquitetura *Stateless*:** Os servidores de aplicação não mantêm dados de sessão, arquivos ou logs locais, tornando-se descartáveis e facilmente substituíveis.
  * **Cache Distribuído:** O estado da aplicação (como sessões e carrinhos) é centralizado em um serviço de cache externo de altíssima velocidade e baixa latência (como Redis ou Memcached).
  * **Escalabilidade do Cache:** O próprio cache distribuído pode ser escalado horizontalmente criando clusters de Redis.

  ---

  ### Conclusão

  O ciclo de evolução arquitetural parte da **otimização local (JVM)**, passa pelo crescimento do hardware (**Escalabilidade Vertical**), evolui para a distribuição do tráfego (**Escalabilidade Horizontal** com *Sticky Sessions*), adiciona **replicação de estado**, e culmina na adotação de uma **arquitetura *Stateless*** integrada a um **Cache Distribuído**. Esses conceitos são independentes de linguagem (aplicáveis a Java, PHP, Ruby, .NET, etc.).
</details>


## Faça seu "dever de casa"
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMyMywicHVyIjoiYmxvYl9pZCJ9fQ==--28053f9b34233fc44962181ff6ae3fc0e9eb6a31/2025-06-09%20-%20Slides%20-%20Cap%2006%20-%20Fazendo%20seu%20dever%20de%20casa.pdf
- [Slides da apreesentação](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2006%20-%20Fazendo%20seu%20dever%20de%20casa.pdf)

> Não tem infraestrutura que aguente aplicação mal construída: comece 
fazendo seu “dever de casa"

- worload comum em sistemas distribúidos
- cpu bounds (tempo de processamento e tempo de entrada e saída)
- I/O Bound (tempo de espera entre as requisições)

Num serviço organizado em camadas: apresentação, negócio e persistência. O maior gargalo, na maior parte do tempo, está na persistência de dados.
```
 T = Tacq + Treq + Texec + Tres + Tidle
```
### Tacq
- tempo de aquisição. Pool de conection. 
- About Pool Sizing: https://github.com/brettwooldridge/HikariCP/wiki/About-Pool-Sizing. 
- The best way to determine the optimal connection pool size: https://vladmihalcea.com/optimal-connection-pool-size/

### Treq
- tempo de requisição
- habilitar batch size. Somente envia quando chegar na quantidade de batch configurada. Funciona para delete e update
- quanto menos roundtrips ao banco, menos o response time.

### Texec
- tempo de execução

### Tres
- tempo de resposta
- uso de consultas projetadas (DTO projections)
- problema do select com N+1. 
  + Configurar o modo EAGER quando precisamos de todos relacionamento sempre
  + configurar o modo LAZY quando não precisamos de todos
  + projeção com DTO quando precisamos de somente alguns campos
  + configurar o número de linhas (paginação) quando não precisamos de todas linhas do banco de dados.

> quanto menor a quantidade de dados recuperados, menor o response time

```sql
EXPLAIN (ANALYZE, BUFFERS)
SELECT u.*
 FROM users u
 WHERE
 lower(email) = 'email@example.com'
```
- site para indexação e tuning SQS: https://use-the-index-luke.com/


### Tidle



## Usando cache para lidar com picos de acesso e sobrecarga no banco de dados
- PLataforma antiga: https://dev-eficiente.memberkit.com.br/231902-pilares-da-escalabilidade-os-3-pilares-para-escalar-sistemas-distribuidos/4626442-usando-cache-para-lidar-com-picos-de-acesso-e-sobrecarga-no-banco-de-dados/downloads/4227324

- [Slides da apreesentação](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2007%20-%20Segundo%20pilar%20-%20caching.pdf)

- as chamada que ocorrem no entity manager do JPA ocorre com o cache de primeiro nível (first level cache, L1), ou seja, ao realizar o comando `repository.findById(42)` três vezes, somente a primeira será realmente executada no banco de dados.
- para cada usuário que realizar uma ação no sistema, é criada uma entity manager e isso não é o que queremos. Para isso existe um outro cache chamado de cache de segundo nível (second level cache). Tecnicamente estamos falando sobre a `EntityManagerFactory`.
- exemplo de código para habilitar utilizando property, no spring existe uma anotação para isso também:
```
# persistence.xml
<property
 name="hibernate.cache.second_level_cache"
 value="true" />
```
E depois no código:
```java
@Entity 
@Cache(...)
class NotaFiscal {
  …
  
 
 @OneToMany(fetch=FetchType.EAGER)
  List<Item> itens;
}
```

Estratégias de caching usando hibernate:
- READ_ONLY: melhor performance
- NONSTRICT_READ_WRITE: dados não críticos
- READ_WRITE: modificações frequentes

```
# persistence.xml
<property
 name="hibernate.cache.second_level_cache"
 value="true" />
<property
 name="hibernate.javax.cache.provider"
 value="org.ehcache.jsr107.EhcacheCachingProvider" />
<property
 name="hibernate.cache.region.factory_class"
 value=“org.hibernate.cache...JCacheRegionFactory” />
<property
 name="hibernate.javax.cache.uri"
 value="ehcache.xml" />
```

> a consulta mais rápida é aquela que nem chega no banco de dados



## Máximizando o throughput da aplicação com processamento assíncrono
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMyNywicHVyIjoiYmxvYl9pZCJ9fQ==--2d6d92f0bce0cbe0dcb4f6b69056710eb697ba8c/2025-06-09%20-%20Slides%20-%20Cap%2008%20-%20Terceiro%20pilar%20-%20processamento%20assincrono.pdf
- [Slides da apresentação](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2008%20-%20Terceiro%20pilar%20-%20processamento%20assincrono.pdf)

> Não processe hoje o que você pode processar amanhã: postergando tarefas custosas e lentas com PROCESSAMENTO ASSÍNCRONO

- não subestime picos de acessos
- um controller com processamento demorado com diversos ações como efetuar pagamento, baixa de estoque, atualização de pedido, envio de email e geração de nota fiscal. Isso muda a experiencia do usuário. Em alguns cados podemos processar em outro momento.
- processamento assíncrono localmente na aplicação pode sofrer com problemas de memória em algum momente e pode perder esse controle de tearefas a seren executadas. Para esse cenário existe a possibilidade de usar um broker
- broker: mantém as tarefas de forma segura e tem dois papeis importantes: producer e consumer. Problemas nas aplicações não impactam os brokers. Ex: RabbitMQ

<details>
  <summary>Gerado por IA</summary>

  Aqui está um resumo detalhado da aula, estruturado por tópicos para facilitar a leitura e o estudo.

  ---

  ## 📌 Contexto e Problema Inicial

  * **Filosofia Central:** *"Não processe hoje o que você pode processar amanhã"*.
  * **O Limite das Otimizações Síncronas:** Mesmo com otimizações em persistência de dados e o uso de *caching*, o sistema ainda fica vulnerável a picos de acesso (*spikes*) duradouros e volumosos em **endpoints de escrita** (operações custosas/lentas).
  * **Exemplo Prático (Finalização de Compra):**
  * O endpoint `POST /vendas/finaliza` realiza tarefas pesadas na mesma requisição: autorização em gateway de pagamento externo, baixa em estoque, atualização do pedido, geração de nota fiscal e envio de e-mail de confirmação.
  * **Consequência do Modelo Síncrono:** O usuário aguarda na tela até que todas essas etapas terminem. Isso prejudica a experiência do usuário, a taxa de conversão do e-commerce e eleva a latência do sistema.



  ---

  ## 1. Processamento Assíncrono In-Memory (`@Async` / Thread Pools)

  * **Solução Inicial:** Desfazer o acoplamento da resposta usando a anotação `@Async` (Spring Boot), delegando a execução pesada para background via Thread Pool (`ThreadPoolExecutor`).
  * **Como funciona por baixo dos panos:**
  * A requisição HTTP devolve uma resposta imediata ao cliente.
  * O Spring coloca a tarefa em uma **fila interna em memória**, de onde *threads workers* retiram e processam os itens.


  * **Gargalos do Modelo `@Async` In-Memory:**
  1. **Picos Longos e Volumosos:** Se o volume de requisições exceder a capacidade das *threads*, a fila interna em memória crescerá descontroladamente.
  2. **Out of Memory (OOM):** O alto consumo de memória RAM faz a aplicação travar ou ser encerrada pelo sistema operacional/Kubernetes.
  3. **Perda Irrecuperável de Dados:** Como a fila reside puramente na memória (volátil), a queda da aplicação resulta no **descarte de todos os pedidos enfileirados**, gerando perda direta de vendas.



  ---

  ## 2. Filas Duráveis e Message Brokers

  Para garantir resiliência e alta escala, é preciso evoluir de uma fila in-memory para uma **Message Queue (MQ) externa e durável** gerenciada por um **Message Broker** (ex.: *RabbitMQ*, *Apache Kafka*).

  * **Conceito e Arquitetura:**
  * **Producer:** A API/Controller apenas serializa a mensagem (ex.: em JSON) e a envia para a fila (ex.: via `JmsTemplate`).
  * **Broker (Middleware):** Armazena as mensagens com persistência em disco e suporte a réplicas/clusters (escalabilidade horizontal).
  * **Consumer:** Serviço ou *listener* (ex.: `@JmsListener`) desacoplado que lê as mensagens da fila e processa as regras de negócio pesadas.


  * **Vantagens Principais:**
  * **Durabilidade:** Em caso de crash da aplicação, nenhuma mensagem é perdida, pois elas permanecem salvas no broker.
  * **Arquitetura Stateless (*Shared-Nothing*):** O estado da fila fica fora da aplicação web, permitindo que instâncias crashadas sejam substituídas sem perda de dados.
  * **Escala Independente:** Para aumentar a vazão do processamento, basta adicionar mais consumidores (*consumers*) de forma horizontal.



  ---

  ## 3. Conectando os Conceitos: Traffic Shaping e Proteção do Sistema

  ```
  [ Tráfego Irregular com Picos ] ──> ( FILA / BUFFER ) ──> [ Processamento Estável e Constante ]
            (Producer)                                                 (Consumer)

  ```

  * **Traffic Shaping (Achatamento da Curva de Tráfego):**
  * A fila inverte o fluxo de controle: o consumidor passa a ditar o ritmo em que consegue processar as tarefas.
  * Transforma picos pontuais e caóticos de requisições do lado da escrita em uma **taxa de processamento constante, suave e controlada** do lado do consumidor.


  * **Resiliência e Proteção (*Buffer*):**
  * **Sistemas Síncronos:** Ao atingirem o ponto de saturação, entram em colapso e o *throughput* despenca violentamente a zero.
  * **Sistemas Assíncronos com Fila:** A fila atua como um *buffer* protetor contra vendas relâmpago, campanhas agressivas de marketing e até ataques de negação de serviço (DoS). O tempo de espera da fila pode subir temporariamente, mas a aplicação **não colapsa**.
</details>



## Recapitulando os 3 pilares
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMyOCwicHVyIjoiYmxvYl9pZCJ9fQ==--a80cd5a26ba0e40cb7715077cdf1c3eb4c6b9363/2025-06-09%20-%20Slides%20-%20Cap%2009%20-%20Recapitulando%20os%203%20pilares.pdf
- [Slides da apresentação](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2009%20-%20Recapitulando%20os%203%20pilares.pdf) 

---
- baixa latência (abaixa de 200ms)
- aumentar throughput
- baixar a coordenação (gerenciar)

---
- otimização de código. através da JVM etc
- escalar verticalmente (hardware)
- escalar horizontal
- diminuir latência
- maximizar o throughput (processo assíncrono em memória ou broker)

---
três pilares:
- cache
- processamento assincrono
- balanceamento de carga (distribuição de cargas)

---
- cloud pública
- kubernetes
- trade-offs

<details>
<summary>Gerado por IA</summary>

  ### 1. Objetivos Fundamentais da Escalabilidade e Performance

  Independente do estilo arquitetural adotado — seja uma aplicação mais centralizada (**monolítica**) ou descentralizada (**microsserviços**) —, a construção de sistemas distribuídos exige uma fundação técnica sólida. Empresas *Enterprise*, *startups* e *Big Techs* enfrentam desafios semelhantes ao atender grandes volumes de usuários e requisições.

  Para suportar essas cargas massivas e escalar sob demanda, os sistemas devem buscar continuamente três objetivos:

  1. **Baixa Latência:**
  * **Métrica de referência (mundo Web/APIs REST):** Latências preferencialmente abaixo de **100 ms**, idealmente na faixa de **10 ms a 50 ms**.
  * **Objetivo:** Responder às requisições do usuário no menor tempo possível.


  2. **Alto *Throughput* (Vazão):**
  * **Métrica de referência:** Alcançar marcas de **500, 600, 1.000, 2.000 ou mais requisições por segundo (req/s)**.
  * **Objetivo:** Otimizar o uso de recursos de hardware (CPU, memória) para processar o máximo de informações na mesma janela de tempo.


  3. **Evitar Coordenação:**
  * **Conceito:** Reduzir a dependência rígida entre serviços e processos, evitando *locks*, semáforos, bloqueios de *threads* e sincronização pesada.
  * **Solução:** Adotar **processos assíncronos** e a **consistência eventual** para diminuir a serialização.



  ---

  ### 2. Otimizações de Base e Infraestrutura

  Antes de aplicar os pilares arquiteturais externos, a aplicação deve ser otimizada internamente:

  * **Otimização do Runtime (JVM / Processo):** Ajuste de uso de memória e *Garbage Collector* para extrair a capacidade máxima da infraestrutura existente.
  * **Gargalos de I/O e Persistência:** Em aplicações *I/O-bound*, o maior gargalo costuma estar na camada de banco de dados. Atacar a latência nessa camada é indispensável.
  * **Escala Vertical vs. Horizontal:**
  * **Escala Vertical:** Aumento de CPU, memória ou disco em uma única máquina.
  * **Escala Horizontal:** Quando uma única máquina atinge o limite físico/financeiro, distribui-se a carga adicionando múltiplas máquinas em um *cluster*.



  ---

  ### 3. Os 3 Pilares da Escalabilidade

  Tudo o que foi discutido sobre arquitetura e performance resume-se a três pilares conceituais fundamentais. Embora frequentemente exemplificados com Java, esses princípios são **agnósticos de plataforma** e funcionam em qualquer tecnologia (PHP, .NET, Ruby on Rails, Elixir, etc.):

  ```
                      ┌─────────────────────────────────────────┐
                      │    3 PILARES DA ESCALABILIDADE          │
                      └────────────────────┬────────────────────┘
                                            │
          ┌────────────────────────────────┼────────────────────────────────┐
          │                                │                                │
          ▼                                ▼                                ▼
  ┌─────────────────┐              ┌─────────────────┐              ┌─────────────────┐
  │   1. CACHING    │              │ 2. PROCESSAM.   │              │3. BALANCEAMENTO │
  │                 │              │    ASSÍNCRONO   │              │   DE CARGA      │
  │ • Baixa latência│              │ • Alto throughput│              │ • Escala        │
  │ • Alívio de DB  │              │ • Queues/Filas  │              │   horizontal    │
  │ • Dados em RAM  │              │ • Processa no   │              │ • Cluster de    │
  └─────────────────┘              │   seu ritmo     │              │   máquinas      │
                                  └─────────────────┘              └─────────────────┘

  ```

  #### **Pilar 1: Caching**

  * **Objetivo:** Reduzir latência e aliviar componentes internos (bancos de dados, APIs internas).
  * **Mecanismo:** Mantém em memória (RAM/backend) os dados frequentemente acessados para responder instantaneamente às requisições do usuário.

  #### **Pilar 2: Processamento Assíncrono**

  * **Objetivo:** Gerenciar picos de carga, alto *throughput* de chegada e rotinas intensivas de escrita/computação (onde o cache não resolve).
  * **Mecanismo:** Enfileiramento de mensagens (*Message Queues/Filas*). A aplicação aceita a requisição imediatamente e processa o trabalho em segundo plano no ritmo suportado pelos sistemas internos.

  #### **Pilar 3: Balanceamento de Carga (*Load Balancing*)**

  * **Objetivo:** Distribuir a carga de trabalho de forma homogênea.
  * **Mecanismo:** Um balanceador de carga direciona o tráfego entre múltiplos servidores em um *cluster*, viabilizando a **escala horizontal** (adicionar mais máquinas para aumentar a capacidade total).

  ---

  ### 4. Provedores de Nuvem e Orquestração

  Quando a demanda do sistema atinge níveis extremos onde a arquitetura proprietária atinge seus limites, deve-se delegar a complexidade para infraestruturas gerenciadas:

  * **Nuvens Públicas (AWS, GCP, Azure):** Utilização de serviços nativos projetados especificamente para alta escala, reduzindo a complexidade de implementação e manutenção.
  * **Orquestração de Contêineres (Kubernetes):** Para cenários onde não se pode usar nuvem pública, o Kubernetes atua como a fundação para orquestrar e escalar aplicações em contêineres de forma autônoma.

  ---

  ### 5. Trade-offs, Mudança de Paradigma e a Lei de Cockcroft

  #### **A Lei de Adrian Cockcroft**

  > *"Escala quebra hardware, velocidade quebra software, velocidade em escala quebra tudo."*
  > — **Adrian Cockcroft** (ex-VP da AWS, ex-Netflix, eBay e Sun Microsystems).

  #### **Mudança de Paradigma na TI**

  * **TI Tradicional:** Focada em manter um *hardware confiável executando um software estável*. Funciona bem para ciclos de release longos (semestrais ou anuais).
  * **TI de Alta Velocidade (Mercado Atual):** A inovação é medida em **dias, horas ou minutos**.
  * **Design para Falhas:** Para atingir alta velocidade em escala, é necessário abandonar o modelo tradicional e construir sistemas desacoplados (como microsserviços) compostos por **componentes efêmeros e assumidamente quebrados**, garantindo alta disponibilidade mesmo diante de falhas de infraestrutura.
</details>

