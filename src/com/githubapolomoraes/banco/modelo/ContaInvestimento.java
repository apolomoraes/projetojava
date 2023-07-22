package com.githubapolomoraes.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta {
    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal() {
        if(getSaldo().compareTo(new BigDecimal("10000")) < 0) {
            sacar(new BigDecimal("30"));
        }
    }

    public void creditarRendimentos(BigDecimal percentualJuro) {
        BigDecimal valorRendimentos = getSaldo().multiply(percentualJuro).divide(new BigDecimal("100"), 2, RoundingMode.HALF_EVEN);
        depositar(valorRendimentos);
    }
}
