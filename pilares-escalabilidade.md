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






## Trade-offs: Introdução
- https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzMzMywicHVyIjoiYmxvYl9pZCJ9fQ==--f1b5114ca0b53432ad64dae2a21f35ab3b404150/2025-06-09%20-%20Slides%20-%20Cap%2010%20-%20Trade-offs.pdf
- [Slides da apresentação](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2010%20-%20Trade-offs.pdf)

<details>
  <summary>Gerado por IA</summary>

  ### Trade-offs na Arquitetura de Software: Conceito e Consciência

  O conceito de ***trade-off*** e a necessidade de exercer a tomada de decisões conscientes na arquitetura e no design de software — especialmente ao adotar técnicas e pilares para alta performance e escalabilidade — são estruturados nos seguintes pontos:

  ---

  ### **1. O Conceito de Trade-off em Arquitetura**

  * **Equilíbrio Consciente:** *Trade-off* é o balanço entre o que se deseja obter e aquilo de que se está disposto a abrir mão.


  * **Regra Fundamental:** Nenhuma solução ou técnica de escalabilidade vem "de graça"; para se ganhar determinado benefício (como performance ou vazão), inevitavelmente perde-se algo em contrapartida.


  * **O Papel do Arquiteto:** Uma boa decisão arquitetural não consiste em encontrar a "solução perfeita", mas em compreender claramente quais são as perdas e ganhos associados a cada escolha.


  * **Alerta sobre Soluções "Sem Perdas":** Se um desenvolvedor ou arquiteto não consegue identificar os *trade-offs* de uma solução, significa que ele simplesmente não está enxergando o que está perdendo.



  ---

  ### **2. Os Perigos da Busca Insana por Performance**

  * **Sensibilidade em Escala:** Ao buscar alta velocidade e escala, os sistemas tornam-se ainda mais sensíveis e sujeitos aos impactos negativos dos *trade-offs*.


  * **Trabalhar em Alta Concorrência:** Operar em alta escala implica lidar com alta concorrência, o que eleva drasticamente a complexidade do sistema.


  * **Alerta de Brian Goetz (Arquiteto-chefe da linguagem Java):**
  > *"Quando você troca segurança (safety) por performance, você pode acabar sem nenhuma das duas."*
  > 


  * **Risco de Apressamento:** Sacrificar a segurança do código ou da aplicação em busca de métricas de performance pode resultar na degradação de ambas as frentes.



  ---

  ### **3. Avaliação de Trade-offs no Contexto do Projeto**

  * **Relevância Contextual:** Ter *trade-offs* não invalida uma solução; a questão crítica é avaliar se esse impacto negativo é **significativo ou não no seu contexto específico**.


  * **Análise Temporal de Impactos:** É indispensável mapear se as desvantagens aceitas se tornarão um problema a **curtíssimo, curto, médio ou longo prazo**.


  * **Próximos Passos:** Essa mentalidade analítica deve ser aplicada diretamente aos três pilares da escalabilidade (**Caching**, **Processamento Assíncrono** e **Balanceamento de Carga**) para identificar quais perdas cada um introduz no ecossistema da aplicação.
</details>




## Trade-offs: As desvantagens ao adotar o Pilar de Caching
Performance vs consistency
- mais distante da verdade, maior a performance
- em contrapartida, menor consistência

Um cache próximo do cliente aumenta a performance, mas também aumenta a complexidade na consistência de dados, invalidar o cache para manter a informação atualizada em relação ao banco de dados.

Latency vs throughput
- quanto mais distribuído o cache, maior o throughput 
- em contrapartida, maior latência


<details>
  <summary>Gerado por IA</summary>

  ### Resumo Detalhado: Trade-offs e Desvantagens do Pilar de Caching

  A adoção de soluções de *caching* (memória de acesso rápido) traz melhorias expressivas de performance e alívio de infraestrutura. No entanto, a aplicação dessa técnica introduz *trade-offs* técnicos e arquiteturais críticos que afetam a consistência dos dados, a latência e a complexidade de gerenciamento.

  ---

  ### **1. Trade-off 1: Performance vs. Consistência**

  A relação entre a velocidade de acesso ao *cache* e a fidelidade dos dados é inversamente proporcional: **quanto mais distante da fonte da verdade (banco de dados), maior é a performance do *cache*, mas menor é a sua consistência.**

  ```
                      +---------------------------------------+
                      |        MAIOR PERFORMANCE              |
                      |       (Menor Consistência)            |
                      +-------------------+-------------------+
                                          |
                                    [ Browser / Client ]
                                          |
                                    [ Presentation / API ]
                                          |
                                    [ Business / Backend ]
                                          |
                                    [ Persistence / DB ]
                                          |
                      +-------------------+-------------------+
                      |         MAIOR CONSISTÊNCIA            |
                      |       (Menor Performance)             |
                      +---------------------------------------+

  ```

  * **Cache Próximo à Fonte da Verdade (Backend / DB):**
    * **Vantagens:** Ficar na camada de persistência (ex: *Second-Level Cache* do ORM/Hibernate) ou de negócio facilita a sincronização e a invalidação, pois os dados estão diretamente integrados ao banco de dados.
    * **Desvantagens:** Entrega uma ganho de performance moderado em comparação às camadas de ponta.


  * **Cache Distante da Fonte da Verdade (Controller / Browser / CDN):**
    * **Vantagens:** Oferece altíssima performance e respostas quase instantâneas ao salvar diretamente a resposta final (*endpoints* REST, *Spring Cache*) ou ao manter o dado no navegador do usuário.
    * **Desvantagens:** Torna o controle e a invalidação extremamente difíceis, podendo levar o usuário a visualizar dados desatualizados e tomar decisões incorretas.




  #### **O Desafio da Invalidação em Sistemas Distribuídos (Microsserviços)**
  * Citação clássica da Ciência da Computação: *"Existem apenas dois problemas difíceis na Ciência da Computação: dar nome às coisas e invalidar cache."*
  * **Redundância e Inconsistência:** Em microsserviços autônomos (ex: Serviço de Clientes e Serviço de Entregas), o serviço consumidor pode criar um *cache* local para continuar operando mesmo se o serviço de clientes falhar ou a rede cair (resiliência e isolamento).
  * **Impacto no Negócio:** Se o cliente alterar seu endereço no Serviço de Clientes, a fonte da verdade se atualiza, mas o *cache* local do Serviço de Entregas continua com o dado antigo. Sem um mecanismo eficiente de notificação ou invalidação, operações custosas ou incorretas são executadas (ex: entregas enviadas para endereços errados).



  ---

  ### **2. Trade-off 2: Latência vs. Throughput (Vazão)**

  Ao dimensionar a arquitetura do *cache*, deve-se escolher entre soluções em memória local (*In-Memory*) ou soluções distribuídas (*Distributed Cache*): **quanto mais distribuído o cache, maior é o throughput (vazão), porém maior é a latência.**

  | Categoria | *In-Memory Cache* (Cache Local) | *Distributed Cache* (ex: Redis Cluster) |
  | --- | --- | --- |
  | **Localização** | Roda dentro do próprio processo da aplicação (JVM). | Processos e instâncias isolados rodando na rede.   |  
  | **Latência** | **Extremamente Baixa** (acesso direto na memória RAM do processo). | **Mais Alta** (introduz *I/O* e overhead de tráfego de rede).|
  | **Throughput (Vazão)** | Limitado pela capacidade e concorrência da máquina local. | **Altíssimo** (permite adicionar múltiplos nós ao cluster). | 
  | **Complexidade** | Baixa complexidade de infraestrutura. | Requer gerenciamento de *clusters* e bibliotecas de rede. |


  #### **O Perigo da Escala Vertical e do *Garbage Collector* (GC)**
  * Tentar contornar os limites do *In-Memory Cache* aumentando a memória RAM da máquina (ex: alocar 30 GB de *Heap* da JVM para *cache* local) gera o risco do efeito **Stop-the-World**.
  * Quando o *Garbage Collector* roda para rastrear e limpar gigabytes de memória, ele pausa a aplicação. Essa pausa pode durar segundos, simulando um particionamento de rede.
  * **Risco de Cascata:** Ferramentas de orquestração (como o Kubernetes) podem interpretar que a aplicação travou devido à ausência de resposta durante a coleta de memória e derrubar a instância, agravando o problema de disponibilidade.



  #### **A Solução com Cache Distribuído (*Stateless* + Redis)**
  * Separa-se a arquitetura em dois *clusters*:
    1. **Aplicação *Stateless*:** Nós leves da JVM (2 a 4 GB de *Heap*) focados puramente em processamento.
    2. **Cluster de Cache Distribuído:** Instâncias dedicadas (ex: Redis com 64 GB+) conectadas via rede.
  * **Efeito na Latência:** Ao substituir o acesso à RAM local por chamadas de rede no Redis, o tempo de resposta pode subir de **5-10 ms** para **20-40 ms**. Contudo, ganha-se capacidade ilimitada de escala de *throughput* e facilidade de gerenciamento.



  ---

  ### **3. Conflito em Altas Escalas**
  Performance (baixa latência) e escala (alto *throughput*) possuem uma relação estreita, mas entram em conflito em volumes elevados. Em determinando ponto do projeto, a engenharia do sistema precisa decidir conscientemente se irá **otimizar para mínima latência** (privilegiando acessos locais) ou **otimizar para máxima vazão** (aceitando o custo da latência de rede em caches distribuídos).

