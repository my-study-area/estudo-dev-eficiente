## Testes automatizados: revelando bugs de maneira eficiente
### Unindo academia e indústria no mundo dos testes automatizados
- conteúdo inspirado no livro de Maurício Aniche
- visão de industria vs academia. Na academia tentam revelar os bugs e na indústria verica se o código feito está correto.

### Testes: Mitos x Realidade
- A industria indica o uso de TDD
- Não existe uma evidência que TDD traz mais qualidade para o código

### Vamos focar em testes de unidade
- Uma unidade é um ponto de entrada
- combinação de testes de unidade, sistema e integrados

### Técnica \#1: Specification Based Testes
- pensar em testes pensando na especificação
- Regras:
  - identificar os parâmetros de entrada das funções classes e métodos

### Técnica \#2: Boundary Testing
- identificar os valores limites/fronteiras
- Regras:
  - utilizar valores extremos para uma lógica de uma idade, por exemplo 18. Testar com os valores menores e maiores que 18. Utilize com os valores: 10,17, 18, 19 e 30 no mínimo.

### Técnica #3: Começando com structural testing
- Cobertura de código (linha, branch, branch com condições). Testar a estrutura de um código.

### Structural testing: Cobertura por linhas de código
- não utilizaremos esse tipo de testes em nossos estudos

### Structural testing: Cobertura por branches
- branches são: if, switch, loops, etc.
- jacoco utiliza testes por condicional
- utilizar branch cobrindo todas combinações de valores como em: "se condicao1 OU condicao2". Criar testes com combinações de valores. TRUE/FALSE, FALSE/TRUE, TRUE/TRUE, FALSE/FALSE.

### Structural testing: Cobertura por condicionais
- cobrir as condicionais e as branchs.
Cobertura por branch testa se todos os caminhos de decisão (true/false) foram percorridos.
Cobertura por condição testa se cada condição dentro da decisão assumiu true e false pelo menos uma vez.

Exemplo:

```
if (A && B):  # Decisão com duas condições
```

- Branch coverage garante que o if foi testado para true e false.
- Condition coverage garante que A e B foram testados separadamente como true e false.

### Structural testing: Cobertura por branch + condicional

### Structural testing: Cobertura por todos os caminhos e MC/DC
Explicação da técnica: https://www.youtube.com/watch?v=bwtALQVx86w

### Técnica #4: Self testing
Realizar verificações dentro do próprio código.
```java
public void aplicaCupom(Cupom cupom) {
  Assert.isTrue(cupom.valido(),"Olha o cupom que está sendo aplicado não está mais válido");
  Assert.isNull(cupomAplicado,"Olha você não pode trocar um cupom de uma compra");
  this.cupomAplicado = new CupomAplicado(cupom);
}
```

Comentário da aula:

No "Design by Contract" (DbC), conceito introduzido por Bertrand Meyer (criador da linguagem Eiffel), as pré-condições, pós-condições e invariantes formam o "contrato" de um método ou classe.


- As pré-condições devem ser verdadeiras antes da execução de um método.
- As pós-condições devem ser verdadeiras após a execução de um método.
- As invariantes devem ser verdadeiras antes e depois da execução de um método.


A linguagem Eiffel suporta DbC nativamente. Em contraste, Java não tem suporte nativo para DbC, mas podemos implementar algo semelhante usando asserções (ou exceções). Ao utilizar asserções em Java, com a técnica de "Design by Contract" em mente, podemos simplificar o processo de detecção e correção de bugs.

Referência sobre o assunto: https://martinfowler.com/bliki/SelfTestingCode.html

### Técnica #5: Property Based Testing
Property-Based Testing (Teste Baseado em Propriedades) verifica se um código funciona corretamente gerando vários casos de teste automaticamente, em vez de testar apenas exemplos específicos.

