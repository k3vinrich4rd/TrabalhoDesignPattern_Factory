package com.DesignPatterns.pagamentoPattern.model.recebimentos;

public class RecebimentoFactory {

    public static CalculoDeRecebimentos tipoRecebimento(String tipoRecebimento){
        if (tipoRecebimento.equalsIgnoreCase("DIN_PIX_CHEQUE")){
            return new DinheiroPixCheque();
        } else if (tipoRecebimento.equalsIgnoreCase("CARTAO_DEBITO")) {
            return new CartaoDebito();
        } else if (tipoRecebimento.equalsIgnoreCase("CARTAO_CREDITO")) {
            return new CartaoCredito();
        } else if (tipoRecebimento.equalsIgnoreCase("VALE_REFEICAO")) {
            return new ValeRefeicao();
        }else {
            return null;
        }
    }
}
