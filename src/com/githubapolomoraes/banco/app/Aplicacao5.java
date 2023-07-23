package com.githubapolomoraes.banco.app;

import com.githubapolomoraes.banco.modelo.Banco;
import com.githubapolomoraes.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Optional;

public class Aplicacao5 {
    public static void main(String[] args) {
        Banco banco = new Banco();

//        Optional<Conta> contaOptional = banco.buscar(123, 111);

//        banco.buscar(123,111)
//        .ifPresent(conta -> System.out.println(conta.getSaldo()));


//    contaOptional.ifPresent(conta -> System.out.println(conta.getSaldo()));

//        if (contaOptional.isPresent()) {
//            Conta contaEncontrada = contaOptional.get();
//            System.out.println(contaEncontrada.getSaldo());
//        }


//        if(contaOptional != null) {
//            System.out.println(contaOptional.getSaldo());
//        }

//        Conta contaEncontrada = banco.buscar(123,111)
//                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
//
//        System.out.println(contaEncontrada.getSaldo());

        BigDecimal saldo = banco.buscar(123, 111)
                .map(Conta::getSaldo)
                .orElse(BigDecimal.ZERO);

        System.out.println(saldo);
    }
}
