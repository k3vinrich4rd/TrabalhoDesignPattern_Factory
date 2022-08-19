package com.DesignPatterns.pagamentoPattern.service;

import com.DesignPatterns.pagamentoPattern.model.PagamentoModel;
import com.DesignPatterns.pagamentoPattern.model.pagamentos.CalculoPagamentoFactory;
import com.DesignPatterns.pagamentoPattern.respository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;


    public List<PagamentoModel> exibirTodosPagamentos() {
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> exibirPagamentosViaId(Long id) {
        return pagamentoRepository.findById(id);
    }

    public PagamentoModel cadastrarNovosPagamentos(PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory) {
        //Conexão Factory
        BigDecimal resultado = CalculoPagamentoFactory.tipoPagamento(pagamentoModel.getStatusDoPagamento()).calculoDePagamentos(pagamentoModel);
        pagamentoModel.setValorPago(resultado); // Valor pago está recebendo o resultado do calculo do meu método

        return pagamentoRepository.save(pagamentoModel);
    }

    public PagamentoModel alterarPagamentos(PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory) {
        //Conexão Factory
        BigDecimal resultado = CalculoPagamentoFactory.tipoPagamento(pagamentoModel.getStatusDoPagamento()).calculoDePagamentos(pagamentoModel);
        pagamentoModel.setValorPago(resultado); // Valor pago está recebendo o resultado do calculo do meu método

        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletarPagamentoViaId(Long id) {
        pagamentoRepository.deleteById(id);
    }


}