</details>




## Trade-offs: O que você perde ao usar o Pilar de Processamento Assíncrono
### Mudança no workflow
Client-side precisa se adaptar ao modelo assíncrono e trabalhar um pouco mais para obter uma resposta.
- requisições comuns que vão de ponta a ponto desde a requisição do usuário, chegando no banco de dados e retornando a resposta para o usuário é lenta
- realizar requisições utilizando um broker como o RabbitMQ é rápido, mas paga o preço utilizando uma segunda requisição para verificarmos se a requisição já foi processada
- aumenta a complexidade

### Fire and Forget Regret
Ignorar o feedback do fluxo de envio é como maximizamos o throughput ao custo de perdas de mensagens.
- existem casos que não precisamos da resposta neste momento. Nem mesmo precisamos ter a certeza que a requisição foi finalizada com sucesso. Neste cenário onde a requisição não é crítica é uma exemplo de uso, por exemplo, um curtir num postagem de rede social
- também é possível diminuir ainda mais a latência, já que no RabbitMQ utilizamos a rede para se comunicar que mais lenta que a memória, pode-se utilizar uma thread para envia o evento para fila RabbitMQ e já devolver uma resposta de sucesso, sem aguardar a resosta do broker. Neste caso temos os mesmos problemas causa de filas em memória.


<details>
  <summary>Gerado por IA</summary>

  Aqui está um resumo detalhado da aula sobre os **trade-offs do processamento assíncrono**, focando nos dois principais desafios apresentados para desenvolvedores ao escalarem aplicações.

  ---

  ## 1. Mudança no Workflow (A Experiência do Cliente)

  Ao migrar de um modelo síncrono para o assíncrono para ganhar escalabilidade e performance (*throughput*), o fluxo de trabalho do cliente (frontend, mobile ou browser) precisa se adaptar, pois o modelo deixa de ser natural (dar uma requisição e esperar a resposta imediata).

  * **O Modelo Síncrono Tradicional:** O usuário solicita algo pesado (ex: gerar a fatura de um cartão de crédito, que exige consultas complexas ao banco de dados e cálculos). O backend processa tudo e retorna um `HTTP 200` com o PDF pronto. No entanto, isso gera alta latência e baixa escalabilidade sob carga pesada.
  * **O Modelo Assíncrono com Broker (Ex: RabbitMQ):**
  * A aplicação recebe o pedido, publica uma mensagem no broker e retorna imediatamente um `HTTP 202 (Accepted)` contendo apenas um **ID de transação (ticket)**.
  * O cliente precisa adotar um novo passo no fluxo: **fazer *polling*** (consultar periodicamente o backend com aquele ID para saber se o arquivo ficou pronto) ou aguardar uma notificação (como um e-mail).


  * **O Impacto:** Divide-se o que era uma operação simples em duas ou mais etapas (requisição e verificação posterior). Isso aumenta a complexidade de desenvolvimento, da arquitetura, da testabilidade e dificulta o *troubleshooting* de bugs.

  ---

  ## 2. *Fire and Forget* ou *Fire and Regret* (Ignorar o Feedback)

  Muitas vezes, desenvolvedores buscam maximizar o *throughput* ao extremo, abrindo mão da garantia de entrega das mensagens.

  * **O Problema do *Fire and Forget* em Memória:**
  * Exemplo: Em uma tela de "Esqueci minha senha", o sistema gera um token e precisa enviar um e-mail (operação lenta via SMTP). Para não travar a requisição, o desenvolvedor usa uma *thread pool* local (em memória, como `@Async` no Spring ou threads avulsas).
  * A aplicação responde instantaneamente ao usuário, mas a execução real ocorre em background. Se ocorrer um *crash* no servidor, queda de energia ou falta de memória (*Out of Memory*), **a tarefa em memória é perdida**. O usuário fica esperando eternamente por um e-mail que nunca chegará.


  * **A Tentativa de Melhoria com Brokers:**
  * O uso de um broker durável (como RabbitMQ) garante mais resiliência, pois a mensagem é gravada em disco.


  * **O Extremo "Tirar Leite de Pedra" (*Fire and Regret*):**
  * Para eliminar até mesmo a pequena latência de rede de enviar a mensagem ao RabbitMQ, alguns desenvolvedores colocam o envio ao broker dentro de uma *thread pool* local assíncrona.
  * Com isso, a aplicação finge que enviou, mas se houver uma falha de rede ou o broker recusar a mensagem enquanto ela está pendente na *thread* em memória, **a mensagem é perdida de vez** sem tratamento de erro ou mecanismo de *retry*.


  * **Quando usar?** O *Fire and Forget* agressivo só é aceitável em cenários onde a perda de dados é tolerável (como a contabilização de *likes* em uma rede social). Em sistemas corporativos críticos (como pagamentos ou entregas), correr esse risco pode ser desastroso — transformando o *Fire and Forget* em um **"dispare e se arrependa" (*Fire and Regret*)**.

  ---

  ### Conclusão

  Os trade-offs do processamento assíncrono vão muito além da latência e consistência de arquitetura: eles impactam diretamente os **custos de desenvolvimento, a complexidade de manutenção** e exigem decisões conscientes sobre **confiabilidade e perda de dados**.
