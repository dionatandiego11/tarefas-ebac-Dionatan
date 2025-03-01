import br.com.deresende.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calcular(0));
    }

    @Test
    public void testFibonacciUm() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calcular(1));
    }

    @Test
    public void testFibonacciCinco() {
        Fibonacci fib = new Fibonacci();
        assertEquals(5, fib.calcular(5)); // 0, 1, 1, 2, 3, **5**
    }

    @Test
    public void testFibonacciDez() {
        Fibonacci fib = new Fibonacci();
        assertEquals(55, fib.calcular(10)); // 55 é o 10º número da sequência
    }

    @Test
    public void testFibonacciNegativo() {
        Fibonacci fib = new Fibonacci();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fib.calcular(-1));
        assertEquals("O número não pode ser negativo.", exception.getMessage());
    }
}
