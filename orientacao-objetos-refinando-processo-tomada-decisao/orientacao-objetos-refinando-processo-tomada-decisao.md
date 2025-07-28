# Orientação a Objetos: Refinando seu Processo de Tomada de Decisão
Vamos buscar refinar nossos processos mentais para identificar oportunidades de uso de abstrações dentro do sistema.

## O que vamos treinar neste módulo?
O que vamos ver? R: Diferença de algoritmo e heurísticas.

Após o curso podemos aplicar o estudo nos nossos códigos criados nos desafios.

Algoritmo: conjunto de passos para realizar um objetivo. Um conjunto de passos que sempre chega no mesmo resultado.

Heurística: Conjunto de passos que pode ou não chegar em algum lugar.Refinar os padrões para identificar quando vamos utilizar determinada decisão.

Gerado por IA:

Por exemplo, no contexto de análise de código, para identificar quais "commits" (registros de alterações no código) representaram refatorações (melhorias internas sem mudança de comportamento externo), pesquisadores e desenvolvedores criam heurísticas:
- Heurística 1: "Se na mensagem do commit estiver escrita a palavra refactor, quer dizer que é um commit de refatoração".
- Heurística 2: "Se desse commit para o commit anterior, houve uma redução significativa no número de linhas de código, pode ser que isso seja uma refatoração".
Perceba a diferença:
- A primeira heurística pode falhar se alguém escrever "refactor" em um commit que não é de refatoração, ou se uma refatoração for feita sem essa palavra-chave.
- A segunda heurística também não é 100% garantida, pois uma redução de linhas pode ser apenas a remoção de código morto, e não uma refatoração.
No entanto, essas heurísticas são padrões identificados que aumentam suas chances de encontrar o que você procura ou de tomar a decisão certa. Elas te ajudam a identificar oportunidades de aplicar seu conhecimento. 


**Diferença entre Algoritmo e Heurística**

Aqui está a tabela que resume as principais diferenças entre **algoritmo** e **heurística**:

| Característica | Algoritmo                                                                | Heurística                                                                         |
| :------------- | :----------------------------------------------------------------------- | :--------------------------------------------------------------------------------- |
| **Garantia** | Garante que encontrará a **solução correta e ótima** (se houver).         | Não garante a solução correta ou ótima, mas busca uma **solução boa o suficiente**. |
| **Otimização** | Busca a solução exata e perfeita.                                        | Busca uma solução aproximada e aceitável, priorizando a velocidade.                |
| **Precisão** | É **exato**, determinístico e segue passos bem definidos.               | É **aproximado**, pode ser não determinístico e baseado em "regras práticas".     |
| **Complexidade** | Pode ser **computacionalmente caro** e demorado para problemas complexos. | Geralmente mais **eficiente em tempo** para problemas complexos, mas com sacrifício na otimalidade. |
| **Uso** | Quando a **exatidão e a otimalidade são cruciais** e o problema é bem definido. | Quando a **rapidez e uma solução aceitável são mais importantes** do que a otimalidade perfeita. |


> O objetivo do módulo ao qual essas informações se referem é justamente trabalhar na identificação desses padrões para aumentar sua chance de usar suas habilidades de programação (orientada a objetos, funcional) para elevar a qualidade do seu código.

## Algumas heurísticas que já são bem padrões
Neste vídeo Alberto explica como, provavelmente, nós já temos algumas heurísticas bem padrões e que nos guiam na construção de novas abstrações.

Exemplo do desafio da casa do código, por exemplo, a criação de uma classe de entidade para salvar uma informação no banco de dados com a utilização do hibernate para criação de uma entidade que representa uma tabela do banco de dados.

Outro exemplo é o Controller usado para criação de endpoint de uma api para permitir que os dados sejam salvos num banco de dados.

DTO e arquiteturas como arquiteturas limpa são outros tipos de heurítica já conhecidos.


## Instruções para que você consiga realizar os desafios para cada conceito (NÃO PULE)
Você pode encontrar o código fonte base com todos os desafios acessando o repositório através:
- link do repositório do Github: https://github.com/asouza/desafios-heuristicas-deveficiente/tree/0e42c602ba0662f192c9657fdd5d5e485fdf99ea
- fork do repositório: https://github.com/forks-projects/desafios-heuristicas-deveficiente

Caso você vá implementar tudo utilizando Java, basta baixar o projeto e importar na sua IDE predileta. Por outro lado, se for implementar os desafios em outras linguagens, aí a ideia é que você use o repositório para copiar os exemplos base para a linguagem que você deseja. Se este for o caso, fica aqui a sugestão de compartilhar com outros(as) colegas da Jornada que podem querer se desafiar na mesma linguagem que você.

A estrutura do repositório segue as heurísticas que serão trabalhadas durante o módulo. Cada pacote tem um subpacote com um exemplo pronto ou com um exemplo que precisa ser finalizado para realizar o desafio que será proposto. A ideia é que você vá implementando e depois comparando com as sugestões de soluções.

Para fechar, existe um branch separada para cada proposta de solução. Cada branch será referenciada dentro do contexto das heurísticas em si.



## Heurística #1 Coesão Básica: O que essa heurística quer dizer?
### Anotações da aula
#### Heurística 1: Explicação sobre a oportunidade de uso da coesão básica
Coesão: facilita o reaproveitamento de código.

