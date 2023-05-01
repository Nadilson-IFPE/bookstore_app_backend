package com.nadilson.bookstore_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nadilson.bookstore_app.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
