package com.DesignPatterns.pagamentoPattern.controller;

import com.DesignPatterns.pagamentoPattern.model.PagamentoModel;
import com.DesignPatterns.pagamentoPattern.model.pagamentos.CalculoPagamentoFactory;
import com.DesignPatterns.pagamentoPattern.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pagamentos") // não é necessário fazer 'pagamento' em path
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;


    @GetMapping
    public List<PagamentoModel> exibirTodosPagamentos() {
        return pagamentoService.exibirTodosPagamentos();
    }

    @GetMapping(path = "/{id}")
    public Optional<PagamentoModel> exibirPagamentoViaId(@PathVariable Long id) {
        return pagamentoService.exibirPagamentosViaId(id);
    }

    @PostMapping
    public PagamentoModel cadastrarNovoPagamento(@RequestBody PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory) {
        return pagamentoService.cadastrarNovosPagamentos(pagamentoModel, calculoPagamentoFactory);
    }

    @PutMapping(path = "/{id}")
    public PagamentoModel alterarRegistroDePagamento(@RequestBody PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory){
        return pagamentoService.alterarPagamentos(pagamentoModel, calculoPagamentoFactory);
    }

    @DeleteMapping(path = "/{id}")
    public void  deletarPagamentoViaId (@PathVariable Long id){
        pagamentoService.deletarPagamentoViaId(id);
    }

}
