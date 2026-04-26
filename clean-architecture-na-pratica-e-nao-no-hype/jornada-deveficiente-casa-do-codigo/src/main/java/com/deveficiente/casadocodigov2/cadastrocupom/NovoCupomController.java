package com.deveficiente.casadocodigov2.cadastrocupom;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoCupomController {

	private CadastroNovoCupom cadastroNovoCupom;

	public NovoCupomController(CadastroNovoCupom cadastroNovoCupom) {
		this.cadastroNovoCupom = cadastroNovoCupom;
	}

	@PostMapping(value = "/cupons")
	public String cria(@RequestBody @Valid NovoCupomRequest request) {

		Cupom novoCupom = cadastroNovoCupom.executa(request);

		return novoCupom.toString();
	}

}
