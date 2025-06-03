# Práticas de design de código para o seu dia a dia
Este curso concentra práticas que podem ser aplicadas de maneira sistemática. É uma lista de práticas que Devs + Eficientes usam e que os ajudam a terem mais fluidez para entregar código que facilite a manutenção.

## Introdução
2 tipos de conteúdos:
  1. clean code de forma sistemática
  2. direcionamentos (intenção) de código de qualidade

## Direcionamento 1: Qualidade não é negociável
Qualidade não é negociável. O código deve ser feito com o design proporcional a complexidade considerando os conhecimentos que temos no momento da produção.

1. **Qualidade não é negociável**:  
   - O código deve sempre refletir o melhor esforço possível, dentro das limitações e variáveis existentes.  
   - Priorize práticas que garantam confiabilidade e clareza, mesmo em prazos apertados. A qualidade nunca deve ser sacrificada de forma deliberada.

2. **Design proporcional à complexidade**:  
   - O design deve ser simples e adequado à complexidade do problema, evitando abstrações ou generalizações desnecessárias.  
   - Considere os conhecimentos disponíveis no momento para criar soluções específicas e eficientes, priorizando clareza e legibilidade.  

## Direcionamento 2: Aceite, tomamos decisões ruins
Você vai deixar decisões ruins pelo caminho, não importa o seu nível.

## Direcionamento 3: Fazemos o que foi combinado
A prioridade máxima é funcionar de acordo com o caso de uso.

## Prática 1. - Parte 1: Implemente de de fora para dentro
Execute o seu código o mais rápido possível. Priorize implementar de fora para dentro, dessa forma você visualiza o que realmente precisa e usa uma abordagem mais incremental. O "fora" aqui pode ser o endpoint que vai receber uma chamada, pode ser seu teste automatizado

Por exemplo, criar o endpoint primeiro, depois implementar as entidade e serviços. Trazer um resultado de forma incremental e sempre testando as fucionalidades.

## Prática 1. - Parte 2: Implemente de de fora para dentro
Descreva os passos necessários para executar a tarefa antes da implementação do código.

```java
* Neste endpoint eu preciso receber a pessoa logada que gerará o convite e também a conta daquele convite.
    * A pessoa logada vai vir via header
    * a conta pode vir via parametro combinado na própria url (path variable)
    * Também preciso receber os dados do convite: Email e dias de expiração
* Carregar a pessoa logada e verificar se ela existe mesmo (use o getOrThrow e lance ResponseStatusException)
* Carregar a conta e verificar se ele existe mesmo (use o getOrThrow e lance ResponseStatusException)
* A pessoa logada precisa ser dona da conta (lance ResponseStatusException)
* Eu crio o novo convite para aquele email com aquela data de expiração
    * Crie um método chamado toModel na classe de request
* Salvo este convite
    * Utilize o EntityManager
* Preciso mandar um email para a pessoa que vai receber o convite
    * Deixe fake por enquanto
```

## Prática 1. - Parte 3: Implemente de de fora para dentro
- termos o passo a passo de implementação desejada
- No lugar de inicar o desenvolvimento das classes pelas entidades e repositórios, iniciar pelo controller e ir avançando passo a passo. Você define o nível de granularidade.
- Maximizar as chances de identificar os problema com mais antecedência.
- Testar granularmente ajuda a identificar os problemas com mais facilidade.

**Resumo - Implementação "De Fora Para Dentro"**

1. **Definição**: A prática "de fora para dentro" consiste em implementar funcionalidades começando pelo comportamento externo, validando cada parte progressivamente.  
2. **Testes Incrementais**: Após cada etapa implementada, testar funcionalidades pequenas para localizar problemas rapidamente.  
3. **Granularidade**: Dividir a execução em passos menores e iterar sobre eles, garantindo que cada um funcione antes de seguir.  
4. **Validação Contínua**: Confirmar a correta passagem de parâmetros, headers e dados da requisição, verificando se o comportamento está alinhado.  
5. **Refinamento**: Ajustar e corrigir cada parte à medida que o processo avança, evitando retrabalho maior no final.  
6. **Origem do Problema**: Atuar próximo à origem das falhas facilita a resolução e mantém o processo mais ágil e preciso.  

