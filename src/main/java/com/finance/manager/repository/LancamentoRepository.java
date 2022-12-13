package com.finance.manager.repository;

import com.finance.manager.domain.Lancamento;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends ReactiveCrudRepository<Lancamento, String> {}
