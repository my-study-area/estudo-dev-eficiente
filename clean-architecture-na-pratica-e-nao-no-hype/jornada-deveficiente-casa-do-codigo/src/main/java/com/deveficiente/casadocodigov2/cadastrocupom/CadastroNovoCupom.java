package com.deveficiente.casadocodigov2.cadastrocupom;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class CadastroNovoCupom {

	private CupomRepository cupomRepository;

	public CadastroNovoCupom(CupomRepository cupomRepository) {
		this.cupomRepository = cupomRepository;
	}

	@Transactional
	public Cupom executa(@Valid DadosNovoCupom dados) {
		Cupom novoCupom = dados.toModel();
		cupomRepository.save(novoCupom);
		return novoCupom;
	}
}
