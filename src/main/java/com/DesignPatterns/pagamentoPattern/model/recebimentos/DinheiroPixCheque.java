package com.DesignPatterns.pagamentoPattern.model.recebimentos;

import com.DesignPatterns.pagamentoPattern.model.RecebimentoModel;

import java.math.BigDecimal;

public class DinheiroPixCheque implements CalculoDeRecebimentos{
    @Override
    public BigDecimal calculoDeRecebimentos(RecebimentoModel recebimentoModel) {
        return BigDecimal.valueOf(0) ;
    }
}
