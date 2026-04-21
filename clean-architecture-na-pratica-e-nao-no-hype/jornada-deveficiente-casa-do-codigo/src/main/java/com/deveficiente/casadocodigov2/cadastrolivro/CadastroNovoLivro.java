package com.deveficiente.casadocodigov2.cadastrolivro;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.deveficiente.casadocodigov2.cadastrocategoria.Categoria;
import com.deveficiente.casadocodigov2.novoautor.Autor;

@Service
@Validated
public class CadastroNovoLivro {

    private LivroRepository livroRepository;
    private BuscadorDeEntidades buscadorDeEntidades;

    public CadastroNovoLivro(LivroRepository livroRepository, BuscadorDeEntidades buscadorDeEntidades) {
        this.livroRepository = livroRepository;
        this.buscadorDeEntidades = buscadorDeEntidades;
    }

    @Transactional
    public Livro executa(@Valid DadosNovoLivro request) {
        Livro novoLivro = request.toModel(
                id -> buscadorDeEntidades.buscaPorId(Autor.class, id),
                id -> buscadorDeEntidades.buscaPorId(Categoria.class, id));
        livroRepository.save(novoLivro);
        return novoLivro;
    }
}
