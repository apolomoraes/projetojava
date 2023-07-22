package com.githubapolomoraes.banco.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {
    BigDecimal getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo() {
        System.out.println("Comprovante de pagamento");
        System.out.println("--------------------------------------");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }
}
