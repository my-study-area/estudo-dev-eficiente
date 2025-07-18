package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

import org.springframework.util.Assert;

import java.util.Optional;

public class NovoClienteRequest {

	private String nomePais;
	private String nomeEstado;

	public NovoClienteRequest(String nomePais) {
		//país é obrigatório no cadastro
		super();
		Assert.notNull(nomePais, "Nome do pais não pode ser nulo");
		this.nomePais = nomePais;
	}
	
	public void setEstado(String nomeEstado) {
		//estado é opcional
		this.nomeEstado = nomeEstado;
	}

	public String getNomePais() {
		return nomePais;
	}

	public Optional<String > getPossivelNomeEstado() {
		return Optional.ofNullable(nomeEstado);
	}
}
