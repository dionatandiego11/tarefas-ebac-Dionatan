package test.br.com.deresende;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.List;

import main.br.com.deresende.dao.ClienteDAO;
import main.br.com.deresende.dao.IClienteDAO;
import main.br.com.deresende.domain.Cliente;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Rodrigo Pires");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void testAtualizarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCodigo("123");
        cliente.setNome("João da Silva");

        ClienteDAO clienteDAO = new ClienteDAO();

        try {
            clienteDAO.atualizar(cliente);
            System.out.println("Cliente atualizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o cliente: " + e.getMessage());
        }
    }

    @Test
    public void testBuscarTodosClientes() {
        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            List<Cliente> clientes = clienteDAO.buscarTodos();
            if (clientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado.");
            } else {
                System.out.println("Clientes encontrados:");
                for (Cliente cliente : clientes) {
                    System.out.println("Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome());
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar clientes: " + e.getMessage());
        }
    }
}


