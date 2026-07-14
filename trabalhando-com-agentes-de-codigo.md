# Trabalhando com Agentes de Código

## Introdução
O objetivo é deixar o aluno mais capaz de entregas o que precisa e destravar as ideias que estão na gaveta.


## Um pouco mais sobre os objetivos de aprendizagem
- a aula está conectando com o curso máquina de aprender
- diferença entre os modelos determinísticos e não determinísticos

<details>
<summary>Gerado por IA</summary>

## Resumo Executivo: Objetivos de Aprendizagem e Eficiência de Agentes
### Ideia Central
O objetivo principal do conteúdo é refinar o entendimento sobre a aplicação de agentes de código e modelos de IA, enfatizando a importância de balancear execuções determinísticas e inferências para otimizar custos, tempo e janelas de contexto.

---

### Pontos-Chave
* **Maximização Determinística:** Substituir inferências de modelos por scripts e funções determinísticas sempre que possível para economizar tokens, reduzir o tempo de execução e otimizar custos de API.
* **Otimização de Fluxos de Trabalho:** Utilizar agentes de código para automatizar tarefas de revisão, como a avaliação de qualidade e clareza de itens no *backlog*.
* **Apoio à Tomada de Decisão:** Empregar a tecnologia para registrar decisões de design, discutir arquiteturas complexas e validar hipóteses de forma mais ágil.
* **Estímulo ao Debate Técnico:** Refletir criticamente sobre restrições e o uso dessas ferramentas, promovendo o compartilhamento de ressalvas e aprendizados nos canais de comunidade.

---

### Conclusão/Recomendação
O autor recomenda avaliar constantemente os fluxos de trabalho atuais para identificar onde agentes e automações determinísticas podem ser integrados de forma mais eficiente. Além disso, incentiva o usuário a utilizar os canais de discussão da plataforma (como o Discord) para debater hipóteses, arquiteturas e eventuais ressalvas sobre as ferramentas apresentadas.
</details>




## Leia antes um resumo de tudo que você vai ver
https://plataforma.contrateumdeveficiente.com/arquivos-aulas/trabalhando-com-agentes-de-codigo-blink.pdf




## Referências
> Minhas anotações: ler sobre Harness engineering: https://www.langchain.com/blog/the-anatomy-of-an-agent-harness

- https://openai.com/index/harness-engineering/
- https://bits.logic.inc/p/ai-is-forcing-us-to-write-good-code
- https://www.anthropic.com/engineering/harness-design-long-running-apps
- https://www.anthropic.com/engineering/effective-harnesses-for-long-running-agents
- https://www.anthropic.com/engineering/effective-context-engineering-for-ai-agents
- https://martinfowler.com/articles/exploring-gen-ai/harness-engineering-memo.html
- https://martinfowler.com/articles/harness-engineering.html
- https://martinfowler.com/articles/exploring-gen-ai/13-role-of-developer-skills.html
- https://mitchellh.com/writing/my-ai-adoption-journey#step-5-engineer-the-harness
- https://aicoding.leaflet.pub/3mbrvhyye4k2e
- https://x.com/Vtrivedy10/status/2031408954517971368
- https://lexler.github.io/augmented-coding-patterns/patterns/approved-scenarios/
- https://stripe.dev/blog/minions-stripes-one-shot-end-to-end-coding-agents
- https://stripe.dev/blog/minions-stripes-one-shot-end-to-end-coding-agents-part-2
- https://www.tbench.ai/leaderboard/terminal-bench/2.0?agents=
- https://x.com/Vtrivedy10/status/2023805578561060992?s=20
- https://arxiv.org/abs/2503.13657
- https://arxiv.org/abs/2505.18286
- https://gist.github.com/karpathy/442a6bf555914893e9891c11519de94f
- https://x.com/namcios/status/2050975727390986735
- https://medium.com/@FilipeFNunes/o-agente-n%C3%A3o-%C3%A9-o-modelo-como-constru%C3%ADmos-o-rocky-para-aguentar-a-porrada-do-desenvolvimento-mobile-c2f753a3c1ce
- https://aclanthology.org/2024.tacl-1.9.pdf
- https://walkinglabs.github.io/




## Não acredito que existe a melhor maneira, ainda
- o autor vai mostrar os experimentos feitos pelo autor
- existem divergências entre os principais players
> "objetivo aqui é maximizar a chance do output sair exatamente do jeito que deveria para minimizar trabalho de revisão"

<details>
<summary>Gerado por IA</summary>
## Resumo Executivo: Estratégias e Experimentos com Agentes de Código
### Ideia Central
O objetivo principal do vídeo é compartilhar experimentos práticos e estratégias para maximizar a confiabilidade e a autonomia de agentes de código, assumindo que não existe um padrão único ou uma "melhor maneira" definitiva no atual estágio da tecnologia.

### Pontos-Chave
* **Ausência de um Padrão Consensual:** Não há uma abordagem universal ou soberana para organizar repositórios e guiar agentes, visto que os principais *providers* do mercado (Anthropic e OpenAI) frequentemente divergem em suas metodologias.
* **Abordagem Baseada em Experimentos:** O foco do conteúdo é relatar testes empíricos de estruturação (como o uso de arquivos de design e otimização de janelas de contexto), incentivando o usuário a comparar os resultados com suas próprias práticas.
* **Desmistificação da Economia de Contexto:** Testes práticos indicam que estratégias intuitivas para guiar o agente nem sempre resultam em uma redução significativa ou linear no consumo de *tokens*.
* **Busca pela Autonomia da Execução:** O direcionamento dos experimentos visa criar um fluxo de trabalho onde a máquina seja altamente confiável, reduzindo gradativamente a necessidade de intervenção humana no *output*.

### Conclusão / Recomendação
A recomendação do autor é focar na **maximização da assertividade do *output*** para minimizar ou eliminar o trabalho de revisão humana. Alcançar esse nível de confiabilidade na execução automatizada é apontado como o principal pré-requisito para que a adoção de sistemas de **multiagentes** passe a gerar escala e valor real.
</details>




## O que é padrão, já está na documentação. Vamos de opinião
- explicação sobre agent.md, MCP e skills não serão explicadas neste curso. Já está documentado na documentações oficiais

<details>
<summary>Gerado por IA</summary>

## Resumo Executivo: Abordagem Prática e Aplicação de Ferramentas de Agentes

### Ideia Central

O propósito principal do curso é focar na combinação prática e aplicação estratégica de recursos como MCP, *skills* e *rules*, em vez de reexplicar conceitos teóricos que já estão disponíveis nas documentações oficiais das ferramentas.

### Pontos-Chave

* **Autonomia na Base Teórica:** Conceitos estruturais (como o protocolo MCP, *skills*, *rules* e arquivos `.md` de configuração) não serão detalhados, pois seu entendimento conceitual deve ser obtido diretamente nos documentos formais dos provedores.
* **Gestão de Janela de Contexto:** As documentações oficiais já detalham os mecanismos técnicos que as ferramentas (como o Claude Code) utilizam para carregar *tools* e *skills* de forma eficiente, evitando a saturação do contexto.
* **Foco no "Como" e não no "O Quê":** O valor do conteúdo está no compartilhamento de fluxos de trabalho reais, demonstrando como orquestrar e combinar essas ferramentas no dia a dia do desenvolvimento.
* **Eficiência no Aprendizado:** Evitar explicações redundantes de especificações técnicas visa acelerar a produtividade, direcionando o tempo para técnicas que geram resultados práticos imediatos.

### Conclusão / Recomendação

A recomendação do autor é que o aluno assuma o papel de uma "máquina de aprender", consultando ativamente as documentações técnicas para compreender os fundamentos e os riscos dos recursos, permitindo que as aulas sejam aproveitadas estritamente para absorver as estratégias de combinação e uso avançado dessas tecnologias.
</details>




## Visão geral do que vamos trabalhar
O autor fala sobre as prática utilizadas: 
- agente de marketing
- agente que gera post de blog baseada na tranascrição de gravações do youtube
- a nova plataforma de estudo do dev eficiente
- agente que faz resumo dos livros, blinks disponíveis na plataforma do dev eficiente

O objetivo é escutar sobre as ideia e refletir sobre a técnica e acompanhar num exemplo real do dia a dia





## A busca pelo contexto ideal
- fornecer o contexto correto
- tem que buscar realizar experimentações sobre o resultado de acordo com os contextos gerados pela IA
- utilizar uma abordagem e armazenar numa nova branch, criar uma nova branch e comparar com um novo contexto para validar
- o autor comentou sobre o cenário fora da área de engenharia de software, na escrita de posagem em blog. Utilizando um tom de voz da personalidade de uma pessoa ao escrever um post, por exemplo