## Prática 2: Maximize a coesão
- Deixar o comportamento próximo do estado. O comportamento é o método e o estado são as classes com as propriedades de um domínio de informação (entidade).
- Como decidir quando realizar ou não? R: está realizando uma lógica baseada no estado

**Princípios Fundamentais**

1. Encapsular Comportamentos Próximos ao Estado
  - Evite implementar lógica fora da entidade que contém o estado.
  - Promova a responsabilidade dentro da classe que contém os atributos.
2. Evitar Código Anêmico
  - Use entidades ricas (Rich Domain Models) para encapsular lógica relacionada ao domínio.
  - Deixe comportamentos relevantes no modelo, ao invés de espalhá-los por controladores ou serviços.

Exemplo 1 (utilização do equals em outra classe, fora da classe `Conta`):
```java
//RUIM
if (conta.getProprietario().equals(usuarioLogado)) {
    // lógica de sucesso
} else {
    throw new ResponseStatusException(HttpStatus.FORBIDDEN);
}

//BOM
public class Conta {
    private Usuario proprietario;

    public boolean pertenceAoUsuario(Usuario usuario) {
        return this.proprietario.equals(usuario);
    }
}
```

Exemplo 2 ():
```java
//RUIM
Convite convite = new Convite(request.getEmail(), request.getDiasParaExpirar());

//BOM
public class ConviteRequest {
    private String email;
    private int diasParaExpirar;

    public Convite toConvite() {
        return new Convite(this.email, this.diasParaExpirar);
    }
}
```

Exemplo de **code Smells**:
```java
//RUIM
if (conta.getProprietario().getEmail().equals(usuario.getEmail())) { ... }
```

## Prática 3: Proteja as bordas do sistema
- Proteja as bordas do sistema, iniciando pela camada mais externa. No caso de aplicações java com Spring, isso significa validar as classes de DTO com dados de entrada, também chamado de dados de entradas que repressentam os dados do body de uma requisição de uma api HTTP.
- Evita que dados invalidos percorram pelo sistema
- Esta prática também pode ser aplicada em outras partes do sistema, com por exemplo, métodos internos. Neste caso utilizando spring temos `org.springframework.util.Assert` que podemos verificar se um valor é nulo ou vazio, entre outros.

## Prática 4: Não retorne nulo
- **Problema com retorno nulo:** Retornar nulo em métodos quebra a confiança no código e pode causar erros como NullPointerException.  
- **Garantir retorno:** Métodos devem sempre retornar um valor válido ou usar abstrações (ex.: `Optional` no Java) para indicar ausência de valor.  
- **Exemplo prático:** O uso de métodos como `findById` no Spring Data JPA, que retorna um `Optional`, ajuda a tratar situações em que o valor pode estar ausente.  
- **Alternativa segura:** Caso o retorno não possa ser garantido, lançar exceções ou usar abstrações para sinalizar ausência é mais adequado.  
- **Benefício geral:** A abordagem melhora a clareza, previne erros e mantém a consistência no código.

Exmeplo:
```java
Pessoa pessoaLogada = pessoaRepository.findById(IdPessoaLogada)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
Conta conta = contaRepository.findById(idConta)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
```

## Prática 5: Não ligamos parâmetros de borda externa com entidades
-Evitar o uso de classes de entidades na borda expondo propriedades que não devem estar expostas ao usuários. 
- Use DTO somente com os dados necessários
- Evite criar método de mapeamento nas entidades, eles tedem a crecer em quantidade. Utilize métodos específicos no DTO.

## Prática 6: Informação obrigatória entra pelo construtor
- Usar construtor para criar um objeto válido e obrigatórios
- Utilizar setters para atualizar valores pode aumentar o acomplamento mental e permite a criação de um objeto sem os valores obrigatórios

