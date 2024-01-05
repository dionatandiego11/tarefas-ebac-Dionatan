import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class ClienteMapDAO implements IClienteDAO {

    private Set<Cliente> clientes;

    public ClienteMapDAO() {
        this.clientes = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (clientes.contains(cliente)) {
            return false; // Cliente já cadastrado
        }
        clientes.add(cliente);
        return true; // Cliente cadastrado com sucesso
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = consultar(cpf);

        if (clienteCadastrado != null) {
            clientes.remove(clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = consultar(cliente.getCpf());
        if (clienteCadastrado != null) {
            clientes.remove(clienteCadastrado); // Remove o cliente antigo
            clientes.add(cliente); // Adiciona o cliente atualizado
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return clientes;
    }
}
