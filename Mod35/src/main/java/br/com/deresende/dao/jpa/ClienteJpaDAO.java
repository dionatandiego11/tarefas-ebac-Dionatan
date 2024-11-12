package br.com.deresende.dao.jpa;

import br.com.deresende.dao.generic.jpa.GenericJpaDAO;
import br.com.deresende.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}