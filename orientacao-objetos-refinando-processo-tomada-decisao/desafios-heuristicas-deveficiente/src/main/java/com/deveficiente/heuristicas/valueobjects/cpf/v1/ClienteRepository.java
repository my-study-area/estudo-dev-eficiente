package com.deveficiente.heuristicas.valueobjects.cpf.v1;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {


	public Cliente busca(Long id) {
		return new Cliente(CPFLimpo.criar(String.valueOf("985746985643")));
	}
}
