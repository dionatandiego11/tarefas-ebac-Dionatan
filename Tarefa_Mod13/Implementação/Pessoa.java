import java.util.HashSet;
import java.util.Set;

public class Pessoa {

    public String nome;

    private Set<PessoaFisica> PessoaFisica;

    private Set<PessoaJuridica> PessoaJuridica;

    public Pessoa() {
        this.PessoaFisica = new HashSet<>();
        this.PessoaJuridica = new HashSet<>();
    }

    public void add(PessoaFisica pf) {
        this.PessoaFisica.add(pf);
    }

    public void add(PessoaJuridica pj) {
        this.PessoaJuridica.add(pj);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
