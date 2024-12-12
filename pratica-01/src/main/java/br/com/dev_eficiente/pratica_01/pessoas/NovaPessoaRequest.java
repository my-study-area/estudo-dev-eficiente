package br.com.dev_eficiente.pratica_01.pessoas;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class NovaPessoaRequest {
    @NotBlank
    private String nome;
    @Min(value = 18)
    private int idade;

    public NovaPessoaRequest(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa toModel() {
        return new Pessoa(this.nome, this.idade);
    }
}
