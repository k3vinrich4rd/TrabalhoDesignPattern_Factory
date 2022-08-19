package com.DesignPatterns.pagamentoPattern.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pagamento_registro")
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    @Column(name = "status_pagamento", length = 100, nullable = false)
    private String statusDoPagamento;

    @Column(name = "valor_a_pagar", length = 100, nullable = false)
    private BigDecimal valorAPagar;

    @Column(name = "diferença_valor", length = 100, nullable = false)
    private BigDecimal desconto;

    @Column(name = "valor_pago", length = 100)
    private BigDecimal valorPago;
}
