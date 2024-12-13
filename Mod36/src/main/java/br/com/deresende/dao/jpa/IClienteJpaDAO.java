package br.com.deresende.dao.jpa;

import br.com.deresende.dao.generic.jpa.IGenericJapDAO;
import br.com.deresende.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}