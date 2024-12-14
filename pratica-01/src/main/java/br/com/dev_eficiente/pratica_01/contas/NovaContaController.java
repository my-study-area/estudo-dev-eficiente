package br.com.dev_eficiente.pratica_01.contas;

import br.com.dev_eficiente.pratica_01.pessoas.PessoaRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class NovaContaController {
    private final ContaRepository contaRepository;
    private final PessoaRepository pessoaRepository;

    public NovaContaController(ContaRepository contaRepository, PessoaRepository pessoaRepository) {
        this.contaRepository = contaRepository;
        this.pessoaRepository = pessoaRepository;
    }

    @PostMapping("/contas")
    public ResponseEntity<?> cadastrar(@Valid @RequestBody NovaContaRequest novaPessoa, UriComponentsBuilder uriBuilder) {
        Conta conta = novaPessoa.toModel(this.pessoaRepository);
        Conta contaSalva = contaRepository.save(conta);
        URI uri = uriBuilder.path("/contas/{id}").buildAndExpand(contaSalva.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
