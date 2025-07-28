package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class RespostaRepository {
	
	private List<Resposta> respostas = new ArrayList<>();

	public void salva(Resposta resposta) {
		try {
			System.out.println("Aguardando o tempo para persistir no banco de dados");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		respostas.add(resposta);
	}

}
