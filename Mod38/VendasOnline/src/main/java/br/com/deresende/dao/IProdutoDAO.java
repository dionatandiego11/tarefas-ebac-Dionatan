package br.com.deresende.dao;

import java.util.List;

import br.com.deresende.dao.generic.IGenericDAO;
import br.com.deresende.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
