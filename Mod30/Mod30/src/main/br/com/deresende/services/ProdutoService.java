package main.br.com.deresende.services;

import main.br.com.deresende.dao.IProdutoDAO;
import main.br.com.deresende.domain.Produto;
import main.br.com.deresende.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
