package com.example.control.repetitive;

public class ForArray {

    public static void main(String[] args) {

        // Un atributo es como una varible (text)
        String text = "Hola mundo";
        int textLength = text.length();

        //    Array    =     0           1          2          3          4     length = 5
        String[] names = {"person1", "person2", "person3", "person4", "person5"};

        // Esto nos permite mostrar el array de forma ascendente
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        /* Esto nos permite mostrar el array de forma descendente
        for (int i = names.length -1; i >= 0 ; i--) {
        // se coloca int i = names.length -1 para que el length no valga 5 que está fuera del rango del array
        // se coloca i >= 0 para que muestre todas las posiciones del array
            System.out.println(names[i]);
        }*/
    }
}
