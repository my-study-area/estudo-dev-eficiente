package br.com.dev_eficiente.pratica_01.convites;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class Convite {
    @NotNull
    @Email
    private String email;

    @NotNull
    private LocalDate dataExpiracao;

    public Convite(String email, LocalDate dataExpiracao) {
        this.email = email;
        this.dataExpiracao = dataExpiracao;
    }

    @Override
    public String toString() {
        return "Convite{" +
                "email='" + email + '\'' +
                ", dataExpiracao=" + dataExpiracao +
                '}';
    }
}
