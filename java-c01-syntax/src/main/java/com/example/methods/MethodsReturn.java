package com.example.methods;

public class MethodsReturn {

    //Se crea este método para rear una variable que no va a cambiar (constante)
    public static final double IVA = 0.21;

    public static void main(String[] args) {
        double price = 4.99;
        double price2 = 7.99;

        //Crear una función que calcule el IVA de un parámetro precio y lo devuelva
        double priceWithIVA = calculateIVA(price);
        System.out.println(priceWithIVA);

        // función suma
        double suma = sum(price, price2);
        System.out.println(suma);

        // función multiplicación
        double multiplica = mul(10, 5);
        System.out.println(multiplica);

        // devolver mensaje de bienvenida para un nombre concreto
        // Muestra (welcome + name) cuando NO entra al IF
        String text = getMessage("Oscar");
        System.out.println(text);

        // Muestra (welcome user) cuando entra al IF
        text = getMessage("");
        System.out.println(text);
    }

    /*
    La función o método sino devuelve nada se puede colocar void
    si devuelve algo hay que colocar el tipo de variable que devuelve
     */

    // Función que calcula el precio con iva
    public static double calculateIVA(double price) {
        return price + (price * IVA);
    }

    // Función que suma dos números
    public static double sum(double price, double price2) {
        return price + price2;

        // Si se coloca Math. es una clase que permite crear varios métodos o diferentes operaciones
        //Math.
    }

    // Función que multiplica dos números
    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static String getMessage(String name) {
        boolean isEmpty = name.length() == 0;
        if (isEmpty)
            return "Welcome user";
        return "Welcome " + name;
    }

    // Permite crear métodos de constantes como euler o pi
    public static final double PI = 3.14;
}
