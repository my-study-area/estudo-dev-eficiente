package com.deveficiente.heuristicas.valueobjects.cpf.v1;

import org.springframework.util.Assert;

import javax.validation.constraints.NotBlank;

/**
 * Classe reponsável por representar o numero de CPF, somente números.
 * O número de CPF somente possui valores numéricos. Ex: 62578281041
 */
public class CPFLimpo {
    private String numeroCPF;

    private CPFLimpo() {
    }

    private CPFLimpo(@NotBlank String numeroCPF) {
        Assert.isTrue(isNumeric(numeroCPF), "CPF deve conter somente números");
        this.numeroCPF = numeroCPF;
    }

    public static CPFLimpo criar(@NotBlank String numeroCPF) {
        return new CPFLimpo(numeroCPF);
    }

    private boolean isNumeric(@NotBlank String numero) {
        if (numero == null || numero.isEmpty()) {
            return false;
        }
        for (char c : numero.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public String getCPFLimpo() {
        return numeroCPF;
    }

    @Override
    public String toString() {
        return "CPFLimpo{" +
                "numeroCPF='" + numeroCPF + '\'' +
                '}';
    }
}
