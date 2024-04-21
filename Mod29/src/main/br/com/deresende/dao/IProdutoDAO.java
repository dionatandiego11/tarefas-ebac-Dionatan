package main.br.com.deresende.dao;

import main.br.com.deresende.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    public Integer cadastrar(Produto produto) throws Exception;

    public Integer atualizar(Produto produto) throws Exception;

    public Produto consultar(Produto produto) throws Exception;

    public Integer excluir(Produto produtoDB) throws Exception;

    public List<Produto> buscarTodos() throws Exception;
}
