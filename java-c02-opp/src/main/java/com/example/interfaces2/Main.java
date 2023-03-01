package com.example.interfaces2;

public class Main {
    /**
     * El operador instanceof permite saber si un objeto es de determinado tipo de dato
     */
    public static void main(String[] args) {
        // abstracto            concreto
        Saludo saludo1 = new SaludoFormal();
        Saludo saludo2 = new SaludoInformal();

        // Comprobar si un objeto es de un tipo de dato en concreto
        // System.out.println(saludo1 instanceof String); // da error
        System.out.println(saludo1 instanceof Saludo);  //true
        System.out.println(saludo1 instanceof SaludoFormal);    //true
        System.out.println(saludo1 instanceof SaludoInformal);  //false

        System.out.println(saludo2 instanceof Saludo);  //true
        System.out.println(saludo2 instanceof SaludoFormal);    //false
        System.out.println(saludo2 instanceof SaludoInformal);  //true


        System.out.println(saludo1);
        System.out.println(saludo2);

    }
}
