# Cognitive Driven Development (CDD): Controle o Impacto Cognitivo do Seu Código de forma Sistemática

## Introdução oficial ao CDD
No momento da criação da primeira versão da jornada, a teoria de design já estava clara, mas ainda não tínhamos um nome oficial e um paper publicado. 

Para ler o primeiro artigo oficial sobre CDD, você pode acessar o seguinte link: https://github.com/asouza/pilares-design-codigo/blob/master/ICSME-2020-cognitive-driven-development.pdf

[Link do ebook local](https://github.com/my-study-area/estudo-dev-eficiente/blob/main/materiais/praticas-de-codigo-para-devs-eficientes.pdf)

Adendo: Um novo e-book sobre Design de Código: https://drive.google.com/file/d/1jJjf3JL-IXBEKVEVXKp0E9tlhKW2f2mC/view


## Um exemplo real sobre complexidade em um projeto open source
- analise do código do [Feign](https://github.com/OpenFeign/feign)

## Analisando o incremento de complexidade de modo visual
- Projeto para analisar a complexidade de uma classe a partir de vários commits: [complexity-tracker Public](https://github.com/asouza/complexity-tracker)

## Experimento CDD x Convencional
- comparação entre as técnicas CDD e convencionais
- [youtube.com/watch?v=VqqIqA8cwCw](youtube.com/watch?v=VqqIqA8cwCw)
- https://arxiv.org/pdf/2206.10655

Explicação das técnicas para avaliação de código:

### **CBO: Acoplamento (Coupling Between Objects)**
* **Significado:** O CBO mede o **quanto uma classe depende de outras classes**.
* **Alto CBO:** Indica que as classes estão muito interligadas, como "amigas grudentas".
* **Implicações:** Dificulta a **manutenção**, o **reuso** e a **testabilidade** do código, pois mudanças em uma classe afetam muitas outras.
* **Objetivo:** Buscar um **CBO baixo** resulta em classes mais **independentes**, **modulares** e fáceis de gerenciar, cada uma com sua responsabilidade bem definida.

### **WMC: Complexidade Ciclomática Ponderada (Weighted Methods Per Class)**
* **Significado:** O WMC soma a **complexidade ciclomática** de todos os métodos de uma classe. A complexidade ciclomática avalia o número de caminhos lógicos independentes (decisões, loops) no código.
* **Alto WMC:** Indica que a classe possui métodos muito complexos, com muitos desvios e fluxos de execução.
* **Implicações:** Aumenta significativamente a dificuldade de **testar**, **manter** e **compreender** o código.
* **Objetivo:** Um **WMC baixo** é preferível, pois indica classes e métodos mais **simples**, o que melhora a legibilidade, a testabilidade e a facilidade de manutenção.

### **RFC: Resposta para uma Classe (Response For a Class)**
* **Significado:** O RFC contabiliza o **número de métodos que podem ser chamados** em resposta à invocação de um método da classe, incluindo métodos internos e de classes externas utilizadas.
* **Alto RFC:** Sugere que a invocação de um método da classe pode ter um "alcance" ou "impacto" muito grande, desencadeando chamadas a muitos outros métodos.
* **Implicações:** Torna a **testabilidade** mais complexa e dificulta a **compreensão do fluxo** do programa, além de complicar a **depuração**.
* **Objetivo:** Preferir um **RFC menor** leva a um comportamento da classe mais **contido**, **previsível** e, consequentemente, mais fácil de entender e testar.

### **LCOM: Coesão de Métodos Afetados por Atributos (Lack of Cohesion Of Methods)**
* **Significado:** O LCOM mede o **quanto os métodos de uma classe estão relacionados** entre si, especificamente pelo uso dos mesmos atributos da classe.
* **LCOM baixo (perto de 0):** Indica **alta coesão**, o que significa que os métodos da classe trabalham em conjunto para uma única responsabilidade bem definida.
* **LCOM alto (longe de 0):** Indica **baixa coesão**, sugerindo que a classe pode estar fazendo muitas coisas diferentes e talvez devesse ser dividida.
* **Implicações:** Baixa coesão dificulta a **manutenção**, o **reuso** e o **entendimento** da classe.
* **Objetivo:** Buscar um **LCOM baixo** garante que suas classes sejam **coesas**, focadas e mais fáceis de gerenciar.

### **LOC: Linhas de Código (Lines Of Code)**
* **Significado:** O LOC é uma contagem simples do **número de linhas de código** em um programa, arquivo ou função.
* **Alto LOC:** Em uma única função ou classe, pode indicar que ela está executando muitas tarefas.
* **Implicações:** Pode dificultar a **manutenção** e a **compreensão**, embora o LOC sozinho não seja uma métrica direta de qualidade.
* **Objetivo:** Usado principalmente como um **indicativo de tamanho**. Funções ou classes com um LOC muito alto são frequentemente candidatas a **refatoração** para serem divididas em partes menores e mais gerenciáveis.



## Métrica derivada do CDD sugerida na jornada
- explicação do guideline para o CDD
- aplicação do CDD com solução

## Derivando métricas do CDD para outros cenários
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

## CDD aplicado para cenários de código legado
- Em classe com uma grande quantidade de pontos de complexidade, tente diminuir em porcentagem. Por exemplo, dimnuir para 90%, depois 80% e etc.
- procure objetivos mais tangíveis

## Design escalável e sustentável
- utilizar a técnica para tornar o código manutenível

## A relação do CDD com tudo que você já conhece
- SOLID, Clean Code e inspirações arquiteturais como MVC, Clean Architecture e Arquitetura Hexagonal podem continuar sendo utilizadas, caso você ache necessário. As métricas derivadas do CDD limitam a complexidade, não impõem uma forma de programar. 

## Como derivar métricas com CDD
- mágico numero 7 e a carga cognitiva (ICP - Implicity Cognitive points)
- definir as unidades de itens (entendimento): um método pode ser a unidade de entendimento, uma classe ou um arquivo. O auto utiliza um arquivo como unidade de entendimento.
- identificar os ponto de complexidades (if, switch, implementação de interfaces, etc)
- votar cadas unidades e selecionar alguns através de votação.

## Duas formas diferentes de tentar resolver o mesmo desafio
Enquanto as práticas inspiradas no SOLID, Clean Code, Domain Driven Design etc tentam acomodar mudar mudanças de tecnologia e se antecipar para possíveis mudanças de escopo, o CDD abraça a mudança de escopo e de pessoas. 

Na opinião de Alberto o que mais muda num projeto, principalmente da indústria, é o escopo e as pessoas. Então a aposta é que um código mais fácil de entender vai ser mais fácil de manter e evoluir. A flexibilidade do código vai ser simplesmente uma resposta a especificação. Dado que, no fim, um código é uma automação do desejo de alguém :). 
