package br.com.deresende;

/**
 * Classe Calculadora que fornece operações matemáticas básicas.
 * Todos os métodos são privados, então a execução dos testes exige reflexão (Reflection API).
 */
public class Calculadora {

    /**
     * Método privado que realiza a adição de dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return A soma de a e b.
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Método privado que realiza a subtração de dois números inteiros.
     *
     * @param a Minuendo (valor do qual será subtraído).
     * @param b Subtraendo (valor a ser subtraído).
     * @return O resultado da subtração a - b.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método privado que realiza a multiplicação de dois números inteiros.
     *
     * @param a Primeiro fator.
     * @param b Segundo fator.
     * @return O produto de a e b.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método privado que realiza a divisão entre dois números inteiros.
     *
     * @param a Dividendo.
     * @param b Divisor (não pode ser zero).
     * @return O quociente da divisão a / b.
     * @throws ArithmeticException Se o divisor for zero.
     */
    private int dividir(int a, int b) {
        return a / b; // Lança ArithmeticException automaticamente se b for zero
    }
}
