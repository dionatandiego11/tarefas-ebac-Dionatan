import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FatorialTopDown {
    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada: ");
        int numero = scanner.nextInt();
        System.out.println("Saída: " + calcularFatorialTopDown(numero));
    }

    public static BigInteger calcularFatorialTopDown(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        BigInteger resultado = BigInteger.valueOf(n).multiply(calcularFatorialTopDown(n - 1));
        memo.put(n, resultado);
        return resultado;
    }
}