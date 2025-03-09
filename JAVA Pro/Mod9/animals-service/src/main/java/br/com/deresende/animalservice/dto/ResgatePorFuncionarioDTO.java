package br.com.deresende.animalservice.dto;

public class ResgatePorFuncionarioDTO {
    private String nomeRecebedor;
    private Long quantidadeAnimais;

    public ResgatePorFuncionarioDTO(String nomeRecebedor, Long quantidadeAnimais) {
        this.nomeRecebedor = nomeRecebedor;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Long getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(Long quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }
}
