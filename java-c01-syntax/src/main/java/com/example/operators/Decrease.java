package com.example.operators;

public class Decrease {

    public static void main(String[] args) {
        int num = 5;

        /* -- Para decrementar un num, es decir: num = num - 1 (este sirve para asignar el valor a la variable
        porque lo guarda si se colocara num -1 solo suma el valor de numero pero no lo guarda)
         */

        num--;
        System.out.println(num);
        // Primero lo usa y luego lo decrementa (por eso se sigue viendo el 4)

        System.out.println(num--);
        // Primero lo decrementa y luego lo usaa (y muestra el 2)
        System.out.println(--num);
    }
}
