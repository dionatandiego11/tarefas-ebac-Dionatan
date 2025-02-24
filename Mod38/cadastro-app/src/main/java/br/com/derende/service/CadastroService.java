package br.com.derende.service;

import br.com.derende.model.CadastroEntity;
import br.com.derende.repository.CadastroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CadastroService {

    @Inject
    CadastroRepository repository;

    public void validarESalvar(CadastroEntity entidade) throws Exception {
        if(entidade.getEmail() == null || !entidade.getEmail().contains("@")) {
            throw new Exception("Email inválido");
        }
        repository.salvar(entidade);
    }
}