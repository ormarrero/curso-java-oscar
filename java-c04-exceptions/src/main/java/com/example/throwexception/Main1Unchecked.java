package com.example.throwexception;
import com.example.throwexception.exception.BookNotFoundException;
/**
 * EXCEPCIONES NO COMPROBADAS (UNCHECKED EXCEPTION)
 *
 * Vienen de RuntimeException
 *
 * No obligan a usar throws o capturar con try catch
 */
public class Main1Unchecked {

    public static void main(String[] args) {

        BookService bookService = new BookServiceImpl();
//       Pruebas para detectar los fallos o exceptions
//        Long bookId = null; // IllegalArgument
//        Long bookId = -5L; // IllegalArgument
//        Long bookId = 999L; // NotFound
        Long bookId = 1L; // OK

        try {
            Book book1 = bookService.findById(bookId);
            double priceWithIVA = book1.getPrice() + book1.getPrice() * 0.21;
            System.out.println(book1);
        } catch (IllegalArgumentException | BookNotFoundException e){
            e.printStackTrace();
            System.out.println(bookService.findAll());
        }
        System.out.println("fin");
    }
}
