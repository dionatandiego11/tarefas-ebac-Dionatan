import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest() {
        IContratoService service = new ContratoServiceTest();
        retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
