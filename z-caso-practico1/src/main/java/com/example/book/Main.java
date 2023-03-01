package com.example.book;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instanciar la interfaz
        BookService bookService = new BookServiceImpl();

        // Imprimir menú de opciones por consola
        System.out.println("""
                Welcome to Library App:
                1. Find all books
                2. Find one book by id
                3. Find all books by num pages
                4. Create a new book
                5. Update a book
                6. Remove a book
                7. Exit
                """);

        // leer qué opción quiere el usuario
        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();

        System.out.println("Has seleccionado la opción: " + option);

        // pedir datos y ejecutar método de interfaz
        if (option == 1){
            List<Book> books = bookService.findAll();
            System.out.println("Hay un total de " + books.size() + " libros.");
            for (Book book : books)
                System.out.println(book);

        } else if (option == 2){
            // pedir el id al usuario
            System.out.println("Introduce el id del libro a buscar:");
            String bookDescription = scanner.next();
            Book book = bookService.findByDescription(bookDescription);

            if (book == null)
                System.out.println("404 Not Found - Libro no encontrado");
            else
                System.out.println(book);

        } else if (option == 3) {
            System.out.println("Introduce el número mínimo de páginas:");
            int min = scanner.nextInt();
            System.out.println("Introduce el número máximo de páginas:");
            int max = scanner.nextInt();

            List<Book> books = bookService.findAllByNumPagesBetween(min, max);
            for (Book book : books)
                System.out.println(book);

            if(books.size() == 0)
                System.out.println("No hay libros con ese rango de paginas en este momento");
        }
        else if (option == 4) {

            System.out.println("Introduce el título del libro ");
            String title = scanner.next();
            scanner.nextLine(); // OJO: lee el salto de línea para que no haya problemas con las siguientes lecturas

            System.out.println("Introduce la descripción del libro:");
            String description = scanner.next();

            System.out.println("Introduce el num pages del libro:");
            int numPages = scanner.nextInt();

            System.out.println("Introduce el isbn del libro:");
            String isbn = scanner.next();

            System.out.println("Introduce el idioma del libro:");
            String language = scanner.next();

            Boolean available = true;

            System.out.println("Introduce el precio del libro (Ejemplo: 4,76)");
            Double price = scanner.nextDouble();

            LocalDate initDate = LocalDate.now(); // 2023-01-24

            System.out.println("Introduce el año de cierre del libro");
            int year = scanner.nextInt();

            System.out.println("Introduce el mes de cierre del libro (Ejemplo: 1 - 12)");
            int month = scanner.nextInt();

            System.out.println("Introduce el día de cierre del libro (Ejemplo: 1 - 31)");
            int day = scanner.nextInt();

            LocalDate endDate = LocalDate.of(year, month, day); // DateTimeException

            Book book = new Book(null, title, description, numPages, isbn, language, available, price, initDate, endDate);

            Book createdBook = bookService.create(book);

            System.out.println("Se ha guardado el libro correctamente con el id: " + createdBook.getId());
        }

        else if (option == 5) {

            System.out.println("Introduce el ID del libro a actualizar:");
            Long bookId = scanner.nextLong();

            Book book = bookService.findById(bookId);
            System.out.println("Estos son los datos actuales del libro: " + bookId);
            System.out.println(book);

            System.out.println("Introduce el nuevo título del libro ");
            String title = scanner.next();

            scanner.nextLine(); // OJO: lee el salto de línea para que no haya problemas con las siguientes lecturas

            System.out.println("Introduce la nueva descripción del libro:");
            String description = scanner.next();

            System.out.println("Introduce el nuevo num pages del libro:");
            int numPages = scanner.nextInt();

            System.out.println("Introduce disponibilidad del libro (true o false) ");
            Boolean available = scanner.nextBoolean();

            System.out.println("Introduce el precio del libro (Ejemplo: 4,76)");
            Double price = scanner.nextDouble();

            System.out.println("Introduce el año de cierre del libro");
            int year = scanner.nextInt();

            System.out.println("Introduce el mes de cierre del libro (Ejemplo: 1 - 12)");
            int month = scanner.nextInt();

            System.out.println("Introduce el día de cierre del libro (Ejemplo: 1 - 31)");
            int day = scanner.nextInt();

            LocalDate endDate = LocalDate.of(year, month, day); // DateTimeException

            book.setTitle(title);
            book.setDescription(description);
            book.setNumPages(numPages);
            book.setAvailable(available);
            book.setPrice(price);
            book.setEndDate(endDate);

            Book updatedBook = bookService.update(book);

            if (updatedBook == null)
                System.out.println("No se ha podido actualizar el libro");
            else
                System.out.println("Actualizado: " + updatedBook);
        }
        else if(option == 6){
            System.out.println("Introduce el ID del libro a borrar:");
            Long bookId = scanner.nextLong();

            boolean isRemoved = bookService.removeById(bookId);

            if (isRemoved)
                System.out.println("Borrado correctamente");
            else
                System.out.println("No se ha podido borrar el libro");
        }


        scanner.close();
        System.out.println("fin");
    }
}
