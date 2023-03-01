package com.example.control.repetitive;

public class ForIf {

    public static void main(String[] args) {

        String[] names = {"person1", "person2", "person3", "person4", "aperson5"};   // length = 5
/*
        // Con este for podremos saludar a todos los que están dentro del Array
        for (int i = 0; i < names.length; i++) {
            // Con este if lo que hace es que no salude a la person 3
            if (names[i].equalsIgnoreCase("person3"))
                continue;   //este continue salta a la siguiente instrucción
            System.out.println("Welcome " + names[i]);
        }
        */
        /*
        //  El mismo ejercicio pero utilizando negación !
        for (int i = 0; i < names.length; i++) {
            // Con este if lo que hace es que no salude a la person 3 (utilizando negación)
            if (!names[i].equalsIgnoreCase("person3"))
                System.out.println("Welcome " + names[i]);
        }
        */
        // Ejemplo saludando a todas las presonas menos a las que comienzan por A
        for (int i = 0; i < names.length; i++) {
            // Se cambia equalsIgnoreCase por Contain y esta no imprime la palabra que contenga la letra A en cualquier parte
            // Se cambia equalsIgnoreCase por startsWith y esta no imprime la palabra que comience por la letra A
            if (names[i].startsWith("a"))
                continue;
            System.out.println("Welcome " + names[i]);
        }
    }
}
