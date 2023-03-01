package com.example.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        /**
         * Ejemplo de try múltiples catch, para cada tipo de excepción:
         */

            try {
                // Excetion1:
                long option = scanner.nextLong();

                // Exception 2:
            // long operation / 0L;
                long operation = option / 1L;

                // Exception 3
                int[] array = new int[2];
                array[5] = 5;

            } catch (InputMismatchException e){
                e.printStackTrace();

            } catch (ArithmeticException e){
                e.printStackTrace();

            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }

            /**
             * Exception para asegurarse de capturar la excepción sea cual sea.
             */

            System.out.println("fin");

    }
}
