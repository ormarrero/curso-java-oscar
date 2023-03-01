package com.example.exceptionloops;
import java.util.Scanner;

/**
 * PoC - Proof Of Concept - Prueba de concepto
 *
 * Probar qué pasa si se cierra y abre un Scanner, ello implica releer toda la consola si no habrá fallos
 */
public class Poc {

    public static void main(String[] args) {
/**
 * Conclusión: No cierra el primer Scanner para abrir el segundo porque genera conflicto.
 */
        Scanner scanner = new Scanner(System.in);   // Abrir escaner
        double number;
        System.out.println("Introduce el valor double para: " );
        do {
            try {
                number = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el número: " );
                // La siguiente línea con el if lo que hace es preguntar ¿tienes línea con scanner? si= leela; no=no la leas
                scanner.next(); /*Evita que se quede en un bucle infinito (desplaza el scanner debajo del texto
                para que se pueda leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
                */
            }
        } while (true);
 //       scanner.close();    // Cerrar escanner

   //     Scanner scanner = new Scanner(System.in);   // Abrir escaner
        System.out.println("Introduce el valor double para " );
        do {
            try {
                number = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el número: " );
                // La siguiente línea con el if lo que hace es preguntar ¿tienes línea con scanner? si= leela; no=no la leas
                scanner.next(); /*Evita que se quede en un bucle infinito (desplaza el scanner debajo del texto
                para que se pueda leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
                */
            }
        } while (true);
        scanner.close();    // Cerrar escanner
    }
}
