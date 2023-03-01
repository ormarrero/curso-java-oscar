package com.example.constants;

public class Constants {

    // Las Constantes: no cambian de valor. Por defecto las ponemos en MAYÚSCULAS.

    public static final double IVA = 0.21d;
    static final String DEFAULT_USERNAME = "anonimo";
    static final double IRPF = 0.15d;
/*
    1. final: significa que no deja modificarse la constante.
    2. Las constantes finales se colocan en Mayúsculas.
    3. En el ejemplo de String, lo que hace es que si no se coloca  ningún nombre, coloca anonimo
*/
    public static void main(String[] args) {
        String nombre = "Oscar";
        double iva = 0.21;
        iva = 0.25;

        //Ejemplo para calcular el iva de una marca
        double asusPrice = 1200.0d;
        double asusPriceIVA = asusPrice + (asusPrice * iva);
        System.out.println(asusPriceIVA);

        String nombre2 = "user1" + DEFAULT_USERNAME;
    }
}