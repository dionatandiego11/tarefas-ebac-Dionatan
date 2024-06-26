package br.com.deresende;
import br.com.deresende.dao.IProdutoDao;
import br.com.deresende.dao.ProdutoDao;
import br.com.deresende.domain.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A5");
        produto.setNome("Curso de Java Backend");
        produto.setDescricao("Boa");
        produto.setValor(50.0);
        produto.setCor("Azul");
        produto.setPreco(100.0);
        produto.setQuantidade(2.0);
        produto.setPreço(30.0);

        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto.getId()); // Verifica se o produto foi persistido corretamente
    }

}