package com.example.repositories;

import com.example.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Proporciona Métodos CRUD
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}
