import java.math.BigInteger;
import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada: ");
        int numero = scanner.nextInt();
        System.out.println("Saída: " + calcularFatorial(numero));
    }

    public static BigInteger calcularFatorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
        }
    }
}