package com.deveficiente.casadocodigov2.novoautor;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//3
public class AutoresController {
	
	private CadastroNovoAutor cadastroNovoAutor;

	public AutoresController(CadastroNovoAutor cadastroNovoAutor) {
		this.cadastroNovoAutor = cadastroNovoAutor;
	}

	@PostMapping(value = "/autores")
	@Transactional
	//1
	//2
	public String cria(@RequestBody @Valid DadosNovoAutor request) {
		//1
		Autor autor = cadastroNovoAutor.executa(request);
		return autor.toString();
	}

	
}
