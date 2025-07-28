package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.concurrent.CompletableFuture;

@RestController
class RecebeRespostaExercicioController {

	private RespostaRepository respostaRepository;
	private ExercicioRepository exercicioRepository;
	private IntegracaoTypeForm integracaoTypeForm;
	private ExecutaComTransacao executaComTransacao;
	private SubmeteRespostaParaAnalise submeteRespostaParaAnalise;
	private ExecutaAsync executaAsync;

	public RecebeRespostaExercicioController(
            RespostaRepository respostaRepository,
            ExercicioRepository exercicioRepository,
            IntegracaoTypeForm integracaoTypeForm,
            ExecutaComTransacao executaComTransacao,
            SubmeteRespostaParaAnalise submeteRespostaParaAnalise,
			ExecutaAsync executaAsync) {
		super();
		this.respostaRepository = respostaRepository;
		this.exercicioRepository = exercicioRepository;
		this.integracaoTypeForm = integracaoTypeForm;
		this.executaComTransacao = executaComTransacao;
        this.submeteRespostaParaAnalise = submeteRespostaParaAnalise;
        this.executaAsync = executaAsync;
    }

	@PostMapping("/recebe-resposta/v1")
	@Transactional
	public ResponseEntity<?> executa(Aluno alunoLogado,
                                     NovaRespostaRequest request) {

		if (integracaoTypeForm.verificaExistencia(request.idExercicio,
				alunoLogado.getEmail())) {
			Resposta novaResposta = request.toResposta(exercicioRepository);
			
			/*
			 * Agora, depois que salva uma nova resposta, é necessário mandar
			 * a resposta para análise para o sistema de correção automática.
			 * 
			 * Já temos a interface + classe que disponibilizam tal comportamento. 
			 * Olhe a SubmeteRespostaParaAnaliseComAmazonSQS.
			 * 
			 * Um detalhe é que tal envio deve ser feito de maneira assíncrona. O retorno
			 * deste método não deve ficar travado esperando o retorno do sistema de 
			 * análise. 
			 * 
			 */

			ResponseEntity<String> respostaSalva = executaComTransacao.comRetorno(() -> {
				System.out.println("Salvando a resposta e definindo retorno");
				respostaRepository.salva(novaResposta);
				return ResponseEntity.ok("Resposta salva");
			});

			this.executaAsync.semRetorno(() -> this.submeteRespostaParaAnalise.envia(novaResposta));

			return respostaSalva;
		}

		return ResponseEntity.notFound().build();
	}

	public static void main(String[] args) {

		RespostaRepository respostaRepository = new RespostaRepository();
		ExercicioRepository exercicioRepository = new ExercicioRepository();
		IntegracaoTypeForm integracaoTypeForm = new IntegracaoTypeForm();
		ExecutaComTransacao executaComTransacao = new ExecutaComTransacao();
		AmazonSQS amazonSQS = new AmazonSQS();
		SubmeteRespostaParaAnalise submeteRespostaParaAnalise = new SubmeteRespostaParaAnaliseComAmazonSQS(amazonSQS);
		ExecutaAsync executaAsync = new ExecutaAsync();
		
		RecebeRespostaExercicioController controller = new RecebeRespostaExercicioController(respostaRepository,
				exercicioRepository, integracaoTypeForm,executaComTransacao, submeteRespostaParaAnalise, executaAsync);
		
		Aluno alunoLogado = new Aluno("teste@deveficiente.com");
		NovaRespostaRequest request = new NovaRespostaRequest(1l,
				"texto da resposta");
		
		ResponseEntity<?> response = controller.executa(alunoLogado, request);
		System.out.println(response.getStatusCodeValue());
	}
}
