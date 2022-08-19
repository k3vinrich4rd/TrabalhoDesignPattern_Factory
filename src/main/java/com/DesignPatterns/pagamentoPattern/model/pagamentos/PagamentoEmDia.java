package com.DesignPatterns.pagamentoPattern.model.pagamentos;

import com.DesignPatterns.pagamentoPattern.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoDePagamentos {


    @Override
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel) {
                                                                        //ValueOf — Conversão de valores para String
        return pagamentoModel.getValorAPagar().subtract(new BigDecimal(String.valueOf(pagamentoModel.getDesconto())));
    }
}
