package br.com.deresende.dao;

import br.com.deresende.domain.Curso;

import java.util.List;

public interface ICursoDao {

    public Curso cadastrar(Curso curso);

    public void excluir(Curso cur);

    public List<Curso> buscarTodos();

    void deletarTodos();
}
