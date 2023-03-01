package com.example.interfaces4;
//(2)
import java.util.List;

/**
 * (2)
 * Interfaz para declarar las operaciones/métodos sobre objetos Book
 */
public interface BookService {

    // CRUD

    // 1. Buscar todos los libros
    List<Book>findAll();

    // 2. Buscar un libro por su id
    Book findById(Long id);

    // 3. Buscar por rango de páginas: 50 y 100
    List<Book>findAllByNumPagesBetween(int min, int max);

    // 4. Crear o Guardar un libro en Base de Datos (puede devolver Book, void, boolean)
    Book create(Book book);

    // 5. Actualizar un libro existente
    Book update(Book bookToUpdate);// ojo se cambio el nombre update

    // 6. Eliminar un libro (Devuelve un boolean o un void)
    boolean removeByid(Long book);

    boolean removeById(Long bookId);
}
