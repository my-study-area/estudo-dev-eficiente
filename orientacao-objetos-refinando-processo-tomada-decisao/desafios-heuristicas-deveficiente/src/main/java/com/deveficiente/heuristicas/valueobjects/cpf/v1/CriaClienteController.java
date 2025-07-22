package com.deveficiente.heuristicas.valueobjects.cpf.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

//@RestController
public class CriaClienteController {

//	@PostMapping("/cpf/v1")
	public void executa(String cpf) {
		/*
		 * Como você sabe se é para passar o cpf é com pontuação ou sem? Como você vai 
		 * facilitar a vida de quem vai usar essa classe?	
		 */
		CPFLimpo cpfLimpo = CPFLimpo.criar(cpf);
		Cliente cliente = new Cliente(cpfLimpo);
		System.out.println(cliente);
	}

	public static void main(String[] args) {
		@NotBlank String cpf = "62578281041";
		CPFLimpo cpfLimpo = CPFLimpo.criar(cpf);
		Cliente cliente = new Cliente(cpfLimpo);
		System.out.println(cliente);
	}
	
}
