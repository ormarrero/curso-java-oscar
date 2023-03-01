package com.example.trycathfinally;
import java.util.Scanner;

public class Main {
    /*
    finally se utiliza para cerrar recursos independientemente de si
    se ha ejecutado bien el try o se ha ejecutado el catch

    Ejemplos:
    - Cerrar conexión a base de datos
    - Cerrar scanner
    - Cerrar flujos de datos a archivos
    - Cerrar conexiones socket
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long option;
        try{
            option = scanner.nextLong();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // Se utiliza finally para cerrar recursos
            scanner.close();
        }
    }
}
