package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ValidaSeEstadoPertenceAPais {
	
	/*
	 * Existem dois países cadastrados com os seguintes nomes:
	 * 
	 * 1) Brasil
	 * 2) Estados Unidos
	 * 
	 * Existem também dois estados pré cadastrados para cada país
	 * 
	 * 1) Bahia 
	 * 2) Californina
	 */
	private BancoDeDadosPaisesEEstados bancoDeDadosPaisesEEstados;
	
	public ValidaSeEstadoPertenceAPais(
			BancoDeDadosPaisesEEstados bancoDeDadosPaisesEEstados) {
		super();
		this.bancoDeDadosPaisesEEstados = bancoDeDadosPaisesEEstados;
	}

	/**
	 * 
	 * @return lista com mensagens de erros
	 */
	public List<String> valida(NovoClienteRequest request) {
		//é necessário agora implementar a seguinte validação:
		/*
		 * A validação é a seguinte: Caso um estado tenha sido selecionado, 
		 * é necessário verificar se ele pertence ao pais que foi escolhido.
		 * 
		 * Caso não pertença, uma lista com uma mensagem de erro deveria ser retornada
		 */
		Optional<String> possivelNomeEstado = request.getPossivelNomeEstado();
        if (possivelNomeEstado.isPresent()) {
			Estado estado = this.bancoDeDadosPaisesEEstados.buscaEstadoPeloNome(possivelNomeEstado.get());
			Pais pais = this.bancoDeDadosPaisesEEstados.buscaPaisPeloNome(request.getNomePais());
			if(!estado.pertenceAPais(pais)) {
				return List.of("Estado pertence a outro país");
			}
        }
		return Collections.emptyList();
	}
	
	public static void main(String[] args) {
		ValidaSeEstadoPertenceAPais validador = new ValidaSeEstadoPertenceAPais(
				new BancoDeDadosPaisesEEstados());
		
		/*
		 * Aqui fique a vontade para brincar com os valores para testar seu validador
		 */
		NovoClienteRequest request = new NovoClienteRequest("Brasil");
		request.setEstado("Bahia");
		System.out.println(validador.valida(request));

		request.setEstado("california");
		System.out.println(validador.valida(request));
	}
}
