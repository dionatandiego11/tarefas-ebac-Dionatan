package br.com.deresende.dao;

import br.com.deresende.dao.generic.IGenericDAO;
import br.com.deresende.domain.Venda;
import br.com.deresende.exceptions.DAOException;
import br.com.deresende.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
