package com.example.StringMethods;

public class StringCase {

    public static void main(String[] args) {
        String text = "Hola Mundo nuevo";

        //Coloca el texto inicial todo en minúsculas
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Coloca el texto inicial todo en mayúsculas
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);
    }
}
