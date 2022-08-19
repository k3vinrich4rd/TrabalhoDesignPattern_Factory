package com.DesignPatterns.pagamentoPattern.respository;

import com.DesignPatterns.pagamentoPattern.model.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoModel, Long> {
}
