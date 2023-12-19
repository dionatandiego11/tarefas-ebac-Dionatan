import java.util.Scanner;

public class Wrappers {
    static long valor;
    static int valorS;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        scanner();
        conversao();
        resultado();
    }

    public static void scanner() {
        System.out.println("Digite o primeiro valor: ");
        valor = scanner.nextLong();
    }
    
    public static void conversao() {
       valorS = (int) valor;
    }

    public static void resultado() {
        System.out.println("O resultado da conversão é: " + valorS);
    }
}

