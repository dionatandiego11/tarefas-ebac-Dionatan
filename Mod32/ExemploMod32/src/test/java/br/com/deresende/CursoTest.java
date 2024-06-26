package br.com.deresende;

import br.com.deresende.dao.ICursoDao;
import br.com.deresende.domain.Curso;
import org.junit.jupiter.api.Test;
import br.com.deresende.dao.CursoDao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A9");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
