package com.DesignPatterns.pagamentoPattern.respository;

import com.DesignPatterns.pagamentoPattern.model.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
