**Métrica e avaliação de complexidade de código guiada CDD**    

**Métrica**    
1. Condicional (condicionais do if, loops, if ternário) - 1 ICP
2. Blocos de código adicionais (try, catch, cases do switch, funções como argumento) - 1 ICP
3. Acoplamento com classes específicas do projeto - 1 ICP

**Como avaliar o que foi medido ?**    
- Se é greenfield, sugiro começar de maneira mais restritiva e avaliar. Limite inicial 10
- Se é um legado de conhecimento que já vem com bastante complexidade, aumenta esse limite. Limite inicial 50

**Guia para escrita de testes automatizados**    
1. Busque sempre 90% ou mais de cobertura
2. Busque escrever os testes mais integrados possíveis.
3. Fique sempre atento(a) a velocidade de execução.
4. Para cobrir o código, utilize a técnica MC/DC.
5. Utilize a técnica de Boundary Testing para explorar os valores de teste
6. Tente utilizar property based testing para ir além dos testes derivados de maneira sistemática
7. Defina uma métrica e uma forma de avaliar inspirada no CDD para controlar o aumento de complexidade dos arquivos de teste

# Guia para logar
**Quando logar e qual nível de severidade usar**    
1. Sempre que tiver alteração de estado no sistema, realize o log em nível de info antes e depois da realização da alteração do estado.
2. Sempre que for consumir serviços externos, realize o log em nível de info antes e depois da chamada de api.
3. Sempre que você realizar um tratamento de erro, cujo problema permite que o fluxo da aplicação continue, realize o log em nível de error. Lembrando de evitar logar em nível de erro e relançar o problema para cima.
4. Realize log em nível de debug quando o código tiver caminhos de decisão, como ifs, loops etc. Faça isso com

**Como logar?**    
Todas as aplicações devem realizar o log utilizando a biblioteca padrão da empresa que já obriga a passagem de relevantes assim como já serializa o log no formato adequado.

**Maximize a coesão do código**    
Constantemente analise se o código que você está escrevendo tem conexão com os outros códigos já escritos. Tente manter tudo que faz sentido ficar junto, realmente próximo. Alguns exemplos da aplicação dessa ideia:
1. Se você tem uma classe que tem um atributo de data e você precisa saber se determinado objeto tem um valor antes ou depois daquela data, você deveria criar um método dentro daquela classe para operar sobre o atributo.
2. Se você decidiu criar um novo serviço, maximize a chance que todo código daquele serviço realmente tenha conexão.

**Postergue ao máximo as generalizações e ideias de reuso de código**    
Decidir precocemente sobre generalizações e códigos reutilizáveis pode fazer com que você extraia algo que não é de fato reaproveitável. Simplesmente pelo fato de você não ter esperado coletar mais variáveis de entendimento sobre o problema que estava sendo resolvido.

**Patterns que podem ser seguidos**    
1. Controllers 100% coesos.
2. Services 100% coesos
3. UseCases 100% coesos
4. Form/Request/DTO Value Objects
