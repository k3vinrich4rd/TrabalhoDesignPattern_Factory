package com.DesignPatterns.pagamentoPattern.model.pagamentos;

import com.DesignPatterns.pagamentoPattern.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoDePagamentos {
    public BigDecimal calculoDePagamentos(PagamentoModel pagamentoModel);

}
