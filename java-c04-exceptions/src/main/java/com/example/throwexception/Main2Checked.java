package com.example.throwexception;
import com.example.throwexception.exception.InvalidBookData;
/**
 *   EXCEPCIONES COMPROBADAS (Checked Exception)
 *     Vienen de Exception
 *
 *     Obligan a utilizar throws o capturarlas con try catch
 */
public class Main2Checked {

    public static void main(String[] args) {
        Book book = new Book(null, "hola", "fdsvdf", 200, "1212S", "spanish", true, 19.99, null, null);

        BookService bookService = new BookServiceImpl();

        // Te obliga a utilizar throws (relanzar la excepción) o capturarla con try catch para gestionarla
        try {
            bookService.create(book);
        } catch (InvalidBookData e) {
            e.printStackTrace();
        }
    }
}
