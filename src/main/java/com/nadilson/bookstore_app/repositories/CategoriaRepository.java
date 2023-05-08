package com.nadilson.bookstore_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadilson.bookstore_app.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
