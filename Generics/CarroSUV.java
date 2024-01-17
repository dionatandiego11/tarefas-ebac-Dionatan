// Classe concreta CarroSUV
class CarroSUV extends Carro {
    private int capacidadePassageiros;

    public CarroSUV(String marca, String modelo, int capacidadePassageiros) {
        super(marca, modelo);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro SUV: " + marca + " " + modelo + ", Capacidade de Passageiros: " + capacidadePassageiros);
    }
}