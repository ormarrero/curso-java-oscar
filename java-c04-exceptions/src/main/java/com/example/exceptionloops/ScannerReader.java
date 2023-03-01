package com.example.exceptionloops;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * SE CREA UN MÉTODO: Para leer Números, String, Boolean.
 *
 * MÉTODO PARA LEER UN DOUBLE
 */
public class ScannerReader {

    // 1. Se crea un atributo private Scanner
    private Scanner scanner;

    // 2. Se crea un atributo vacío de ScannerReader
    public ScannerReader(){
        // 3. Se inicializa el Scanner
        scanner = new Scanner(System.in);
    }

    public double readDouble(String attribute){

        //scanner = new Scanner(System.in);
        double number;
        System.out.println("Introduce el valor double para " + attribute);
        do {
            try {
                number = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el número: " + attribute);
                scanner.next();
                /**
                 * scanner.next(); /*Evita que se quede en un bucle infinito de error (desplaza el scanner debajo del
                 * texto para que se pueda leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
                 */
                            }
        } while (true);
        return number;
    }
    // 4. Se crea un método para cerrar el scanner
    /**
     * Para hacerlo para String o Boolean se debe hacer otro método aparte igual
     */

    // 5. Se crea un Scanner para Boolean
    public boolean readBoolean(String attribute) {

        boolean check;
        System.out.println("Introduce el valor boolean para " + attribute);
        do {
            try {
                check = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el: " + attribute);
                scanner.next();
                /**
                 * scanner.next(); /*Evita que se quede en un bucle infinito de error (desplaza el scanner debajo del
                 * texto para que se pueda leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
                 */
            }
        } while (true);
        return check;
    }

    // 6. Se crea un Scanner para Int
    public int readInt(String attribute) {

        int entero;
        System.out.println("Introduce el valor entero para " + attribute);
        do {
            try {
                entero = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el: " + attribute);
                scanner.next();
                /**
                 * scanner.next(); /*Evita que se quede en un bucle infinito de error (desplaza el scanner debajo del
                 * texto para que se pueda leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
                 */
            }
        } while (true);
        return entero;
    }
    // 7. Se crea un Scanner para String

            public String readString(String attribute){

                String text;
                System.out.println("Introduce el valor texto para: " + attribute);
                do {
                    try {
                        text = scanner.next();
                        break;
                    } catch(Exception e) {
                        System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                        scanner.next();
                    }
                } while(true);
                return text;
            }

    public void close(){
        scanner.close();
    }
    public LocalDate readLocalDate(String attribute) {
        return null;
    }

    public LocalDate readLocalTime(String attribute) {
        return null;
    }

}