<details>
<summary>Gerado por IA</summary>


</details>







## Prefira o caminho determinístico
- identificar problemas que podem ser resolvidos de forma determinística
- motivos do determinismo: primeiro é mais rápido e segundo porque a resposta é mais confiável
> ao menos no momento atual da evolução da IA
- boa práticas: linter podem ser aplicado via ferramentas de linter do ecossitema da liguagem de programação no lugar de deixar o modelo de IA realizar esse processo
- executar uma ferramenta de cobertura de testes no lugar de pedia para o modelo identificar a cobertura dos testes. Fornecendo um script bash com a instrução de linha de comando que já fornece a cobertura do código
- análise de código estática e complexidade de algoritmo estática é outro exemplo


<details>
<summary>Gerado por IA</summary>

## Ideia Central
A otimização do desenvolvimento de software e da automação de processos reside no equilíbrio estratégico entre abordagens determinísticas (mais rápidas e confiáveis) e não determinísticas baseadas em LLMs, priorizando o determinismo sempre que ferramentas e scripts estruturados estiverem disponíveis.

---

## Pontos-Chave
* **Determinismo vs. Não Determinismo:** Processos determinísticos (como funções de código tradicionais) garantem o mesmo *output* para os mesmos parâmetros, oferecendo maior velocidade e confiabilidade. Em contrapartida, LLMs operam por inferência (não determinísticas), embora a variabilidade de suas respostas esteja diminuindo com a evolução dos modelos.
* **Agentes e Infraestrutura (*Harness*):** O uso de modelos de IA de ponta (como as linhas Anthropic/Claude) é potencializado quando integrado a agentes de código. Essa infraestrutura executa fluxos passo a passo (*step-by-step*), gerando e executando scripts intermediários para enriquecer o contexto e aumentar a confiabilidade do resultado final.
* **Arquitetura Híbrida em Casos Reais:** Tarefas complexas devem ser divididas. Enquanto a geração de ideias ou estruturação de conteúdos de mídia pode ser delegada ao modelo de IA (não determinístico), a validação de formatos, dimensões de imagens, aplicação de identidade visual e regras de negócio deve ser executada por scripts determinísticos.
* **Automação de Qualidade de Código:** Práticas de Engenharia de Software — como aplicação de *linters*, cobertura de testes, análise estática e avaliação de complexidade cognitiva (ex: *Cognitive Driven Development* - CDD) — devem utilizar ferramentas e *plugins* tradicionais via *hooks* de *pré-commit*. A IA entra como alternativa temporária ou complementar apenas quando não houver ferramental determinístico pronto.

---

## Conclusão/Recomendação
A diretriz prática do autor consiste em adotar uma abordagem **"determinística por padrão"**: sempre que um problema puder ser resolvido via algoritmo tradicional, script ou ferramenta estática, esse deve ser o caminho escolhido. Caso a solução determinística não exista ou seja inviável de implementar de imediato, adota-se a solução não determinística via LLM, aceitando conscientemente uma menor confiabilidade e utilizando o ecossistema de agentes para mitigar os erros.
</details>






## Tradeoff de tempo e custo em função do caminho de resolução
- aumento o tempo de execução e gastar mais tokens

<details>
<summary>Gerado por IA</summary>

Com base na transcrição fornecida, apresento o resumo executivo estruturado:

## Resumo Executivo: Execução Determinística vs. Não Determinística

### Ideia Central

O uso de modelos de linguagem (LLMs) para análises que poderiam ser resolvidas de forma determinística via scripts introduz ineficiências desnecessárias, como maior tempo de execução, menor confiabilidade e custos adicionais com tokens.

---

### Pontos-Chave

* **Alternativa Determinística:** Atividades como análise de complexidade pelo CDD (Cognitive Driven Development) e verificação de estratégias de teste (cobertura de estados, *boundary tests*) podem e devem ser automatizadas via scripts determinísticos sempre que possível.
* **Trade-offs das LLMs:** A adoção de uma abordagem não determinística baseada em IA introduz três desvantagens críticas: aumento no tempo de processamento, perda de previsibilidade/confiabilidade nos resultados e consumo financeiro de tokens.
* **Fator Conhecimento:** Muitas vezes opta-se por soluções não determinísticas por desconhecimento de ferramentas ou algoritmos específicos que resolveriam o problema de forma exata e linear.
* **Restrição de Custos:** O consumo de tokens deve ser tratado como uma restrição de design séria no desenvolvimento do fluxo de trabalho, pesando diretamente na decisão arquitetural.

---

### Conclusão/Recomendação

Antes de delegar uma tarefa de análise de código ou testes a uma LLM, deve-se priorizar a busca ou o desenvolvimento de ferramentas determinísticas (scripts estruturados), reservando a inteligência artificial estocástica estritamente para cenários de análise semântica complexa onde não existam regras computacionais claras.
</details>





## Cada iteração deveria contar
> cada interação deveria ser um aprendizado

Práticas durante a interação:
- perguntar pro agente qual foi o aprendizado identificado para implementar a tarefa
- dar export da conversação com o modelo para refletir num momento futuro


<details>
<summary>Gerado por IA</summary>

## Resumo Executivo: O Poder do Feedback Loop e Iteração com IA
A iteração contínua e estruturada com modelos de Inteligência Artificial permite refinar a qualidade das entregas (seja em geração de conteúdo ou engenharia de software) a ponto de reduzir drasticamente a necessidade de revisão humana e maximizar a assertividade das respostas.

---

### Pontos-Chave
* **Refinamento de Estilo e Naturalidade:** O processo iterativo de ajuste de tom de voz e referências permite que a IA gere textos técnicos complexos (como análises métricas de futebol) tão naturais que leitores humanos não distinguem a autoria automatizada.
* **Ganho de Eficiência no Desenvolvimento:** No contexto de entrega de software (design, arquitetura, testes e *troubleshooting*), inputs didáticos e bem contextualizados reduzem progressivamente a necessidade de revisões humanas no código gerado.
* **Extração Ativa de Aprendizado:** Ao finalizar uma tarefa, interrogar o próprio agente de IA sobre os aprendizados adquiridos naquela interação ajuda a consolidar melhorias para os próximos fluxos de trabalho.
* **Auditoria de Prompts:** Exportar o histórico das sessões de uso serve como ferramenta de reflexão analítica para otimizar a engenharia de prompts e aperfeiçoar o *feedback loop* com a tecnologia.

---

### Conclusão/Recomendação
Trate cada interação com a IA como um ciclo de aprendizado: ao concluir uma entrega, adote a prática de exportar a sessão e questionar o agente sobre os aprendizados da tarefa, refinando continuamente o contexto e os inputs para os próximos ciclos de desenvolvimento.
</details>





## Guardrails
Checagens pós-tarefa, exemplos de checagens (Hooks):
- percentual de cobertura
- qualidade dos testes: utilizando boundary tests, evitar asserts usando matchers, preferir instância real no lugar de mock em objetos simples de serem criados
- complexidade do código
- práticas de coesão
- conferir a implementação contra a especificação: verificar se os commits estão obedecendo as especificações criadas

<details>
<summary>Gerado por IA</summary>

## Ideia Central

O principal desafio atual no desenvolvimento com LLMs é mitigar o esforço humano na revisão de tarefas e aumentar a confiabilidade do código gerado por IA através do uso de hooks de verificação pós-implementação.

---

## Pontos-Chave

* **Gargalo na Checagem de Saída:** Em meados de 2026, a revisão manual de múltiplas tarefas de código geradas por ferramentas como Claude Code ou Cursor atua como um gargalo produtivo, mesmo com o suporte de agentes adversariais (planejamento, execução e verificação).
* **Verificações Determinísticas:** Consistem na aplicação de ferramentas analíticas tradicionais e automatizadas no estágio de pré-commit para mensurar métricas exatas, como o percentual de cobertura de testes e indicadores de complexidade ciclomática.
* **Verificações Não Determinísticas (Inferência):** Utilizam o LLM como um mecanismo falível para validar critérios qualitativos complexos onde não há ferramental pronto, avaliando a qualidade fina dos testes (uso excessivo de mocks), adesão à especificação e regras de coesão de código.
* **Validação do CDD (*Cognitive Complexity-Driven Development*):** À falta de uma ferramenta multiplataforma determinística para o cálculo de complexidade baseado em CDD, emprega-se a inferência da IA, alimentada por um arquivo de regras customizado, para inspecionar a arquitetura do código.

---

## Conclusão/Recomendação

