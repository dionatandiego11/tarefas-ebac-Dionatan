package main.br.com.deresende.dao;

import main.br.com.deresende.dao.jdbc.ConnectionFactory;
import main.br.com.deresende.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PRODUTO (ID, CODIGO, NOME) VALUES (nextval('SQ_PRODUTO'),?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            stm.setString(2, produto.getNome());
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Produto consultar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "select * from tb_produto where codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo()); // Usar o código do objeto Produto recebido como parâmetro
            rs = stm.executeQuery();
            if (rs.next()) {
                produto.setId(rs.getLong("id")); // Atribuir valores diretamente ao objeto Produto recebido como parâmetro
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
            }
            return produto;
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE tb_produto SET nome = ? WHERE codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM tb_produto";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
                produtos.add(produto); // Adicionar o objeto Produto à lista produtos
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        return produtos; // Retornar a lista de produtos
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PRODUTO WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigo());
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}

