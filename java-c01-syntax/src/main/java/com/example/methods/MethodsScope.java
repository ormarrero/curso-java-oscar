package com.example.methods;

/**
 * Método: Comportamiento asociado a un objeto. Contexto de POO
 * Función: Acción General
 */

public class MethodsScope {     //scoope=alcance

    public static void main(String[] args) {

        double result = calculateIVA(100);
        System.out.println(result);

        //System.out.println(number2);
        int number3;
        if(true){
            number3 = 5;
        }
        System.out.println(number3);
    }

    private static double calculateIVA(int number){
        number = 121;
        System.out.println(number);

        int number2 = 500;
        // System.out.println(number2);
        return number;
    }
}
