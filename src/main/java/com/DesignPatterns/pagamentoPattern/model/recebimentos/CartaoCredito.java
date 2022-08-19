package com.DesignPatterns.pagamentoPattern.model.recebimentos;

import com.DesignPatterns.pagamentoPattern.model.RecebimentoModel;

import java.math.BigDecimal;

public class CartaoCredito implements CalculoDeRecebimentos{
    @Override
    public BigDecimal calculoDeRecebimentos(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAPagar().multiply(new BigDecimal("0.037"));

    }
}
