package br.com.dev_eficiente.pratica_01.contas;

import br.com.dev_eficiente.pratica_01.pessoas.Pessoa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "contas")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String login;
    @OneToOne
    private Pessoa dona;

    public Conta() {
    }

    public Conta(@NotBlank String login, @NotNull Pessoa dona) {
        this.login = login;
        this.dona = dona;
    }

    public Long getId() {
        return this.id;
    }

    public boolean pertenceAPessoa(Pessoa pessoaLogada) {
        return pessoaLogada.equals(this.dona);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", dona=" + dona +
                '}';
    }
}
