import java.util.ArrayList;
import java.util.List;

// Classe abstrata Carro
abstract class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirDetalhes();
}