O objetivo final da estratégia é viabilizar o envio de código para produção de forma automatizada e sem inspeção visual direta (*"subir código sem olhar"*), escalando a esteira de desenvolvimento ao exercitar e refinar continuamente o ecossistema de hooks determinísticos e não determinísticos.
</details>




## Lutando contra a força do modelo
- a força principal do modelo puxa para o lado que ele foi treinado
- seu contexto adicional tenta mudar um output fortemente influenciado pelo treino

<details>
<summary>Gerado por IA</summary>

## Ideia Central

Os modelos de linguagem possuem uma tendência natural de gerar saídas baseadas nos padrões mais comuns de seu treinamento (como *Clean Architecture* e uso excessivo de *mocks*), exigindo que os desenvolvedores apliquem contextos adicionais e regras de design quando precisarem divergir desse comportamento padrão.

---

### Pontos-Chave

* **Força de atração do modelo:** Na ausência de contexto ou memória (*stateless*), o modelo gerará códigos e testes baseados na média do que existe na internet, o que nem sempre alinha-se às necessidades específicas da equipe.
* **Contexto como força contrária:** Para direcionar o modelo a um resultado customizado, é fundamental injetar contextos de negócio, utilizar arquiteturas de recuperação (como *RAG*) e ferramentas adjacentes (*tools/harness*) de leitura e escrita.
* **Playbooks e governança de código:** A criação de diretrizes de design na entrada (*inputs/hooks*) e validações pós-implementação garantem que o código gerado por agentes de IA respeite os padrões de coesão e arquitetura da empresa.
* **Abstração futura do design:** No longo prazo, com os modelos tornando-se cada vez mais confiáveis e próximos do determinismo, a preocupação minuciosa com o design interno do código pode se tornar secundária, priorizando apenas a funcionalidade otimizada.

---

## Conclusão/Recomendação

O autor recomenda que os desenvolvedores atuem de forma análoga a gestores de tecnologia: devem avaliar criticamente quando vale a pena despender esforço injetando contexto para forçar o modelo a seguir um padrão específico e quando é mais produtivo aceitar a saída padrão da IA, focando no funcionamento correto e na entrega de valor do software.
</details>




## Lutando contra a força do modelo: um exemplo de design
<details>
<summary>Gerado por IA</summary>

## Ideia Central

Para evitar o acúmulo de atributos não essenciais nas entidades de um sistema (como dados de ordenação ou comentários), o autor propõe um design minimalista e altamente direcionado, onde as entidades mantêm apenas sua essência e as funcionalidades acessórias são acopladas de forma modular (*plug and play*).

---

### Pontos-Chave

* **Tendência de inflação das entidades:** Sistemas tradicionais tendem a sobrecarregar classes principais (ex: Curso ou Trilha) com atributos circunstanciais, como posições de ordenação e vínculos com múltiplos autores ou comentários.
* **Design essencial e minimalista:** O autor defende que uma entidade deve conter estritamente o seu núcleo de negócio (ex: uma Aula contendo apenas título e conteúdo), reduzindo a complexidade inicial e o impacto de erros de modelagem.
* **Abordagem modular (*Plug and Play*):** Inspirado em arquiteturas de plataformas como WordPress e Drupal, o objetivo é plugar contextos adicionais — como ordenação e sistemas de comentários — como se fossem peças de Lego, sem modificar a essência da entidade.
* **Necessidade de direcionamento estrito da IA:** Por ser uma linha de design menos convencional e pouco explorada na internet, os modelos de IA nunca gerariam esse tipo de arquitetura espontaneamente, exigindo um direcionamento robusto e intencional por parte do desenvolvedor.

---

## Conclusão/Recomendação

A recomendação prática é isolar as responsabilidades periféricas das entidades principais para simplificar a manutenção do código. Ao atuar como líder da ferramenta de IA, o desenvolvedor deve intervir ativamente e guiar o agente com instruções fortes e específicas sempre que o projeto exigir uma arquitetura modular fora dos padrões genéricos de mercado.
</details>




## Aceita que não vai ser do seu jeito
- ao trbalharmos com uma IA, devemos agir como uma pessoa liderando uma equipe. Os as pessoas e papeis são representados pelos agentes no uso do LLM
- evitar o pensamento que output deve ser exatamente "o código que eu geraria". Somente eu poderei gerar o código que estou planejando. POde ser mais flexiveis e aceitar melhor outras versões do output

<details>
<summary>Gerado por IA</summary>

## Ideia Central

A liderança eficaz de times ou de agentes de inteligência artificial exige que o responsável aceite *trade-offs* e compreenda que o resultado final não será idêntico ao que faria com as próprias mãos, sob o risco de gerar fricção excessiva no processo de desenvolvimento.

---

### Pontos-Chave

* **Responsabilidade da liderança:** Assim como em equipes humanas, o responsável por guiar os agentes de IA (como o Cloud Code) assume a responsabilidade pelos resultados entregues, necessitando atuar de forma estratégica e menos centralizadora.
* **Fricção por microgerenciamento:** Tentar forçar revisões e prompts rígidos demais para que a IA siga exatamente as preferências pessoais do desenvolvedor eleva o nível de fricção e reduz a produtividade.
* **Aceitação de desvios aceitáveis:** O autor destaca que, se o código ou a solução atende aos critérios necessários, o desenvolvedor deve superar o apego a estilos estritamente pessoais de implementação.
* **Direcionamento versus execução:** O papel do especialista evolui de executor para direcionador, fornecendo insumos (*inputs*) claros, mas aceitando que a autonomia do time (ou do modelo) trará nuances próprias na saída (*output*).

---

## Conclusão/Recomendação

O autor recomenda praticar o desapego em relação ao controle absoluto sobre o design do código gerado por IA. Para otimizar a eficiência e o fluxo de trabalho, o desenvolvedor deve focar em direcionar o modelo com bons contextos e aceitar os *trade-offs* naturais da automação, entendendo que buscar a perfeição exata de um estilo pessoal anula os ganhos de produtividade da ferramenta.
</details>




## Meu fluxo de spec driven development
- uma pessoa líder de diversas pessoas de uma squad (agentes)
- SDD (spec driven develpment). O autor relaciona o assunto com o Curso Engenharia de Requisitos para Devs. No curso é orientado a definir a especificação dos requisitos e processos antes de realizar a codificação
- No uso de uma agente pode seguir o seguinte fluxo:
a. inicia utilizado o modo de planejamento
b. validação do planejamento
c. implementação do planejamento
d. validação de output e utilização de hooks


<details>
<summary>Gerado por IA</summary>

## Ideia Central

O aproveitamento máximo dos agentes de inteligência artificial no desenvolvimento de software exige deslocar o esforço do programador da escrita e revisão do código para o refinamento rigoroso do contexto e dos requisitos na entrada do fluxo de trabalho.

---

### Pontos-Chave

* **Foco na origem (Input):** Assim como na liderança de equipes humanas, garantir um alinhamento inicial detalhado — definindo objetivos, fluxos e critérios de pronto — é mais eficaz para mitigar erros do que tentar policiar exaustivamente a saída gerada pela IA.
* **Evolução da Engenharia de Requisitos:** O conceito contemporâneo de *Spec-Driven Development* (Desenvolvimento Guiado por Especificação) nada mais é do que a evolução prática da engenharia de requisitos tradicional, na qual o desenvolvedor materializa o passo a passo lógico em uma especificação antes de delegar a codificação.
* **Fluxo de Trabalho com Agentes:** O processo ideal consiste em submeter o objetivo ao modelo, acionar um modo de planejamento para revisão da estratégia, gerar a especificação formal e, por fim, autorizar a implementação automatizada integrada a checagens e ganchos de validação (*hooks*).
* **Transformação vs. Mudança:** A introdução de LLMs no desenvolvimento representa uma transformação estrutural e irreversível na dinâmica de engenharia de software, superando o ciclo tradicional de codificação manual e estabelecendo um patamar inédito de produtividade.

---

## Conclusão/Recomendação

O autor recomenda adotar o *Spec-Driven Development* como um fluxo definitivo, criando e revisando templates de especificação detalhados antes de iniciar qualquer linha de código. O desenvolvedor deve assumir o papel estratégico de revisar o planejamento da IA na entrada, permitindo que a ferramenta execute o trabalho braçal de implementação com o mínimo de fricção e microgerenciamento no código final.
</details>



## E sobre rodar múltiplos agentes?
As indicações e o fluxo utilizado pelo autor:
- executar agentes em paralelo, só quando não precisar mais revisar
- executar agente, revisar e só depois executar outro agente



## Vamos agora demonstar a aplicação dos princípios
- até este momento foi realizado uma chuva de teorias e a partir desse momento será realizada a prática do conteúdo




