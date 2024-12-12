package br.com.dev_eficiente.pratica_01.contas;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "contas")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String login;
    @NotBlank
    @Email
    private String  email;

    public Conta() {
    }

    public Conta(@NotBlank String login, @NotBlank @Email String email) {
        this.login = login;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }
}
