package br.com.dev_eficiente.pratica_01.pessoas;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class NovaPessoaController {
    private final PessoaRepository repository;

    public NovaPessoaController(PessoaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/pessoas")
    public ResponseEntity<?> cadastrar(@Valid @RequestBody NovaPessoaRequest novaPessoa, UriComponentsBuilder uriBuilder) {
        Pessoa pessoa = novaPessoa.toModel();
        Pessoa pessoaSalva = repository.save(pessoa);
        URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(pessoaSalva.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
