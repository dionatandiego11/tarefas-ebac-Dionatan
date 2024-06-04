package main.br.com.deresende.services;

import main.br.com.deresende.dao.IClienteDAO;
import main.br.com.deresende.domain.Cliente;
import main.br.com.deresende.exceptions.DAOException;
import main.br.com.deresende.exceptions.MaisDeUmRegistroException;
import main.br.com.deresende.exceptions.TableException;
import main.br.com.deresende.services.generic.GenericService;
import main.br.com.deresende.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
