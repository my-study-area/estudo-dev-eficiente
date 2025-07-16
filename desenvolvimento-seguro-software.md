# Desenvolvimento Seguro de Software
Neste curso, trazemos práticas de código quando se pensa em segurança. Afinal, escrever software seguro é fundamental nos dias de hoje!

## Introdução
Tópicos do curso
- O que é desenvolvimento de software seguro e como podemos incorporá-lo em nossos fluxos
- Quais são as vulnerabilidades de segurança mais comuns, às quais devemos prestar atenção
- Quais são as práticas recomendadas de codificação segura mais populares que devemos seguir
- O que fazer em caso de incidente de segurança
- Para onde ir a seguir caso queira mergulhar ainda mais na engenharia de software segura

## Vunerabilidades mais comuns e como atacá-las
Baseado na lista da OWASP (Open Web Application Security Project):

### Controle de acesso, identificação e autenticação
#### Privilégio mínimos
Dar acesso somente ao que é necessário para realizar uma ação.

#### Os usuários não podem ter a flexibilidade de "ajustar permissões"
A requisição com permissões são geralmente fornecidas através de uma API, existem APIs que na interface gráfica do usuário não permite adição de novas permissões que não deveriam ter acesso, mas no retorno da API expõe um campo que não está na tela, mas permite que desenvolvedores adicionem um campo na request e adiconar alguma informação.

#### Somente o próprio usuário pode atualizar suas informações
Por exemplo, se um usuário pode atualizar o seu próprio nome, ele não pode atualizar o nome de outro usuário ou qualquer outra informação.

#### API deve restringir o acesso para todos os verbos HTTP, como GET, POST, PUT, DELETE, etc
Por exemplo, se um usuário não tem permissão para deletar um recurso, a API deve retornar um erro 403 Forbidden quando ele tentar fazer isso.

#### Limite a quantidade de logins com falha
Por exemplo, se um usuário tentar logar 5 vezes seguidas, ele deve ser bloqueado por um tempo.

####  Projete sistema de controle de acessos adequados
Ter um controle de acesso

### Falhas criptográficas
**Você está transmitindo dados confidenciais em texto não criptografado**    
Por exemplo, se você estiver transmitindo dados confidenciais, como senhas ou informações de cartão de crédito, em texto não criptografado, um invasor pode interceptar esses dados e usá-los para roubar a identidade do usuário ou cometer fraudes.

**Tem certeza de que precisa armazenar esses dados? Quando você pode descartá-lo?**    
Verifica se realmente precisa armazenar todos os dados e por quanto tempo devemos mantê-los. Muitas vezes, os dados podem ser descartados após um período de tempo específico, o que reduz o risco de vazamento de dados. Como por exemplo, quando uma empresa deixa de utilizar os seus serviços, os dados devem ser excluídos.

**Quais algoritmos você está usando para criptografar informações?**    
Utilizar um algoritmo de hash seguro. Não crie o seu algoritmo de criptografia, use os algoritmos recomendados e testados pela comunidade.

**Nunca implemente seu próprio algoritmo de criptografia.**    

**Use as funções de geração de aleatoriedade recomendadas.**    

**Aplique HTTPS e tenha todos os certificados corretos em vigor.**    
HTTPS adiciona uma barreira de segurança muito grande.

**Permita apenas níveis criptográficos corretos.**    

### Injeção

**SQLs**    
Em caso de dados de entrada que fazem parte de uma consulta SQL e não existir um tratamento dos dados, um invasor pode injetar comandos SQL maliciosos que podem comprometer a segurança do banco de dados. Como por exemplo, adicionar novos usuário ou adicionar permissões indevidas.

**Comandos shell**    
Utilizar comandos shell em partes da aplicação que permitem a execução de comandos.

**OGNL**    
A injeção de OGNL é uma vulnerabilidade crítica que ocorre quando expressões dinâmicas escritas em OGNL (Object-Graph Navigation Language) são avaliadas de forma insegura em aplicações Java, como o framework Apache Struts, permitindo que invasores executem comandos maliciosos, acessem dados sensíveis ou tomem controle do sistema — esse tipo de falha ficou famoso após o ataque à Equifax em 2017, e para mitigá-la é essencial validar entradas de usuários, evitar avaliação dinâmica de expressões, atualizar frameworks vulneráveis e adotar boas práticas de segurança, como o uso de firewalls de aplicação web e revisão constante do código fonte.

**XML e JSON**    

**Deserialização**    

**Nunca confie nos dados que vêm do usuário**  
Todo dados enviado pelo usuário deve sser tatado.

### Configuração incorreta de segurança
- Você tem nomes de usuário e senhas padrão em ferramentas administrativas ou hardware?
- Você expõe páginas da web, contas ou serviços que não são necessários/necessários?
- Suas mensagens de erro e outros rastreamentos de pilha são retornados aos usuários em detalhecompletos?
- Sanitizar dados de entradas e saída para os usuários
- Você armazena chaves de API ou credenciais confidenciais em texto simples e em um arquivo quum invasor ou malware pode acessar?

