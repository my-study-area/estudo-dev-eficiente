package com.deveficiente.heuristicas.enumsricas.status.v2;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {

	private Treinamento treinamento;
	private Aluno aluno;
	private List<Resposta> respostas = new ArrayList<>();

	public Inscricao(Aluno aluno, Treinamento treinamento) {
		super();
		this.aluno = aluno;
		this.treinamento = treinamento;
	}

	public void adicionaResposta(Atividade atividade) {
		this.respostas.add(new Resposta(this, atividade));
	}

	public boolean jaRespondeu() {
		return !this.respostas.isEmpty();
	}

	public boolean respondeuTudo() {
		return this.treinamento.estaTodoRespondido(respostas);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result
				+ ((treinamento == null) ? 0 : treinamento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscricao other = (Inscricao) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (treinamento == null) {
			if (other.treinamento != null)
				return false;
		} else if (!treinamento.equals(other.treinamento))
			return false;
		return true;
	}

	public StatusProgresso calculaProgresso() {
		/*
		 * Existem 3 possibilidades de progresso:
		 * 
		 * 1) Não começou 2) Começou 3) Finalizou
		 * 
		 * Só que esses status podem evoluir com o tempo. Pode ser que no futuro
		 * seja importante saber quem passou da metade.
		 * 
		 * Como você vai resolver isso aqui?
		 */

		return StatusProgresso.descobre(this);
	}

	public static void main(String[] args) {
		Atividade atividade1 = new Atividade("atividade 1");
		Atividade atividade2 = new Atividade("atividade 2");
		Atividade atividade3 = new Atividade("atividade 3");

		Treinamento treinamento = new Treinamento("titulo", List.of(atividade1, atividade2, atividade3));
		Treinamento treinamento2 = new Treinamento("treinamento 2", List.of(atividade1, atividade2));
		Treinamento treinamento3 = new Treinamento("treinamento 3", List.of(atividade3));

		Aluno aluno = new Aluno("pessoa@deveficiente.com");

		Inscricao inscricao = new Inscricao(aluno,treinamento);
		Inscricao inscricao2 = new Inscricao(aluno,treinamento2);
		Inscricao inscricao3 = new Inscricao(aluno,treinamento3);

		//faça o código para adicionar uma resposta numa inscricao

		inscricao.adicionaResposta(atividade1);
		inscricao.adicionaResposta(atividade2);
		inscricao.adicionaResposta(atividade3);

		inscricao2.adicionaResposta(atividade1);

		System.out.println(inscricao.calculaProgresso());
		System.out.println(inscricao2.calculaProgresso());
		System.out.println(inscricao3.calculaProgresso());
	}

}