Regra básica: Deixar o estado perto do comportamento.

Exemplo antes:
```java
@GetMapping("viagens/{id}/dias-para-partir")
public int executa(@PathVariable("id") Long id) {
  ViagemV1 viagem = viagemRepository.buscaViagem(id);

  /*
    *  Aqui o código executou um lógica sobre o estado de um objeto
    *  fora dele. O simples fato de fazer te exigiria maior esforço
    *  para coisas básicas. 
    *  
    *  1) E se eu precisar dessa lógica em outro lugar?
    *  2) E se eu quiser trocar o tipo que guardo a data da viagem?
    *  3) E se eu quiser testar essa lógica, o quão fácil fica?
    *  
    *  Você poderia ganhar tudo o que está aí em cima usando uma ideia
    *  básica de OO. Deixar estado perto do comportamento. 
    */
  return LocalDate.now().until(viagem.getPartida()).getDays();
}
```

Depois:
```java
package com.deveficiente.heuristicas.coesaobasica.datas.v2;

import java.time.LocalDate;

public class ViagemV2 {

  private LocalDate partida;

  public ViagemV2(LocalDate partida) {
    super();
    this.partida = partida;
  }
  

  public int quantasDiasFaltam(LocalDate de) {
    return de.until(this.partida).getDays();
  }
  
  
}

@GetMapping("viagens/{id}/dias-para-partir")
public int executa(@PathVariable("id") Long id) {
  ViagemV2 viagem = viagemRepository.buscaViagem(id);

  /*
    *  Aqui o código executou um lógica sobre o estado de um objeto
    *  fora dele. O simples fato de fazer te exigiria maior esforço
    *  para coisas básicas. 
    *  
    *  1) E se eu precisar dessa lógica em outro lugar? -> É só reutilizar a lógica
    *  2) E se eu quiser trocar o tipo que guardo a data da viagem? -> É só trocar a implementação
    *  3) E se eu quiser testar essa lógica, o quão fácil fica? -> É só testar a classe Viagem
    *  
    *  Você poderia ganhar tudo o que está aí em cima usando uma ideia
    *  básica de OO. Deixar estado perto do comportamento. 
    */
  return viagem.quantasDiasFaltam(LocalDate.now());
}
```
Fonte: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/0e42c602ba0662f192c9657fdd5d5e485fdf99ea/src/main/java/com/deveficiente/heuristicas/coesaobasica/datas/v1/VerificaDiasParaPartidaController.java

