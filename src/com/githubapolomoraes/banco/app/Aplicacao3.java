package com.githubapolomoraes.banco.app;

import com.githubapolomoraes.banco.modelo.Banco;
import com.githubapolomoraes.banco.modelo.Conta;

public class Aplicacao3 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }
}
