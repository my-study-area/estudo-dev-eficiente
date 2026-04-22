package com.deveficiente.casadocodigov2.detalhelivro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.deveficiente.casadocodigov2.cadastrolivro.Livro;

@RestController
public class DetalheLivroSiteController {

	private BuscaDetalhesLivro buscaDetalhesLivro;

	public DetalheLivroSiteController(BuscaDetalhesLivro buscaDetalhesLivro) {
		this.buscaDetalhesLivro = buscaDetalhesLivro;
	}

	@GetMapping(value = "/produtos/{id}")
	public DetalheSiteLivroResponse detalhe(@PathVariable("id") Long id) {

		Livro livroBuscado = buscaDetalhesLivro.executa(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

		DetalheSiteLivroResponse detalheSiteLivroResponse = new DetalheSiteLivroResponse(
				livroBuscado);
		return detalheSiteLivroResponse;
	}

}
