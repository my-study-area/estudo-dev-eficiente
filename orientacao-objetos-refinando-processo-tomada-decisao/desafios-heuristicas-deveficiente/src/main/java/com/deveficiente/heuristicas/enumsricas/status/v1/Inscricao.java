package com.deveficiente.heuristicas.enumsricas.status.v1;

import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;
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

	public void adicionaResposta(@NotNull Resposta resposta) {
		Assert.notNull(resposta, "Resposta deve existir");
		this.respostas.add(resposta);
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
		int totalAtividades = this.treinamento.getQuantidadeAtividades();
		int quantidadeRespostas = this.respostas.size();

		if(quantidadeRespostas == 0) {
			return StatusProgresso.NAO_INICIADO;
		} else if (quantidadeRespostas <  totalAtividades) {
			return StatusProgresso.INICIADO;
		}

		return StatusProgresso.FINALIZADO;
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
		Resposta resposta1 = new Resposta(inscricao, atividade1);
		Resposta resposta2 = new Resposta(inscricao, atividade2);
		Resposta resposta3 = new Resposta(inscricao, atividade3);

		inscricao.adicionaResposta(resposta1);
		inscricao.adicionaResposta(resposta2);
		inscricao.adicionaResposta(resposta3);

		inscricao2.adicionaResposta(resposta1);

		System.out.println(inscricao.calculaProgresso());
		System.out.println(inscricao2.calculaProgresso());
		System.out.println(inscricao3.calculaProgresso());
	}

}
