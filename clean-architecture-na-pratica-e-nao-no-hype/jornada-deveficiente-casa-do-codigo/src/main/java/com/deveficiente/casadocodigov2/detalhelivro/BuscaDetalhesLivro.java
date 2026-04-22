package com.deveficiente.casadocodigov2.detalhelivro;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.deveficiente.casadocodigov2.cadastrolivro.Livro;
import com.deveficiente.casadocodigov2.cadastrolivro.LivroRepository;

@Service
public class BuscaDetalhesLivro {

	private LivroRepository livroRepository;

	public BuscaDetalhesLivro(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public Optional<Livro> executa(Long id) {
		return livroRepository.findById(id);
	}
}
