package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.naoseiqualfilausar.v2;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecebeRespostaExercicioController {

	private RespostaRepository respostaRepository;
	private ExercicioRepository exercicioRepository;
	private SubmeteRespostaParaAnalise submeteRespostaParaAnalise;

	public RecebeRespostaExercicioController(
			RespostaRepository respostaRepository,
			ExercicioRepository exercicioRepository, SubmeteRespostaParaAnalise submeteRespostaParaAnalise) {
		super();
		this.respostaRepository = respostaRepository;
		this.exercicioRepository = exercicioRepository;
		this.submeteRespostaParaAnalise = submeteRespostaParaAnalise;
	}

	@PostMapping("/recebe-resposta/v1")
	public void executa(NovaRespostaRequest request) {

		Resposta novaResposta = request.toResposta(exercicioRepository);
		respostaRepository.salva(novaResposta);
		
		/*
		 * Agora é necessário mandar essa nova resposta para uma fila. 
		 * Posteriormente essa resposta vai ser analisada por um modelo de
		 * aprendizado de máquina que vai tentar aplicar uma correção 
		 * automágica para a resposta. 
		 * 
		 * Neste momento queremos usar o SQS da amazon, mas essa não é 
		 * uma decisão que temos certeza se queremos manter no futuro. Você 
		 * precisa resolver aqui esse fluxo fazendo com que seu código expresse
		 * a mesma preocupação que foi relatada neste texto. 
		 * 
		 */

		this.submeteRespostaParaAnalise.envia(novaResposta);
	}

	public static void main(String[] args) {
		RecebeRespostaExercicioController controller = new RecebeRespostaExercicioController(
				new RespostaRepository(),
				new ExercicioRepository(),
				new SubmeteComAmazonSQS(new AmazonSQS())
		);

		controller.executa(new NovaRespostaRequest(1L, "Resposta"));

		/**
		 * Como o controller receber um SubmeteRespostaParaAnalise que é uma interface com somente um método,
		 * chamamos isso de interface funcional e podemos utilizar conforme o exemplo abaixo.
		 */
		RecebeRespostaExercicioController controller2 = new RecebeRespostaExercicioController(
				new RespostaRepository(),
				new ExercicioRepository(),
				resposta -> System.out.println("Alguma outra coisa.")
		);
		controller2.executa(new NovaRespostaRequest(2L, "Resposta 2"));
	}
}
