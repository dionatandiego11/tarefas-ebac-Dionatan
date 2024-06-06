package main.br.com.deresende.dao;

import main.br.com.deresende.dao.generic.IGenericDAO;
import main.br.com.deresende.domain.Venda;
import main.br.com.deresende.exceptions.DAOException;
import main.br.com.deresende.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
