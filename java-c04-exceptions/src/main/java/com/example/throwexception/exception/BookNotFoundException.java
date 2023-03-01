package com.example.throwexception.exception;

// Se cambia la extensión (Throwable) por RuntimeException
// No comprobada (Unchecked)
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String s) {
    }
}
