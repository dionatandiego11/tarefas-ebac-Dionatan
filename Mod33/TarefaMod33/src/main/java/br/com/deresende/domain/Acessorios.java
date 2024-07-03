package br.com.deresende.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_ACESSORIOS")
public class Acessorios {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acess_seq")
    @SequenceGenerator(name = "acess_seq", sequenceName = "sq_acessorios", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "DESCRICAO", length = 50, nullable = false)
    private String descricao;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros = new ArrayList<>();

    public Acessorios() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
        carro.getAcessorios().add(this);
    }

    public void removeCarro(Carro carro) {
        this.carros.remove(carro);
        carro.getAcessorios().remove(this);
    }
}