</details>




## Trade-offs: O Pilar de Load balancing e novas formas de quebrar seus sistemas
### latency vs consistency
> Diminuir a latência muitas vezes significa abrir mão de uma consistência (mais) forte.
- numa aplicação que realizar persistência no banco de dados, divide-se a carga de trabalho em leitura e escrita. Normalmente essa carga segue uma proporção de leitura para escrita de 80/20 ou 70/30. A escrita fica no banco primário que possui replicas de somente leitura e o tempo de sincronização pode não ser imediata, mas com o preço de uma consistência eventual
- consistência eventual

### coordination & race condition
> Distribuir a carga pode significar mais throughput ao custo de novas formas de quebrar o sistema
- problema de concorrência
- na tentativa de aumentar o throughput, adiciona-se mais instâncias horizontalmente o que pode causar problemas de sobrescrita de valores se forem realizadas num instante muito próximo entre as requisições.
- a anotação sincronized realiza um lock local, mas somente ocorre dentro de uma única instância que causa problemas ao realizar uma escala horizontal.
```java
@Component
public class ProcessadorDeComprasJob {

    @Scheduled(...)
    public synchronized void execute() {
        // executa lógica de negócio
    }
}
```

<details>
  <summary>Gerado por IA</summary>

  Aqui está um resumo detalhado da aula **"Trade-offs: O Pilar de Load Balancing e novas formas de quebrar seus sistemas"**, estruturado de forma clara e organizada:

  ---

  ## 🎯 Visão Geral

  A aula aborda os **trade-offs** (compensações) envolvidos na implementação de balanceamento de carga e escala horizontal em sistemas distribuídos. O foco principal é mostrar que, embora essas estratégias tragam ganhos de performance e vazão (*throughput*), elas introduzem novos desafios e formas de falha que os desenvolvedores precisam conhecer.

  ---

  ## ⚖️ Trade-off 1: Latência vs. Consistência

  O primeiro dilema discutido trata de como diminuir a latência do sistema frequentemente exige abrir mão de uma consistência de dados mais forte.

  * **O Cenário de Leitura e Escrita:** A maioria dos sistemas corporativos possui um *workload* (carga de trabalho) desproporcional, com muito mais operações de **leitura do que de escrita** (geralmente uma proporção de 70/30 ou 80/20).
  * **O Uso de Réplicas:** Para não sobrecarregar uma única instância de banco de dados, utiliza-se um banco primário (responsável por leituras e escritas) e várias **réplicas** (cópias do banco primário focadas exclusivamente em receber leituras).

  ### 1. Replicação Síncrona (Alta Consistência, Maior Latência)

  * **Como funciona:** Quando a aplicação envia um comando de escrita (Insert/Update/Delete) para o banco primário, ele bloqueia a aplicação e só confirma a operação após propagar e gravar a alteração **em todas as réplicas**.
  * **Vantagem:** O sistema garante **consistência imediata**. A aplicação consegue ler suas próprias escritas instantaneamente em qualquer réplica.
  * **Desvantagem:** Alta latência, pois a aplicação fica bloqueada esperando a sincronização completa.

  ### 2. Replicação Assíncrona (Baixa Latência, Consistência Eventual)

  * **Como funciona:** A aplicação escreve no banco primário, que libera a resposta imediatamente e despacha as atualizações para as réplicas de forma **assíncrona**.
  * **Vantagem:** Menor latência e maior velocidade, mantendo o fluxo ágil.
  * **Desvantagem:** Introduz a **consistência eventual** (*eventual consistency*). Se a aplicação tentar ler de uma réplica antes que ela receba a atualização, os dados estarão desatualizados.
  * **Exemplo prático:** Um usuário adiciona um item ao carrinho de compras, a tela recarrega imediatamente buscando dados de uma réplica que ainda não foi sincronizada, e o usuário vê o carrinho vazio, gerando frustração e comportamentos inesperados.

  ---

  ## ⚡ Trade-off 2: Coordenação e Condições de Corrida (*Race Conditions*)

  O segundo dilema aborda como a distribuição de carga através da escala horizontal pode aumentar o *throughput*, mas abre espaço para sérios problemas de concorrência.

  * **O Cenário do Job em Background:** Imagine uma aplicação que executa uma tarefa agendada (*Job*) a cada 1 minuto (usando `@Scheduled` no Spring Boot) para processar pedidos pendentes em uma tabela do banco de dados.
  * **O Problema da Escala Horizontal:** Se a aplicação roda em apenas uma máquina, o Job processa os registros sequencialmente. No entanto, se escalarmos para **duas ou mais instâncias** da aplicação para obter redundância ou maior vazão, **ambas as máquinas executarão o mesmo Job ao mesmo tempo**, disparando consultas idênticas e tentando processar os mesmos pedidos de forma duplicada.
  * **Por que o `synchronized` do Java não resolve?** A cláusula `synchronized` garante exclusão mútua apenas dentro de uma única Máquina Virtual Java (JVM). Como temos instâncias rodando em máquinas separadas com *locks* locais e independentes que não se comunicam entre si, o problema persiste.
  * **Consequências:** Processar a mesma compra duas vezes pode gerar cobranças duplicadas, bugs de concorrência difíceis de rastrear e severos problemas de consistência de dados.

  ---

  > 💡 **Conclusão:** Aumentar a distribuição e o balanceamento de carga com a escala horizontal traz grandes benefícios de desempenho, mas exige atenção redobrada aos arquitetos e desenvolvedores, pois introduz complexidades invisíveis a priori, como a gestão de consistência de dados e o controle de concorrência entre múltiplos nós.
</details>




