package generic;

import java.util.Collection;

public class IGenericDAO <T extends Persistente> {
    public Boolean cadastrar(T entity);
    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<Produto> buscarTodos();
}
