package com.example.methods;

public class Methods {

    // Los métodos se crean dentro de la Clase

    public static void main(String[] args) {
        // Este es el método main (principal o especial)
        System.out.println("Hola Mundo");

        printHello(); // Llamado del metodo creado
        printText("Hola Imprimir Texto");
        // para crear métodos de forma rápida se coloca primero print+nombre y se cambia de private a public
        printNombre("Oscar", "Bienvenido a Java.");
        printNameAndSurnameAndText("María", "Torrez", "bienvenida a Java.");
    }

    private static void printNameAndSurnameAndText(String name, String surname, String text) {
        System.out.println(name + " " + surname + ", " + text);
    }

    public static void printNombre(String nombre, String mensaje) {
        // Se coloca la función que va a realizar este método, para este caso imprimir dos variables String
        System.out.println(nombre + " " + mensaje);
    }

    // Se crea otro método
    public static void printHello(){
        System.out.println("Hello");
    }

    // Se crea otro método con Parámetro
    public static void printText(String text){
        System.out.println(text);
    }
}
