
public class Main {
    public static void main(String[] args) {
        ColecaoCarros<Carro> carros = new ColecaoCarros<>();
        carros.adicionarCarro(new CarroEsportivo("Ferrari", "488 GTB", 330));
        carros.adicionarCarro(new CarroSUV("Land Rover", "Discovery", 7));

        carros.exibirCarros();
    }
}