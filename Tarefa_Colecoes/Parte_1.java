import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte_1 {
    static String nomes;
    static Scanner scanner = new Scanner(System.in);
    static List<String> listaNomes = new ArrayList<>();

    public static void main(String[] args) {
        realizarLeitura(); 
        realizaOrdenamento();
        realizarPrint();
    }

    public static void realizarLeitura() {
        System.out.println("Digite os nomes, separados por vírgulas: ");
        nomes = scanner.nextLine(); 
        String[] arrayNomes = nomes.split(",");
        for (String nome : arrayNomes) {
            listaNomes.add(nome.trim());
        }
    }
        
    public static void realizaOrdenamento() {
        Collections.sort(listaNomes);
    }

    public static void realizarPrint() {
        System.out.println("Lista de nomes ordenadas" + listaNomes);
    }
}

// 