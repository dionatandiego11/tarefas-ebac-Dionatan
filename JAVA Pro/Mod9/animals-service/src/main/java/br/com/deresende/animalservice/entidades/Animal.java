package br.com.deresende.animalservice.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.sql.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column(nullable = false)
    private String condicoesChegada;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private String especie;  // New field for species (dog/cat)

    public Animal() {
    }

    public Animal(String nomeProvisorio, Integer idadeEstimada, String raca, Date dataEntrada,
                  String condicoesChegada, String nomeRecebedor, String porte, String especie) {
        this.nomeProvisorio = nomeProvisorio;
        this.idadeEstimada = idadeEstimada;
        this.raca = raca;
        this.dataEntrada = dataEntrada;
        this.condicoesChegada = condicoesChegada;
        this.nomeRecebedor = nomeRecebedor;
        this.porte = porte;
        this.especie = especie;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }
    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }
    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }
    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }
    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }
    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }
    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
