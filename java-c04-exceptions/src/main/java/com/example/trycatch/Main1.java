package com.example.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * Ejemplo de try-catch simple:
         */

        try {
            long option = scanner.nextLong();
        } catch (InputMismatchException e){
        /**
         * Captura el error que indica que el dato (Muestra un error cuando se escribe un dato distinto a un long)
        */
         e.printStackTrace();    // imprime por consola el error y continua el programa
         }

        System.out.println("fin");

    }
}
