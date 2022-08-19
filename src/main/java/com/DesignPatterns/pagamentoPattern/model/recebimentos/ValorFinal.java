package com.DesignPatterns.pagamentoPattern.model.recebimentos;

import java.math.BigDecimal;

public class ValorFinal {
    public static BigDecimal valorFinal(BigDecimal valorAPagar, BigDecimal valorDesconto){
        return valorAPagar.subtract(valorDesconto);
    }
}
