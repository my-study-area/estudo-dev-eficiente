package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v2;

public class Atividade {

	private String texto;

	public Atividade(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Atividade{" +
				"texto='" + texto + '\'' +
				'}';
	}
}
