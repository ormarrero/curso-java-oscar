package com.example.control.conditional;

public class IfElseIf {
    public static void main(String[] args) {
        double price = 156.0d;
    /*
    if-else-if: se utiliza cuando hay más de dos condiciones
     */
        if(price < 50) {
            System.out.println("Es barato");
        } else if (price < 100) {
            System.out.println("Es medio");
        } else if (price < 150) {
            System.out.println("Es caro");
        } else {
            System.out.println("Es carísimo");
        }
        System.out.println("fin del programa");
    }
}
