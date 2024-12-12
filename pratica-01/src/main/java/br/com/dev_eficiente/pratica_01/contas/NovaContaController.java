package br.com.dev_eficiente.pratica_01.contas;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class NovaContaController {
    private final ContaRepository repository;

    public NovaContaController(ContaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/contas")
    public ResponseEntity<?> cadastrar(@Valid @RequestBody NovaContaRequest novaPessoa, UriComponentsBuilder uriBuilder) {
        Conta conta = novaPessoa.toModel();
        Conta contaSalva = repository.save(conta);
        URI uri = uriBuilder.path("/contas/{id}").buildAndExpand(contaSalva.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
