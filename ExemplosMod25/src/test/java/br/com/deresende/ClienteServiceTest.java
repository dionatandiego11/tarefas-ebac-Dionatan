/**
 * 
 */
package br.com.deresende;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.deresende.dao.ClienteDaoMock;
import br.com.deresende.dao.IClienteDAO;
import br.com.deresende.domain.Cliente;
import br.com.deresende.exceptions.TipoChaveNaoEncontradaException;
import br.com.deresende.services.ClienteService;
import br.com.deresende.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678L);
		cliente.setNome("Dionatan");
		cliente.setCidade("Belo Horizonte");
		cliente.setEnd("Rua numero 0");
		cliente.setEstado("MG");
		cliente.setNumero(03);
		cliente.setTel(37999823135L);
		//clienteService.salvar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test 
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}

	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
	    cliente.setNome("Dionatan Resende");
	    clienteService.alterar(cliente); // Chamada correta
	    Assert.assertEquals("Dionatan Resende", cliente.getNome());
	}

}
