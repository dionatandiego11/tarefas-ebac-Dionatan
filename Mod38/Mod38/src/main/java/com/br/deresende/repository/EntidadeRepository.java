package com.br.deresende.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import com.br.deresende.model.Entidade;

public class EntidadeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void salvar(Entidade entidade) {
        entityManager.persist(entidade);
    }
}