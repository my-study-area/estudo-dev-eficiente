package br.com.dev_eficiente.pratica_01.convites;

import br.com.dev_eficiente.pratica_01.contas.Conta;
import br.com.dev_eficiente.pratica_01.contas.ContaRepository;
import br.com.dev_eficiente.pratica_01.pessoas.Pessoa;
import br.com.dev_eficiente.pratica_01.pessoas.PessoaRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class NovoConviteController {
/**
 * Neste endpoint eu preciso receber a pessoa logada que gerará o convite e também a conta daquele convite.
 * A pessoa logada vai vir via header
 * a conta pode vir via parametro combinado na própria url (path variable)
 * Também preciso receber os dados do convite: Email e dias de expiração
 * Carregar a pessoa logada e verificar se ela existe mesmo (use o getOrThrow e lance ResponseStatusException)
 * Carregar a conta e verificar se ele existe mesmo (use o getOrThrow e lance ResponseStatusException)
 * A pessoa logada precisa ser dona da conta (lance ResponseStatusException)
 * Eu crio o novo convite para aquele email com aquela data de expiração
 * Crie um método chamado toModel na classe de request
 * Salvo este convite
 * Utilize o EntityManager
 * Preciso mandar um email para a pessoa que vai receber o convite
 * Deixe fake por enquanto
 */

    private final PessoaRepository pessoaRepository;
    private final ContaRepository contaRepository;

    public NovoConviteController(PessoaRepository pessoaRepository, ContaRepository contaRepository) {
        this.pessoaRepository = pessoaRepository;
        this.contaRepository = contaRepository;
    }

    @PostMapping(value = "/contas/{idConta}/convites")
    public ResponseEntity<?> enviarConvite(
        @RequestHeader(value = "id_pessoa_logada") long IdPessoaLogada,
        @PathVariable(value = "idConta") Long idConta,
        @Valid @RequestBody NovoConviteRequest novoConviteRequest
    ) {
        Pessoa pessoaLogada = pessoaRepository.findById(IdPessoaLogada)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Conta conta = contaRepository.findById(idConta)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if(!conta.pertenceAPessoa(pessoaLogada)) {
            throw  new ResponseStatusException(HttpStatus.FORBIDDEN);
        }

        Convite convite = novoConviteRequest.toModel();

        return ResponseEntity.ok("cadastrado conta=" + conta + " pessoa=" + pessoaLogada + " requestbody=" + novoConviteRequest + "convite=" + convite);
    }
}
