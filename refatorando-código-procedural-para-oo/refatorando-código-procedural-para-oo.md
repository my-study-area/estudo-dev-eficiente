# Refatorando código procedural para OO

## Bem vindo ao curso!
Nome do livro citado no vídeo: Refactoring to Patterns  por Joshua Kerievsky


## Clonando o repositório
https://github.com/forks-projects/refactoring-workshop


## O problema do cálculo de descontos: Qual o problema?
Analise o código e pense na solução em 30 minutos

O código com problema: https://github.com/forks-projects/refactoring-workshop/blob/main/workshop/src/main/java/discountapplier/DiscountApplier.java


## O problema do cálculo de descontos: Por que este código é problemático?
Identificação dos problemas:
* **Classe "Monstrinho":** A classe faz coisa demais, centralizando todas as regras de desconto (produto, valor, etc) em um único lugar.
* **Evolução via "Copia e Cola":** Para adicionar novos descontos, o desenvolvedor é obrigado a duplicar blocos de código e alterar valores manualmente.
* **Complexidade Desproporcional:** O método cresce de forma desordenada; o autor cita um exemplo real onde o código chegou a ter 37 "IFs".
* **Dificuldade de Leitura:** O código fica tão confuso que os desenvolvedores começam a escrever comentários explicativos (ex: "regra 1") em vez de ter um código legível.
* **Conexão de Métodos via Booleano:** O uso de métodos privados que retornam "true/false" para decidir se o próximo desconto deve ser aplicado é considerado uma "gambiarra".
* **Falta de Travas no Carrinho:** O método de subtrair valor aceita qualquer entrada, permitindo que o carrinho fique com valor total negativo.
* **Mutabilidade Exposta:** A classe "Carrinho de Compras" permite que qualquer um mude seu estado interno (valor total) de forma direta e sem controle.
* **Dados Fixos no Código (Hardcoding):** Nomes de produtos (Macbook, iPhone) estão escritos direto no código, o que impede que os dados venham de um banco de dados de forma elegante.


## O problema do cálculo de descontos: Quebrando o código em pequenas classes
- separar os métodos do descontos em classes separadas
- criar uma interface que determina o comportamento das classes de desconto
- a classe que chama os descontos (`DiscountApplier`) deve receber uma lista de descontos
- crie uma classe main para realizar os testes manuais. Esta classe deve criar uma lista de descontos e passar para o objeto `DiscountApplier`.

**1. Criação da Abstração**    
* [ ] Criar a interface `DiscountStrategy` (ou `DescontoStrategy`).
* [ ] Definir o contrato principal: um método público `apply(Basket basket)` (ou `aplicar`) que retorna um `boolean`.
    * *Nota: O retorno booleano indica se a regra foi aplicada, permitindo o controle de interrupção do fluxo.*

**2. Externalização das Regras de Negócio**    
* [ ] Criar a classe `DiscountPerProduct` (Desconto por Produto) implementando a interface.
* [ ] Criar a classe `DiscountPerAmount` (Desconto por Valor/Quantidade) implementando a interface.
* [ ] Mover a lógica contida nos métodos privados da classe original para dentro do método `apply` de suas respectivas novas classes.

**3. Reestruturação da Classe Principal (`DiscountApplier`)**    
* [ ] Declarar um campo privado e final: `List<DiscountStrategy> discounts`.
* [ ] Criar um construtor que receba essa lista como parâmetro (Injeção de Dependência).
* [ ] Remover os métodos privados antigos que foram migrados para as novas classes.

**4. Generalização do Processamento de Descontos**    
* [ ] No método principal de aplicação, substituir as chamadas fixas por um laço de repetição (`for` ou `stream`).
* [ ] Implementar a lógica de parada: iterar pela lista e, caso `strategy.apply(basket)` retorne `true`, interromper o loop (`break`).

**5. Implementação da Fábrica (Factory) ou Orquestrador**    
* [ ] Criar uma classe `DiscountFactory` ou um ponto de configuração no sistema.
* [ ] Instanciar as estratégias na ordem correta (ex: 1º Produto, 2º Valor).
* [ ] Passar essa lista ordenada para a classe `DiscountApplier`.

**6. Proteção e Segurança do Código**    
* [ ] Garantir que a lista de estratégias seja imutável após a construção do objeto para evitar efeitos colaterais.
* [ ] Validar se a lógica de retorno `boolean` está consistente em todas as implementações para não quebrar o fluxo de interrupção.



