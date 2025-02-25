import java.math.BigInteger;
import java.util.Scanner;

public class FatorialBottomUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada: ");
        int numero = scanner.nextInt();
        System.out.println("Saída: " + calcularFatorialBottomUp(numero));
    }

    public static BigInteger calcularFatorialBottomUp(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }
}