```java
import net.jqwik.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PropertyBasedTest {

    // Método a ser testado
    int calcular(int a, int b) {
        return a + b; // Simples soma, pode ser alterado para outras operações
    }

    @Property(tries = 100) // Executa 100 testes automáticos
    void somaSempreMenorQue200(@ForAll @IntRange(min = 0, max = 100) int a,
                                @ForAll @IntRange(min = 0, max = 100) int b) {
        int resultado = calcular(a, b);
        assertTrue(resultado <= 200, "A soma deve ser no máximo 200");
    }

    @Property(tries = 100) // Executa 100 vezes
    void multiplicacaoDentroDosLimites(@ForAll @IntRange(min = 0, max = 100) int a,
                                       @ForAll @IntRange(min = 0, max = 100) int b) {
        int resultado = a * b;
        assertTrue(resultado >= 0 && resultado <= 10000, "O produto deve estar entre 0 e 10.000");
    }
}
```
Exemplo de uso de Rafael Pontes do [Linkedin](https://www.linkedin.com/posts/rponte_jqwik-activity-7290355568723042306--9Nc/?utm_source=share&utm_medium=member_desktop&rcm=ACoAAAfm0E8BHZBHyafH5dJvcNZWg08QZfPcTMc): https://gist.github.com/rponte/cb1f027f89f964a3def81978eb3f25bc

### Pragmatismo e estratégia de testes
- gerar testes com pouca "dor"
- utilização de mocks em equilibrio
- escrever código para facilitar a escrita de testes?

### 0015 testes pirâmide de testes
- **teste de unidade**: pode ser um método ou uma classe e são rápidos de executar
- **teste integrados**: mais custuzo e temos que popular e genrênciar os registro na base de dados
- **testes de sitema**: subir um sistema e suas dependências e validar.
- teste manuais durante o desenvolvimento

### Testes de unidade o mais integrado possível
- evitar o uso de mocks para casos em que a criação da instância seja simples. Ex: criação de excetions lançadas pelo framework.
- nos casos complexos que trazem mais carga cognitiva utilizar bibliotecas como Mockito

### Mocks: Como, quando e até onde usar
- testes de unidade estão distantes do uso real em um sistema por representarem uma pequena parte do comportamento de uma funcionalidade
- procure criar as instâncias usando o new da linguagem e ter os estados reais de um objeto. O uso de mock nos testes de unidade pode deixar os testes de unidade mais distante do comportamento real

### Combinando testes de API com Property Based Testing
- combinação de testes de API com a técnica Property Based Testing para conseguir explorar os fluxos da nossa aplicação com valores gerados automaticamente
- use testes de api com o comportamento completo e complemente com uso de uma biblioteca como jqwik para gerar variações dos valores de entrada

```java
package com.deveficiente.casadocodigov2.fechamentocompra;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import com.deveficiente.casadocodigov2.cadastrocupom.Cupom;
import com.deveficiente.casadocodigov2.paisestado.Estado;
import com.deveficiente.casadocodigov2.paisestado.Pais;

public class CupomValidoValidatorTest {

	private CupomRepository cupomRepository  = Mockito.mock(CupomRepository.class);
	private List<NovoPedidoItemRequest> itens = List.of(new NovoPedidoItemRequest(1l, 10));
	private NovoPedidoRequest pedidoRequest = new NovoPedidoRequest(BigDecimal.TEN, itens);
	private NovaCompraRequest request = new NovaCompraRequest("email@email.com", "nome",
			"sobrenome", "8967548654", "endereco", "complemento", "cidade",
			1l, "987454778", "54534534", pedidoRequest);
	
	@Test
	@DisplayName("deveria parar caso o cupom esteja invalido")
	void teste1() throws Exception {
		Cupom cupom = new Cupom("codigo", BigDecimal.TEN, LocalDate.now().plusDays(1));
		//o cupom precisa ficar com uma validade para trás do dia de hoje
		ReflectionTestUtils.setField(cupom, "validade", LocalDate.now().minusDays(1));
		
		request.setCodigoCupom("codigo");
		Mockito.when(cupomRepository.getByCodigo("codigo")).thenReturn(cupom);
		
		
		Errors errors = new BeanPropertyBindingResult(request , "target");
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertTrue(errors.getAllErrors().size() == 1);
		Assertions.assertEquals("Este cupom não é mais válido",errors.getFieldError("codigoCupom").getDefaultMessage());
	}
	
	@Test
	@DisplayName("deveria passar caso o cupom esteja válido")
	void teste2() throws Exception {
		Cupom cupom = new Cupom("codigo", BigDecimal.TEN, LocalDate.now().plusDays(1));
		
		request.setCodigoCupom("codigo");
		Mockito.when(cupomRepository.getByCodigo("codigo")).thenReturn(cupom);
		
		
		Errors errors = new BeanPropertyBindingResult(request , "target");
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertFalse(errors.hasErrors());
	}
	
	@Test
	@DisplayName("deveria passar caso nao tenha codigo de cupom")
	void teste3() throws Exception {
		Errors errors = new BeanPropertyBindingResult(request , "target");
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertFalse(errors.hasErrors());
	}
	
	@Test
	@DisplayName("deveria parar caso já tenha erro")
	void teste4() throws Exception {
		Errors errors = new BeanPropertyBindingResult(request , "target");
		errors.reject("codigo");
		
		CupomValidoValidator validador = new CupomValidoValidator(cupomRepository);
		validador.validate(request, errors);
		
		Assertions.assertTrue(errors.getAllErrors().size() == 1);
		Assertions.assertEquals("codigo",errors.getGlobalErrors().get(0).getCode());
	}	
	
}
```

### Design de código voltado para testabilidade
- Usar CDD nas classes de testes

### Sugestão de como realizar testes dentro da Jornada
- boundary test
- structural testing (MCDC)
- property base testing
- self testing
- prioridade nos testes de unidade mais integrado o possível
- testes de apis

```java
// testar campos privados
ReflectionTestUtils.saetField(objeto, "propriedade", "novo valor");

// evitar testes logicos usando recursos da linguagem. NO exemplo para evitar NullPointerException
Optional.ofNullable(nome).orElse("Nome Padrão");
```

exemplo: https://github.com/forks-projects/pilares-design-codigo/blob/master/playbook-testes-automatizados-jornada-4.md

### Reforçando: Vamos buscar testes de unidade mais integrados
- testes de unidade integrados, utilizandos os objetos reais, sem mock ou stubs

### Você precisa ser fluente com as tecnologias de testes
- dominar a ferramenta de testes

### Certificado
https://dev-eficiente.memberkit.com.br/certificates/GLDJEm

