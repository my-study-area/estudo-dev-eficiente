package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v2;

public class IndexadorAtividadePostgresSearch implements IndexadorAtividade {
    @Override
    public void indexar(Atividade atividade) {
        System.out.println("Indexando atividade: " + atividade);
    }
}
