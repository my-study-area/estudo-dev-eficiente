package com.deveficiente.casadocodigov2.cadastrolivro;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosController {
	
	private CadastroNovoLivro cadastroNovoLivro;

	public LivrosController(CadastroNovoLivro cadastroNovoLivro) {
		this.cadastroNovoLivro = cadastroNovoLivro;
	}

	@PostMapping(value = "/livros")
	@Transactional
	//1
	public String cria(@RequestBody @Valid NovoLivroRequest request) {
		Livro novoLivro = cadastroNovoLivro.executa(request);
		return novoLivro.toString();
	}

}
