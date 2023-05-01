package com.nadilson.bookstore_app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadilson.bookstore_app.domain.Categoria;
import com.nadilson.bookstore_app.domain.Livro;
import com.nadilson.bookstore_app.repositories.CategoriaRepository;
import com.nadilson.bookstore_app.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreAppApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null, "Informática", "Livros de TI");
		
		Livro livro1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", categoria1);
		
		categoria1.getLivros().addAll(Arrays.asList(livro1));
		
		this.categoriaRepository.saveAll(Arrays.asList(categoria1));
		this.livroRepository.saveAll(Arrays.asList(livro1));
		
	}

}
