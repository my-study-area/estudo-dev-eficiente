package br.com.dev_eficiente.pratica_01.pessoas;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class NovaPessoaRequest {
    @NotBlank
    private String nome;
    @Min(value = 18)
    private int idade;
    @Email
    private String email;

    public NovaPessoaRequest(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Pessoa toModel() {
        return new Pessoa(this.nome, this.email, this.idade);
    }
}
