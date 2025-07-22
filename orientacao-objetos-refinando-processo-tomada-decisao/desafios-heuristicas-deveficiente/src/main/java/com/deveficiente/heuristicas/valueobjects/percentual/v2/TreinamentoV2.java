package com.deveficiente.heuristicas.valueobjects.percentual.v2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class TreinamentoV2 {

	private int numeroDeAulas;
	private Map<String, Integer> aulasFeitasPorAluno = new HashMap<>();

	public TreinamentoV2(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
	}

	public Percentual percentualFeito(String emailAluno) {
		// aqui é só para simular
		return new Percentual(numeroDeAulas/2, numeroDeAulas);
	}

	public BigDecimal percentualCustomizado(String emailAluno, int tamanho, RoundingMode arredondamento) {
		return new BigDecimal(numeroDeAulas / 2).divide(
				new BigDecimal(numeroDeAulas), tamanho, arredondamento);
	}

}
