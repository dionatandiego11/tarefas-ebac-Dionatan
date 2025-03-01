import br.com.deresende.Documentacao;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class DocumentacaoTest {

    @Test
    public void testSomaNumeros_HappyPath() {
        final Documentacao documentacao = new Documentacao();

        final int soma = documentacao.somaNumeros(10, 10);

        assertEquals(20, soma);
    }
}