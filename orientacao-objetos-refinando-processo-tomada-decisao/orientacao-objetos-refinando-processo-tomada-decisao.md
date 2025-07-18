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
Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-treinamento-e-atividades/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v1/Treinamento.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/17348204d2659ba00ca7a95e6431654578593f6d/src/main/java/com/deveficiente/heuristicas/coesaobasica/treinamentoseatividades/v2/Treinamento.java


## Heurística #1 Coesão Básica: Segundo desafio
Desafio: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-validacao-estado-pais/src/main/java/com/deveficiente/heuristicas/coesaobasica/validarequest/v1/ValidaSeEstadoPertenceAPais.java

Solução: https://github.com/asouza/desafios-heuristicas-deveficiente/blob/solucao-coesao-desafio-validacao-estado-pais/src/main/java/com/deveficiente/heuristicas/coesaobasica/validarequest/v2/ValidaSeEstadoPertenceAPais.java


## Heurística #2 Quando o tipo padrão não é mais suficiente: Explicação e primeiro exemplo
Retornos de tipos padrão, como por exemplo, String, Long e outros podem não ser suficientes em alguns casos.

Alguns exemplos de texto como um **e-mail** ou **link** que são representados como String em alguns casos, possuem algumas Características adicionais e que diferem de sua característica original. No caso de **String**, é um conjunto de caracteres, por exemplo, já um email possui as caracteristicas similares a um texto, mas também possui um padrão de caracteres que o diferencia de uma **String** comum como o uso de `@` e os outros elementos. É este conceito que é abordado nesta heurística.

A aula faz referência quanto ao uso de Factory Methods falado no LIvro Java Efetivo para facilitar a criação de um objeto. Item 1 trata especificamente sobre o uso de métodos estáticos de fábrica em vez de construtores.
