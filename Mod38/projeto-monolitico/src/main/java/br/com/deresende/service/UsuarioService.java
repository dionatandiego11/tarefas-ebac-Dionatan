package br.com.deresende.service;

package  br.com.deresende.service;

import  br.com.deresende.model.Usuario;
import  br.com.deresende.repository.UsuarioRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(Usuario usuario) {
        // Exemplo de regra de negócio: validar se os campos não estão vazios
        if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome é obrigatório!");
        }
        if (usuario.getEmail() == null || usuario.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("O e-mail é obrigatório!");
        }

        // Outras regras podem ser implementadas aqui

        // Persistência do usuário
        usuarioRepository.salvar(usuario);
    }
}