## Vamos analisar a aplicação na Plataforma Dev + Eficiente
- a plataforma toda do dev eficiente foi desenvolvida utilizando o claude code
- fornecer o contexto certo
- arquivo claude.md grandes podem ser referênciados para outros arquivos de contexto/especificação
- parte da especificação falando sobre tecnologias e estrutura do projeto no arqui .md foi gerado pelo próprio agente
- O autor adicionou as seguintes descrições no .md:
  a. linguagem preferida para nomenclatura para classes e métodos
  b. Padrões de design utilizadas no curso de Design e CDD
  c. padrões de testes:
    - utilizando objeto real no lugar de mocks
    - mocks para para sistemas externos como banco de dados
    - uso de MCDC
    - evitar uso de matchers, prefira valores reais
    - utilização da anotação @DisplayName (java) para descrição em português nos testes
    - proibido usar any()

**Sobre o os tipos de testes**:
* Escreva apenas testes para os controllers.
* Os testes de controllers devem ser escritos sem dependência do Spring. É para instanciar os objetos necessários e respeitar as regras de mock declaradas.


**Padroes para logs**

Utilize a classe Log5WBuilder para gerar os logs.

* Faça um log em nível de info sempre antes e logo depois de alterar um estado no banco de dados
* Faça um log em nível de info sempre antes e logo depois de acessar uma api http externa
* Faça um log em nível de error em catch que não fazem rethrow de exceptions.
* Não precisa fazer log no começo de cada método
* Não precisa fazer log dentro de condicionais que interrompem fluxo
* Priorize o uso de Log5WBuilder.metodo() em vez de Log5WBuilder.metodo(nomeDoMetodo)
* Quando for logar sem informações adicionais, finalize a cadeia com `.semInformacaoAdicional()` antes do `.info(logger)` em vez de não chamar nenhum `adicionaInformacao`.
* Nunca faça o anti pattern log and rethrow. Exemploo abaixo:


**Sobre commits**

Quando for pedido para gerar commit, considere sempre todos os arquivos alterados. Independente do tipo de arquivo.. Frontend, Backend, Especificações etc.

**Antes de qualquer commit**, analise os arquivos modificados/criados (via `git status` e `git diff`) e atualize a skill correspondente em `backend/skills/<modulo>/SKILL.md` para refletir as mudanças (novos endpoints, mudanças de auth, novos DTOs/repositórios relevantes, novos arquivos na tabela de referência etc). Se a alteração tocou mais de um módulo, atualize todas as skills envolvidas. Inclua os SKILL.md atualizados no mesmo commit.

> **Importante:** as skills a serem mantidas/atualizadas são **sempre** as que vivem em `backend/skills/<modulo>/SKILL.md`. Caso existam cópias em outros caminhos (ex: `.claude/skills/`), elas não são a fonte de verdade — não precisam ser atualizadas como parte do commit. Foque exclusivamente em `backend/skills/`.

Depois de comitar, altere o arquivo de especificação em questão para adicionar o instante de finalização e o hash do commit. Utilize como exemplo o arquivo `0058-spec-migration-extrair-perfil-tech-vaga.md`. Aí faça um ammend no último commit. Um detalhe a mais importante aqui: so precisa atualizar a spec uma vez.. depois que atualizou, nao precisa o hash de commit da atualizacao

- Sobre contexto no claude code: https://code.claude.com/docs/en/context-window


<details>
  <summary>Gerado por IA</summary>

  Aqui está o resumo executivo estruturado com base na transcrição fornecida:

  ## Resumo Executivo: Gestão de Contexto em Agentes de IA e Padrões de Desenvolvimento

  ### Ideia Central

  O autor demonstra a eficácia da aplicação prática de padrões de design, testes e logs estruturados em dezenas de milhares de linhas de código geradas por agentes de IA (especificamente o Cloud Code), utilizando arquivos de configuração de contexto para alinhar e calibrar o comportamento dos modelos às preferências do desenvolvedor.

  ---

  ### Pontos-Chave

  * **Centralização do Contexto Transversal:** O uso de arquivos como o `Cloud.md` ou `agents.md` serve para carregar regras que devem ser analisadas pelo agente no início de cada requisição, sendo otimizado por infraestruturas de *prompt caching* para evitar custos excessivos de tokens.
  * **Calibração por Exemplos (*Few-Shot*):** A inclusão de preferências claras de codificação (como idioma português para regras de negócio), padrões de arquitetura e exemplos práticos é essencial para sobrepor as tendências genéricas de treinamento do modelo LLM.
  * **Diretrizes Estritas de Engenharia:** O sucesso das entregas automatizadas baseia-se em regras rígidas pré-estabelecidas no arquivo de contexto, como a proibição de uso de *mocks* fora do banco de dados, foco em testes de borda (*boundary testing*), técnica de cobertura MCDC e logs padronizados (estrutura 5W).
  * **Determinismo Crescente e Confiabilidade:** Com a evolução das ferramentas, os modelos demonstram respostas cada vez mais determinísticas e aderentes às orientações estipuladas, permitindo reduzir a escrita manual de testes e elevar a confiança na regressão automatizada.

  ---

  ### Conclusão/Recomendação

  A ação prática recomendada é estruturar minuciosamente um arquivo de contexto global para o seu repositório (como o `Cloud.md`), preenchendo-o não apenas com metadados do projeto (tecnologias e dependências), mas principalmente com as diretrizes específicas de design de código, arquitetura de testes e exemplos de formatação desejados para obter códigos mais consistentes e reduzir a fricção na engenharia assistida por IA.
</details>




## Plataforma Dev + Eficiente: exemplo de aprendizado por iteração
Um exemplo:
- o autor comentou sobre uma iteração com o claude code que queria a utilização de um código e ele gerou outro
- a partir do problema gerou uma especificação sobre o assunto. Segue:
```text
* Para verificar a existência de recursos dentro de Controllers, prefira `OptionalToHttpStatusException.execute(optional, statusCode, mensagem)` em vez de `optional.orElseThrow(() -> new ResponseStatusException(...))`. Mantém o controller mais enxuto e padroniza a tradução para HTTP.
```
- POst blog a seguir descreve esse passo a passo no desenvolvimento sem interação humanao no processo: https://openai.com/index/harness-engineering/


<details>
  <summary>Gerado por IA</summary>

  ## Resumo Executivo: Iteração de Contexto e Autonomia em Agentes de IA

  ### Ideia Central

  O processo de engenharia assistida por IA exige que o desenvolvedor refine e itere continuamente o arquivo de contexto (`Cloud.md`) após cada entrega, garantindo a padronização arquitetural e elevando progressivamente o nível de autonomia do agente no ciclo de desenvolvimento.

  ---

  ### Pontos-Chave

  * **Refinamento Contínuo do Contexto:** A cada inconsistência gerada pelo agente de IA frente ao design desejado (como o uso inadequado de tratamento de erros ou abstrações específicas), o desenvolvedor deve atualizar o arquivo de contexto em vez de apenas aplicar correções pontuais no código.
  * **Isolamento de Responsabilidades (Borda Limpa):** O autor ilustra a iteração proibindo o lançamento de `ResponseStatusException` fora das classes de *controller*, garantindo que exceções que se transformam em status HTTP fiquem restritas estritamente à borda externa da aplicação.
  * **Alinhamento com Tendências Globais:** Com base em relatos de engenharia da OpenAI com o Codex, o mercado caminha para a codificação completa do ciclo de desenvolvimento dentro do sistema, onde o gosto e as diretrizes arquiteturais (*architecture taste*) são forçados através do ecossistema do agente.
  * **Busca pela Autonomia Ponta a Ponta (*End-to-End*):** O objetivo final da iteração constante é atingir um patamar onde o agente consiga, a partir de um único comando, reproduzir bugs, implementar correções, validar builds, rodar testes e abrir *Pull Requests* sem a necessidade de microrevisão humana constante.

  ---

  ### Conclusão/Recomendação

  A recomendação prática é encarar o arquivo de contexto do seu agente como um artefato vivo e dinâmico. Sempre que uma entrega da IA desviar do padrão esperado, atualize as regras globais e reteste o comportamento do agente (inclusive retrocedendo commits em ramificações de teste se necessário), eliminando gradualmente o tempo gasto com revisões manuais repetitivas.
</details>




## Plataforma Dev + Eficiente: exemplo de luta contra a força do modelo
- existem casos que o modelo tende a utilizar um padrão devido ao que ele foi treinados, nesses casos, podemos criar um documento de especificação bem detalhado com os objetivos da sua fucnionalidade e como você gostaria que fosse implementado. Uma relação de um registro de uma tabela ou a comunicação entre componentes do sistema.

