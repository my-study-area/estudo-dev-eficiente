package br.com.dev_eficiente.pratica_01.contas;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class NovaContaRequest {
    @NotBlank
    private String login;
    @NotBlank
    @Email
    private String email;

    public NovaContaRequest(String email, String login) {
        this.email = email;
        this.login = login;
    }

    public Conta toModel() {
        return new Conta(this.login, this.email);
    }
}
