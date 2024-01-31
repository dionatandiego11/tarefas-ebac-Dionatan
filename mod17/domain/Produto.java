public class Produto implements Persistente{
    private Long codigo;
    private String nome;

    @TipoChave("getCodigo")
  
    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
