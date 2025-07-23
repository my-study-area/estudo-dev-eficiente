package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AtividadeRepository {
	
	private List<Atividade> atividades = new ArrayList<>();

	public void salva(Atividade novaAtividade) {
		this.atividades.add(novaAtividade);
	}

}
