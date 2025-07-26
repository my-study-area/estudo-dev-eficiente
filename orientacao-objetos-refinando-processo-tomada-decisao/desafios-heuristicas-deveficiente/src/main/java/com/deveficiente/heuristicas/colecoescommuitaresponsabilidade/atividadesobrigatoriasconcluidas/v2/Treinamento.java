package com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v2;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Treinamento {

	private String titulo;
	private ColecaoSecoesAtividades colecaoSecoesAtividades;

	public Treinamento(String titulo, List<SecaoAtividades> listaSecoesAtividades) {
		super();
		this.titulo = titulo;
		this.colecaoSecoesAtividades = new ColecaoSecoesAtividades(listaSecoesAtividades);
	}

	private int getTotalAtividades() {
		return colecaoSecoesAtividades.getTotalAtividades();
	}

	public int calculaQuantidadeAtividadesObrigatorias() {
		return colecaoSecoesAtividades.calculaQuantidadeAtividadesObrigatorias();
	}

	public int calculaQuantasObrigatoriasForamFinalizadas(Aluno aluno) {
		return colecaoSecoesAtividades.calculaQuantasObrigatoriasForamFinalizadas(aluno);
	}

	public BigDecimal calculaPercentualDeAtividadesObrigatorias() {
		return colecaoSecoesAtividades.calculaPercentualDeAtividadesObrigatorias();
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
		System.out.println("Total de atividades: " + treinamento.getTotalAtividades());
		System.out.println("Total de atividades obrigatórias: " + treinamento.calculaQuantidadeAtividadesObrigatorias());
		System.out.println("Total de atividades obrigatórias finalizadas pelo aluno `" + aluno.getEmail() +"`: " + treinamento.calculaQuantasObrigatoriasForamFinalizadas(aluno));
		System.out.println("Percentual de atividade obrigatórias: " + treinamento.calculaPercentualDeAtividadesObrigatorias() + "%");
	}



}
