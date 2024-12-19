package br.com.dev_eficiente.pratica_01.convites;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class NovoConviteRequest {
    @NotBlank
    @Email
    private String email;
    @Min(value = 1)
    private int diasParaExpirar;

    public NovoConviteRequest(String email, int diasParaExpirar) {
        this.email = email;
        this.diasParaExpirar = diasParaExpirar;
    }

    public Convite toModel() {
        LocalDate dataExpiracao = LocalDate.now().plusDays(this.diasParaExpirar);
        return new Convite(this.email, dataExpiracao);
    }

    @Override
    public String toString() {
        return "NovoConviteRequest{" +
                "email='" + email + '\'' +
                ", diasParaExpirar=" + diasParaExpirar +
                '}';
    }
}
