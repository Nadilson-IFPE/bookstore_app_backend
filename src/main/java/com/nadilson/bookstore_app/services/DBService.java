package com.nadilson.bookstore_app.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadilson.bookstore_app.domain.Categoria;
import com.nadilson.bookstore_app.domain.Livro;
import com.nadilson.bookstore_app.repositories.CategoriaRepository;
import com.nadilson.bookstore_app.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	
	public void instanciaBaseDeDados() {
		
		Categoria categoria1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria categoria2 = new Categoria(null, "Ficção Científica", "Livros de Ficção Científica");
		Categoria categoria3 = new Categoria(null, "Biografias", "Livros de Biografias");
		
		Livro livro1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", categoria1);
		Livro livro2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", categoria1);
		Livro livro3 = new Livro(null, "The Time Machine", "H. G. Wells", "Lorem ipsum", categoria2);
		Livro livro4 = new Livro(null, "The War of the Worlds", "H. G. Wells", "Lorem ipsum", categoria2);
		Livro livro5 = new Livro(null, "I, Robot", "Isaac Asimov", "Lorem ipsum", categoria2);
		
		categoria1.getLivros().addAll(Arrays.asList(livro1, livro2));
		categoria2.getLivros().addAll(Arrays.asList(livro3, livro4, livro5));
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));
		livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3, livro4, livro5));
	}

}
