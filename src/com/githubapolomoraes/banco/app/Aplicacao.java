package com.githubapolomoraes.banco.app;

import com.githubapolomoraes.banco.modelo.*;
import com.githubapolomoraes.banco.modelo.atm.CaixaEletronico;
import com.githubapolomoraes.banco.modelo.pagamento.Boleto;
import com.githubapolomoraes.banco.modelo.pagamento.DocumentoPagavel;
import com.githubapolomoraes.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João");
        titular1.setDocumento("cpf");
        titular1.setRendimentoAnual(new BigDecimal("15000"));
        titular1.setTipo(TipoPessoa.JURIDICA);
        titular1.getTipo();
        titular1.getDataUltimaAtualizacao();
        System.out.println(titular1.getTipo());
        System.out.println(titular1.getDataUltimaAtualizacao());
        System.out.println(titular1.getRendimentoAnual());

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Apolo");
        titular2.setDocumento("identidade");

        ContaEspecial minhaConta = new ContaEspecial(titular1, 123, 321, new BigDecimal("1000"));
        ContaInvestimento randomConta = new ContaInvestimento(titular2, 0203, 0607);

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        try {
            minhaConta.depositar(new BigDecimal("80000"));
            minhaConta.sacar(new BigDecimal("15500"));
            minhaConta.debitarTarifaMensal();


            randomConta.depositar(new BigDecimal("30000"));
            randomConta.sacar(new BigDecimal("8000"));
            randomConta.creditarRendimentos(new BigDecimal("0.2"));
            randomConta.debitarTarifaMensal();


            Boleto boletoEscola = new Boleto(titular1, new BigDecimal("360"));
            Holerite salarioFuncionario = new Holerite(titular1, new BigDecimal("24"), 180);
            System.out.println("Salário: " + salarioFuncionario.getValorTotal());
            System.out.println();
            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);

            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);


            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();

        } catch (Exception e) {
            System.out.println("Erro ao realizar transação/serviço, tente novamente mais tarde.");
            System.out.println("Erro: " + e.getMessage());
        }
        caixaEletronico.imprimirSaldo(minhaConta);
    }
}
