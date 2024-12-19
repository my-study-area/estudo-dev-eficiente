package br.com.dev_eficiente.pratica_01.convites;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    @PostMapping("/teste1")
    public ResponseEntity<?> test1(
            @Valid @RequestBody NovoConviteRequest request
    ) {
        return ResponseEntity.ok("request= " + request + " header=");
    }

    @PostMapping("/teste2/{idTeste}/convites")
    public ResponseEntity<?> test2(
            @PathVariable(required = true, value = "idTeste") int idTeste,
            @Valid @RequestBody NovoConviteRequest request
    ) {
      return ResponseEntity.ok("request= " + request + "path=" + idTeste + " header=");
    }

    @PostMapping("/teste3/{idTest}/convites")
    public ResponseEntity<?> test3(
            @PathVariable(value="idTest") String idTeste,
            @Valid @RequestBody NovoConviteRequest request,
            @RequestHeader(value = "header") String header
            ) {
        return ResponseEntity.ok("request= " + request + "path=" + idTeste + " header=" + header);
    }
}
