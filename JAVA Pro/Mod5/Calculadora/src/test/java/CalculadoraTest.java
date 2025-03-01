import static org.junit.jupiter.api.Assertions.*;

import br.com.deresende.Calculadora;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

/**
 * Classe de testes unitários para a classe Calculadora.
 * Como os métodos da Calculadora são privados, utilizamos Reflection para acessá-los.
 */
public class CalculadoraTest {

    /**
     * Testa o método adicionar().
     * Deve retornar a soma correta de dois inteiros.
     */
    @Test
    public void testAdicionar() throws Exception {
        Calculadora calc = new Calculadora();
        Method method = Calculadora.class.getDeclaredMethod("adicionar", int.class, int.class);
        method.setAccessible(true); // Permite acesso ao método privado
        int resultado = (int) method.invoke(calc, 2, 3);
        assertEquals(5, resultado);
    }

    /**
     * Testa o método subtrair().
     * Deve retornar a diferença correta entre dois inteiros.
     */
    @Test
    public void testSubtrair() throws Exception {
        Calculadora calc = new Calculadora();
        Method method = Calculadora.class.getDeclaredMethod("subtrair", int.class, int.class);
        method.setAccessible(true);
        int resultado = (int) method.invoke(calc, 5, 3);
        assertEquals(2, resultado);
    }

    /**
     * Testa o método multiplicar().
     * Deve retornar o produto correto entre dois inteiros.
     */
    @Test
    public void testMultiplicar() throws Exception {
        Calculadora calc = new Calculadora();
        Method method = Calculadora.class.getDeclaredMethod("multiplicar", int.class, int.class);
        method.setAccessible(true);
        int resultado = (int) method.invoke(calc, 4, 3);
        assertEquals(12, resultado);
    }

    /**
     * Testa o método dividir().
     * Deve retornar o quociente correto da divisão entre dois inteiros.
     */
    @Test
    public void testDividir() throws Exception {
        Calculadora calc = new Calculadora();
        Method method = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        method.setAccessible(true);
        int resultado = (int) method.invoke(calc, 10, 2);
        assertEquals(5, resultado);
    }

    /**
     * Testa o método dividir() com divisor zero.
     * Deve lançar ArithmeticException.
     */
    @Test
    public void testDividirPorZero() throws Exception {
        Calculadora calc = new Calculadora();
        Method method = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        method.setAccessible(true);

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            try {
                method.invoke(calc, 10, 0);
            } catch (Exception e) {
                // Captura a exceção e verifica se a causa foi uma ArithmeticException
                if (e.getCause() instanceof ArithmeticException) {
                    throw (ArithmeticException) e.getCause();
                }
                throw new RuntimeException(e);
            }
        });

        assertNotNull(exception.getMessage());
    }
}
