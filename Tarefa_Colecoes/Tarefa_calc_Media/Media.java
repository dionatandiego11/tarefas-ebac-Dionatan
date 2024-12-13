import java.util.Scanner;

public class Media {
    static int valor1, valor2, valor3, valor4, media;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        scanner();
        media();
        resultado();
    }

    public static void scanner() {
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
    
        System.out.println("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
    
        System.out.println("Digite o quarto valor: ");
        valor4 = scanner.nextInt();
    }
    
    public static void media() {
        media = (valor1 + valor2 + valor3 + valor4)/4;
    }

    public static void resultado() {
        System.out.println("A média é: " + media);
    }
}