###  Componeentes vulneráveis
- Você está ciente de todos os componentes do sistema e qual versão deles estamos executando?
- O software está vulnerável ou desatualizado. Verifique as sua dependências também
- Dependências, estruturas e plataformas não são atualizadas com frequência suficiente.
- As configurações desses componentes não são seguras.
- Não usar assinaturas digitais para garantir que a biblioteca baixada seja realmente a correta.
- Usando fontes não confiáveis de dependências.

### Quanto mais cedo melhor!
- A segurança deve acontecer em todas as fases do nosso desenvolvimento.
- Exercícios de modelagem de ameaças.
- Segurança no dia a dia:
  - Nas reuniões diárias
  - Ao desenvolver uma nova funcionalidade
  - Ao testar
  - Ao revisar
  - Ao monitorar

## Outras práticas de segurança de código
### Valide suas entradas
Entradas não confiáveis são uma grande fonte de problemas:
  - E se o invasor escrever 5 MB de texto nesse campo e seu aplicativo o armazenar no banco de dados?
  - E se o invasor enviar lotes de 50 MB JSON para seu serviço da web, que então começa a analisá-lo?
  - E se o invasor aproveitar uma (entre tantas) vulnerabilidades XML?
  - E se o invasor enviar caracteres em diferentes codificações e isso travar seu aplicativo?
  - E se o invasor estiver passando uma string contendo comandos SQL ou shell?
  
Na aula é comentado sobre um teste realizado por um aluno da faculdade que experimentou enviar grandes textos num campo de formulário. Em um certo momento o sistema deixou de atender as requisições enviadas.

Condições de guarda:
  - intervalo numérico
  - intervalo d string
  - tamanho da string
  - conteúdo da string

Existem duas formas de tratar isso: rejeite ou "conserte" o valor.

### Integer e float overflow
- Tenha cuidado com o transbordamento do tipo.
  - Se você estiver somando um número com um valor fornecido pelo usuário, o que acontecerá se essa pessoa fornecer um inteiro super grande que faça a soma estourar?
  - pense em combinação de valore. Existem casos que o sistema realiza calculos e somas e eles podem estourar.
- Sempre verifique se as entradas estão dentro de limites razoáveis.
- Analise os limites das diferentes operações aritméticas em seu código.
- Lembre-se que o estouro pode acontecer em valores intermediários calculados.
- Verifique todas as conversões para números inteiros. O famoso uso de cast de valores.

### Memória e estouros de buffer
- A memória também pode ser um alvo para invasores.
  - Acesso aleatório em arrays.
  - Manipulação de ponteiro.
- O famoso “heartbleed bug”. O Heartbleed foi uma falha de segurança descoberta em 2014 na biblioteca OpenSSL, usada para proteger dados na internet. Ela permitia que invasores pedissem dados extras da memória do servidor — como senhas ou chaves secretas — usando uma mensagem falsa, chamada “heartbeat”. O servidor, sem verificar corretamente o tamanho da mensagem, acabava revelando partes da sua memória. É como pedir 5 palavras e receber 100 por engano. Esse erro foi crítico porque afetou milhões de sites e mostrou como pequenas falhas podem causar grandes problemas. 
- Sempre verifique os limites de quaisquer dados que você receber e/ou enviar de volta.
- Evite funções que manipulam a memória sem verificações de limite específicas. Comum em liguagens como C.
- Se você manipular referências de ponteiro com base na entrada do usuário, certifique-se de que esteja em uma posição válida.

### Testes
- vá além do caminho feliz, teste com valores de entrada inválidos
- valide seu projeto de segurança
- teste de penetração

### Tratar execeções corretamente
- O tratamento adequado de exceções ajuda a reduzir a superfície de ataque.
- Nunca retorne um rastreamento de pilha completo para o usuário. Não mostre o stacktrace para o usuário. O usuário pode ser uma pessoa não confiável e utilizar essa informação para identificar alguma vunerabilidade do sistema.
- Trate as exceções que devem ser tratadas.

### Log e monitoramento  
- Todas as falhas de login, controle de acesso e validação de entrada do lado do servidor devem ser registradas com contexto de usuário suficiente para identificar contas suspeitas ou maliciosas.  
- Segure os logs por tempo suficiente para permitir análise forense atrasada.  
- Gere logs em um formato que pode ser facilmente consumido por soluções centralizadas de gerenciamento de logs.  
- Estabelecer monitoramento e alerta eficazes.  
- Nunca registre informações confidenciais.

### Crie APIs sobre APIs não seguras
Pense como uma camada para auxiliar a criação de uma api segura. Esta camada poderia tratar sobre alguma vunerabilidade sobre XML. Relembrar cada processo ou técnica de segurança no desenvolvimento de software pelo desenvolvedor pode ser um trabalha exaustivo e provavelmete acabará deixando alguma coisa de lado.
- Crie APIs além de operações inseguras.  
- Converse com os membros de sua equipe e outros desenvolvedores sobre isso.
- coloque na balança o esforço para criação de uma solução ou reutilização de uma solução existente.

### Revise o código com a segurança em mente
- As revisões são um bom lugar para encontrar vulnerabilidades de segurança.  
- Você tem um checklist? Checklist é uma forma de facilitar lembrar os pontos a serem validados e forçar a revisão passando por 4 olhos.

