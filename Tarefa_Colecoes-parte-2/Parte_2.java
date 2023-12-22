import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte_2 {
    static Scanner scanner = new Scanner(System.in);
    static List<String> listaNomes = new ArrayList<>();
    static List<String> masculino = new ArrayList<>();
    static List<String> feminino = new ArrayList<>();

    public static void main(String[] args) {
        realizarLeitura(); 
        realizaOrdenamento();
        realizarPrint_Masculino();
        realizarPrint_Feminino();
    }

    public static void realizarLeitura() {
        System.out.println("Digite os nomes _ sexo, separados por vírgulas: ");
        String nomes = scanner.nextLine(); 
        String[] arrayNomes = nomes.split(",");
        for (String nome : arrayNomes) {
            listaNomes.add(nome.trim());
        }
    }
        
    public static void realizaOrdenamento() {
        for (String nome : listaNomes) {
            if (nome.contains("m")) {
                masculino.add(nome);
            } else if (nome.contains("f")) {
                feminino.add(nome);
            }
        }
    }
    
    public static void realizarPrint_Masculino() {
        System.out.println("Lista de nomes masculinos: " + masculino);
    }

    public static void realizarPrint_Feminino() {
        System.out.println("Lista de nomes femininos: " + feminino);
    }
}