## Trade-offs: Finalizando
Pilares da esclabilidade:
- cache
- processamento assincrono
- balanceamento de cargas

> um bom arquiteto escolhe tecnologias por sua DESVANTAGENS

<details>
  <summary>Gerado por IA</summary>

  Aqui está um resumo detalhado da aula **"Trade-offs: Finalizando"**, estruturado para fixar os conceitos principais:

  ---

  ## 🎯 Visão Geral

  A aula de encerramento reforça que **toda decisão arquitetural ou tecnológica envolve trade-offs** (desvantagens ou perdas em troca de ganhos). O grande papel de um bom desenvolvedor ou arquiteto de software não é apenas olhar para as vantagens de uma tecnologia, mas entender profundamente o que se está perdendo ao adotá-la.

  ---

  ## 🔑 Pontos-Chave da Aula

  * **O Conceito de Trade-off:** É a balança da arquitetura. Sempre que você ganha algo (como menor latência, maior vazão, segurança ou simplicidade), você invariavelmente abre mão de outra coisa (como consistência mais forte, simplicidade de desenvolvimento ou menor complexidade operacional).
  * **A Regra de Ouro do Arquiteto:**
  > *"O bom arquiteto ou arquiteta não escolhe soluções tecnológicas apenas por suas vantagens; ele ou ela escolhe principalmente por suas desvantagens."*


  * **A Pergunta Crítica:** Sempre que uma nova tecnologia, framework, biblioteca ou decisão de alto nível (como uso de cache, processamento assíncrono ou load balancing) for proposta, a postura correta deve ser: **"Eu entendi o que estou ganhando, mas o que é que estou perdendo?"**
  * **O Contexto é Rei:** Um trade-off só é um problema real se ele for **significativo para o seu contexto específico**. Por exemplo, adotar processamento assíncrono traz complexidade, mas se o seu time já domina essa abordagem, essa complexidade deixa de ser um problema crítico.
  * **Cuidado com o *Hype*:** A aula alerta contra decisões tomadas com base em modismos ou dicas superficiais da internet (como posts rápidos em redes sociais), que prometem soluções mágicas para performance e escala sem avaliar os impactos reais no ecossistema da sua aplicação.

  ---

  > 💡 **Conclusão:** Se você não consegue enxergar quais são os trade-offs de uma solução ao adotá-la, o ideal é parar, respirar, pesquisar e estudar antes de seguir em frente. Avaliar os prós e os contras de forma consciente garante decisões técnicas muito mais maduras e alinhadas à realidade do seu projeto.
</details>



