package com.deveficiente.casadocodigov2.paisestado;

import javax.validation.constraints.NotBlank;

import com.deveficiente.casadocodigov2.compartilhado.UniqueValue;

public class NovoPaisRequest implements DadosNovoPais {

	@NotBlank
	@UniqueValue(domainClass = Pais.class,fieldName =  "nome")
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public Pais toModel() {
		return new Pais(nome);
	}
}
