package com.deveficiente.casadocodigov2.paisestado;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriaPaisController {

	private CadastraNovoPais cadastraNovoPais;

	public CriaPaisController(CadastraNovoPais cadastraNovoPais) {
		this.cadastraNovoPais = cadastraNovoPais;
	}

	@PostMapping(value = "/paises")
	public String criaPais(@RequestBody @Valid NovoPaisRequest request) {
		Pais novoPais = cadastraNovoPais.executa(request);
		return novoPais.toString();
	}

}

