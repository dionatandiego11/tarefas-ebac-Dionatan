package br.com.deresende.services;

import br.com.deresende.dao.IProdutoDAO;
import br.com.deresende.domain.Produto;
import br.com.deresende.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}

