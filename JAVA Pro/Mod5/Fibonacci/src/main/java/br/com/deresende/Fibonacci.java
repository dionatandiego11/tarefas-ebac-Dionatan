package br.com.deresende;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fibonacci {
    public int calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calcular(n - 1) + calcular(n - 2);
    }
}
