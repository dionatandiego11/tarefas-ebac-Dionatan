// Classe ColecaoCarros que usa Generic
import java.util.List;
import java.util.ArrayList;

public class ColecaoCarros<T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void exibirCarros() {
        for (T carro : carros) {
            carro.exibirDetalhes();
        }
    }
}