## Ampliando as perspectivas: Introdução
- [Slides](https://assets.memberkit.com.br/rails/active_storage/blobs/redirect/eyJfcmFpbHMiOnsiZGF0YSI6NDIyNzM1MiwicHVyIjoiYmxvYl9pZCJ9fQ==--d443ba30908b6ac70611218bf56f76c393d0f561/2025-06-09%20-%20Slides%20-%20Cap%2011%20-%20Ampliando%20sua%20perspectiva%20-%20Caching.pdf)
- [Slides local](./pilares-escalabilidade/2025-06-09%20-%20Slides%20-%20Cap%2011%20-%20Ampliando%20sua%20perspectiva%20-%20Caching.pdf)

- Cache: não dá para resumir cache com cache distribuído com redis
- Processamento assíncrono: processamento assincrono vai além de broker de mensageria
- balanceamento de cargas: é além do balanceamento de carga


## Ampliando as perspectivas no uso de Caching
- podemos aplicar em nível de backend, frontend ou infraestrutura

### In-memory cache: simples
- solução simples e ingênua
- sem limite de quantidade de elementos no cache
```java
import java.util.concurrent.ConcurrentHashMap; Simple and naive Cache Implementation
@Component 
public class CacheStore {
 private static final Map<String, ExpensiveObject> cache;
 @PostConstruct
 public void initCache() {
 // logic to create the cache and warm it up
 this.cache = new ConcurrentHashMap<>(); //sem limite de tamanho
 }
 public ExpensiveObject get(String key) {
 ExpensiveObject value = cache.computeIfAbsent(key, (key) -> {
 // logic to create the expensive object
 return new ExpensiveObject(key, ...);
 });
 return value;
 }
}

```


### In-memory cache - Google guava cache implementation
- limita o tamanho do cache
- define o tempo de expirar
```java
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
public class CacheStore {
  private static final Cache<String, ExpensiveObject> cache; //cache da lib
 @PostConstruct
 public void initCache() {
   // logic to create the cache and warm it up
 this.cache = CacheBuilder.newBuilder()
 .maximumSize(100_000) //limita o tamanho máximo
 .expireAfterWrite(1, TimeUnit.DAYS) //tempo de expirar
 .build();
 }
 public ExpensiveObject get(String key) {
   ExpensiveObject value = cache.get(key, () -> {
     // logic to create the expensive object
 return new ExpensiveObject(key, ...);
 });
 return value;
 }
}
```

### Distributed cache - PostgreSQL Materialized View Implementation
- view materializada
- atualiza o cache da view
- atualiza sem realizar o bloqueio na view. Mais demorado

```sql
CREATE MATERIALIZED VIEW sales_summary AS
 SELECT seller_no as seller, 
 invoice_date as sold_at,
 sum(invoice_amt) as sales_amount
 FROM invoice
 WHERE invoice_date < CURRENT_DATE
GROUP BY
 seller_no,
 invoice_date;

CREATE UNIQUE INDEX sales_summary_seller
 ON sales_summary (seller, sold_at);

SELECT s.seller, 
 s.sold_at,
 s.sales_amount
 FROM sales_summary s
 WHERE s.sold_at >= CURRENT_DATE - 7 
ORDER BY
 s.sold_at;

REFRESH MATERIALIZED VIEW sales_summary; //atualiza view

REFRESH MATERIALIZED VIEW CONCURRENTLY sales_summary; //atualiza e não bloqueia a view, mas demorada
```


### Distributed cache - Content Delivery Network (CDN)
Outra forma de realizar um cache distribuído é através do Content Delivery Network (CDN). Comum em aplicações que possuem um frontend com diversos megas de html, css e js.
- cache em nível de infraestrutura

> Lembrando, sempre devemos fazer o trade-off entre performance (latência) e consistência. Quanto mais perto o cache do usuário, menor a latência com o preço de uma persistência eventual

<details>
  <summary>Gerado por IA</summary>
  Aqui está um resumo detalhado dos principais pontos abordados no vídeo sobre **ampliar as perspectivas no uso de cache**:

  ---

  ## 🚀 Visão Geral

  O vídeo propõe ir além do tradicional cache de backend (como o Redis) e explorar o uso de cache em **diferentes camadas da aplicação** (memória, banco de dados e infraestrutura). O objetivo é fornecer insights sobre novas possibilidades de implementação e arquitetura, avaliando trade-offs como performance e consistência.

  ---

  ## 1. Cache em Memória (In-Memory Cache)

  * **Abordagem Simples e Ingênua (`ConcurrentHashMap`):**
  * Utiliza um mapa thread-safe nativo do Java (`ConcurrentHashMap`) em uma classe gerenciada pelo Spring (`Singleton`).
  * Ideal para aplicações simples sem grandes volumes de dados ou problemas críticos de escala.
  * **Problema:** Não possui limite de tamanho, políticas de invalidação (TTL - *Time to Live*) ou *eviction*, o que pode causar estouro de memória (**OutOfMemory**) e sobrecarregar o *Garbage Collector*.


  * **Abordagem Robusta (Com Biblioteca - Google Guava / Caffeine):**
  * Recomenda-se nunca implementar a lógica complexa de cache do zero, adotando bibliotecas maduras.
  * Permite configurar parâmetros vitais, como o **número máximo de entradas** (ex: 100.000 itens) e políticas de substituição automática (como o algoritmo **LRU** - *Least Recently Used*), além de expiração por tempo.
  * O objetivo é buscar um **Cache Hit** (taxa de acerto) superior a **90%**.



  ---

  ## 2. Cache no Banco de Dados: Views Materializadas

  Quando não é possível usar cache distribuído na aplicação ou em ambientes clusterizados, o próprio banco de dados relacional (como o PostgreSQL) pode atuar como camada de cache.

  * **O que são:** Diferente das *views* normais (que apenas encapsulam queries e rodam toda vez), as **views materializadas** executam a consulta pesada (ex: relatórios de e-commerce com milhões de linhas) e armazenam o resultado fisicamente em disco, como uma tabela temporária.
  * **Vantagens:** As consultas seguintes são executadas de forma extremamente rápida, permitindo inclusive a criação de índices adicionais.
  * **Invalidação e Atualização:**
  * Pode ser feita por meio de rotinas (*cron jobs*) executando o comando `REFRESH MATERIALIZED VIEW`.
  * O parâmetro `CONCURRENTLY` pode ser usado para atualizar os dados em segundo plano sem bloquear a leitura dos usuários, garantindo disponibilidade contínua (com eventual consistência).



  ---

  ## 3. Cache na Infraestrutura: CDN (*Content Delivery Network*)

  Voltado para aplicações web e frontends modernos, focado em otimizar a distribuição de ativos estáticos (HTML, CSS, JavaScript).

  * **Funcionamento:** Em vez de forçar usuários geograficamente distantes a baixarem dezenas de megabytes diretamente do servidor de origem, a aplicação distribui os assets estáticos em servidores de **CDN** (ex: Cloudflare) espalhados pelo mundo.
  * **Vantagens:** Reduz drasticamente a latência de rede, encaminhando o usuário para a máquina mais próxima e melhorando a experiência global.
  * **Trade-off:** Quanto mais próximo o cache está do usuário (e distante da fonte da verdade), maior é a performance, mas **menor é o controle sobre a consistência imediata** na atualização dos arquivos.

</details>




## Ampliando as perspectivas no uso de Processamento Assíncrono
- link da apresentação You Keep Using That Word: Asynchronous And Interprocess Comms - Sam Newman - NDC London 2023: https://www.youtube.com/watch?v=6FOCNf06lqY

### Local scheduling: Spring Boot Scheduleder Implementation
```java
@Component
public class OneJob {

    @Scheduled(
        fixedDelay = 60,
        timeUnit = TimeUnit.SECONDS
    )
    public void runQuiteOften() {

        // job logic goes here

    }
}
```

- utilizando regex
```java
@Component
public class AnotherJob {

    @Scheduled(
      cron = "0 0 9-17 * * MON-FRI"
    )
    public void runOnWorkDays() {

        // job logic goes here

    }
}
```

- de forma programática
```java
@Component
public class WorkdaysScheduler {

    @Autowired
    private TaskScheduler scheduler;

    public void schedule(Runnable task) {

        scheduler.schedule(
            task,
            new CronTrigger("0 15 9-17 * * MON-FRI")
        );

    }
}
```


### Distributed scheduling: JobRunr Distributed Job Scheduleder Implementation
- Link: https://www.jobrunr.io/en/
```java
public class JobRunrExample {

    public static void main(String[] args) {

        HikariConfig config = // configure the connection pool
        HikariDataSource dataSource = new HikariDataSource(config);

        JobScheduler jobScheduler = JobRunr.configure()
                .useStorageProvider(
                        SqlStorageProviderFactory.using(dataSource)
                )
                .useDashboard()
                .initialize()
                .getJobScheduler();

        jobScheduler.enqueue(() -> {
            System.out.println("Up & Running from a background Job");
        });
    }
}
```


### Distributed scheduling: Kubernetes CrontJob Implementation
```yaml
apiVersion: batch/v1
kind: CronJob
metadata:
  name: process-csv-files
spec:
  schedule: "0 0 * * *"
  jobTemplate:
    spec:
      template:
        spec:
          containers:
          - name: process-csv-files
            image: busybox:1.28
            imagePullPolicy: IfNotPresent
            command:
            - /bin/sh
            - -c
            - ./run-application.sh
          restartPolicy: OnFailure
```

### Server Push: Server-sent Events(SSE) Implementation
- exemplo de polling: pode gerar DDoS e não é escalável
```html
<h1>Dashboard | Top10 Sales</h1>

<script>
  function fetchData() {
    fetch("/dashboards/top10-sales")
      .then(response => response.json())
      .then(data => {
        // Atualize o dashboard com os dados recebidos
      })
  }

  // Agenda execução a cada 15 segundos
  setInterval(fetchData, 15000);
</script>
```

```java
@GetMapping("/dashboards/top10-sales")
public List<Sale> top10Sales() {
    List<Sale> sales = salesRepository.findTop10Sales();
    return sales;
}
```
- web socket é um canal de duas direções
- server-sent events: é uma canal de única direção
```html
<h1>Dashboard | Top10 Sales</h1>

<script>
  var eventSource = new EventSource("/dashboards/top10-sales")
  eventSource.addEventListener("message", (event) => {
    // update the dashboard
  })
</script>
```

```java
@GetMapping("/dashboards/top10-sales")
public Flux<ServerSentEvent<?>> streamEvents() {

    return Flux.interval(Duration.ofSeconds(15))
        .map(sequence -> {

            List<Sale> sales = salesRepository.findTop10Sales();
            return ServerSentEvent.builder()
                .id(String.valueOf(sequence))
                .event("periodic-event")
                .data(sales)
                .build()
        });
}
```


<details>
  <summary>Gerado por IA</summary>

  Aqui está um resumo detalhado e estruturado da aula **"Ampliando as perspectivas no uso de Processamento Assíncrono"**:

  ---

  ## 📌 Visão Geral e Propósito

  O objetivo principal do vídeo é **desmistificar e ampliar a visão sobre o processamento assíncrono**. O instrutor destaca que, no mercado de desenvolvimento, o termo costuma ser associado quase que exclusivamente a *message brokers* (como Kafka ou RabbitMQ), ignorando uma vasta gama de soluções e abstrações assíncronas presentes em diversas camadas da arquitetura de software.

  Citando o especialista **Sam Newman**, o vídeo destaca que **não existe um consenso absoluto** sobre o termo "assíncrono". Por isso, o mais importante é que a equipe de engenharia alinhe internamente o significado do conceito para evitar ruídos de comunicação e tomar decisões arquiteturais mais conscientes.

  ---

  ## 🛠️ Abordagens Práticas e Arquiteturais

  A aula apresenta como a assincronicidade se manifesta em diferentes camadas da aplicação:

  ### 1. Agendamento Local de Tarefas (*Scheduling* na Aplicação)

  * **Conceito:** Execução de rotinas periódicas ou agendadas rodando diretamente na memória do processo da aplicação.
  * **Exemplo Prático (Spring Boot):**
  * **Fixo (*Fixed Delay*):** Métodos anotados para rodar a cada intervalo fixo (ex: a cada 60 segundos).
  * **Flexível (*Cron Expressions*):** Uso de expressões Cron para regras complexas de tempo (ex: rodar apenas em horário comercial, de 1 em 1 hora, de segunda a sexta).
  * **Programático:** Configuração dinâmica via código (`TaskScheduler`), permitindo ajustar regras de execução conforme parâmetros cadastrados pelo usuário ou vindos do banco de dados.


  * **Caso de uso:** Adequado para tarefas simples e locais que não exigem coordenação entre múltiplas instâncias da aplicação.

  ---

  ### 2. Agendadores de Tarefas Distribuídos (*Distributed Background Jobs*)

  * **Conceito:** Quando a aplicação roda em cluster/múltiplas instâncias, o agendamento local pode gerar problemas de *race condition* (duplicidade de execução). Surgem, então, os coordenadores distribuídos.
  * **Exemplo Prático (JobRunr):**
  * O agendador registra o job e seus metadados em um armazenamento centralizado (*Storage*), como banco de dados relacionais (PostgreSQL) ou chaves/valor (Redis).
  * **Workers:** Instâncias da aplicação funcionam como *workers*, observando o armazenamento e executando as tarefas de forma coordenada e sem concorrência.


  * **Vantagens:**
  * Tolerância a falhas e resiliência.
  * Separação de *workloads* (ex: direcionar tarefas *CPU-bound* para máquinas específicas e *I/O-bound* para outras).
  * Painéis visuais (*Dashboards*) para monitoramento dos jobs.



  ---

  ### 3. Agendamento Delegado à Infraestrutura (Kubernetes CronJob)

  * **Conceito:** Transferência da responsabilidade de agendamento e execução para o orquestrador de contêineres/nuvem, aproximando as equipes de Desenvolvimento e Operações (DevOps).
  * **Exemplo Prático (Kubernetes CronJob):**
  * Definição via arquivo de configuração YAML.
  * O Kubernetes cria um Pod/Contêiner temporário baseado em uma imagem (ex: executando um script `.sh` ou uma tarefa de manutenção) no horário especificado (ex: todo dia à meia-noite).


  * **Vantagens:** O ciclo de vida da aplicação fica limpo, delegando ao orquestrador a subida, execução, distribuição e destruição do contêiner da tarefa.

  ---

  ### 4. Comunicação Assíncrona no Front-End & Back-End (*Polling* vs. *Server-Sent Events*)

  Ao construir dashboards ou interfaces em tempo real, a escolha do padrão de comunicação impacta diretamente a latência e a escalabilidade da infraestrutura:

  #### A. Polling (Request-Response Tradicional)

  * O cliente faz requisições HTTP periódicas (ex: `fetch` a cada 15 segundos) para perguntar ao servidor se há novos dados.
  * **Problema:** Em aplicações com milhares de usuários simultâneos, o *polling* gera um efeito colateral similar a um ataque de negação de serviço distribuído (DDoS) voluntário, sobrecarregando o banco e o servidor com requisições repetitivas.

  #### B. Server-Sent Events - SSE (Server Push)

  * Em vez do cliente perguntar repetidamente (*polling*), ou de usar uma conexão bidirecional complexa (*WebSockets*), o cliente usa `EventSource` para abrir um **canal unidirecional**.
  * **Funcionamento:** O servidor toma a responsabilidade de consultar o banco (ex: usando abordagens reativas com Spring `Flux.interval`) e empurrar (*push*) as atualizações para o browser apenas quando necessário ou no intervalo controlado pelo back-end.
  * **Benefício:** Reduz drasticamente a carga de requisições no servidor, otimiza o uso de rede e melhora a experiência do usuário (*UX*).

  ---

  ## 💡 Principais Conclusões

  1. **Assincronicidade vai além de Message Brokers:** Threads, Event Loops, chamadas não-bloqueantes, corrotinas, AJAX, `async/await`, agendadores de tarefas e conexões unidirecionais (*SSE*) também são formas legítimas de processamento assíncrono.
  2. **Importância do Alinhamento de Time:** Definir o que a equipe entende por "assíncrono" previne ruídos de arquitetura.
  3. **Escolha Consciente da Ferramenta:** Analise a camada (Front-end, Aplicação ou Infraestrutura) e a escalabilidade necessária para escolher a abordagem assíncrona mais simples e eficiente para o problema.
</details>


## Ampliando as perspectivas no uso de Load Balancing (ou melhor, Workload Distribution)
Melhor ser nomeado como distribuidor de carga

### Parallell processing: Distribuindo a carga entre múltiplas threads
- ao carregar um arquivo csv, podemos carregar o arquivo em memória, mas em arquivos grandes podemos receber um erro de falta de memória devido ao tamanho do arquivo. Também pode carregar um arquivo grandes em partes para realizar o processamento.
```java
@Service
public class ImportProductsJob {

    @Autowired
    private ProductProcessor processor;
    private ExecutorService executor = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors() // thread-pool size
    );

    @Scheduled(fixedDelay = 60_000)
    public void execute() {

        // read csv file in chunks of 1000 rows
        Path file = Paths.get("/products-large-file.csv");
        IndexedCsvReader<CsvRecord> csv = IndexedCsvReader.builder()
                .pageSize(1000)
                .ofCsvRecord(file);

        int pageCount = csv.getIndex().getPageCount();
        List<Future<?>> futures = new ArrayList<>(pageCount);

        // process chunks in parallel
        IntStream.range(0, pageCount).forEach((pageNumber) -> {
            List<CsvRecord> records = csv.readPage(pageNumber);
            futures.add(
                    this.executor.submit(() -> {
                        return processor.process(records);
                    })
            );
        });

        // wait for all threads to finish
        futures.forEach(Future::get); // TODO: error handling
    }
}
```
Explicação:
- define o periodo de execução com @Scheduled
- define o número de threads baseada no número núcleos do processador
- realiza uma páginação de 1000 do arquivo csv
- percorre os itens da paginação e executa
- executa o processamento em paralelo
- aguarda a finalização de todos no processamento paralelo para finalizar


### Sharded Counters: Distribuindo a carga via Slotted Counter Pattern
```sql
CREATE TABLE post (
    id    BIGINT PRIMARY KEY,
    title TEXT NOT NULL,
    -- other columns
);

CREATE TABLE post_likes (
    post_id BIGINT PRIMARY KEY REFERENCES post(id),
    counter BIGINT DEFAULT 0 NOT NULL
);
```


```sql
UPDATE post_likes
   SET counter = counter + 1
 WHERE post_id = 4201
```

Ao realizar diversos update para registrar a quantidade de likes, pode ocorrer umesgotamento na quantidade de conexões suportada pelo banco de dados
```sql
/* connection 1 */
UPDATE post_likes
   SET counter = counter + 1
 WHERE post_id = 4201

/* connection 2 */
UPDATE post_likes
   SET counter = counter + 1
 WHERE post_id = 4201

/* connection 3 */
UPDATE post_likes
   SET counter = counter + 1
 WHERE post_id = 4201
```
Ao realizar um conjunto de atualizações podemos sofre um problema de lock contention. Ocorre quando diversos eventos de escrita tentam acessar a mesma tabela

Cada shard adiciona uma quantidade de linhas para cada usuário realizar a sua operação de escrita
```sql
CREATE TABLE post_likes (
    post_id  BIGINT PRIMARY KEY REFERENCES post(id),
    counter  BIGINT DEFAULT 0 NOT NULL,
    shard_id SMALLINT NOT NULL
);

CREATE UNIQUE INDEX post_likes_shards
    ON post_likes(post_id, shard_id);

UPDATE post_likes
   SET counter = counter + 1
 WHERE post_id = 4201
   AND shard_id = floor(random() * 4)

-- floor(random() * 4) = { 0, 1, 2, 3 }
```
Essa técnica de shards é chamada de **slotted counter pattern**

```sql
SELECT sum(count) as count
  FROM post_likes
 WHERE post_id = 4201
```


### Competing Consumers: Distribuindo a carga de uma Queue entre consumidores
Consumidores que competem

- RabbitMQ
O padrão Competing Consumers (Consumidores Concorrentes) ocorre quando múltiplos executores (ou workers) leem mensagens da mesma fila de processamento ao mesmo tempo.

Imagine uma fila de guichês num banco: existe apenas uma fila de clientes, mas vários atendentes. O atendente que ficar livre pega o próximo cliente da fila. O objetivo principal é processar muitas tarefas em paralelo de forma simples, garantindo que cada mensagem seja processada por apenas um consumidor.

- Kafka
Não temos filas, mas temos a mesma ideia de produtores e consumidores. No lado da fila temos um tópico que tem uma partição. Os consumidores não estão concorrendo, mas recebendo o mesmo item porque ele trabalha com o padrão chamado de sigle writter pattern. Para aumentar o número de consumidores, é necessário aumentar a quantidade de partições.

- PostgreSQL
Um agendamento utilizando Spring:
```java
@Component
public class TasksProcessorJob {

    @Scheduled(fixedDelay = 60_000)
    public void execute() {

        // processa itens da fila (tabela)

    }
}
```

Com uma atualização no banco de dados, processando linha a linha. Em caso de duas máquinas ocorre uma concorrência pela mesma linha:
```sql
select t.*
  from task t
 where p.status = 'PENDING'
 order by p.created_at asc
 limit 1
```

Podemos utilizar o `for update` com a intenção de realizar um lock. Enquanto uma instânica está processando, outra instânica aguarda a finalização do processamento:
```sql
select t.*
  from task t
 where p.status = 'PENDING'
 order by p.created_at asc
 limit 1
for update
```

Com aumento de mais máquinas sofremos o problema de lock contention que atrapalha a escalabilidade e o throughput.
```sql
select t.*
  from task t
 where t.status = 'PENDING'
   and mod(t.id, 4) = :machine_id
 order by t.created_at asc
 limit 1
 for update
```
Obs: próximo ao round robin. Disputam linhas distintas.

Ainda podemos otimizar com locks por linhas, mas caso aquela linha já esteja sendo processada, a instância pula aquele registro do banco de dados para uma linha que tem menos chance de ser processada.

```sql
select t.*
  from task t
 where t.status = 'PENDING'
   and mod(t.id, 4) = :machine_id 
 order by t.created_at asc
 limit 1
 for update
```

Com skip locker ao identificar que uma linha está sendo processada, pula para a próxima linha.
```sql
select t.*
  from task t
 where t.status = 'PENDING'
   -- and mod(t.id, 4) = :machine_id 
 order by t.created_at asc
 limit 1
 for update skip locked
```

<details>
  <summary>Gerado por IA</summary>

  Aqui está o resumo detalhado do conteúdo apresentado na aula sobre a distribuição de carga através do pilar de **Workload Distribution** (balanceamento de carga) e a aplicação do padrão **Competing Consumers**:

  ---

  ## 1. Recontextualizando o 3º Pilar: Workload Distribution

  Apesar de ser comumente associado apenas a balancidores de carga tradicionais (hardware/software), o terceiro pilar da escalabilidade é mais abrangente e pode ser chamado de **Workload Distribution** (Distribuição de Carga/Trabalho).

  * Ele engloba a escala vertical, escala horizontal, réplicas de leitura/escrita, particionamento de dados (*sharding*) e técnicas aplicadas diretamente na camada de código e backend.

  ---

  ## 2. Processamento Paralelo via Threads (Back-end Level)

  Como distribuir a carga de um processamento pesado na mesma máquina ou processo:

  * **Caso de Uso:** Leitura e importação de um arquivo CSV pesado em background (ex.: `ImportProductJob` no Spring).
  * **Solução Ineficiente:** Carregar todo o CSV em memória e processar linha a linha sequencialmente (risco de *Out of Memory* e baixa vazão).
  * **Solução Eficiente:**
  1. **Carregamento Incremental e Paginação:** Ler o arquivo por demanda (usando libs como *FastCSV*) e criar páginas/lotes de dados (ex.: 1.000 linhas por página).
  2. **Thread Pool:** Submeter o processamento de cada página paralelamente utilizando o `ExecutorService` e um pool de threads.


  * **Atenção ao Tamanho do Thread Pool:**
  * **Problema:** Aumentar excessivamente o número de threads acima da capacidade de hardware causa concorrência por tempo de CPU (*Lock Contention* e alto *Context Switch*), piorando a performance.
  * **Aplicações CPU-Bound:** O número ideal de threads deve ser próximo ao número de *cores* da CPU (`Runtime.getRuntime().availableProcessors()`).
  * **Aplicações I/O-Bound:** É possível usar múltiplos do número de cores (ex.: $2 \times \text{cores}$), já que as threads passam tempo aguardando respostas do disco ou rede.
  * **Coleta de Resultados:** Armazenar os retornos em objetos `Future` para sincronizar e aguardar a conclusão de todas as páginas antes de finalizar o job.



  ---

  ## 3. Padrão Slotted Counter (Sharded Counters)

  Como distribuir a carga para evitar gargalos em contadores de alto tráfego no banco de dados relational:

  * **O Problema de Concorrência (*Lock Contention*):**
  * Em cenários como redes sociais (ex.: likes em fotos), se milhares de usuários clicam em "curtir" simultaneamente, uma única linha do banco (`post_likes`) recebe múltiplos comandos `UPDATE` simultâneos.
  * O banco precisa adquirir um **Lock Exclusivo** na linha e serializar as requisições. Isso causa **Lock Contention** (contenção de locks), que limita a escalabilidade e derruba a latência/throughput.


  * **A Solução via Slotted Counter / Sharded Counter:**
  * Em vez de manter **uma** linha de contador para o post, cria-se **múltiplas linhas** associadas ao mesmo post, diferenciadas por uma coluna chamada `shard_id` (ex.: de 0 a 3).
  * Quando um usuário dá *like*, o sistema sorteia aleatoriamente um `shard_id` (`FLOOR(RAND() * N)`).
  * **Resultado:** Os updates são distribuídos dinamicamente entre linhas distintas, reduzindo dramaticamente a disputa de lock entre as conexões.
  * **Trade-off:** Para consultar o total de likes, é necessário realizar uma agregação (`SUM(counter) WHERE post_id = X`).



  ---

  ## 4. Padrão Competing Consumers (Consumidores Concorrentes)

  O padrão visa escalar o consumo de dados distribuindo os itens de uma fila/tópico entre múltiplos trabalhadores concorrentes.

  ### A. Em Brokers de Mensageria Convencionais (ex.: RabbitMQ)

  * **Mecanismo:** Uma fila acumula as mensagens.
  * **Escala:** Para aumentar o *throughput* (vazão de mensagens), basta adicionar novos *consumers* (threads ou novos nós da aplicação) escutando a mesma fila. O próprio broker distribui as mensagens exclusivamente entre eles.

  ### B. Em Plataformas de Streaming (ex.: Apache Kafka)

  * **Estrutura:** O Kafka não utiliza filas tradicionais, mas sim **Tópicos** divididos em **Partições**.
  * **Single Writer Pattern:** Para garantir máxima vazão e integridade sem *locks*, **uma partição só pode ser consumida por um único consumidor dentro de um mesmo *Consumer Group***.
  * **Escala no Kafka:**
  * A unidade de paralelismo do Kafka é a **Partição**.
  * Não adianta adicionar mais consumidores a um *Consumer Group* do que o número de partições disponíveis no tópico (os excedentes ficarão ociosos).
  * Para aplicar *Competing Consumers* e escalar a vazão no Kafka, é necessário **aumentar o número de partições** no tópico e garantir que os produtores distribuam bem as mensagens entre elas (ex.: via chave de particionamento).



  ### C. Em Bancos de Dados Relacionais (Processamento de Tarefas em Tabela)

  Ao utilizar uma tabela como fila de tarefas pendentes em um cluster de aplicações:

  1. **Abordagem Básica com `FOR UPDATE`:**
  * Evita que duas máquinas processem a mesma tarefa, mas força uma máquina a esperar a outra liberar o lock da linha, caindo novamente em *Lock Contention*.


  2. **Abordagem com Divisão por Módulo (`MOD` / Round-Robin):**
  * Filtrar o ID da tarefa com base no ID da máquina usando módulo: `WHERE MOD(id, total_maquinas) = machine_id`.
  * Cada nó processa uma fatia diferente da tabela, reduzindo a disputa.


  3. **Solução Nativa Ideal (`FOR UPDATE SKIP LOCKED`):**
  * Funcionalidade suportada por bancos modernos (como PostgreSQL, MySQL 8+ e Oracle).
  * O comando instrui o banco a selecionar a linha e, caso ela já esteja travada por outro processo/transação, **pular instantaneamente para a próxima linha disponível**.
  * **Benefício:** Elimina completamente o tempo de espera (*Lock Contention*), maximiza a vazão (*throughput*) e mantém a consistência dos dados de forma limpa e nativa.
</details>



## Ampliando as perspectivas: Finalizando
- Cache: não se resume a um cache distribudo como Redis
- Processamento assíncrono: não se resumo a um broker de mensageria como apache Kafka ou RabbitMQ
- Balanceamento de carga: não se resume ao Apache ou NGINX

<details>
  <summary>Gerado por IA</summary>

  O vídeo **"Ampliando as perspectivas: Finalizando"** conclui o capítulo sobre a aplicação dos três pilares fundamentais da performance e escalabilidade em sistemas distribuídos: **cache, processamento assíncrono e balanceamento de carga**.

  ---

  **Conceitos Chave e Aprendizados**

  * **Aplicação em Múltiplos Níveis:** Os pilares de arquitetura não dependem exclusivamente de ferramentas consolidadas de mercado (como Redis para cache, RabbitMQ/Kafka para mensageria ou Nginx/Apache para balanceamento de carga). Eles podem e devem ser aplicados em diversas camadas — do *front-end* e *back-end* à infraestrutura e serviços em nuvem.
  * **Métricas de Sucesso:** A atenção às diferentes alternativas de implementação busca maximizar o *throughput* (vazão de dados) e minimizar a latência nas comunicações em rede entre sistemas.
  * **Soluções Sob Medida:** Desenvolvedores não precisam recorrer a ferramentas complexas ou "da moda" para resolver problemas de escala. Antes de adotar novas infraestruturas, vale explorar recursos nativos e locais.

  ---

  **Principais Recursos Internos a Explorar**

  | Recurso / Abordagem | Benefício na Arquitetura |
  | --- | --- |
  | **Capacidade Local da Máquina** | Extrai o máximo de desempenho do hardware já disponível. |
  | **In-Memory Cache** | Reduz chamadas externas armazenando dados diretamente na memória da aplicação. |
  | **Uso de Threads** | Permite concorrência e processamento paralelo sem necessidade imediata de *brokers* externos. |
</details>

