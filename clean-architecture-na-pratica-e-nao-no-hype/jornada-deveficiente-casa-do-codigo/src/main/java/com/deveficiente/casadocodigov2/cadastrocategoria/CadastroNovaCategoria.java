package com.deveficiente.casadocodigov2.cadastrocategoria;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Service
@Validated
public class CadastroNovaCategoria {
    private CategoriaRepository categoriaRepository;

    public CadastroNovaCategoria(CategoriaRepository categoriaRepository) {
        super();
        this.categoriaRepository = categoriaRepository;
    }

    @Transactional
    public Categoria executa(@Valid DadosNovaCategoria request) {
        Categoria categoria = request.toModel();
        categoriaRepository.save(categoria);
        return categoria;
    }
}
