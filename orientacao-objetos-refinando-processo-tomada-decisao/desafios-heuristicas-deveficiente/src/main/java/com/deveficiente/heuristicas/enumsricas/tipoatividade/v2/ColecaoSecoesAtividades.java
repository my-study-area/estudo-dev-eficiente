package com.deveficiente.heuristicas.enumsricas.tipoatividade.v2;

import com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v2.Aluno;
import com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v2.Atividade;
import com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v2.Resposta;
import com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v2.SecaoAtividades;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ColecaoSecoesAtividades {
    private List<SecaoAtividades> secoes;
    private BigDecimal PERCENTUAL_MULTIPLICACAO = new BigDecimal(100);

    public ColecaoSecoesAtividades(List<SecaoAtividades> secoes) {
        this.secoes = secoes;
    }

    private SortedSet<Atividade> getTodasAtividades() {
        SortedSet<Atividade> todasAtividades = new TreeSet<>();
        for (SecaoAtividades secaoAtividades : secoes) {
            SortedSet<Atividade> atividades = secaoAtividades.getAtividades();
            todasAtividades.addAll(atividades);
        }
        return todasAtividades;
    }

    public int getTotalAtividades() {
        return getTodasAtividades().size();
    }

    public int calculaQuantidadeAtividadesObrigatorias() {
        return getAtividadesObrigatorias().size();
    }

    public SortedSet<Atividade> getAtividadesObrigatorias() {
        SortedSet<Atividade> atividadesObrigatorias = new TreeSet<>();
        for (Atividade atividade : getTodasAtividades()) {
            if (atividade.isOpcional()) continue;
            atividadesObrigatorias.add(atividade);
        }
        return atividadesObrigatorias;
    }

    public int calculaQuantasObrigatoriasForamFinalizadas(Aluno aluno) {
        List<Resposta> respostasObrigatoriasFinalizadas = new ArrayList<>();
        for (Atividade atividade : getAtividadesObrigatorias()) {
            List<Resposta> respostas = atividade.getRespostas();
            List<Resposta> respostasFiltradas = getRespostasPorAluno(aluno, respostas);
            respostasObrigatoriasFinalizadas.addAll(respostasFiltradas);
        }
        return respostasObrigatoriasFinalizadas.size();
    }

    private List<Resposta> getRespostasPorAluno(Aluno aluno, List<Resposta> respostas) {
        List<Resposta> respostasFiltradasPorAluno = new ArrayList<>();
        for (Resposta resposta : respostas) {
            if (resposta.pertenceAoAluno(aluno)) {
                respostasFiltradasPorAluno.add(resposta);
            }
        }
        return respostasFiltradasPorAluno;
    }

    public BigDecimal calculaPercentualDeAtividadesObrigatorias() {
        int total = getTodasAtividades().size();
        int obrigatorias = getAtividadesObrigatorias().size();

        if (total == 0) {
            return BigDecimal.ZERO;
        }

        return BigDecimal.valueOf(obrigatorias)
                .multiply(PERCENTUAL_MULTIPLICACAO)
                .divide(BigDecimal.valueOf(total), RoundingMode.CEILING);
    }
}
