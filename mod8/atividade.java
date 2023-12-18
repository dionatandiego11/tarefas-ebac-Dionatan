/**
 * Classe que representa um Time de futebol
 */
public class Time {

    // Propriedades
    private String estado;
    private String divisao; // Corrigido: removido o modificador 'private'
    private int ano;
    private String cor;
    
    /**
     * Método construtor para iniciar um novo Time
     * com os atributos fornecidos
     */
    public Time(String estado, String divisao, int ano, String cor) { 
        this.estado = estado;
        this.divisao = divisao;
        this.ano = ano; 
        this.cor = cor;
    }

    // Getters e Setters
    
    /**
     * Retorna o Estado
     */ 
    public String getEstado() {
        return this.estado;
    }
    
    /**
     * Define um novo valor para o Estado do Time
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    /**
     * Método para Adicionar Título 
     */
    public void adicionarTitulo() {
        System.out.println("Adicionando Título para o Time de "+this.estado);
    }
    
    /** 
     * Método para Retirar Título
     */
    public void retirarTitulo() { 
        System.out.println("Retirando o Título do Time de "+this.estado);
    }
}
