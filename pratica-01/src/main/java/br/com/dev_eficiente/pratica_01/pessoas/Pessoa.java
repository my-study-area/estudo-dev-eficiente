package br.com.dev_eficiente.pratica_01.pessoas;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "pessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @Email
    private String email;

    @Min(value = 18)
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome,
                  String email,
                  Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
