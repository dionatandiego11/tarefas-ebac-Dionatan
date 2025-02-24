package br.com.derende.controller;

import br.com.derende.model.CadastroEntity;
import br.com.derende.service.CadastroService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class CadastroController {

    @Inject
    private CadastroService service;

    private CadastroEntity entidade = new CadastroEntity();

    public void salvar() {
        try {
            service.validarESalvar(entidade);
            // Redirecionamento ou mensagem de sucesso
        } catch (Exception e) {
            // Tratar erro
        }
    }

    public CadastroService getService() {
        return service;
    }

    public void setService(CadastroService service) {
        this.service = service;
    }

    public void setEntidade(CadastroEntity entidade) {
        this.entidade = entidade;
    }

    // Getter para entidade
    public CadastroEntity getEntidade() {
        return entidade;
    }
}