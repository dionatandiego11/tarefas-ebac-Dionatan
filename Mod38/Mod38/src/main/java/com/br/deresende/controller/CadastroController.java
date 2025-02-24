package com.br.deresende.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import com.br.deresende.model.Entidade;
import com.br.deresende.service.EntidadeService;

@Named
@RequestScoped
public class CadastroController {

    private Entidade entidade = new Entidade();

    @Inject
    EntidadeService service;

    public String salvar() {
        try {
            service.validarESalvar(entidade);
            return "confirmacao?faces-redirect=true";
        } catch (IllegalArgumentException e) {
            // Adicionar mensagem de erro (ex: FacesContext)
            return null;
        }
    }

    public Entidade getEntidade() {
        return entidade;
    }
}
