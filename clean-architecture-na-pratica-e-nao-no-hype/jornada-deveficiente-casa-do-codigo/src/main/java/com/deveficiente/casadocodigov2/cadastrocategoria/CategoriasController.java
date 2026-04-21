package com.deveficiente.casadocodigov2.cadastrocategoria;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriasController {

	private CadastroNovaCategoria cadastroNovaCategoria;

	public CategoriasController(CadastroNovaCategoria cadastroNovaCategoria) {
		this.cadastroNovaCategoria = cadastroNovaCategoria;
	}

	@PostMapping(value = "/categorias")
	@Transactional
	public String cria(@RequestBody @Valid NovaCategoriaRequest request) {
		Categoria novaCategoria = cadastroNovaCategoria.executa(request);
		return novaCategoria.toString();
	}
		
	

}
