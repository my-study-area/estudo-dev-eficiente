package com.deveficiente.casadocodigov2.paisestado;

import java.util.function.Function;

public interface DadosNovoEstado {

	Estado toModel(Function<Long, Pais> carregaPais);
}
