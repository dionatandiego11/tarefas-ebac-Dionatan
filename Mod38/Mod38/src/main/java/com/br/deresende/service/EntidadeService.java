package com.br.deresende.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import com.br.deresende.model.Entidade;
import com.br.deresende.repository.EntidadeRepository;

@ApplicationScoped
public class EntidadeService {

    @Inject
    EntidadeRepository repository;

    public void validarESalvar(Entidade entidade) throws IllegalArgumentException {
        if (entidade.getEmail() == null || !entidade.getEmail().contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }

        // Validações adicionais...

        repository.salvar(entidade);
    }
}