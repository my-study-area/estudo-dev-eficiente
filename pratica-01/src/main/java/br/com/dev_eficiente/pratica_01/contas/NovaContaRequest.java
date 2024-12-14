package br.com.dev_eficiente.pratica_01.contas;

import br.com.dev_eficiente.pratica_01.pessoas.Pessoa;
import br.com.dev_eficiente.pratica_01.pessoas.PessoaRepository;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NovaContaRequest {
    @NotBlank
    private String login;
    @NotNull
    private Long pessoaId;

    public NovaContaRequest(String login, Long pessoaId) {
        this.login = login;
        this.pessoaId = pessoaId;
    }

    public Conta toModel(PessoaRepository repository) {
        Pessoa pessoa = repository.findById(this.pessoaId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new Conta(this.login, pessoa);
    }
}
