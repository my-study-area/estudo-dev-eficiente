package com.deveficiente.casadocodigov2.cadastrocupom;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupomRepository extends CrudRepository<Cupom, Long> {

	/**
	 * Busca por um cupom que existe no sistema
	 * @param codigo
	 * @return
	 */
	public Cupom getByCodigo(String codigo);
}

