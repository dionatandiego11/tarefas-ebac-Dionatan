public interface IProdutoDAO {
    public Boolean cadastrar(Produto produto);
    public void excluir(Long codigo);
    public void alterar(Produto produto);
    public Cliente consultar(Long codigo);
    public Collection<Produto> buscarTodos();
}
