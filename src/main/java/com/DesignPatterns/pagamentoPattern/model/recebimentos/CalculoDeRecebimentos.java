package com.DesignPatterns.pagamentoPattern.model.recebimentos;

import com.DesignPatterns.pagamentoPattern.model.RecebimentoModel;

import java.math.BigDecimal;

public interface CalculoDeRecebimentos {
    public BigDecimal calculoDeRecebimentos(RecebimentoModel recebimentoModel);
}