<details>
  <summary>Exemplo de especificação</summary>

  ## Explicacao de design

  Detalhando cada coisa:

  ### Trilhas

  Uma trilha basicamente tem um nome e uma descricao.

  ### Cursos

  Um curso basicamente tem um nome, uma descricao.

  ### Encaixe Trilha Curso

  A relação entre trilha e coisas(por enquanto curso) deve morar numa classe difeente. Vamos chamar de ItemTrilha.

  Este ItemTrilha referencia a trilha e o codigoUniversal do item que vai ser relacionado com a trilha.

  A ideia aqui é já deixar preparado para qualquer coisa ser relacionada com uma tri

  ### Aulas

  Uma aula é uma unidade de ensino. Uma aula pode ter:

  * uma coleção de urls para vídeos
  * uma coleção de textos
  * uma colecao de links para documentos extras
  * uma colecao de referencias bibliograficas
</details>


<details>
  <summary>Gerado por IA</summary>

  ## Ideia Central

  Os modelos de Inteligência Artificial tendem a gerar arquiteturas de software padronizadas com base nos dados majoritários de seu treinamento, exigindo especificações textuais extremamente detalhadas e customizadas quando o desenvolvedor deseja implementar designs não convencionais ou modulares (como uma estrutura estilo "Lego" ou CMS).

  ---

  ## Pontos-Chave

  * **Tendência ao Padrão:** Os LLMs (como Claude e GPT) são altamente treinados em padrões comuns de mercado (ex: relações rígidas entre Trilha $\rightarrow$ Curso $\rightarrow$ Aula) e sempre tentarão "puxar" o código para essa abordagem convencional se não forem devidamente direcionados.
  * **Design Estilo Lego (CMS):** O autor optou por um design modular inspirado em WordPress e Drupal, utilizando entidades mínimas decoradas por contextos transversais (como um "contexto de comentários" ou "itens de trilha" genéricos com códigos universais), evitando o acoplamento polimórfico tradicional em bancos de dados.
  * **A Importância da Especificação Rígida:** Para forçar o modelo a sair do comportamento padrão, foi necessário escrever uma documentação técnica altamente minuciosa, detalhando cada operação, classe de encaixe e isolamento de escopo desejado.
  * **Assimetria de Conhecimento dos Modelos:** Tecnologias e padrões com vasta literatura na internet (ex: PostgreSQL ou POO tradicional) geram respostas automáticas melhores, enquanto stacks menos documentadas (ex: framework Pedestal ou banco Datomic) ou designs customizados exigem muito mais esforço de engenharia de prompt.

  ---

  ## Conclusão/Recomendação

  Para otimizar o uso de assistentes de código baseados em IA, avalie o nível de aderência da sua solução aos padrões de mercado: se o seu design de arquitetura ou stack tecnológica fugir do convencional, dedique tempo para redigir uma especificação técnica granular e assertiva, forçando explicitamente o modelo a seguir as restrições exclusivas do seu projeto.
</details>




## Plataforma Dev + Eficiente: aceitando que não vai ser do meu jeito
- o autor mostra um trecho de código que foi criado pela ferramenta de IA que não é o padrão utilizado por ele, nesses casos, no final da aula indicou que em alguns casos podemos evitar o atrito para gerar um código exatamente da forma que queremos para aceitar o código gerado por agentes.


<details>
  <summary>Gerado por IA</summary>

  ## Ideia Central

  O vídeo discute o trade-off de design de código no desenvolvimento orientado por Inteligência Artificial, ponderando entre a busca humana por coesão e o viés dos modelos de IA em gerar códigos procedurais, sugerindo a aceitação controlada de pequenas dívidas técnicas em prol da produtividade.

  ---

  ## Pontos-Chave

  * **Tendência de Código dos Modelos:** Modelos de IA tendem a gerar códigos menos coesos porque são majoritariamente treinados com bases de dados que refletem essa prática comum no mercado de desenvolvimento.
  * **Benefícios da Coesão:** Manter comportamentos próximos aos seus respectivos estados (encapsulamento) otimiza a testabilidade, facilita o uso de mocks e permite o reaproveitamento de lógica em múltiplos pontos do sistema.
  * **Estratégias de Mitigação:** É possível mitigar desvios de padrão arquitetural utilizando instruções customizadas (arquivos `.md`), exemplos de antipadrões e automações como *git hooks* acionando agentes revisores de coesão no momento do commit.
  * **Flexibilização do Code Review:** Em fluxos isolados e validados por testes de integração (como lógica de entrada em controllers), a rigidez na revisão pode ser flexibilizada, aceitando pequenas imperfeições que já ocorreriam em times estritamente humanos.

  ---

  ## Conclusão/Recomendação

  O autor recomenda que, ao gerenciar um fluxo de desenvolvimento baseado em agentes de IA, o desenvolvedor estabeleça diretrizes e guardrails automáticos básicos, porém aprenda a flexibilizar o controle ("largar a rédea"), aceitando que certas dívidas técnicas menores são gerenciáveis e aceitáveis diante do ganho de velocidade.
</details>




## Plataforma Dev + Eficiente: evolução das specs
- o autor sobre o seu fluxo onde não utiliza um spec-kit ou Kiro e nem utiliza um PRD (Product Requirement Description)
- O fluxo segue o seguinites passos:
  a. planejamento com o agente
  b. revisão do plano
  c. gerar a especificação
  d. implementação
  e. pré-commit com a execução dos hooks (testes, cobertura, análise estática etc)


<details>
  <summary>Exemplo da primeira especificação criada:</summary>

  ```md
  ## Objetivo

  Importar os membros do memberkit para nosso próprio banco de dados.

  ## Pacote

  * O código de importação em si deve ser criado dentro do pacote memberkit.

  ## Referencias

  * API de listagem de membro do memberkit -> [https://ajuda.memberkit.com.br/referencia-api/get-users](https://ajuda.memberkit.com.br/referencia-api/get-users)
  * Detalhes importantes:
  * A resposta traz um header chamado current-page que informa a página atual da listagem
  * A resposta traz um header chamado total-pages que informa o total de páginas
  * A request precisa carregar um header chamado api_key para ser liberada.





  ## Detalhes da implemetacao

  * A ideia é criar um controller que seja capaz de importar todos membros do memberkit que ainda nao foram importados anteriormente.
  * Quando fizer a primeira chamada de todas, já verifica se existe o primeiro email cadastrado. Se existir, não precisa continuar.
  * A chamada para o membekit deve ser feita via client do feign.
  * A api_key do memberkit deve vir do application.properties. Ela deve obrigatoriamente estar definida como uma variavel de ambiente.

  ## Direcionamento para o claude

  * Pode criar o código inteiro, começando desde o controller.
  * Escreva um teste de unidade para o controller.
  * Faça as variações necessárias seguindo o padrão de testes especificado.
  ```
</details>


