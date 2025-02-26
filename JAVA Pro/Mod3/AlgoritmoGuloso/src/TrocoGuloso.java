import java.util.Arrays;
import java.util.Scanner;

public class TrocoGuloso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantia para o troco: ");
        int quantia = scanner.nextInt();

        System.out.print("Digite a quantidade de tipos de moedas disponíveis: ");
        int n = scanner.nextInt();

        int[] moedas = new int[n];
        System.out.println("Digite os valores das moedas (em ordem):");
        for (int i = 0; i < n; i++) {
            moedas[i] = scanner.nextInt();
        }

        // Ordenar as moedas em ordem decrescente
        Arrays.sort(moedas);
        for (int i = 0; i < n / 2; i++) {
            int temp = moedas[i];
            moedas[i] = moedas[n - i - 1];
            moedas[n - i - 1] = temp;
        }

        // Aplicar o algoritmo guloso
        int[] quantidadeMoedas = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            quantidadeMoedas[i] = quantia / moedas[i];
            quantia %= moedas[i];
            total += quantidadeMoedas[i];
        }

        // Exibir o resultado
        System.out.println("Número total de moedas: " + total);
        System.out.println("Distribuição de moedas:");
        for (int i = 0; i < n; i++) {
            if (quantidadeMoedas[i] > 0) {
                System.out.println(quantidadeMoedas[i] + " moeda(s) de " + moedas[i]);
            }
        }

        scanner.close();
    }
}