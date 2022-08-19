package com.DesignPatterns.pagamentoPattern.model.pagamentos;

public class CalculoPagamentoFactory {
    public static CalculoDePagamentos tipoPagamento(String tipoPagamento) {
        if (tipoPagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {
            return new PagamentoEmAtraso();
        } else if (tipoPagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new PagamentoEmDia();

        } else {
            return null;
        }
    }
}
