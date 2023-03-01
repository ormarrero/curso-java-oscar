package com.example.control.repetitive;

public class For {

    public static void main(String[] args) {

        // for: Estructura de Control Repetitivo
        // for each
        // for i: Estructura de Control Repetitivo (inicio: i=0; fin: i<10; incremento:i++)
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + i);

        // si queremos contar hasta un millón se puede colocar 1_000_000 para hacer más fácil la vista
        }*/
        /*  EJEMPLO 2: Cuenta de 2 en 2
        for (int i = 0; i < 20; i+=2) {
            System.out.println("Número: " + i);
        }*/
        /*EJEMPLO 3: Cuenta de forma regresiva o descendente*/
        for (int i = 20; i > 0; i--) {
            System.out.println("Número: " + i);
        }
    }
}
