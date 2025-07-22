package com.deveficiente.heuristicas.valueobjects.cpf.v1;

public class Cliente {

	private CPFLimpo cpf;

	public Cliente(CPFLimpo cpf) {
		super();
		this.cpf = cpf;
	}


	public String getCpfLimpo() {
		return cpf.getCPFLimpo();
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"cpf=" + cpf +
				'}';
	}
}
