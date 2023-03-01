package com.example.book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    // Base de datos
    private List<Book> database = new ArrayList<>();
    private Long id = 0L;

    public BookServiceImpl(){
        // datos demo
        Book book1 = new Book(null, "book1", "d1", 200, "111A", "spanish", true, 20.0, LocalDate.now(), null);
        Book book2 = new Book(null, "book2", "d2", 150, "BBBA", "spanish", true, 20.0, LocalDate.now(), null);
        Book book3 = new Book(null, "book3", "d3", 100, "CCCA", "spanish", true, 20.0, LocalDate.now(), null);
        this.create(book1);
        this.create(book2);
        this.create(book3);
    }


    @Override
    public List<Book> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Book findByDescription(String title) {
   // public Book findByDescription(String description) {

        for (Book book : database) {
            if (book.getDescription() == book.getDescription()) {
                return book;
            }
        }
        return null;
    }
    @Override
    public Book findById(Long id) {

        for (Book book : database) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    @Override
    public List<Book> findAllByNumPagesBetween(int min, int max) {
        List<Book> filteredBooks = new ArrayList<>();

        if (min <= 0) // límite inferior
            return filteredBooks;

        if (max <=  0) // límite superior
            return filteredBooks;

        if (min >= max) // comprobar que no se hayan intercambiado
            return filteredBooks;

        for (Book book : database) {
            if (book.getNumPages() >= min && book.getNumPages() <= max) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    @Override
    public Book create(Book book) {
        // Comprobar que no tiene ya un id asignado
        if (book.getId() != null)
            return null; // entonces es una actualización

        // Validar el libro: comprobar título, número mínimo de pages

        // Generar un id para el nuevo libro
        Long id = this.generateId();
        book.setId(id);
//        book.setId(++id);

        // Primera iteración: id = 1
        // Segunda iteración: id = 2
        // Tercera iteración: id = 3

        // Almacenar el libro en la estructura de datos
        database.add(book);

        return book;
    }

    /*
    Detectar el mayor id en uso
    Sumarle 1 y devolverlo, ese sería el nuevo id disponible
     */
    private Long generateId() {
        Long id = 0L;
        for (Book book : database)
            id = Math.max(id, book.getId());

        return id + 1;
    }

    @Override
    public Book update(Book bookToUpdate) {
        // Comprobar que ya tiene un id
        if (bookToUpdate.getId() == null)
            return null; // entonces es una creación

        // encontrar el libro y modificarlo
        for (Book book : database) {
            if (book.getId() == bookToUpdate.getId()) {
                // cambiar solo aquellos atributos que nos interesen en lugar de sustituir el objeto entero
                book.setTitle(bookToUpdate.getTitle());
                book.setDescription(bookToUpdate.getDescription());
                book.setNumPages(bookToUpdate.getNumPages());
                book.setAvailable(bookToUpdate.getAvailable());
                book.setPrice(bookToUpdate.getPrice());
                book.setEndDate(bookToUpdate.getEndDate());
                return book;
            }
        }

        return null;
    }

    @Override
    public boolean removeById(Long id) {

        for (Book book : database) {
            if (book.getId() == id) {
                database.remove(book);
                return true;
            }
        }
        return false;

    }

    @Override
    public Book findBy(String bookTitle) {
        return null;
    }
}
