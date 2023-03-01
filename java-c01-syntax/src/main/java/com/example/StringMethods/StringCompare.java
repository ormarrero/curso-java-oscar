package com.example.StringMethods;

public class StringCompare {

    public static void main(String[] args) {
        String nombre1 = "Hola";
        String nombre2 = "Adios";
        /*
        Cuando se coloca nombre1. se ven todos los métodos que se pueden utilizar.
        Para el siguiente ejemplo solo te imprimirá verdadero si ambas variables son iguales y falso en caso
        contrario.
         */
        boolean isEquals = nombre1.equalsIgnoreCase(nombre2);
        System.out.println(isEquals);
    }
}
