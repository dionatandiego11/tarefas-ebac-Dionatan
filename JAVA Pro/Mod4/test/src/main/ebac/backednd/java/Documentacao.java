package main.ebac.backednd.java;

/**
 * Classe que é utilizada no curso da EBAC de Java Backend Pro para explicação
 * sobre a importância de se documentar código.
 */
public class Documentacao {

    public int somaNumeros(int a, int b) {
        return a + b;
    }

    /**
     * Calcula o MDC pelo algoritmo de Stein.
     *
     * cálculoMDC(0, n2) = n2, cálculoMDC(n1, 0) = n1, cálculoMDC(0, 0) = 0.
     * Quando n1 e n2 são ambos números pares, então cálculoMDC(n1, n2) = 2 * cálculoMDC(n1/2, n2/2),
     * já que 2 é o divisor comum.
     * Quando n1 é par e n2 é ímpar, então cálculoMDC(n1, n2) = cálculoMDC(n1/2, n2),
     * já que 2 não é divisor comum e vice-versa.
     * Quando n1 e n2 são ímpares e n1 > n2, então cálculoMDC(n1, n2) = cálculoMDC(n1-n2, n2) e vice-versa.
     *
     * @param n1 O próximo número a ser usado no cálculo do MDC.
     * @param n2 O segundo número a ser usado no cálculo do MDC.
     * @return O resultado do cálculo do MDC.
     */
    public int calculaMDC(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }

        if (n2 == 0) {
            return n1;
        }

        int p;
        for (p = 0; ((n1 | n2) & 1) == 0; ++p) {
            n1 >>= 1;
            n2 >>= 1;
        }

        while ((n1 & 1) == 0) {
            n1 >>= 1;
        }

        do {
            while ((n2 & 1) == 0) {
                n2 >>= 1;
            }
            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            n2 = n2 - n1;
        } while (n2 != 0);

        return n1 << p;
    }
}