<details>
  <summary>Exemplo da especificação final:</summary>

  ## Delta criacao

  Inicio – 2026-06-03
  Fim – Sun Jun 7 20:03:54 2026
  Commit – 602d19e6befb39db899c7fcd7bd19a3ab006fbe1

  ---

  ## Objetivo

  Implementar o filtro de progresso de alunos no modulo sistema-aulas, consumindo a estrutura de snapshot (`sa_snapshot_progresso_aluno` ligada a `SolicitacaoSnapshotProgressoAlunos`), nos moldes do `FiltroProgressoAlunosController` do memberkit (`memberkit.filtroprogresso`).

  O filtro **sempre considera a ultima versao do snapshot** (`SolicitacaoSnapshotProgressoAlunosRepository.ultimoIdSolicitacao()`) e filtra/pagina direto no banco via `JpaSpecificationExecutor`. Mantem paridade de funcionalidades com o memberkit V1, adaptado a realidade do sistema-aulas (aluno identificado por email; `Curso` sem FK de categoria).

  ---

  ## Pacote

  * `sistemaaulas.relatorios.progresso` (controller, DTOs, filtros e component novos)
  * `sistemaaulas.organizacao` (apenas dois metodos novos em ItemCategorizadoRepository)
  * `autenticacao` (matchers novos no SecurityConfig)

  ---

  ## Diferencas vs memberkit V1

  * Aluno = `codigoUniversalEntidade` (email). Nao existe `Member`; `nome`/`codigo` vem do `ConsultaMembrosClient` (lotes de 50, so para a pagina retornada; fallback ao proprio email).
  * `Curso` nao tem FK de categoria: filtro e nome de categoria sao resolvidos via `ItemCategorizado`.
  * Filtros de email atuam sobre `codigoUniversalEntidade` (no memberkit era `aluno.email`).

  ---

  ## Repositorios

  * `ItemCategorizadoRepository`: adicionar `findAllByCategoriaCodigoUniversalIn(Collection<String>)` e `findAllByCodigoUniversalItemIn(Collection<String>)`.
  * Ja existem: `SnapshotProgressoAlunoRepository` (JpaSpecificationExecutor + `findBySolicitacaoIdAndCodigoUniversalEntidade`), `SolicitacaoSnapshotProgressoAlunosRepository.ultimoIdSolicitacao()`, `CursoRepository.findAllByCodigoUniversalIn`.

  ---

  ## Enriquecimento da pagina

  * Emails da pagina $\rightarrow$ `ConsultaMembrosClient.consultaEmails` em lotes de 50 $\rightarrow$ `nome`/`codigo` (reusa o padrao `resolveMembrosPorEmail` do `RelatorioConclusaoAtividadesControllerV2`).
  * Cursos completos da pagina $\rightarrow$ codigos $\rightarrow$ `ItemCategorizado.findAllByCodigoUniversalItemIn` $\rightarrow$ `Map<codigoCurso, nomeCategoria>`.

  ---

  ## Endpoints

  1. `GET /api/sistema-aulas/filtro-progresso-aluno-especifico` – progresso do aluno autenticado na ultima versao (`findBySolicitacaoIdAndCodigoUniversalEntidade`); se ausente, `ProgressoAlunoResponse.zerado(membro)`.
  2. `GET /api/sistema-aulas/filtro-progresso-alunos` – lista filtrada/paginada (query params + `page=0` / `size=20`).
  3. `POST /api/sistema-aulas/filtro-progresso-alunos` – mesmo filtro via `@RequestBody`.

  Fluxo da lista: `ultimoId = ultimoIdSolicitacao()` (se `null` $\rightarrow$ pagina vazia); `baseSpec` = `solicitacao.id == ultimoId`; combina com os filtros; `Sort` por `ordenacaoTipo`; `findAll(spec, pageable)`; enriquece a pagina; embaralha se nao houver ordenacao.

  ---

  ## Filtros (request)

  * `codigosUniversaisCategoria: List<String>` – AND: aluno deve ter curso completo em cada categoria.
  * `minimoFinalizados: Integer` – `numeroCursosCompletos >= minimo`.
  * `ordenacaoTipo: OrdenacaoProgressoTipo` – `CURSOS_CONCLUIDOS` | `ATIVIDADES_CONCLUIDAS` (DESC).
  * `emailAluno: String`, `emailsAlunos: List<String>`, `emailsExcluidos: List<String>`

  ---

  ## Seguranca (SecurityConfig)

  Espelhar o memberkit (la o filtro e `.authenticated()`): adicionar, ANTES do catch-all `/api/sistema-aulas/` (que exige DEFEFICIENTE), matchers `.authenticated()` para `GET`/`POST /api/sistema-aulas/filtro-progresso-alunos` e `GET /api/sistema-aulas/filtro-progresso-aluno-especifico`. A lista de progresso fica visivel a qualquer autenticado (igual ao memberkit).

  ---

  ## Fora de escopo

  * Frontend; geracao do snapshot (ja existe); remocao do filtro do memberkit.

  ---

  ## Direcionamento para o claude

  * Seguir o CLAUDE.md: portugues; metodos no imperativo; nada de nulo (Optional); DTOs de saida recebem dominio no construtor; sem exceptions HTTP fora do controller. Logs `Log5WBuilder` info antes/depois das chamadas ao `ConsultaMembrosClient`. Fluxo read-only.
  * Atualizar `backend/skills/sistema-aulas/SKILL.md` com os novos endpoints/DTOs/matchers.
  * Nao rodar build automaticamente.

  ---

  ## Arquivos novos (sistemaaulas.relatorios.progresso)

  * `FiltroProgressoAlunosController` (`@RestController`) – orquestra os 3 endpoints.
  * `FiltroProgressoAlunosRequest` – entrada (setters p/ binding GET; corpo JSON no POST).
  * `OrdenacaoProgressoTipo` – enum com `Sort` (espelha `OrdenacaoTipo`).
  * Filtros `Specification<SnapshotProgressoAluno>`:
  * `EmailAlunoFilter`, `EmailsAlunosFilter`, `EmailsExcluidosFilter` (sobre `codigoUniversalEntidade`).
  * `MinimoFinalizadosFilter` (`numeroCursosCompletos`).
  * `CategoriasFilter` – recebe, por categoria, o conjunto de **ids de Curso** ja resolvido; gera por categoria uma subquery `EXISTS` sobre `cursosCompletos` (`c.id IN <ids>`), combinadas com AND. Categoria sem cursos resolvidos $\rightarrow$ `cb.disjunction()` (ninguem casa).


  * `ProgressoAlunoResponse` (+ inner `CursoCompletoInfo`: `codigoCurso`, `nomeCurso`, `nomeCategoria`), construtor a partir de dominio + factory `zerado(InfoMembroResponse)`.
  * `FiltroProgressoAlunosPageResponse` (+ `embaralhaConteudo()`).
  * `ResolvedorCategoriasCursos` (`@Component`) – `codigosUniversaisCategoria` $\rightarrow$ `Map<categoria, Set<idCurso>>` (via `ItemCategorizado` + `CursoRepository`) e `Map<codigoCurso, nomeCategoria>` para a resposta.
</details>

<details>
  <summary>Gerado por IA</summary>

  ## Resumo Executivo: Fluxo de Spec-Driven Development (SDD)

  ### Ideia Central

  O autor apresenta um fluxo simplificado e pragmático de *Spec-Driven Development* (SDD) integrado a Grandes Modelos de Linguagem (LLMs), rejeitando ferramentas complexas e burocráticas em prol de um ciclo direto focado em intenção, planejamento automatizado e geração de especificações em Markdown.

  ### Pontos-Chave

  * **Simplicidade vs. Overkill:** O processo descarta o uso de frameworks pesados (como *SpecKit* ou *Kiro*) e pipelines rígidos de gerenciamento (geração automatizada de PRDs para divisão de microtarefas por agentes), considerando-os excessivos para o dia a dia.
  * **Evolução da Escrita de Specs:** A abordagem evoluiu de especificações manuais altamente granulares e prescritivas para um modelo onde o autor fornece a intenção, a LLM gera um plano detalhado (incluindo endpoints, filtros e impactos em repositórios) e, após revisão humana, esse plano é convertido na especificação final.
  * **Abordagens de Restrição (Prompts de Código vs. TDD):** Houve a experimentação de delimitar o escopo da LLM criando assinaturas de métodos vazias no código ou aplicando TDD; contudo, o autor preferiu retornar ao fluxo de debater o design no modo de planejamento para não mitigar a capacidade criativa da IA.
  * **Documentação Viva e Histórico Histórico:** As especificações são tratadas como arquivos Markdown imutáveis e commitados no repositório, servindo como um registro histórico fino do design do software, superior aos backlogs tradicionais de ferramentas como Jira ou Trello.

  ### Conclusão/Recomendação

  A recomendação prática é delegar a decomposição técnica e a criação de planos estruturados diretamente para as LLMs a partir de uma intenção clara, mantendo o desenvolvedor no papel de revisor estratégico e utilizando arquivos Markdown simples como documentação definitiva e imutável de cada funcionalidade.
</details>




## Plataforma Dev + Eficiente: exemplo de criação de uma spec
- exemplo real de adição de uma nova especificação
- inicia com um prompt de intenção utilizando no mode de planejamento
- com finalização é possível validar os passos executados pelo agente como token e tools utilizados, além de poder validar as inferências realizadas e conseguir validar alguns pontos para melhoria de prompt para as futuras interações.
- com o planejamento validado, pede-se para o agente gerar a especificação da funcionalidade


