package com.example.throwexception;
//(2)
import com.example.throwexception.exception.InvalidBookData;

import java.util.List;

/**
 * 1. Para crear BookServiceImpl, se le da botón derecho sobre BookService y se implementa la clase.
 *
 * 2. Interfaz para declarar las operaciones sobre objetos Book
 */

public interface BookService {

    // Ejemplo1: Lanza una excepción no comprobada por el compilador
    // 2. Buscar un libro por id:
    Book findById(Long id);

    // Ejemplo2: Lanza una excepción comprobada por el compilador, por eso usa (throws) con s.
    // 4. Crear/guardar libro en base de datos
    Book create(Book book) throws InvalidBookData;

    // 1. Buscar todos los libros:
    List<Book> findAll();

    // 3. Buscar por rango de páginas: 50 y 100
    List<Book> findAllByNumPagesBetween(int min, int max);

    // 5. Actualizar libro existente:
    Book update(Book bookToUpdate);

    // 6. Borrar libro:
    boolean removeById(Long id);

}
