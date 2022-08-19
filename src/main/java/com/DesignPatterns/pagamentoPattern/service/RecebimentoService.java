package com.DesignPatterns.pagamentoPattern.service;

import com.DesignPatterns.pagamentoPattern.model.RecebimentoModel;
import com.DesignPatterns.pagamentoPattern.model.recebimentos.CalculoDeRecebimentos;
import com.DesignPatterns.pagamentoPattern.model.recebimentos.RecebimentoFactory;
import com.DesignPatterns.pagamentoPattern.respository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {

    @Autowired
    private RecebimentoRepository recebimentoRepository;

    public List<RecebimentoModel> exibirTodosRecebimentos() {
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> exibirViaID(Long id) {
        return recebimentoRepository.findById(id);
    }

    public RecebimentoModel cadastrarRecebimento(RecebimentoModel recebimentoModel, CalculoDeRecebimentos calculoDeRecebimentos) {
        BigDecimal resultado = RecebimentoFactory.tipoRecebimento(recebimentoModel.getStatusDoRecebimento()).calculoDeRecebimentos(recebimentoModel);
        recebimentoModel.setValorPago(recebimentoModel.getValorAPagar().subtract(resultado));

        return recebimentoRepository.save(recebimentoModel);
    }

    public RecebimentoModel alterarRecebimento(RecebimentoModel recebimentoModel, CalculoDeRecebimentos calculoDeRecebimentos) {
        BigDecimal resultado = RecebimentoFactory.tipoRecebimento(recebimentoModel.getStatusDoRecebimento()).calculoDeRecebimentos(recebimentoModel);
        recebimentoModel.setValorAPagar(recebimentoModel.getValorAPagar().subtract(resultado));

        return recebimentoRepository.save(recebimentoModel);

    }

    public void deletarRecebimento(Long id) {
        recebimentoRepository.deleteById(id);
    }
}

