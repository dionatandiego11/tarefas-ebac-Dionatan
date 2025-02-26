import java.util.ArrayList;
import java.util.List;

public class SubsetBacktracking {

    // Função recursiva que gera os subconjuntos
    private static void backtrack(int[] S, int n, int start, List<Integer> current, List<List<Integer>> subsets) {
        // Caso base: se o tamanho atual do subconjunto é igual a n, adiciona uma cópia dele à lista de subconjuntos
        if (current.size() == n) {
            subsets.add(new ArrayList<>(current));
            return;
        }
        // Itera pelos elementos começando do índice "start" para evitar repetições
        for (int i = start; i < S.length; i++) {
            // Escolhe o elemento S[i]
            current.add(S[i]);
            // Chama recursivamente incrementando o índice para evitar usar o mesmo elemento novamente
            backtrack(S, n, i + 1, current, subsets);
            // Remove o último elemento para voltar atrás (backtracking)
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Exemplo de entrada
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subsets = new ArrayList<>();

        // Chamada inicial do backtracking
        backtrack(S, n, 0, new ArrayList<>(), subsets);

        // Exibe os subconjuntos encontrados
        System.out.println("Subconjuntos de tamanho " + n + ":");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
