package com.deveficiente.casadocodigov2.cadastrolivro;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.deveficiente.casadocodigov2.cadastrocategoria.CategoriaRepository;
import com.deveficiente.casadocodigov2.novoautor.AutorRepository;

@Service
@Validated
public class CadastroNovoLivro {

    private LivroRepository livroRepository;
    private AutorRepository autorRepository;
    private CategoriaRepository categoriaRepository;

    public CadastroNovoLivro(LivroRepository livroRepository, AutorRepository autorRepository,
            CategoriaRepository categoriaRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Transactional
    public Livro executa(@Valid DadosNovoLivro request) {
        Livro novoLivro = request.toModel(
                id -> autorRepository.findById(id).orElse(null),
                id -> categoriaRepository.findById(id).orElse(null));
        livroRepository.save(novoLivro);
        return novoLivro;
    }
}
