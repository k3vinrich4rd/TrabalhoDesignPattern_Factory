package com.DesignPatterns.pagamentoPattern.controller;

import com.DesignPatterns.pagamentoPattern.model.RecebimentoModel;
import com.DesignPatterns.pagamentoPattern.model.recebimentos.CalculoDeRecebimentos;
import com.DesignPatterns.pagamentoPattern.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recebimentos") // não é necessário fazer 'pagamento' em path
public class RecebimentoController {

    @Autowired
    private RecebimentoService recebimentoService;

    @GetMapping
    public List<RecebimentoModel> exibirTodosRecebimento() {
        return recebimentoService.exibirTodosRecebimentos();
    }

    @GetMapping(path = "/{id}")
    public Optional<RecebimentoModel> exibirRecebimentoViaId(@PathVariable Long id) {
        return recebimentoService.exibirViaID(id);
    }

    @PostMapping
    public RecebimentoModel cadastrarNovoRecebimento(@RequestBody RecebimentoModel recebimentoModel, CalculoDeRecebimentos calculoDeRecebimentos) {
        return recebimentoService.cadastrarRecebimento(recebimentoModel, calculoDeRecebimentos);
    }

    @PutMapping(path = "/{id}")
    public RecebimentoModel alterarRecebimento(@RequestBody RecebimentoModel recebimentoModel, CalculoDeRecebimentos calculoDeRecebimentos) {
        return recebimentoService.cadastrarRecebimento(recebimentoModel, calculoDeRecebimentos);
    }

    @DeleteMapping(path = "/{id}")
    public void deletarRecebimento(@PathVariable Long id) {
        recebimentoService.deletarRecebimento(id);
    }


}
