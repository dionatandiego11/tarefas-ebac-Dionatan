package test.br.com.deresende;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;

import org.junit.Test;

import main.br.com.deresende.dao.ProdutoDAO;
import main.br.com.deresende.dao.IProdutoDAO;
import main.br.com.deresende.domain.Produto;

public class ProdutoTest {
    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("iPhone");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBusca = new Produto();
        produtoBusca.setCodigo(produto.getCodigo()); // Set the codigo property
        Produto produtoBD = dao.consultar(produtoBusca);
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void testAtualizarProduto() {
        Produto produto = new Produto();
        produto.setCodigo("123");
        produto.setNome("Galaxy");

        ProdutoDAO produtoDAO = new ProdutoDAO();

        try {
            produtoDAO.atualizar(produto);
            System.out.println("Produto atualizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o produto: " + e.getMessage());
        }
    }

    @Test
    public void testBuscarTodosProdutos() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            List<Produto> produtos = produtoDAO.buscarTodos();
            if (produtos.isEmpty()) {
                System.out.println("Nenhum produto encontrado.");
            } else {
                System.out.println("Produtos encontrados:");
                for (Produto produto : produtos) {
                    System.out.println("Código: " + produto.getCodigo() + ", Nome: " + produto.getNome());
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar produtos: " + e.getMessage());
        }
    }
}
