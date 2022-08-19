package com.DesignPatterns.pagamentoPattern.model.pagamentos;

import com.DesignPatterns.pagamentoPattern.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmAtraso implements CalculoDePagamentos {

    @Override
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel) {
                                                                     //ValueOf — Conversão de valores para String
        return pagamentoModel.getValorAPagar().add(new BigDecimal(String.valueOf(pagamentoModel.getDesconto())));
    }
}