### Use ferramentas
- Leve a sério o feedback de suas ferramentas de segurança.  
- Não corrija simplesmente o código sem entender a causa raiz da vulnerabilidade.  
- Não refatore simplesmente seu código para "certificar-se de que a ferramenta pare de reclamar".

### Documente suas preocupações de segurança
- Documente todas as suas preocupações específicas de segurança  
- Documente suas melhores práticas

## Respondendo à ataques
Gerado por IA com base na transcrição:
- Ataques podem ocorrer mesmo com boas práticas preventivas — o importante é reagir com rapidez.
- Responda imediatamente, especialmente em sistemas críticos como bancos ou meios de pagamento.
- Mantenha um grupo de segurança com plantões bem organizados e alertas eficientes.
- O responsável pelo plantão lidera a resposta, mas deve envolver os desenvolvedores certos.
- Tenha um playbook com checklist claro para guiar ações sob pressão.
- Documente todas as ações realizadas durante o incidente (consultas, logs, decisões).
- Trate informações com confidencialidade — evite divulgar dados sensíveis em canais abertos.
- Avalie o risco e impacto: valor afetado, multas, danos à marca e facilidade do ataque.
- Classifique o risco para definir prioridades de resolução.
- Realize um postmortem técnico para entender causas e prevenir recorrências.
- Use o incidente como aprendizado para evitar ataques semelhantes no futuro.

Gerado com maior contexto pela IA:
### 🛡️ Respondendo a ataques de segurança: uma introdução para iniciantes
Imagine que você é responsável por cuidar da segurança de uma aplicação crítica. Você estudou boas práticas, usou ferramentas, seguiu checklists... mas, numa madrugada qualquer, seu sistema começa a agir de forma estranha. Você percebe que **um ataque está acontecendo**. E agora?

Esse momento é tenso. O coração acelera, o instinto grita, e você precisa agir com clareza. Para isso, existem estratégias e rotinas que te ajudam a responder a esse tipo de incidente com eficácia. Vamos explorar isso juntos:

### 🚨 Reação rápida é fundamental
- A primeira regra de ouro: **tempo é tudo**. Quanto mais rápido você responder, menor o impacto.
- Aplicações críticas (como bancos ou gateways de pagamento) não podem esperar até o dia seguinte — cada segundo pode significar prejuízo.
- Por isso, muitas empresas mantêm **grupos de segurança em plantão**, prontos para agir a qualquer hora.

### 🧑‍🤝‍🧑 Trabalhe em equipe
- Quem está de plantão lidera a resposta, mas **não precisa resolver tudo sozinho**.
- Às vezes o ataque afeta outro sistema, e você deve **chamar os especialistas certos**.
- A colaboração entre equipes é essencial — segurança é responsabilidade compartilhada.


### 📚 Use um playbook (manual de ações)
- Ter um **checklist claro** evita decisões impulsivas sob pressão.
- O playbook deve conter:
  - Etapas para análise e contenção
  - Quem deve ser acionado
  - Ferramentas e comandos úteis
  - Registros das ações executadas

### 📝 Documente tudo
- Anote **cada passo que você tomou**: comandos executados, resultados obtidos, decisões feitas.
- Isso ajuda colegas a entenderem a situação e, futuramente, pode ser útil em auditorias.
- Transparência é essencial para aprender com o incidente.


### 🔐 Cuide das informações sensíveis
- Trate o incidente com **confidencialidade** — evite divulgar detalhes em canais públicos.
- Entenda quais informações podem ser compartilhadas com todos e quais devem ficar restritas ao grupo de segurança.


### ⚖️ Avalie o risco
- Pergunte: qual foi o impacto? O que foi afetado? Qual o valor do ativo?
- O ataque é fácil de repetir por outros? Ele exige habilidade técnica ou é algo trivial?
- Avaliar isso ajuda a **priorizar a resposta** e planejar ações de mitigação.


### 📦 Faça um postmortem (análise pós-incidente)
- Após resolver o incidente, reúna o time e analise:
  - **Por que o ataque aconteceu?**
  - **Como podemos evitar algo semelhante no futuro?**
- Não procure culpados. Foque em sistemas, processos e aprendizados.
- Vá além do ataque específico: pense em **categorias de ataques semelhantes**.


### 🧠 Finalizando com um exemplo real

Uma boa analogia vem das agências espaciais. Quando uma nave detecta um objeto se aproximando, não é uma pessoa que decide por instinto — há **procedimentos claros e testados** para desviar, avaliar riscos, e agir com precisão. **Segurança da informação exige o mesmo tipo de preparo**: você não quer improvisar, quer saber exatamente o que fazer.


Essa abordagem transforma o caos de um ataque em um processo controlado e eficiente — onde o aprendizado é contínuo e cada incidente fortalece a equipe. Se quiser, podemos criar juntos um modelo de playbook, ou uma rotina personalizada para responder a incidentes no seu contexto. Bora construir isso? 🚀🔐

## Até a próxima!
Finalização do curso básicos sobre segurança relembrando os principais tópicos abordados.
