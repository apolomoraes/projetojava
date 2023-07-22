package com.githubapolomoraes.banco.modelo.atm;

import com.githubapolomoraes.banco.modelo.Conta;
import com.githubapolomoraes.banco.modelo.pagamento.DocumentoEstornavel;
import com.githubapolomoraes.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta) {
        System.out.println("Conta de " + conta.getTitular().getNome() + " referente a agencia e número: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
        System.out.println("===========/==========================/======================/");
    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if(documento.estaPago()) {
            throw new IllegalStateException("Documento já está pago");
        }

        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {
        if(!documento.estaPago()) {
            throw new IllegalStateException("Documento não está pago");
        }

        conta.depositar(documento.getValorTotal());

        documento.estornarPagamento();
    }
}
