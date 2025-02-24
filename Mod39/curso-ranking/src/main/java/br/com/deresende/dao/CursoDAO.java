<<<<<<< HEAD
package br.com.deresende.dao;

import br.com.deresende.model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    private static List<Curso> cursos = new ArrayList<>();

    static {
        // Dados dummy para teste
        cursos.add(new Curso("Engenharia", "Universidade X", 4.5));
        cursos.add(new Curso("Medicina", "Faculdade Y", 4.8));
    }

    public List<Curso> listarTodos() {
        return cursos;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        // Lógica para atualizar as notas dos cursos
    }
}
=======
package br.com.deresende.dao;

import br.com.deresende.model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    private static List<Curso> cursos = new ArrayList<>();

    static {
        // Dados dummy para teste
        cursos.add(new Curso("Engenharia", "Universidade X", 4.5));
        cursos.add(new Curso("Medicina", "Faculdade Y", 4.8));
    }

    public List<Curso> listarTodos() {
        return cursos;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        // Lógica para atualizar as notas dos cursos
    }
}
>>>>>>> 25ecb72d8c1ae08f09e42e694df6eed168d670c4
