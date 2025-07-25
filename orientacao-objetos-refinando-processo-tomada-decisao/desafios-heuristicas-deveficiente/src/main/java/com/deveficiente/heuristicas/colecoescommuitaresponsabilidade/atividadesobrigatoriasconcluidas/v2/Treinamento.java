package com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v2;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treinamento {

	private String titulo;
	private SortedSet<SecaoAtividades> secoes = new TreeSet<>();
	private static BigDecimal PERCENTUAL_MULTIPLICACAO = new BigDecimal(100);

	public Treinamento(String titulo, List<SecaoAtividades> secoes) {
		super();
		this.titulo = titulo;
		secoes.forEach(this.secoes :: add);
	}

	/**
	 * Relacionamento entre as classes
	 * Treinamento > []secoes atividades > []atividades > opcional/obrigatoria
	 *
	 */
	public int calculaQuantidadeAtividadesObrigatorias() {
		return getAtividadesObrigatorias().size();
	}

	private SortedSet<Atividade> getAtividadesObrigatorias() {
		SortedSet<Atividade> atividadesObrigatorias = new TreeSet<>();
		for (Atividade atividade : getTodasAtividades()) {
			if (atividade.getTipoAtividade() == TipoAtividade.OPCIONAL) continue;
			atividadesObrigatorias.add(atividade);
		}
		return atividadesObrigatorias;
	}

	private SortedSet<Atividade> getTodasAtividades() {
		SortedSet<Atividade> todasAtividades = new TreeSet<>();
		for (SecaoAtividades secaoAtividades : secoes) {
			SortedSet<Atividade> atividades = secaoAtividades.getAtividades();
			todasAtividades.addAll(atividades);
		}
		return todasAtividades;
	}

	public int calculaQuantasObrigatoriasForamFinalizadas(Aluno aluno) {
		int total = 0;
		for (Atividade atividade : getAtividadesObrigatorias()) {
			List<Resposta> respostas = atividade.getRespostas();
			if (respostas.isEmpty()) continue;
			for (Resposta resposta : respostas) {
                if (resposta.pertenceAoAluno(aluno)) {
                    total+=1;
                }
			}
		}
		return total;
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

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("aluno1@email.com");
		Aluno aluno2 = new Aluno("aluno2@email.com");
		AtividadeRepository atividadeRepository = new AtividadeRepository();
		
		List<Atividade> atividades = new ArrayList<>();
		Atividade atividade1 = new Atividade("t1", 0, TipoAtividade.OPCIONAL);
		atividadeRepository.save(atividade1);
		atividades.add(atividade1);
		atividade1.adicionaResposta(new Resposta(atividade1, aluno1));
		atividade1.adicionaResposta(new Resposta(atividade1, aluno2));
		
		Atividade atividade2 = new Atividade("t2", 1, TipoAtividade.OPCIONAL);
		atividadeRepository.save(atividade2);
		atividade2.adicionaResposta(new Resposta(atividade2, aluno1));
		atividades.add(atividade2);
		
		
		Atividade atividade3 = new Atividade("t3", 2, TipoAtividade.OBRIGATORIA);
		atividadeRepository.save(atividade3);
		atividades.add(atividade3);

		Atividade atividade4 = new Atividade("t4", 3, TipoAtividade.OBRIGATORIA);
		atividade4.adicionaResposta(new Resposta(atividade4, aluno1));
		atividade4.adicionaResposta(new Resposta(atividade4, aluno2));
		atividadeRepository.save(atividade4);
		atividades.add(atividade4);

		SecaoAtividades secaoAtividades = new SecaoAtividades("titulo",1,atividades);

		Treinamento treinamento = new Treinamento("titulo do treinamento", List.of(secaoAtividades));

		imprimirValidacaoDosValores(treinamento, aluno1);

	}

	private static void imprimirValidacaoDosValores(Treinamento treinamento, Aluno aluno) {
		System.out.println("Total de atividades: " + treinamento.getTodasAtividades().size());
		System.out.println("Total de atividades obrigatórias: " + treinamento.calculaQuantidadeAtividadesObrigatorias());
		System.out.println("Total de atividades obrigatórias finalizadas pelo aluno `" + aluno.getEmail() +"`: " + treinamento.calculaQuantasObrigatoriasForamFinalizadas(aluno));
		System.out.println("Percentual de atividade obrigatórias: " + treinamento.calculaPercentualDeAtividadesObrigatorias() + "%");
	}



}
