package br.com.deresende.dao;

import java.util.List;

import br.com.deresende.dao.generic.IGenericDAO;
import br.com.deresende.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
