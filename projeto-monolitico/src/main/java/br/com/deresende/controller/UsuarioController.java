package br.com.deresende.controller;

import br.com.deresende.model.Usuario;
import br.com.deresende.service.UsuarioService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UsuarioController {

    private String nome;
    private String email;

    @Inject
    private UsuarioService usuarioService;

    // Getters e setters para JSF vincular os campos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método acionado pela ação do formulário
    public String cadastrar() {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);

        // Chama o serviço para realizar as regras de negócio e persistir o usuário
        usuarioService.cadastrarUsuario(usuario);

        // Retorna para a mesma página (ou pode redirecionar para outra página)
        return "index.xhtml?faces-redirect=true";
    }
}
