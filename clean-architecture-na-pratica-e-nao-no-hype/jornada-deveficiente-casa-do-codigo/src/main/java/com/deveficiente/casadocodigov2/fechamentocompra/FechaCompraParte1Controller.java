package com.deveficiente.casadocodigov2.fechamentocompra;

import javax.validation.Valid;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FechaCompraParte1Controller {

	private EstadoPertenceAPaisValidator estadoPertenceAPaisValidator;
	private CupomValidoValidator cupomValidoValidator;
	private FechaNovaCompra fechaNovaCompra;

	public FechaCompraParte1Controller(
			EstadoPertenceAPaisValidator estadoPertenceAPaisValidator,
			CupomValidoValidator cupomValidoValidator,
			FechaNovaCompra fechaNovaCompra) {
		this.estadoPertenceAPaisValidator = estadoPertenceAPaisValidator;
		this.cupomValidoValidator = cupomValidoValidator;
		this.fechaNovaCompra = fechaNovaCompra;
	}

	@InitBinder
	public void init(WebDataBinder binder) {
		binder.addValidators(estadoPertenceAPaisValidator, cupomValidoValidator);
	}

	@PostMapping(value = "/compras")
	public String cria(@RequestBody @Valid NovaCompraRequest request) {

		Compra novaCompra = fechaNovaCompra.executa(request);

		return novaCompra.toString();
	}

}
