import java.util.Scanner;

public class Nota {
    static int valor1, valor2, valor3, valor4; 
    static double media;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        scanner();
        media();
        System.out.println(getMedia(media));
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
        media = (valor1 + valor2 + valor3 + valor4)/4.0;
    }

    public static String getMedia(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5 && media < 7) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
