package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

public class Pais {

	private String nome;

	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Pais pais)) return false;

        return nome.equals(pais.nome);
	}

	@Override
	public int hashCode() {
		return nome.hashCode();
	}
}
