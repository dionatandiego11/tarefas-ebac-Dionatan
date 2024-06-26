package br.com.deresende.dao;

import br.com.deresende.domain.Produto;

import java.util.List;

public interface IProdutoDao {
    Produto cadastrar(Produto produto);
    void excluir(Produto produto);
    List<Produto> buscarTodos();
    Produto buscarPorCodigo(String codigo);
}
