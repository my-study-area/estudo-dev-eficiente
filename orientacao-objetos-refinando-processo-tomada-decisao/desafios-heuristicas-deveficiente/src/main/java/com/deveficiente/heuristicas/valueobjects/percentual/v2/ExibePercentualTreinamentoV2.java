package com.deveficiente.heuristicas.valueobjects.percentual.v2;

import java.math.RoundingMode;

public class ExibePercentualTreinamentoV2 {

	public static void main(String[] args) {
		TreinamentoV2 treinamentoV2 = new TreinamentoV2(13);

		/*
		 * Como você sabe o numero de casas decimais aqui? Qual 
		 * foi o arrendondamento?
		 * 
		 * Como você pode refatorar para que o retorno possa ser utilizado
		 * de tal maneira que a pessoa não precise olhar a implementação? 
		 */

		//solução 1
		System.out.println(treinamentoV2.percentualCustomizado("email@email.com", 2, RoundingMode.UP));

		//solução 2
		Percentual percentualFeito = treinamentoV2.percentualFeito("email@email.com");
		System.out.println(percentualFeito.calcula(2, RoundingMode.UP));
		System.out.println(percentualFeito.calcula(2, RoundingMode.DOWN));



	}
}
