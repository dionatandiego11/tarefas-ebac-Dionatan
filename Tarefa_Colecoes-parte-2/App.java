import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // Criando um mapa simples para teste
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Valor1");
        lista.put(2, "Valor2");
        lista.put(3, "Valor3");

        // Imprimindo as entradas do mapa usando o loop corrigido
        System.out.println("***** foreach comum *****");
        Set<Map.Entry<Integer, String>> entrySet = lista.entrySet();
        for (Map.Entry<Integer, String> e : entrySet) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }
    }
}
