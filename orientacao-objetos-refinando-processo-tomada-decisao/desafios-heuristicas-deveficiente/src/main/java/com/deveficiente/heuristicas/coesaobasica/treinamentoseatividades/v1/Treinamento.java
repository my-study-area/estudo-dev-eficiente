package com.deveficiente.heuristicas.coesaobasica.treinamentoseatividades.v1;

import java.util.ArrayList;
import java.util.List;

public class Treinamento {

	private String titulo;
	private List<String> titulosAtividades = new ArrayList<>();

	public Treinamento(String titulo) {
		super();
		this.titulo = titulo;
	}

	public void adicionarAtividade(String tituloAtividade) {
		titulosAtividades.add(tituloAtividade);
	}

	public int getPosicao(String tituloAtividade) {
		if (!titulosAtividades.contains(tituloAtividade)) {
			throw new IllegalArgumentException("Titulo não encontrado");
		}
		return titulosAtividades.indexOf(tituloAtividade);
	}

	public static void main(String[] args) {
		Treinamento testeDeFogo = new Treinamento("teste de fogo para você");
		
		/*
		 * Primeiro passo é vocé implementar a adição de titulos de atividades
		 * dentro do treinamento. Como você faria? 
		 */

		testeDeFogo.adicionarAtividade("atividade 01");
		testeDeFogo.adicionarAtividade("atividade 02");
		testeDeFogo.adicionarAtividade("atividade 03");

		/*
		 * Uma vez que você implementou a adição de titulos de atividades,
		 * é necessário que você possibilite a descoberta da posicao do titulo
		 * da atividade dentro do treinamento. 
		 */

		int posicao = testeDeFogo.getPosicao("atividade 01");

		System.out.println("Posição da atividade é " + posicao);
	}

}
