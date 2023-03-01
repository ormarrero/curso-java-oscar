package com.example.interfaces4;
// (3)
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    // 0. Se crea una Base de Datos:
    private List<Book>database = new ArrayList<>();
    private Long id = 0L;

    // 0-1 Se crea un constructor vacio para crear varios libros
    public BookServiceImpl() {
        Book book1 = new Book(null, "book1", "d1", 200, "111A", "spanish", true, 20.0, LocalDate.now(), null);
        Book book2 = new Book(null, "book2", "d2", 150, "222B", "spanish", true, 20.0, LocalDate.now(), null);
        Book book3 = new Book(null, "book3", "d3", 100, "333C", "spanish", true, 20.0, LocalDate.now(), null);
        this.create(book1);
        this.create(book2);
        this.create(book3);
    }

    // 1. Buscar todos los libros
    @Override
    public List<Book> findAll() {
        return new ArrayList<>(database);   // Devuelve la misma BD en lista
    }

    // 2. Buscar un libro por su id
    @Override
    public Book findById(Long id) {

        for (Book book : database) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // 3. Buscar por rango de páginas: 50 y 100
    /**
     * 1. No se puede hacer return porque es una lista.
     * 2. Se debe hacer un ArrayList.
     * 3. Se debe hacer programación defensiva (comprobar un minimo de páginas
     * 4. Como min y max se convierten a variable primitiva (int) no se compara con null
     */
    @Override
    public List<Book> findAllByNumPagesBetween(int min, int max) {
        List<Book> filteredBooks = new ArrayList<>();

        if ( min <= 0)  // Comprobación Límite Inferior
            return filteredBooks;

        if ( max <= 0) // Comprobación Límite Superior
            return filteredBooks;

        if (min >= max)     // Comprobación que no estén mal los Límites (no estén intercambiados)
            return filteredBooks;

        for (Book book:database) {
            if (book.getNumPages() >= min && book.getNumPages() <= max){
                filteredBooks.add(book);
            }
        }
         return filteredBooks; // No retorna un null porque se está generando
    }

    // 4. Crear o Guardar un libro en Base de Datos (puede devolver Book, void, boolean)
    /**
     * 1. Comprobar que no tiene ya un id asignado.
     * 2. Validar el libro: comprobar título, número min de páginas (se hace luego)
     * 3. Hay que generar un id para el nuevo libro.
     * 4. Almacenar el libro en la estructura de datos
     */
    @Override
    public Book create(Book book) {
        if (book.getId() != null)   //(1) Si tiene algún id se sale
        return null;

        Long id = this.generateId();    // (3)
        book.setId(id);
        //book.setId(id++)  //Esta opción se una para la declaración que está debajo de la base de datos
                            // Se busca el id max y se le suma 1 para ser agregado
        // Primera iteraccion id = 1
        // Segunda iteraccion id = 2
        // Tercera iteraccion id = 3

        database.add(book); // (4)
        return book;
    }
    // Este método se creó del paso (3). Es privado para no poder ser accedido desde main
      /*
    Detectar el mayor id en uso
    Sumarle 1 y devolverlo, ese sería el nuevo id disponible
     */
    private Long generateId() {
        Long id = 0L;               // Declaro id Long como la var incial
        for (Book book: database)  // Esto itera sobre los libros que ya existen
            id = Math.max(id, book.getId());
        return id + 1;
    }

    // 5. Actualizar un libro existente
    @Override
    public Book update(Book bookToUpdate) { // cambiar el nombre en la interfaz también
        if (bookToUpdate.getId() == null)   // Comprobar que ya tiene un id
            return null;    // Entonces es una creación

        // Encontrar el libro y modificarlo
        for (Book book:database) {
            if (book.getId() == bookToUpdate.getId()){
                // Cambiar solo aquellos atributos que nos interesen
                book.setTitle(bookToUpdate.getTitle()); // Cambia el título
                book.setDescription(bookToUpdate.getDescription()); // Cambia la descripción
                book.setNumPages(bookToUpdate.getNumPages());   // Cambia el número de páginas
                book.setAvailable(bookToUpdate.getAvailable()); // Cambia la disponibilidad
                book.setPrice(bookToUpdate.getPrice()); // Cambia el precio
                book.setEndDate(bookToUpdate.getEndDate()); // Cambia la fecha final (posponer la fecha para quitar la publicación)
                return book;
            }
        }
        return null;
    }

    // 6. Eliminar un libro (Devuelve un boolean o un void)
    @Override
    public boolean removeByid(Long id) {

        for (Book book: database) {
            if (book.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeById(Long bookId) {
        return false;
    }

}