## Prática 7: Deixe pistas quando a compilação não resolver
- Utilize anotações (em outras linguagens chamam de decorator também) nos parâmetros dos métodos para guiar a pessoa que irá utilizar o método. Essas anotações não disparam erros, mas direcionam o usuário o uso de uma característica da informação valida esperada.
- Ao utilizar um construtor vazio numa classe que não deve ser utilizado e que deve ser criado devido alguma dependência como para o uso de um ORM, como no caso do Hibernate, utilize a anotação `@Deprecated` para sinalizar que aquele construtor não deve ser utilizado.
- Utilize documentação para guiar o usuário do código, como por exemplo, o uso de Javadoc.
- [Precise_Documentation_The_Key_To_Better](./materiais/Precise_Documentation_The_Key_To_Better.pdf)

Exemplo de anotações:
```java
public record NovaPerguntaRequest(
        @NotBlank
        String titulo
) {
        // aqui as anotações não geram erros, mas guiam o usuário do código
        public PerguntaProduto toModel(@NotNull Produto produto, @NotNull Usuario usuario) {
                // algum código aqui
                return new PerguntaProduto(titulo(), produto, usuario);
        }
}
```

Exemplo de `@Deprecated`:
```java
/**
 * Somente para uso do ORM
 */
@Deprecated
public PerguntaProduto() {}
```

## Prática 8: Utilize o que está pronto
- Usamos tudo que conhecemos que está pronto.
- podemos utilizar a exception do Spring para lançar um erro de validação, como por exemplo, `ResponseStatusException` para lançar um erro de validação de dados. Também podemos utilizar a classe `Assert` do Spring para validar os dados de entrada, como por exemplo, verificar se um objeto é nulo ou se uma string está vazia.

Acompanhe oExemplo de uso do Assert:

```java
// Antes
public class Convite {
    
    public Convite(Conta conta, @Email @NotBlank String email, @Future LocalDate dataExpiracao) {

        if(conta == null) {
            throw new IllegalArgumentException("A conta não pode ser nula");
        }
    
        if(email == null || email.trim().equals("")) {
           throw new IllegalArgumentException("O email precisa estar preenchido");
        }

        if(dataExpiracao.compareTo(LocalDate.now()) <= 0) {
            throw new IllegalArgumentException("A data de expiracao do convite tem que ser no futuro");
        }
    }
}
```

```java
// Depois
public class Convite {
    private LocalDate dataExpiracao;

    public Convite(Conta conta, @Email @NotBlank String email, @Future LocalDate dataExpiracao) {
        Assert.notNull(conta, message: "A conta não pode ser nula");
        Assert.hasText(email, message: "O email precisa estar preenchido");
        Assert.isTrue(expression: dataExpiracao.compareTo(LocalDate.now()) <= 0, message: "A data de expiração deve ser no futuro");


        this.conta = conta;
        this.email = email;
        this.dataExpiracao = dataExpiracao;
    }
}
```

## Prática 9: Utilize o CDD
Foi utilizado como guideline:
```java
/**
 * - acoplamento com classes especificas do projeto - 1 ICP
 * - condicionais - 1 ICP
 * - blocos extras de código (try/catch, switch, loops, functions e etc)- 1 ICP
 */
```

Após a contagem verifique se o número de ICPs e verifique com o valor máximo que deve ser utilizado em uma classe combinado com usa Squad. Sempre que atinigr o vaor definido, realize uma refatoração do código para reduzir a complexidade.

## Prática 10: Só alteramos referências que criamos
- só alterar estados de objetos que criamos em nossas classes.
- objetos criados externamente devem ser alterados em sua classe de origem.

## Prática 11: Derive testes de maneira sistemática
- cobrir os casos essenciais iniciamente, cobrindo os caminhos e branchs de decisão
- somente depois partir para outras abordagens
