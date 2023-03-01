package com.example.wrappers;

public class Main {

    public static void main(String[] args) {

        /**
         * Wrappers o Envoltorio: Permiten utilizar valores nulos
         * se van a utlizar en
         *
         * Tipos de envoltorio para envolver a los tipos de datos primitivos.
         * Los tipos de envoltorio al ser clases proporcionan métodos para trabajar con respectivo tipo de dato.
         */

        /**
         * Entero (int)
         */
        int num0 = 1;
        Integer num1 = 1;
        Integer num2 = num0 + num1;
        System.out.println(num2);

        /**
         * Entero (long)
         */
        long number3 = 3L;
        Long number4 = 1L;

        /**
         * Decimal (float)
         */
        float number5 = 4.99f;
        Float number6 = 9.99f;

        /**
         * Decimal (double)
         */
        double number7 = 9.99d;
        Double number8 = 9.99d;

        /**
         * char: usa una sola letra y comilla simple ('')
         */
        char letterA = 'A';
        Character letterB = 'B';

        /**
         * texto o String: usa una o varias letras y comillas dobles ("")
         * No es un dato primitivo porque pertenece a una clase
         */
        String text = "Hola mundo";

        /**
         * boolean
         */
        boolean isValid1 = true;
        Boolean isValid2 = false;

        // Ejemplo para sacar el numero mayor dentro del paréntesis
        Integer result = Integer.max(5, 10);
        System.out.println("Número mayor es: " + result);

        String number ="10";
        Integer number10 = Integer.valueOf(number);
        System.out.println(number10);


    }
}
