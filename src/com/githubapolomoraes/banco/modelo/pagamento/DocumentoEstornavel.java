package com.githubapolomoraes.banco.modelo.pagamento;

public interface DocumentoEstornavel extends  DocumentoPagavel {
    void estornarPagamento();

}
