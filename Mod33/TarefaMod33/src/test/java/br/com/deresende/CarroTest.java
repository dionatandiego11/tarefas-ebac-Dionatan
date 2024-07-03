package br.com.deresende;

import br.com.deresende.dao.*;
import br.com.deresende.domain.Acessorios;
import br.com.deresende.domain.Carro;
import br.com.deresende.domain.Marca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;
    private IAcessoriosDao acessoriosDao;

    public CarroTest() {
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessoriosDao = new AcessoriosDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = criarMarca("M1");
        Acessorios acessorio1 = criarAcessorio("A1");
        Acessorios acessorio2 = criarAcessorio("A2");

        Carro carro = new Carro();
        carro.setCodigo("C1");
        carro.setModelo("Modelo Teste");
        carro.setMarca(marca);
        carro.addAcessorio(acessorio1);
        carro.addAcessorio(acessorio2);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }

    private Acessorios criarAcessorio(String codigo) {
        Acessorios acessorio = new Acessorios();
        acessorio.setCodigo(codigo);
        acessorio.setDescricao("Acessório " + codigo);
        return acessoriosDao.cadastrar(acessorio);
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("Marca " + codigo);
        return marcaDao.cadastrar(marca);
    }
}