package com.deveficiente.casadocodigov2.fechamentocompra;

import java.util.function.Function;

import com.deveficiente.casadocodigov2.cadastrocupom.Cupom;
import com.deveficiente.casadocodigov2.cadastrolivro.Livro;
import com.deveficiente.casadocodigov2.paisestado.Estado;
import com.deveficiente.casadocodigov2.paisestado.Pais;

public interface DadosNovaCompra {

	Compra toModel(
			Function<Long, Pais> carregaPais,
			Function<Long, Estado> carregaEstado,
			Function<Long, Livro> carregaLivro,
			Function<String, Cupom> carregaCupom);

}
