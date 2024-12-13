package br.com.deresende.service;

import java.util.List;

import br.com.deresende.domain.Cliente;
import br.com.deresende.exceptions.DAOException;
import br.com.deresende.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}