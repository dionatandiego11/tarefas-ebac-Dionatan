package main.br.com.deresende.services;

import main.br.com.deresende.domain.Cliente;
import main.br.com.deresende.exceptions.DAOException;
import main.br.com.deresende.exceptions.TipoChaveNaoEncontradaException;
import main.br.com.deresende.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}

