package com.example.exceptionloops;

import java.util.Scanner;

/**
 * Menú de Book
 *
 * Fase 1: el main lo hace la lectura y creación de Book(con excepciones)
 */
public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio del libro: ");
        double price;
        do {
            try {
                price = scanner.nextDouble();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el precio (Ejemplo: 4,55) ");
                scanner.nextLine(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        } while(true);
        System.out.println("El precio es: " + price);


        System.out.println("Introduce si el libro está disponible (true o false): ");
        boolean available;
        do {
            try {
                available = scanner.nextBoolean();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo la disponibilidad (Ejemplo: true o false) ");
                scanner.nextLine(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        } while(true);
        System.out.println("El disponible es: " + available);


        System.out.println("Introduce el num pages del libro: ");
        int numPages;
        do {
            try {
                numPages = scanner.nextInt();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el num pages ");
                scanner.nextLine(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        } while(true);
        System.out.println("El numPages es: " + numPages);

    }
}
