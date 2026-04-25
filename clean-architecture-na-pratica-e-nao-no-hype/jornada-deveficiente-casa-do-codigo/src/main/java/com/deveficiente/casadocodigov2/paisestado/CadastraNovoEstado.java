package com.deveficiente.casadocodigov2.paisestado;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class CadastraNovoEstado {

	private EstadoRepository estadoRepository;
	private PaisRepository paisRepository;

	public CadastraNovoEstado(EstadoRepository estadoRepository, PaisRepository paisRepository) {
		this.estadoRepository = estadoRepository;
		this.paisRepository = paisRepository;
	}

	@Transactional
	public Estado executa(@Valid DadosNovoEstado dados) {
		Estado novoEstado = dados.toModel(
				id -> paisRepository.findById(id).orElseThrow());
		estadoRepository.save(novoEstado);
		return novoEstado;
	}
}

