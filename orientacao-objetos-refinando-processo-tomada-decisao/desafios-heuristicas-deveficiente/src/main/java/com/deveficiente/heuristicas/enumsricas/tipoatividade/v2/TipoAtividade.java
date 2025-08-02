package com.deveficiente.heuristicas.enumsricas.tipoatividade.v2;

public enum TipoAtividade {

	CONVENCIONAL(true),
    IMITACAO(false),
    EXEMPLO_TRABALHADO(false);

    private boolean indicadorObrigatoriedade;

    TipoAtividade(boolean indicadorObrigatoriedade) {
        this.indicadorObrigatoriedade = indicadorObrigatoriedade;
    }

    public boolean isObrigatoria() {
        return this.indicadorObrigatoriedade;
    }
}