#### Outra explicação com verificação de nullidade
Conteúdo desta aula foi utilizado em dois momento no curso. Para evitar repetição, este conteúdo ficou centralizado em [Heurística #1 Coesão Básica: Mais um exemplo](#heurística-1-coesão-básica-mais-um-exemplo)


### Descrição da atividade
Neste primeiro vídeo Alberto explica o que ele quer dizer com esta heurística e também já demonstra uma situação onde existe uma oportunidade de aumentar a coesão do código. Além disso ele deixa o ponto de vista dele sobre os possíveis ganhos de aumentar a coesão do código.

Agora, neste segundo vídeo Alberto traz outro exemplo onde existe uma oportunidade de aumentar a coesão do código.

Antes de caminhar para os desafios, é sugerido que você pare e reflita sobre o que foi explicado no contexto do seu dia a dia de dev(a). Será que os códigos que você tem escrito e visto estão tirando máximo proveito da coesão?

Agora vamos para os desafios. Aqui temos dois desafios e a explicação de cada um pode ser vista nos vídeos a seguir:

1.  [Explicação para o primeiro desafio](https://youtu.be/NXiTagrifEk)
2.  [Explicação para o segundo desafio](https://youtu.be/T6LWAXSirH0)

Após ter refletido e tentado implementar a solução, você pode(deve) conferir a sugestão de solução. Olhar a solução é importante para você ter a capacidade de avaliar o que você mesmo fez. Pode ser que sua solução seja melhor, pior, igual... Essa análise vai te dando cada vez mais clareza sobre os rumos do seu aprendizado.

1.  [Sugestão de solução para o primeiro desafio](https://youtu.be/kp-YFWaC53k)
  - Solução do autor: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/17348204d2659ba00ca7a95e6431654578593f6d/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v2/Treinamento.java


2.  [Sugestão de solução para o segundo desafio](https://youtu.be/EUSmZpOSe3w)

As branches com as sugestões de soluções podem ser acessadas seguindo os links abaixo

1.  [Desafio relacionado a treinamento e atividades](https://github.com/asouza/desafios-heuristicas-deveficiente/tree/solucao-coesao-desafio-treinamento-e-atividades)
2.  [Desafio relacionado a estados e países](https://github.com/asouza/desafios-heuristicas-deveficiente/tree/solucao-coesao-desafio-validacao-estado-pais)

## Heurística #1 Coesão Básica: Mais um exemplo
> Mesmo problema citado acima, comportamento longe do estado.

Antes:
```java
@GetMapping("/busca")
public void executa(BuscaRequestV1 request) {
  
  /**
   * Aqui temos dois problemas, inclusive um deles vamos endereçar de novo mais para frente.
   * 
   * 1) Como você sabe que a string pode ser nula se o retorno é String?
   * 2) Como você sabe que ela pode ser em branco?
   * 
   * O problema é o mesmo, a lógica está saindo de perto do estado
   * afetando a coesão. Falta de coesão gera falta de confiança e exagero
   * em checagens. 
   */
  
  if(request.getNome() != null && !request.getNome().trim().isBlank()) {
    //concatena um pedaço de busca aqui
  }
  
  if(request.getEndereco() != null && !request.getEndereco().trim().isBlank()) {
    //concatena um pedaço de busca aqui
  }
}
```

Depois:
```java
import java.util.Optional;

public class BuscaRequestV2 {

  private String nome;
  private String endereco;
  
  public void setNome(String nome) {
    //Deveria aceitar string em branco? Hm.... Vamos voltar nisso mais para frente.
    //como você sabe que não vem branco? O quão flexível você quer ser aqui?
    this.nome = nome;
  }
  
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  
  public Optional<String> getNome() {
    return Optional.ofNullable(nome);
  }
  
  public Optional<String> getEndereco() {
    return Optional.ofNullable(endereco);
  }
}

@GetMapping("/busca")
public void executa(BuscaRequestV2 request) {
  
  /**
   * Aqui temos dois problemas, inclusive um deles vamos endereçar de novo mais para frente.
   * 
   * 1) Como você sabe que a string pode ser nula se o retorno é String?
   * 2) Como você sabe que ela pode ser em branco?
   * 
   * O problema é o mesmo, a lógica está saindo de perto do estado
   * afetando a coesão. Falta de coesão gera falta de confiança e exagero
   * em checagens. 
   */
  
  request.getNome().ifPresent(nome -> {
    //faz algo aqui
  });
  
  request.getEndereco().ifPresent(nome -> {
    //faz algo aqui
  });
}
```

fonte: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/0e42c602ba0662f192c9657fdd5d5e485fdf99ea/src/main/java/com/deveficiente/heuristicas/coesaobasica/strings/v1/BuscaController.java

## Heurística #1 Coesão Básica: Primeiro desafio
Desafio da lista de atividades. Primeiro devemos implementar a adição ded atividade e depois a identificação da atividade numa lista. O primeiro estará na posição zero e assim por diante.

Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-treinamento-e-atividades/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v1/Treinamento.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/17348204d2659ba00ca7a95e6431654578593f6d/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v2/Treinamento.java


## Heurística #1 Coesão Básica: Segundo desafio
Desafio da validação de um estado que pertence a um país. O país não precisa ter estados, mas caso tenha deverá validar se o estado pertence ao país correto.

Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-validacao-estado-pais/src/main/java/com/deveficiente/heuristicas/coesaobasica/validarequest/v1/ValidaSeEstadoPertenceAPais.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-validacao-estado-pais/src/main/java/com/deveficiente/heuristicas/coesaobasica/validarequest/v2/ValidaSeEstadoPertenceAPais.java


## Heurística #2 Quando o tipo padrão não é mais suficiente: Explicação e primeiro exemplo
Retornos de tipos padrão, como por exemplo, String, Long e outros podem não ser suficientes em alguns casos.

Alguns exemplos de texto como um **e-mail** ou **link** que são representados como String em alguns casos, possuem algumas Características adicionais e que diferem de sua característica original. No caso de **String**, é um conjunto de caracteres, por exemplo, já um email possui as caracteristicas similares a um texto, mas também possui um padrão de caracteres que o diferencia de uma **String** comum como o uso de `@` e os outros elementos. É este conceito que é abordado nesta heurística.

A aula faz referência quanto ao uso de Factory Methods falado no LIvro Java Efetivo para facilitar a criação de um objeto. Item 1 trata especificamente sobre o uso de métodos estáticos de fábrica em vez de construtores.

Exemplo do problema: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/valueobjects/senhaencodada/v1/CriaUsuarioV1Controller.java

Exemplo de solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/valueobjects/senhaencodada/v2/CriaUsuarioV2Controller.java

## Heurística #2 Quando o tipo padrão não é mais suficiente: Retorno sem a semântica suficiente
Ao receber dados de tipos básicos (como `string` ou `int`), pode faltar informações cruciais para operar corretamente sobre eles. Exemplos como CPF ou percentual mostram que, sem abstrações, o código depende de "acoplamento mental" — entendimentos implícitos por parte do desenvolvedor.

Se o tipo básico não comunica tudo que é necessário (ex.: formatação, arredondamento ou precisão), recomenda-se:

- Criar uma abstração específica que encapsule o comportamento desejado.
- Ou parametrizar o método com as informações necessárias para operar corretamente.

## Heurística #2 Quando o tipo padrão não é mais suficiente: Primeiro desafio
Número de CPF somente números ou formatado.

Problema: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/valueobjects/cpf/v1/CriaClienteController.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-value-object-cpf/src/main/java/com/deveficiente/heuristicas/valueobjects/cpf/CriaClienteController.java

Minha solução: [CriaClienteController.java](./desafios-heuristicas-deveficiente/src/main/java/com/deveficiente/heuristicas/valueobjects/cpf/v1/CriaClienteController.java)

## Heurística #2 Quando o tipo padrão não é mais suficiente: Segundo desafio
Arredondamento de BigDecimal.

Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-value-object-percentual/src/main/java/com/deveficiente/heuristicas/valueobjects/percentual/v1/ExibePercentualTreinamentoV1.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-value-object-percentual/src/main/java/com/deveficiente/heuristicas/valueobjects/percentual/v2/ExibePercentualTreinamentoV2.java


## Heurística #2 Quando o tipo padrão não é mais suficiente: Refletindo sobre o que fizemos na heurística de coesão básica
Desafio da lista de atividades. Primeiro devemos implementar a adição ded atividade e depois a identificação da atividade numa lista. O primeiro estará na posição zero e assim por diante.

Agora surge o desafio de permitir que o início da posição da lista de atividades inicie com o valor zero ou outro valor.

Versão inicial, antes da solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/17348204d2659ba00ca7a95e6431654578593f6d/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v2/Treinamento.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-treinamento-e-atividades/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v2/Treinamento.java

## Heurística #2 Quando o tipo padrão não é mais suficiente: Relacionando as soluções com padrões existentes: Value Object e Tiny Objects
Gerado por IA:

### **Entendendo Quando os Tipos Básicos Não São Suficientes**

No desenvolvimento de software, frequentemente utilizamos tipos de dados padrão que a linguagem oferece, como `String` para texto ou `int` para números inteiros. No entanto, o palestrante explica que, em certos casos, esses tipos **não possuem as características ou os comportamentos específicos** que precisamos para representar determinadas informações. Isso significa que eles não conseguem expressar toda a "semântica" (o significado e as regras) por trás de um dado.

Para resolver essa limitação, são abordadas duas soluções de padrões de projeto: **Value Objects** e **Tiny Objects**.

#### 1. **Value Objects (Objetos de Valor)**

*   **O que são?** São classes que representam um valor ou conceito específico do domínio da sua aplicação. A ideia de Value Object é derivada do **Domain-Driven Design (DDD)**.
*   **Qual a principal característica?** A **igualdade** de dois Value Objects é definida **pelas informações de todos os seus atributos**.
    *   **Exemplos Clássicos:**
        *   Um **CPF**: Dois CPFs são iguais se tiverem os mesmos números.
        *   Uma **senha**: Duas senhas são iguais se o texto for o mesmo.
        *   Uma **posição**: Duas posições são iguais se estiverem no mesmo ponto.
        *   Um **endereço** (contendo rua, bairro, número): Dois endereços são considerados iguais se estiverem na mesma rua, no mesmo bairro e tiverem o mesmo número.
*   **Quando usar?** Você deve considerar criar um Value Object quando perceber que está usando **sempre juntos** vários tipos básicos (como `rua`, `bairro` e `número` de um endereço) e **criando comportamentos ou operações que combinam esses dados**. Isso ajuda a **isolar esses comportamentos** e criar operações sobre eles em um único lugar. Essas informações, que fazem parte do domínio da aplicação, podem precisar de uma abstração específica para elas.

#### 2. **Tiny Objects (Pequenos Objetos)**

*   **O que são?** São, como o nome sugere, **objetos pequenos**. A ideia por trás deles é **criar uma abstração para um conceito** que, se fosse representado por um tipo básico (como um número), perderia parte de seu significado ou funcionalidade. O nome "Tiny Object" pode ter vindo do C++.
*   **Qual a principal ideia?** Se um tipo básico não consegue representar bem um conceito, crie uma classe para ele.
    *   **Exemplo:** A **velocidade de um carro**. Em vez de representar a velocidade apenas como um número inteiro, você pode criar uma classe `Velocidade`. Assim, a classe `Velocidade` pode ter métodos para acumular velocidade, compará-la, etc., algo que um simples `int` não faria naturalmente. O palestrante menciona que ele mesmo tem uma influência indireta desse pensamento sobre abstrações específicas para casos específicos.
*   **Cuidado Importante!** O palestrante dá um alerta crucial: **não exagere na criação de Tiny Objects!**. Ele compartilha uma experiência pessoal onde criou classes para tudo (sobrenome, telefone, celular, etc.). O resultado foi que essas classes muitas vezes não tinham nenhuma "inteligência" (comportamento isolado) e apenas "delegavam" chamadas para os tipos básicos, tornando o código mais complexo sem necessidade. Ele enfatiza a importância de ter um sistema claro para medir a necessidade antes de sair criando esse tipo de abstração.

### **Heurísticas: Quando Devo Criar Uma Abstração (Value Object ou Tiny Object)?**

A decisão de criar uma nova classe para um tipo é fundamental. O palestrante sugere avaliar em dois cenários principais:

1.  **Quando você está recebendo parâmetros (informações de entrada):**
    *   **Possui características ou semânticas adicionais?** Por exemplo:
        *   Um número decimal (`BigDecimal`) que precisa ter um máximo de `X` casas decimais.
        *   Um CPF que precisa estar formatado com pontos no local correto ou seguir um algoritmo de hash específico.
        *   Um telefone que precisa estar formatado ou um nome que não pode ter espaços em branco.
    *   **É fácil bloquear a execução do método ou validar a informação no momento da compilação ou execução usando os tipos padrão?**
        *   Se for **fácil** validar usando os tipos padrão (ex: `BigDecimal` com `X` casas decimais), talvez você **não precise** criar uma nova abstração.
        *   Se for **difícil** validar (ex: a regra de um CPF com algoritmo de hash), então **criar uma abstração** pode maximizar a chance de receber o parâmetro corretamente, pois a lógica de validação estaria encapsulada na nova classe.

2.  **Quando você está recebendo um valor de retorno (informações de saída):**
    *   **O tipo padrão que você recebe tem uma "semântica" envolvida?** Por exemplo, uma `String` que tem informações separadas por vírgula ou espaço, ou um número que precisa de um certo número de casas decimais ou um valor máximo.
    *   **Você consegue extrair essa informação semanticamente do tipo padrão facilmente?**
        *   Se não, você pode optar por **parametrizar o método** para que o retorno já seja o que você espera, mas o palestrante comenta sobre os possíveis perigos desse caminho.
        *   Ou, o caminho preferível, **retornar uma abstração própria** (sua nova classe) que já contenha os comportamentos e informações que facilitarão a vida de quem for usar esse retorno.

Em resumo, a ideia é criar essas abstrações específicas (Value Objects e Tiny Objects) quando os tipos básicos da linguagem não são suficientes para expressar a complexidade, as regras de negócio ou os comportamentos associados a um determinado dado. Isso ajuda a construir um código com mais **qualidade** e **clareza**.

---

**Analogia para fixar:**

Pense nos tipos padrão da linguagem (como `int` ou `String`) como **blocos de montar LEGO básicos** (quadrados, retângulos simples). Eles são ótimos para a maioria das construções.

*   Um **Value Object** seria como um **conjunto de blocos LEGO que, juntos, formam algo com um significado único e específico**, como uma "roda de carro" (que tem aro, pneu, etc.). A "roda" é definida por todos esses pedaços, e duas "rodas" são iguais se todos os seus componentes forem os mesmos. Você usa isso quando precisa de um "componente" que é sempre tratado como uma unidade com sua própria identidade de valor.
*   Um **Tiny Object** seria um **bloco LEGO superespecializado**, talvez com uma engrenagem ou um sensor embutido. Você não usaria um desses para cada pequeno detalhe, apenas quando um bloco simples não pode cumprir a função complexa que você precisa (como medir a "velocidade" do seu carro LEGO, que não é só um número, mas algo que precisa de um comportamento específico). A armadilha é transformar todo bloco simples em um bloco superespecializado, o que só tornaria a construção mais difícil e menos flexível.

## Heurística #3 Polimorfismo para postergar decisões ou expressar incertezas no código: Explicação e exemplo
Polimorfismo

Execução de métodos dinâmicos através de implementações de interfaces

Criação de classes concretas com base nas interfaces.

Explicar o polimorfismo é mais fácil que aplicar o polimorfismo. Esta heurística é para isso.

Postegar as decisões quando não temos certeza sobre a solução.

Na aula mostra um exemplo de sistema de avaliação de3 resposta de um exercício. O primeiro passo é slavar as informações no banco de dados e depois enviar as informações da reposta para um outro sistema.
Neste momento o sistema foi desenvolvimento utilizando o SQS como implementação usando uma classe concreta. O uso da classes concreta não flexibiliza para que futuramente utilize uma outra solução como uma fila MQ em outras soluções. Na explicação existe uma necessidade não determinada atualmente sobre a continuação de uma fila SQS ou MQ.


Problema: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/naoseiqualfilausar/v1/RecebeRespostaExercicioController.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/naoseiqualfilausar/v2/RecebeRespostaExercicioController.java

[Exemplo com uso de interface funcional](./desafios-heuristicas-deveficiente/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/naoseiqualfilausar/v2/RecebeRespostaExercicioController.java)

O conhecimento que fica no entendimento da aula é que podemos utilizar o polimorfismo através das interfaces para postergar a decisão de utilizar uma fila SQS da AWS ou outra solução no futuro. Através da implementação da interface podemos criar uma solução que permite a flexibilidade para desenvolver uma solução e facilmente alterar para uma outra solução.


## Heurística #3 Polimorfismo para postergar decisões ou expressar incertezas no código: Desafio
O desafio está em implementar um código que suporte a modificação do sitema que facilite a indexação da informação ao realizar uma busca. Nesse momento estamos entre o postgre search, lucene direto ou elastic search. Não dominamos muito nenhum e existe uma boa opção de escolhermos algo e mudarmos de opinião.

Problema: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/indexarconteudo/v1/NovaAtividadeController.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-flexibilizar-decisao-indexacao/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/indexarconteudo/v2/NovaAtividadeController.java

Minha solução: [./desafios-heuristicas-deveficiente/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/indexarconteudo/v2/NovaAtividadeController.java](./desafios-heuristicas-deveficiente/src/main/java/com/deveficiente/heuristicas/postergandoeflexibilizandodecisoes/indexarconteudo/v2/NovaAtividadeController.java)

## Heurística #4 Até coleções podem ganhar suas próprias abstrações:
Explicação da heurística utilizando código fonte do Spring.

Exemplo de refatoração de código gerado por IA utilizando o conceito apresentado na aula: https://gist.github.com/adrianoavelino/67e64f811ff3016c315b010b15a3e83a


**Material teórico gerado por IA:**


A aula "Heurística #4 Até coleções podem ganhar suas próprias abstrações" aborda uma **heurística** para melhorar a organização e a **manutenibilidade do código** ao lidar com operações sobre coleções.

### Problema Identificado

*   O problema surge quando uma classe possui **atributos do tipo coleção** (como `List` ou `Set`) e múltiplos métodos que realizam diversas e complexas operações sobre essas coleções.
*   Isso pode levar a uma **dificuldade de entendimento** da unidade de código, especialmente se as operações envolvem laços (`for`) e condicionais (`if/continue`) complexos.
*   Métricas de código, como a **complexidade ciclomática** ou a **complexidade intrínseca do CDD**, podem sinalizar que a classe está se tornando "pesada" ou "pintando de vermelho", indicando um potencial problema de manutenção e entendimento. O uso frequente de `continue` em Java, por exemplo, pode ser um indicativo de complexidade.

### Exemplo Prático (Spring Framework)

*   A heurística é ilustrada com um exemplo real do código-fonte do **Spring Framework**, especificamente a classe `ContentNegotiationManager` no módulo `Spring web`.
*   Essa classe possui dois atributos de coleção:
    *   `strategies`: uma lista (`List`) de `ContentNegotiationStrategy`.
    *   `resolvers`: um conjunto (`Set`) de `MediaTypeFileExtensionResolvers`.
*   O palestrante demonstra que há **múltiplas lógicas complexas e recorrentes** executadas sobre essas coleções dentro da própria `ContentNegotiationManager`:
    *   **Sobre `strategies`**: Lógicas para adicionar resolvedores de tipo `MediaTypeFileExtensionResolver` ao `resolvers`, e para verificar e extrair `mediaTypes` que não são iguais a uma lista padrão (`MediaTypeAllList`).
    *   **Sobre `resolvers`**: Lógicas para acumular valores, verificar extensões de forma única, e carregar `mediaTypes` de forma específica.
*   Embora o código existente no Spring não seja considerado "equivocado" (errado) — pois ele segue a heurística de ter a lógica sobre o estado do objeto dentro de métodos da própria classe — ele pode ser **difícil de entender** devido à sua complexidade e ao volume de operações sobre as coleções.

### Solução Proposta: Abstração de Coleções

*   A ideia é criar **novas classes dedicadas** que "embrulham" (wrapper) essas coleções e encapsulam as operações específicas sobre elas.
*   Por exemplo, em vez de ter um atributo `List<ContentNegotiationStrategy>` diretamente na `ContentNegotiationManager`, pode-se ter uma classe como `ContentNegotiationStrategies` (com visibilidade de pacote, por exemplo) que seria um *wrapper* para essa lista.
*   Todas as operações complexas que antes estavam na `ContentNegotiationManager` seriam **movidas para dentro dessa nova classe** `ContentNegotiationStrategies`.
*   O mesmo raciocínio se aplica ao `Set<MediaTypeFileExtensionResolvers>`, que poderia ser encapsulado em uma classe como `MediaTypeFileExtensionResolvers`, para a qual as operações seriam movidas.
*   Essa abordagem **distribui a complexidade**, **facilitando o entendimento e a manutenibilidade** da classe original, pois ela agora delega as operações específicas da coleção para as novas classes *wrapper*.

### Quando Aplicar

*   Você deve considerar essa refatoração quando perceber que **duas ou mais operações** estão sendo realizadas sobre uma determinada coleção que é um atributo da sua classe.
*   É especialmente relevante quando as **métricas de código** (como as do Sonar ou as baseadas no CDD) ou os **princípios de design** (como SOLID) indicam que a classe está se tornando difícil de manter ou dando sinais de dificuldade de manutenibilidade.
*   Essa heurística se alinha com a ideia de criar uma nova classe quando os tipos padrões da linguagem não possuem a **semântica necessária** para representar adequadamente a lógica de domínio.

Pense nisso como um bibliotecário que, em vez de listar todos os livros, autores e empréstimos em um único e imenso caderno (a classe principal), decide criar cadernos menores e especializados: um só para os "livros disponíveis" (a classe que encapsula a coleção de livros), outro para "autores e suas obras" (uma classe para a coleção de autores), e assim por diante. Cada caderno menor se torna mais fácil de manusear e entender suas operações, e o bibliotecário principal agora apenas delega a tarefa de verificar os livros ao caderno de "livros disponíveis", tornando seu próprio trabalho mais claro e organizado.

## Heurística #4 Até coleções podem ganahr suas próprias abstrações: Desafio
Este desafio está mais aberto, não existe uma restrição sobre o que deve ser resolvido. A inteção é praticar refletindo os conhecimentos adquiridos até o momento.

Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/colecoescommuitaresponsabilidade/atividadesobrigatoriasconcluidas/v1/Treinamento.java

Solução inicial: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/7d40f042f2c1b4fd02a65f107ec4882d23f9aca3/src/main/java/com/deveficiente/heuristicas/colecoescommuitaresponsabilidade/atividadesobrigatoriasconcluidas/v1/Treinamento.java

Solução final: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-desafio-colecaomuitasresponsabilidads-treinoeatividades/src/main/java/com/deveficiente/heuristicas/colecoescommuitaresponsabilidade/atividadesobrigatoriasconcluidas/v1/Treinamento.java

> TODO: Fiquei com algumas dúvidas, voltar no assunto futuramente.


## Heurística #5 Identificando oportunidades de aplicação de funções aplicar template method: Explicação e exemplo
Baseado no design de projeto Template method

`@Service` do Spring utiliza um tipo de Template Method

No Java podemos usar as Functions através de um Supplier para executar um trecho de código.

O gatilho para esse problema ocorre quando um conjunto de código em determinado escopo precisa aguardar algum outro processo, ou seja, meu trecho de código fica aguardando um processo anterior. Por exemplo num controller Spring que se comunica com um sistema externo (Typeform, um sistema parecido com Google Form) e depois persiste num banco de dados. Normalmente utilizamos uma anotação `@Transaction` para garantir a consistência do banco de dados, mas neste caso perdemos um tempo aguardando uma resposta do sistema externo. Observe que isso torna o banco de dados mais lento, bloqueando o banco de dados de executar outras transações para aguardar um sistema externo trazer alguma respostas. O correto neste cenário é não ocorrer o bloqueio de requisições para aguardar um outro sistema que não tem uma relação direta com o banco de dados.

Analise o código abaixo com o problema:
```java
@PostMapping("/recebe-resposta/v1")
@Transactional
public ResponseEntity<?> executa(Aluno alunoLogado,
    NovaRespostaRequest request) {

  /*
    * Aqui tem uma chamada remota e estamos segurando recurso do
    * banco de dados sem fazer nada com ele. Como melhorar?
    */
  if (integracaoTypeForm.verificaExistencia(request.idExercicio,
      alunoLogado.getEmail())) {
    Resposta novaResposta = request.toResposta(exercicioRepository);
    respostaRepository.salva(novaResposta);
    return ResponseEntity.ok("Resposta salva");
  }

  return ResponseEntity.notFound().build();
}
```

Analise o código abaixo com solução:
```java
@Component
public class ExecutaComTransacao {

  @Transactional
  public <T> T comRetorno(Supplier<T> funcao) {
    System.out.println("Simulando abertura de transacao");
    T retorno = funcao.get();
    System.out.println("Simulando commit da transacao");
    return retorno;

  }
}

@PostMapping("/recebe-resposta/v1")
public ResponseEntity<?> executa(Aluno alunoLogado,
    NovaRespostaRequest request) {

  if (integracaoTypeForm.verificaExistencia(request.idExercicio,
      alunoLogado.getEmail())) {
    Resposta novaResposta = request.toResposta(exercicioRepository);
    return executaComTransacao.comRetorno(() -> {
      System.out.println("Salvando a resposta e definindo retorno");
      respostaRepository.salva(novaResposta);
      return ResponseEntity.ok("Resposta salva");				
    });
  }

  return ResponseEntity.notFound().build();
}
```

Antes: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/templatesefuncoes/transacoes/v1/RecebeRespostaExercicioController.Java

Depois: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/templatesefuncoes/transacoes/v2/RecebeRespostaExercicioController.java


Conteúdo gerado por IA:

### **Heurística 5: Aplicação do Template Method com Funções**

Esta heurística foca na identificação e aplicação do **Design Pattern Template Method** utilizando conceitos de **programação funcional**. É especialmente relevante para linguagens que suportam esse paradigma, como JavaScript, Go, Clojure, e até mesmo linguagens orientadas a objetos que possuem funcionalidades relacionadas a funções. O objetivo é desenvolver um "olho clínico" para reconhecer oportunidades de uso deste padrão.

#### **1. O que é o Template Method?**

O Template Method é um padrão de design que permite **estruturar o código de forma a ter uma parte padrão (o template)** e, dentro dela, um **pedaço flexível que pode ser customizado** para executar de diferentes maneiras.

#### **2. O Problema Ilustrativo (Cenário de Exemplo)**

O exemplo central da aula descreve um **controle Spring que recebe a resposta de um exercício**.

*   **Comportamento Padrão do Spring `@Transactional`**: Quando um método é marcado com `@Transactional` no Spring, ele se comporta como um Template Method. Por baixo dos panos, o Spring **abre uma transação, executa o código do seu método e, em seguida, commita a transação** (ou faz rollback em caso de erro).
*   **O Problema Específico**: No cenário, o código dentro do método `@Transactional` realiza uma **integração com um sistema externo** (um serviço do Typeform) para verificar se um exercício foi respondido. Somente se o Typeform retornar que a resposta existe, ela é salva no banco de dados.
    *   Ao usar `@Transactional`, uma **conexão com o banco de dados é aberta e uma transação é iniciada**.
    *   O problema é que essa **conexão é mantida (segurada)** enquanto a **chamada remota para a API externa** está sendo realizada, mesmo que essa chamada não tenha relação com o banco de dados.
    *   **Ineficiência**: Isso significa que um **recurso valioso (a conexão com o banco de dados) fica travado por um tempo desnecessário**, aguardando uma operação externa que não depende do banco.
*   **O Desejo**: O ideal seria que apenas a parte do código que interage com o banco de dados (salvar a resposta) rodasse dentro de uma transação. Além disso, essa transação só deveria ser disparada **se, e somente se, o serviço do Typeform retornar que a resposta foi salva**.

#### **3. O Gatilho: Quando Usar o Template Method com Funções?**

A heurística sugere que o gatilho para usar essa abordagem é quando você tem **um pedacinho de código (duas ou três linhas, por exemplo) que você deseja executar dentro de um determinado escopo ou contexto**.

*   **Exemplos de Contextos**:
    *   Rodar o código dentro de uma **transação**.
    *   Rodar o código considerando uma **outra característica específica**.
    *   Rodar coisas usando **serviços de infraestrutura classe A**, como um log padrão para determinadas operações. Você pode ter um método que executa esse log padrão e, no meio dele, precisa executar um código que é diferente.

#### **4. A Solução com Programação Funcional**

A chave da solução é a **transformação do pedaço de código flexível em uma função**.

*   **Envelopando o Código**: As linhas de código que precisam ser executadas dentro de um contexto específico (como uma transação ou um log padrão) podem ser **envelopadas em uma função**.
*   **Passando como Argumento**: Essa função, uma vez criada, pode ser **passada como argumento** para qualquer outro lugar.
*   **Execução pelo Receptor**: Quem recebe essa função (o template) pode então **chamar essa função no momento e contexto apropriado**. Em Java, um `Supplier` pode ser chamado com o método `get()`; em JavaScript, a função pode ser chamada diretamente.

#### **5. A Solução Implementada (Versão 2)**

Na versão resolvida do problema:

*   A anotação `@Transactional` original é **removida** do controle.
*   É criada uma **nova classe (ex: `ExecutaComTransacao`)** com um método (ex: `comRetorno`) que será responsável por gerenciar a transação.
*   Este método `comRetorno` recebe como argumento a **função que representa o pedaço de código a ser executado transacionalmente** (no exemplo, a função `salvaNovaResposta`).
*   **Com Spring**: A nova classe/método `ExecutaComTransacao.comRetorno` é marcada com `@Transactional`, fazendo com que o Spring gerencie a transação ao chamar esse método.
*   **Sem Spring**: Se não houver Spring, o gerenciamento da transação é feito manualmente dentro do método `comRetorno`: abrir a conexão, abrir a transação, chamar a função passada como argumento e, finalmente, commitar a transação.

Isso permite **executar trechos específicos de código dentro de uma transação onde e quando você quiser**, oferecendo maior controle e otimização.

#### **6. Benefícios e Conclusões**

*   **Controle Granular**: Permite que você execute apenas o trecho de código necessário dentro de um escopo específico (como uma transação), em vez de todo o método.
*   **Otimização de Recursos**: Evita que recursos (como conexões de banco de dados) fiquem travados por mais tempo do que o necessário, especialmente durante operações externas ou de infraestrutura.
*   **Simplicidade na Implementação**: A solução em si é considerada de **baixo esforço de implementação**, embora exija um bom conhecimento de funções e passagem de funções como argumento.
*   **Poderoso para Infraestrutura**: É uma abordagem **muito poderosa** para situações que envolvem serviços de infraestrutura, onde você quer limitar o uso de um recurso ao tempo mínimo possível.
*   **A Heurística Final**: Quando você perceber um **conjunto de linhas de código que deseja rodar em um determinado escopo**, você deve:
    1.  **Transformar esse código em uma função**.
    2.  **Criar uma classe para representar o escopo** que você quer delimitar (ex: gerenciamento de transação, logging).
    Essa combinação resulta no **Template Method com funções**, proporcionando flexibilidade e eficiência.


## Heurística #5 Identificando oportunidades de aplicação de funções para construir templates de código: Desafio
O desafio é adicionar uma requisição assincrona para um sistema externo para avaliação da resposta, depois da persistência no banco de dados e de forma assincrôna.

### Desafio
🎯 Descrição da Atividade — Heurística 5: Execução Assíncrona de Código

Nesse desafio, a ideia é botar a mão na massa com um problema real: quando o aluno envia uma resposta de exercício, ela precisa ser salva e enviada pra um sistema automático de correção baseado em machine learning.

Mas tem um detalhe importante: esse envio tem que ser **assíncrono** — ou seja, feito "em paralelo", sem travar o restante do processo. Só que você **não pode alterar** o método `submeteRespostaParaAnalise`, que já está prontinho.

💥 O que você precisa fazer:
- Fazer essa chamada de forma assíncrona, só nesse ponto específico do código.
- Manter tudo funcionando bonitinho sem quebrar a lógica que já existe.
- Pensar como aplicar templates e técnicas de desacoplamento sem complicar demais.

💡 Esse exercício é excelente pra quem quer mandar bem em orientação a objetos, código limpo e boas práticas de arquitetura. Bora codar com estilo!


Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/master/src/main/java/com/deveficiente/heuristicas/templatesefuncoes/execucaoassincrona/v1/RecebeRespostaExercicioController.java


Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-templates-funcoes-execucao-assincrona/src/main/java/com/deveficiente/heuristicas/templatesefuncoes/execucaoassincrona/v1/RecebeRespostaExercicioController.java


## Heurística #5 Identificando oportunidades de aplicação de funções para construir templates de código: Desafio surpresa
Agora, vou deixar mais um desafio para você. Não é anormal existir um controle de perfil para acessar determinadas funcionalidades. De vez em quando você precisa ser admin, de vez em quando precisa ter direito sobre o recurso etc. Será que você consegue criar essa situação na sua mente e implementar um código inspirado nesta heurística para controlar acesso a funcionalidades?

Dica: Para este desafio você provavelmente vai trabalhar com encadeamento de chamadas de funções que tem responsabilidades bem definidas. 

> Aqui fiquei confuso sobre a atividade, vou aguardar um explicação ou reformulação do curso.

