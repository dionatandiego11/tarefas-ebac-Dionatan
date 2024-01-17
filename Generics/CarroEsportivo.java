// Classe concreta CarroEsportivo
class CarroEsportivo extends Carro {
    private int velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int velocidadeMaxima) {
        super(marca, modelo);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro Esportivo: " + marca + " " + modelo + ", Velocidade Máxima: " + velocidadeMaxima);
    }
}