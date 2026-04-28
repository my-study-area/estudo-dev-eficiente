package com.deveficiente.casadocodigov2.fechamentocompra;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.deveficiente.casadocodigov2.cadastrocupom.CupomRepository;
import com.deveficiente.casadocodigov2.cadastrolivro.LivroRepository;
import com.deveficiente.casadocodigov2.paisestado.EstadoRepository;
import com.deveficiente.casadocodigov2.paisestado.PaisRepository;

@Service
@Validated
public class FechaNovaCompra {

	private CompraRepository compraRepository;
	private PaisRepository paisRepository;
	private EstadoRepository estadoRepository;
	private LivroRepository livroRepository;
	private CupomRepository cupomRepository;

	public FechaNovaCompra(CompraRepository compraRepository,
			PaisRepository paisRepository, EstadoRepository estadoRepository,
			LivroRepository livroRepository, CupomRepository cupomRepository) {
		this.compraRepository = compraRepository;
		this.paisRepository = paisRepository;
		this.estadoRepository = estadoRepository;
		this.livroRepository = livroRepository;
		this.cupomRepository = cupomRepository;
	}

	@Transactional
	public Compra executa(@Valid DadosNovaCompra dados) {
		Compra novaCompra = dados.toModel(
				id -> paisRepository.findById(id).get(),
				id -> estadoRepository.findById(id).get(),
				id -> livroRepository.findById(id).get(),
				codigo -> cupomRepository.getByCodigo(codigo)
		);
		
		compraRepository.save(novaCompra);
		return novaCompra;
	}

}
