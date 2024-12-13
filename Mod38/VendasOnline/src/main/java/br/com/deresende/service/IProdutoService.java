package br.com.deresende.service;

import java.util.List;

import br.com.deresende.domain.Produto;
import br.com.deresende.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
