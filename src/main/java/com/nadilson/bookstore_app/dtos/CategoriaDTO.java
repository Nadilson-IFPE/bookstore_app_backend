package com.nadilson.bookstore_app.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.nadilson.bookstore_app.domain.Categoria;

import jakarta.validation.constraints.NotEmpty;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;

	@NotEmpty(message = "Campo NOME é obrigatório!")
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres!")
	private String nome;
	
	@NotEmpty(message = "Campo DESCRIÇÃO é obrigatório!")
	@Length(min = 3, max = 200, message = "O campo DESCRIÇÃO deve ter entre 3 e 200 caracteres!")
	private String descricao;
	
	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

}
