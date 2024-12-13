package br.com.deresende.dao.jpa;

import br.com.deresende.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.deresende.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
