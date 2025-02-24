package br.com.deresende.repository;

import br.com.deresende.model.Usuario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioRepository {

    @PersistenceContext(unitName = "MeuPU")
    private EntityManager em;

    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }
}
