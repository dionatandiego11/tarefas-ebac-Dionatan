package br.com.deresende.dao.jpa;

import br.com.deresende.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.deresende.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
