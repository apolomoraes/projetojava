package com.githubapolomoraes.banco.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public Banco() {
        Pessoa pessoa1 = new Pessoa("Apolo", "14566818907");
        Pessoa pessoa2 = new Pessoa("Itamar", "14466718939");

        Conta conta1 = new ContaInvestimento(pessoa1, 222, 999);
        Conta conta2 = new ContaInvestimento(pessoa1, 123, 111);
        Conta conta3 = new ContaInvestimento(pessoa2, 456, 222);
        Conta conta4 = new ContaEspecial(pessoa1, 789, 333, new BigDecimal("1000"));
        Conta conta5 = new ContaEspecial(pessoa2, 101, 444, new BigDecimal("1000"));

        conta1.depositar(new BigDecimal("120"));
        conta2.depositar(new BigDecimal("150"));
        conta3.depositar(new BigDecimal("500"));
        conta5.depositar(new BigDecimal("1000"));

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
    }

    public List<Conta> getContas() { return contas; }

    public Conta buscar(int agencia, int numeroConta) {
        for (Conta conta : getContas()) {
            if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
                return conta;
            }
        }

        return null;
    }
}
