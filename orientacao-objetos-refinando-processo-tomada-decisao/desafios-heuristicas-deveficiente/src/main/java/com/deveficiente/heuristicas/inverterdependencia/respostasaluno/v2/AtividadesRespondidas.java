package com.deveficiente.heuristicas.inverterdependencia.respostasaluno.v2;

import java.util.List;

public interface AtividadesRespondidas {

    List<Atividade> buscarAtividadesRespondidasPorAlunoNumaSecaoAtividade(Aluno aluno, SecaoAtividades secaoAtividades);
}
