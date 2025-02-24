package br.com.derende.repository;

import br.com.derende.model.CadastroEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class CadastroRepository {

    @PersistenceContext
    private EntityManager em;

    public void salvar(CadastroEntity entidade) {
        em.persist(entidade);
    }
}