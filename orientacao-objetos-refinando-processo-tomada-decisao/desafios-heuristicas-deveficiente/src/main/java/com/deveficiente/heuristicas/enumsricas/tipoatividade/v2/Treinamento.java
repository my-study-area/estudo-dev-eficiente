package com.deveficiente.heuristicas.enumsricas.tipoatividade.v2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treinamento {

	private String titulo;
	private SortedSet<SecaoAtividades> secoes = new TreeSet<>();
	private ColecaoSecoesAtividades colecaoSecoesAtividades;

	public Treinamento(String titulo, List<SecaoAtividades> secoes) {
		super();
		this.titulo = titulo;
		secoes.forEach(this.secoes :: add);
		colecaoSecoesAtividades = new ColecaoSecoesAtividades(secoes);
	}
	
	public int calculaQuantidadeAtividadesObrigatorias() {
		return colecaoSecoesAtividades.calculaQuantidadeAtividadesObrigatorias();
	}
	
	public int calculaQuantasObrigatoriasForamFinalizadas(Aluno aluno) {
		return colecaoSecoesAtividades.calculaQuantasObrigatoriasForamFinalizadas(aluno);
	}
	
	public int calculaQuantidadeAtividadesNaoObrigatorias() {
		return colecaoSecoesAtividades.calculaQuantidadeAtividadesNaoObrigatorias();
	}
	
	public BigDecimal calculaPercentualDeAtividadesObrigatorias() {
		return colecaoSecoesAtividades.calculaPercentualDeAtividadesObrigatorias();
	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("aluno1@email.com");
		Aluno aluno2 = new Aluno("aluno2@email.com");
		AtividadeRepository atividadeRepository = new AtividadeRepository();
		
		List<Atividade> atividades = new ArrayList<>();
		Atividade atividade1 = new Atividade("t1", 0, TipoAtividade.EXEMPLO_TRABALHADO);
		atividadeRepository.save(atividade1);
		atividades.add(atividade1);
		atividade1.adicionaResposta(new Resposta(atividade1, aluno1));
		atividade1.adicionaResposta(new Resposta(atividade1, aluno2));
		
		Atividade atividade2 = new Atividade("t2", 1, TipoAtividade.IMITACAO);
		atividadeRepository.save(atividade2);
		atividade2.adicionaResposta(new Resposta(atividade2, aluno1));
		atividades.add(atividade2);


		Atividade atividade3 = new Atividade("t3", 2, TipoAtividade.CONVENCIONAL);
		atividadeRepository.save(atividade3);
		atividade3.adicionaResposta(new Resposta(atividade3, aluno1));
		atividades.add(atividade3);


		SecaoAtividades secaoAtividades = new SecaoAtividades("titulo",1,atividades);

		Treinamento treinamento = new Treinamento("titulo do treinamento", List.of(secaoAtividades));

		System.out.println("Qtd total de atividades: " + treinamento.getQuantidadeTotalAtividades());
		System.out.println("Qtd atividades obrigatórias: " + treinamento.calculaQuantidadeAtividadesObrigatorias());
		System.out.println("Qtd obrigatórias finalizadas pelo aluno1: " + treinamento.calculaQuantasObrigatoriasForamFinalizadas(aluno1));
		System.out.println("Qtd obrigatórias finalizadas pelo aluno2: " + treinamento.calculaQuantasObrigatoriasForamFinalizadas(aluno2));
		System.out.println("Qtd atividades NÃO OBRIGATÓRIAS: " + treinamento.calculaQuantidadeAtividadesNaoObrigatorias());
		System.out.println("Percentual de obrigatórias: " + treinamento.calculaPercentualDeAtividadesObrigatorias());
	}

	private int getQuantidadeTotalAtividades() {
		return this.colecaoSecoesAtividades.getTotalAtividades();
	}


}