<details>
  <summary>Gerado por IA</summary>

  ## Resumo Executivo: Implementação de Funcionalidade via Spec-Driven Development (SDD) com LLM

  ### Ideia Central

  O autor demonstra a simulação prática de implementação de uma nova funcionalidade na plataforma "Dev Mais Eficiente" a partir do feedback de um usuário, utilizando um agente de inteligência artificial (Cloud Code) em modo de planejamento para analisar o repositório, propor a solução técnica e registrar a especificação formal antes da codificação.

  ### Pontos-Chave

  * **Modo de Planejamento e Consumo de Tokens:** O fluxo inicia-se ativando o modo de planejamento (*plan mode*) da ferramenta para permitir a revisão humana antes de qualquer execução. Esse processo consome uma quantidade significativa de contexto (cerca de 51.800 tokens na etapa demonstrada), mas garante o alinhamento de escopo por um custo financeiro baixo de poucos centavos ou dólares.
  * **Análise Técnica Automatizada (Back-end):** A partir de uma sugestão de usabilidade para centralizar e lincar as perguntas feitas por alunos, a IA identificou que a infraestrutura de comentários existente já suportava a demanda. O plano traçado envolveu reaproveitar componentes e criar um novo *endpoint* filtrado por autor, dividindo as dúvidas em duas listas.
  * **Geração de Especificação (*Spec*) Estruturada:** Após validar o plano, a ferramenta escreve um arquivo de especificação Markdown contendo objetivos, pacotes afetados, novos *endpoints*, arquivos a serem modificados/criados e itens fora de escopo, servindo como documentação imutável.
  * **Otimização para Concorrência e Agentes Paralelos:** O autor destaca uma mudança na convenção de nomenclatura dos arquivos de *spec*, que passaram a incluir um *timestamp* além do número sequencial. Essa estratégia mitiga problemas de concorrência e conflitos de estado ao rodar múltiplas instâncias de agentes em paralelo no mesmo terminal.

  ### Conclusão/Recomendação

  A recomendação prática consiste em adotar o modo de planejamento assistido por IA para refinamento de requisitos de código, dedicando alguns minutos à revisão analítica das propostas de arquitetura geradas pela LLM. Esse investimento inicial em especificações estruturadas previne desvios de escopo e otimiza o tempo total de escrita e entrega do código final.
  </details>



## Plataforma Dev + Eficiente: exemplo de hooks
- percentual de cobertura
- qualidade de testes
- complexidade do código
- práticas de coesãp
- conferir a implementação


<details>
  <summary>Exemplo de hooks</summary>


  ```json
  {
    "hooks": {
      "PreToolUse": [
        {
          "matcher": "Bash",
          "hooks": [
            {
              "type": "agent",
              "if": "Bash(git commit *)",
              "model": "claude-sonnet-4-6",
              "timeout": 300,
              "statusMessage": "Revisando complexidade cognitiva (CDD) das classes que estao entrando no commit...",
              "prompt": "Voce e um revisor de CDD acionado ANTES de um git commit. Sua funcao: impedir o commit enquanto houver cl"
            },
            {
              "type": "agent",
              "if": "Bash(git commit *)",
              "model": "claude-sonnet-4-6",
              "timeout": 180,
              "statusMessage": "Revisando qualidade dos testes (objetos reais, mocks, any(), @DisplayName) que estao entrando no commit...",
              "prompt": "Voce e um revisor de testes acionado ANTES de um git commit. Sua funcao: impedir o commit enquanto houver"
            },
            {
              "type": "agent",
              "if": "Bash(git commit *)",
              "model": "claude-sonnet-4-6",
              "timeout": 180,
              "statusMessage": "Revisando aderencia entre a tarefa solicitada e a implementacao que esta entrando no commit...",
              "prompt": "Voce e um revisor de aderencia Tarefa x Implementacao acionado ANTES de um git commit."
            },
            {
              "type": "agent",
              "if": "Bash(git commit *)",
              "model": "claude-sonnet-4-6",
              "timeout": 180,
              "statusMessage": "Revisando coesao/encapsulamento (Tell Don't Ask, Lei de Demeter) das cl",
              "prompt": "Voce e um revisor de Coesao & Encapsulamento acionado ANTES de um git commit."
            }
          ]
        }
      ]
    }
  }
  ```
</details>

Exemplo de output
<details>
  <summary>Exemplo de arquivo de saída chamando o hook manualmente</summary>

```text
● Analisei a AtualizaTemplateCertificadoController simulando os 4 hooks de PreToolUse que rodam antes de git commit. Dois se aplicam a uma classe de produção como essa (CDD e Coesão); os outros dois não (testes → só *Test.java; tarefa → exige uma spec no transcript).

Hook 1 – CDD (complexidade cognitiva)

Contagem de ICP segundo cdd.json (limite produção = 10):

backend/.../certificado/AtualizaTemplateCertificadoController.java
Categoria: CDD
PCIU: 10 / 10 (producao)
Status: NO FIO
Quebra:
  – acoplamento contextual: 5 × 1 = 5
      TemplateCertificadoRepository, ConfiguracaoCampoTemplateRepository,
      PossivelCampoCertificadoRepository, ArquivoRepository (atributos)
      + AtualizaTemplateCertificadoRequest (parâmetro)
  – funcao-como-argumento: 4 × 1 = 4
      :50 lambda orElseThrow, :54 lambda orElseThrow,
      :58 ConfiguracaoCampoRequest::getCodigoUniversalCampo,
      :64 PossivelCampoCertificado::getCodigoUniversal
  – condicao: 1 × 1 = 1
      :67 if (codigosCamposExistentes.size() != Set.copyOf(...).size())

Sugestão: está exatamente no fio (10/10). Extrair a validação dos campos existentes (linhas 57–70) para um colaborador (ex. ValidaCamposDoTemplate) derrubaria 2–3 pontos e daria folga.

Veredito CDD: allow (igual ao limite = "no fio", não barra). Mas sem nenhuma margem – qualquer if, lambda ou novo tipo de projeto empurra para violação.

Hook 2 – Coesão & Encapsulamento

backend/.../certificado/AtualizaTemplateCertificadoController.java
Categoria: Coesão
Regra: 8.3 (inveja de funcionalidade – projeção de coleção alheia)
Severidade: VIOLAÇÃO

```
</details>




## Plataforma Dev + Eficiente: está funcionando mesmo?
<details>
<summary>Gerado por IA</summary>

  ## Resumo Executivo: Depuração de *Hooks* Automatizados no Cloud Code

  ### Ideia Central

  O vídeo explica como funciona a execução silenciosa de *hooks* de pré-commit orientados por IA no Cloud Code e demonstra como utilizar o modo de depuração (*debug mode*) para validar o acionamento e o comportamento desses seletores de qualidade.

  ### Pontos-Chave

  * **Execução por Subagentes:** Os *hooks* (como a checagem de complexidade cognitiva) rodam em instâncias separadas (*sub-agents*) em segundo plano, o que faz com que seus logs de execução padrão não apareçam diretamente no terminal principal do usuário.
  * **Mecanismo de Bloqueio:** O fluxo do `git commit` só é interrompido e exibe mensagens em tela caso o prompt do *hook* identifique uma violação explícita das diretrizes estabelecidas (como regras de complexidade violadas).
  * **Depuração via Arquivo de Saída:** Quando houver suspeita de falha no acionamento do *hook*, a técnica recomendada é iniciar o agente em modo de depuração redirecionando os logs para um arquivo de saída específico para rastrear detalhadamente cada chamada de sistema.
  * **Gatilho de Comandos Bash:** O subagente monitora comandos executados via Bash e intercepta especificamente a instrução de `git commit` para injetar as verificações de IA configuradas antes de consolidar a alteração.

  ### Conclusão/Recomendação

  Para garantir que as validações automatizadas de qualidade estejam operando corretamente, adote a prática de rodar o agente em modo de *debug* apontando para um arquivo de log durante os testes iniciais de configuração, recorrendo à documentação oficial da ferramenta para ajustes avançados de comportamento dos *hooks*.
</details>




## Claude code: lidando com monorepos e códigos com muito legado
- a fonte de maior confiância sobre a ferramenta, é sempre a documentação oficial
- o autor mostra a documentação oficial do claude para sugerir as recomendações indicadas pelo criadores

<details>
<summary>Gerado por IA</summary>

## Ideia Central

A documentação oficial de uma ferramenta tecnológica é a fonte de informação mais confiável e negligenciada pelos desenvolvedores, sendo indispensável para otimizar o uso de recursos como o *Claude Code* em arquiteturas complexas e bases de código legadas.

---

## Pontos-Chave

* **Negligência da Fonte Oficial:** Testes empíricos demonstram que a maioria dos profissionais utiliza ferramentas baseada em relatos de terceiros (vídeos e tutoriais) sem consultar a documentação oficial.
* **Otimização para Monorepos:** A documentação do *Claude Code* oferece orientações específicas para estruturar a ferramenta em grandes bases de código, permitindo a leitura a partir do repositório raiz ou de subdiretórios com arquivos `.claudemd`.
* **Engenharia de Contexto e Eficiência:** O guia oficial ensina a configurar regras de exclusão de arquivos irrelevantes, reduzindo o consumo de leitura da IA e acelerando o entendimento do projeto.
* **Validação Prática com Open Source:** A aplicação das diretrizes oficiais em repositórios abertos e complexos (como o framework *Spring*) facilita o mapeamento do fluxo de requisições e a compreensão de arquiteturas legadas.

---

## Conclusão/Recomendação

