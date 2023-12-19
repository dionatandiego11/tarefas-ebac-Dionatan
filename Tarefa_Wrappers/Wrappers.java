import java.util.Scanner;

public class Wrappers {
    static int valor; // valor primitivo
    static Integer valorS; // valor como objeto Integer
    static Scanner scanner = new Scanner(System.in); // scanner para ler a entrada

    public static void main(String args[]) {
        scanner(); // lê o valor
        conversao(); // converte o valor para Integer
        resultado(); // imprime o valor e o tipo
    }

    public static void scanner() {
        System.out.println("Digite o valor: ");
        valor = scanner.nextInt(); // lê o valor
    }
    
    public static void conversao() {
       valorS = Integer.valueOf(valor); // converte o valor para Integer
    }

    public static void resultado() {
        System.out.println(valorS); // imprime o valor
        System.out.println("Tipo do valor convertido: " + valorS.getClass().getSimpleName()); // imprime o tipo do valor convertido
    }
}
