package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v2;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.function.Supplier;

@Component
public class ExecutaComTransacao {

	@Transactional
	public <T> T comRetorno(Supplier<T> funcao) {
		System.out.println("Simulando abertura de transacao");
		T retorno = funcao.get();
		System.out.println("Simulando commit da transacao");
		return retorno;

	}
}
