package br.com.deresende.dao.jpa;

import br.com.deresende.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.deresende.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
