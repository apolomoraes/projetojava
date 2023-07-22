package com.githubapolomoraes.banco.modelo.excecao;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
