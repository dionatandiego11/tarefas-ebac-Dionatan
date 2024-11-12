package br.com.deresende.dao.jpa;

import br.com.deresende.dao.generic.jpa.GenericJpaDAO;
import br.com.deresende.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}