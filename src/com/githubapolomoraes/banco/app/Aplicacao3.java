package com.githubapolomoraes.banco.app;

import com.githubapolomoraes.banco.modelo.Banco;
import com.githubapolomoraes.banco.modelo.Conta;

import java.util.Comparator;

public class Aplicacao3 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.getContas().sort(Comparator.comparingInt());

        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }
}
