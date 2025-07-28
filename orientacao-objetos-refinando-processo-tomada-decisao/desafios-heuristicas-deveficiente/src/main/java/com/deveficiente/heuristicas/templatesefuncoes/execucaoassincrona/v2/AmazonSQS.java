package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v2;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AmazonSQS {

	public void send(Map<String, Object> props) {
		System.out.println("Enviando as informacoes para fila SQS: "+props);
    }
}