O autor recomenda fortemente que o usuário interrompa a dependência exclusiva de intermediários e consuma integralmente a documentação oficial da ferramenta (ou dos provedores de LLM como Anthropic e OpenAI). A ação prática imediata é aplicar as instruções de configuração de contexto e filtros do *Claude Code* para acelerar a engenharia reversa e o entendimento de projetos complexos no dia a dia.
</details>




## Claude code: view de agentes
- claude agents: utilizado para utilizar subprocessos em outra sessão entre os processos
- o autor fala sobre a funcionalidade do 'claude agents':  um sessão do claude code que pode abrir diversas sessões de terminal, acessar sessões e voltar para a original.

<details>
<summary>Gerado por IA</summary>

## Ideia Central

A documentação oficial do *Claude Code* revela a funcionalidade avançada `claude agents`, que permite gerenciar e monitorar subagentes em sessões paralelas de terminal para a execução simultânea de múltiplas tarefas de desenvolvimento sob o controle do usuário.

---

## Pontos-Chave

* **Descoberta via Documentação:** O recurso foi identificado exclusivamente através da leitura atenta da documentação oficial, reforçando a importância de explorar os guias do fabricante para além do conhecimento de uso comum.
* **Gerenciamento de Subagentes:** O comando inicializa uma interface no terminal capaz de spawnar (gerar) e coordenar múltiplos subagentes dedicados a tarefas ou *features* distintas de forma isolada.
* **Controle de Sessões em Paralelo:** A ferramenta permite alternar dinamicamente entre as sessões ativas para monitorar o progresso individual de cada agente e retornar à sessão controladora central.

---

## Conclusão/Recomendação

O autor recomenda fortemente a exploração prática do comando `claude agents` como uma oportunidade para otimizar o fluxo de trabalho através do paralelismo. A ação indicada é testar a criação de subagentes no terminal para entender como essa automação e controle multitarefa podem ser integrados no dia a dia do desenvolvimento.
</details>




## Quando custo é uma restrição
- no caso de restrições na escolha dos modelos de LLM, o autor comenta sobre a experimentação de outros agentes gratuitos e a quantidade disponível no nível gratuito.
- indicação de site de bechmark de agentes e modelos: https://www.tbench.ai/leaderboard/terminal-bench/2.0?agents=
- **autor router**, produto que seleciona o melhor modelo de acordo com o seu prompt: https://www.tbench.ai/leaderboard/terminal-bench/2.0?agents=


<details>
<summary>Gerado por IA</summary>

## Ideia Central

A otimização de custos e o gerenciamento de restrições de *tokens* ou requisições corporativas em projetos de IA exigem uma postura analítica e empírica na seleção de agentes e no roteamento inteligente de Grandes Modelos de Linguagem (LLMs).

---

## Pontos-Chave

* **Restrições Financeiras e Corporativas:** Limitações de orçamento e tetos operacionais de requisições por intervalo de tempo são barreiras comuns tanto para profissionais independentes quanto em ambientes corporativos com contratos restritos.
* **Uso de *Leaderboards* e *Benchmarks*:** A consulta a ferramentas de avaliação como o *Terminal Bench* permite descobrir e comparar o desempenho de agentes menos convencionais ou proprietários regionais em diferentes tarefas complexas.
* **Roteamento Inteligente de LLMs:** Soluções de mercado como OpenRouter e Not Diamond atuam como intermediários dinâmicos que selecionam o modelo ideal por meio de critérios parametrizáveis, tais como menor custo, menor latência ou relevância semântica do *prompt*.
* **Abordagem de Validação Científica:** Na ausência de orçamento para planos *premium* de provedores líderes (como Anthropic ou OpenAI), a estratégia ideal envolve testar alternâncias entre modelos gratuitos e validar sua eficácia progressivamente em desafios práticos de engenharia de software.

---

## Conclusão/Recomendação

O autor sugere que desenvolvedores com orçamento disponível invistam diretamente nos planos de maior nível das ferramentas líderes (como o ecossistema Claude/Anthropic) para ganho imediato de eficiência. Para cenários com restrições orçamentárias severas, a recomendação prática é adotar plataformas de roteamento (*OpenRouter*) e executar testes científicos comparativos utilizando repositórios com complexidade progressiva para embasar a escolha da melhor relação custo-benefício.
</details>





## Exemplo trabalhado desafio hotmart: implementando o cadastro de configurações
<details>
<summary>Gerado por IA</summary>

## Ideia Central

O vídeo demonstra a implementação prática de uma funcionalidade de cadastro de configurações utilizando um fluxo de desenvolvimento baseado em agentes de Inteligência Artificial com a ferramenta Claude Code, enfatizando a iteração contínua de padrões de design, testes automatizados e o refinamento do contexto do projeto.

---

## Pontos-Chave

* **Setup e Contextualização do Agente:** O desenvolvedor utiliza arquivos de configuração específicos (`cloud.md`, `CDD.json` e exemplos de código) para ensinar ao agente de IA os padrões de arquitetura, limites de complexidade bi-direcional (CDD) e diretrizes de escrita de testes do projeto.
* **Processo Iterativo de Especificação:** Antes de codificar, a tarefa copiada do desafio é enviada ao Claude Code em modo de planejamento para gerar uma especificação técnica (`spec`) na pasta correta com *timestamp*, permitindo que o desenvolvedor guie decisões arquiteturais cruciais (como respostas HTTP e escopo da entrega).
* **Refinamento do Código e Validações:** Após a geração automatizada do código (controladores, entidades e testes unitários com Mockito), o desenvolvedor ajusta manualmente tipagens e anotações de validação (`@Min`, troca de primitivo `boolean` por classe `Boolean` com `@NotNull`) para garantir consistência contra concorrência e dados nulos.
* **Gerenciamento de Persistência e Memória:** Identifica-se a ausência inicial de migrações de banco de dados, instruindo o agente a criar scripts do Flyway e a documentar essa obrigatoriedade nas instruções globais do projeto para acelerar as próximas implementações.

---

## Conclusão/Recomendação

O autor recomenda adotar o fluxo sistemático de engenharia de software apoiado por agentes (Intenção $\rightarrow$ Geração do Plano $\rightarrow$ Revisão $\rightarrow$ Geração da Spec $\rightarrow$ Implementação em Modo Automático), destacando a importância de retroalimentar a memória da IA com aprendizados colhidos durante as revisões de código para aumentar a velocidade e a autonomia nas entregas seguintes.
</details>




## Exemplo trabalhado desafio hotmart: implementando o cadastro de conta
<details>
<summary>Gerado por IA</summary>

## Ideia Central

O vídeo descreve a segunda etapa de implementação de um desafio (cadastro de contas) utilizando o Claude Code em modo iterativo, demonstrando como limpar e gerenciar a janela de contexto, revisar especificações técnicas e registrar aprendizados arquiteturais para atuar como um líder técnico de agentes de Inteligência Artificial.

---

## Pontos-Chave

* **Gerenciamento de Contexto do Agente:** O desenvolvedor aborda a prática conservadora de limpar o contexto (`clear`) entre a implementação de diferentes funcionalidades para evitar alucinações à medida que a janela de conversa cresce, embora note que os agentes modernos realizam compactação automática de forma cada vez mais eficiente.
* **Processo de Reinicialização da Sessão:** É demonstrada a necessidade de reiniciar a ferramenta após alterações estruturais em arquivos de diretrizes globais (como o `cloud.md`), garantindo que o agente recarregue as novas instruções e memórias antes de iniciar o planejamento de uma nova *spec*.
* **Revisão Fina e Identificação de Invariantes:** Durante a validação da especificação para a criação da conta, o autor identifica e corrige a omissão do campo "nome" e critica uma decisão de design de código (evitando receber objetos de domínio já resolvidos que quebram invariantes entre a requisição e a entidade).
* **Refatoração com Abstrações Funcionais:** O desenvolvedor instrui o agente a utilizar funções (`Function` e `Supplier`) no modelo em vez de passar entidades prontas a partir do controlador. Isso preserva a tradução HTTP na camada de controle e delega a resolução de relacionamentos com segurança ao modelo de domínio.

---

## Conclusão/Recomendação

O autor recomenda encarar o desenvolvimento com agentes de IA como uma relação de liderança técnica tradicional, onde o programador atua revisando, pareando e fornecendo feedbacks minuciosos. A recomendação prática é formalizar cada aprendizado técnico nos arquivos de contexto (`cloud.md` e guias de referência), consolidando um "fluxo padrão-ouro" que maximiza a autonomia da máquina e a consistência arquitetural do projeto.
</details>




## Obrigado
Agradecimentos do autor informando sobre abordagem prática no lugar de replicar a documentação.
