package com.example.throwexception.exception;
// Se cambia la extensión (Throwable) por Exception
// Es una Exception Comprobada (Checked)
public class InvalidBookData extends Exception {
    public InvalidBookData(String s){}
}
