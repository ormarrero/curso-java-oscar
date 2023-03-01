package com.example.interfaces4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Instanciar la interfaz
        BookService bookService = new BookServiceImpl();


        // 2. Imprimir menú de opciones por consola
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

        // 3. Leer qué opción quiere el usuario
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt(); // Para leer un número por consola
        System.out.println("Has seleccionado la opción: " + option);

        // 4. Pedir datos y ejecutar método de interfaz

        if (option == 1){
            List<Book> books = bookService.findAll();
            System.out.println("Hay un total de " + books.size() + " libros.");
            for (Book book : books)
                System.out.println(book);

        }else if (option == 2){
            // pedir el id al usuario
            System.out.println("Introduce el id  del libro a buscar");
            long bookId = scanner.nextLong();
            Book book = bookService.findById(bookId);
            System.out.println(book);
            System.out.println(book);
            if (book == null)
                System.out.println("404 Not Found");
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
        } else if (option == 4) {
            System.out.println("Introduce el título del libro");
            String title = scanner.next();
            scanner.nextLine(); // OJO: Lee el salto de línea, para que no haya problemas con las siguientes lecturas

            System.out.println("Introduce la descripción del libro");
            String description = scanner.next();

            System.out.println("Introduce el número de páginas del libro");
            int numPages = scanner.nextInt();//OJO AQUI ESTA EL ERROR DE CAMBIO DE VARIABLE A STRING

            System.out.println("Introduce el isbn del libro");
            String isbn = scanner.next();

            System.out.println("Introduce el idioma del libro");
            String language = scanner.next();

            Boolean available = true;

            System.out.println("Introduce el precio del libro (Ejemplo: 4,75)");
            Double price = scanner.nextDouble();    // por teclado lee el número con coma

            LocalDate initDate = LocalDate.now(); // Formato: 2023-01-24

            System.out.println("Introduce el año de cierre del libro");
            int year = scanner.nextInt();

            System.out.println("Introduce el mes de cierre del libro (Ejemplo: 1 - 12)");
            int month = scanner.nextInt();

            System.out.println("Introduce el día de cierre del libro (Ejemplo: 1 - 31)");
            int day = scanner.nextInt();

            // Con la introducción de year month y day se crea la fecha
            LocalDate endDate = LocalDate.of(year, month, day); // DateTimeException

            /**
             * Ojo creo un constructor en Book cambiando a numPages a String
             */

            Book book = new Book(null, title, description, numPages, isbn, language, available, price, initDate, endDate);
            Book createBook = bookService.create(book);

            System.out.println("Se ha guardado el libro correctamente el id: " + createBook.getId());

        } else if (option == 5) {

            System.out.println("Introduce el ID del libro a actualizar");
            Long bookId = scanner.nextLong();

            Book book = bookService.findById(bookId);
            System.out.println("Estos son los datos actuales del libro: " + bookId);
            System.out.println(book);

            System.out.println("Introduce el nuevo título del libro ");
            String title = scanner.next();
            scanner.nextLine();

            System.out.println("Introduce la nueva descripción del libro: ");
            String description = scanner.next();

            System.out.println("Introduce el nuevo número de páginas del libro");
            int numPages = scanner.nextInt();

            System.out.println("Introduce la disponibilidad del libro (true/false) ");
            Boolean available = scanner.nextBoolean();

            System.out.println("Introduce el precio del libro (Ejemplo: 4,75)");
            Double price = scanner.nextDouble();

            System.out.println("Introduce el año de cierre del libro");
            int year = scanner.nextInt();

            System.out.println("Introduce el mes de cierre del libro (Ejemplo: 1 - 12)");
            int month = scanner.nextInt();

            System.out.println("Introduce el día de cierre del libro (Ejemplo: 1 - 31)");
            int day = scanner.nextInt();

            LocalDate endDate = LocalDate.of(year, month, day);

            book.setTitle(title);
            book.setDescription(description);
            book.setNumPages(numPages);
            book.setAvailable(available);
            book.setPrice(price);
            book.setEndDate(endDate);

            Book updateBook = bookService.update(book);

            if (updateBook == null)
                System.out.println("No se ha podido actualizar el libro");
            else
                System.out.println("Actualizado: " + updateBook);
        }
        else if (option == 6) {
            System.out.println("Introduce el ID del libro a borrar: ");
            Long bookId = scanner.nextLong();

            boolean isRemoved = bookService.removeByid(bookId);

            if (isRemoved)
                System.out.println("Borrado correctamente");
            else
                System.out.println("No se ha podido borrar el libro");
        }
        scanner.close();
        System.out.println("fin");
    }
}

