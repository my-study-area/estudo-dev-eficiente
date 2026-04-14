package com.deveficiente.casadocodigov2.novoautor;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Service
@Validated
public class CadastroNovoAutor {
    private AutorRepository autorRepository;

    public CadastroNovoAutor(AutorRepository autorRepository) {
        super();
        this.autorRepository = autorRepository;
    }

    @Transactional
    public Autor executa(@Valid DadosNovoAutor request) {
        Autor autor = request.toModel();
        autorRepository.save(autor);
        return autor;
    }
}
