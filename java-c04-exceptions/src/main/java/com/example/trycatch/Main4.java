package com.example.trycatch;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * Ejemplo de try multicatch en caso de que el tratamiento sea el mismo para todos los errores::
         */

        try {
            // Exception1:
            long option = scanner.nextLong();

            // Exception2:
            //    long operation = option / 0L;
            long operation = option / 1L;

            // Exception 3:
            int[] array = new int[2];
            array[5] = 5;

        } catch (Exception e) { // Captura cualquier tipo de excepción
            e.printStackTrace();
        }

        /**
         *  Exception para asegurarse de capturar la exception sea la que sea.
         */

        System.out.println("fin");

    }
}