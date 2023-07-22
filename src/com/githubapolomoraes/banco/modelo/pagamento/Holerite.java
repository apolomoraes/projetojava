package com.githubapolomoraes.banco.modelo.pagamento;

import com.githubapolomoraes.banco.modelo.Pessoa;

import java.math.BigDecimal;

public class Holerite implements DocumentoPagavel {

    private Pessoa funcionario;

    public Holerite(Pessoa funcionario, BigDecimal valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    private BigDecimal valorHora;
    private int quantidadeHoras;
    private boolean pago;

    @Override
    public BigDecimal getValorTotal() {
        return valorHora.multiply(new BigDecimal(quantidadeHoras));
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
