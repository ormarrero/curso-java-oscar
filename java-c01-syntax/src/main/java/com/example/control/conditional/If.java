package com.example.control.conditional;

public class If {

    public static void main(String[] args) {

    /*
    Esta función imprime verdadero cuando es true,
    si es falso no imprime nada
    */
        boolean isValid = true;

        // if sin llaves (solo cuando hay una línea dentro
        if(isValid) System.out.println("Es verdadero");

        // if con llaves
        if(isValid) {
            System.out.println("Es verdadero");
            System.out.println("Es verdadero");
        }

        // if - else sin llaves. Ejecuta una de las dos pero no las dos
        if(isValid)
            System.out.println("Es verdadero");
        else
            System.out.println("Es falso");

        // if - else con llaves
        boolean isValid1 = false;
        if(isValid1) {
            System.out.println("Es verdadero");
        }else {
            System.out.println("Es falso");
        }

        // Operador Ternario
        //Cuando se cumple la condicion muestra 5.5 y cuando no la cumple muestra 0
        double precio = 20.0d;
        double shipCost = precio > 100.0d ? 0d : 5.5d;
        System.out.println(shipCost);

        // comparación ==
        double number1 = 5.0d;
        double number2 = 10.0d;
        // Compara si ambos números son iguales
        if(number1 == number2){
            System.out.println("Numeros iguales");
        }else {
            System.out.println("Numeros diferentes");
        }
    }
}