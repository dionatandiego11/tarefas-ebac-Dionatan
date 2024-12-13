package br.com.deresende.controller;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.deresende.domain.Produto;
import br.com.deresende.service.IProdutoService;

@Named
@ViewScoped
public class ProdutoController implements Serializable {


	private static final long serialVersionUID = -7421034247413419407L;

	private Produto produto;

	private Collection<Produto> produtos;

	@Inject
	private IProdutoService produtoService;

	private Boolean isUpdate;

	@PostConstruct
    public void init() {
		try {
			this.isUpdate = false;
			this.produto = new Produto();
			this.produtos = produtoService.buscarTodos();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar listar os produtos"));
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

	public Boolean getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(Boolean isUpdate) {
		this.isUpdate = isUpdate;
	}

}
