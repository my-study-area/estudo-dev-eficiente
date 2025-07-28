package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Primary
class SubmeteRespostaParaAnaliseComAmazonSQS implements SubmeteRespostaParaAnalise {

	private AmazonSQS amazonSQS;

	public SubmeteRespostaParaAnaliseComAmazonSQS(AmazonSQS amazonSQS) {
		super();
		this.amazonSQS = amazonSQS;
	}

	@Override
	public void envia(Resposta resposta) {
		System.out.println("Enviando mensagem para fila");
		amazonSQS.send(Map.of("uuid", resposta.getUuid(), "texto",
				resposta.getTexto()));
	}

}
