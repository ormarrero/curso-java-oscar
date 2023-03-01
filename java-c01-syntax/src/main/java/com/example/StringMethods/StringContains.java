package com.example.StringMethods;

public class StringContains {

    public static void main(String[] args) {

        //En este ejemplo se utiliza para comprobar si hay una palabra que coincida con el texto
        // dando como resultado un boolean
        String text = "Hola mundo nuevo";

        boolean contains = text.contains("mundo");
        System.out.println(contains);
    }
}
