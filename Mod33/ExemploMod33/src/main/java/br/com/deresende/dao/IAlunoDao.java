package br.com.deresende.dao;

import br.com.deresende.domain.Aluno;

public interface IAlunoDao {

    public Aluno cadastrar(Aluno aluno);

    void deletarTodos();
}
