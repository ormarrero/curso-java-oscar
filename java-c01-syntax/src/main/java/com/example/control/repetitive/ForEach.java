package com.example.control.repetitive;

public class ForEach {

    public static void main(String[] args) {

        // ForEach es para cada elemento, es igual al for pero se escribe de forma mas reducida

        String[] names = {"person1", "person2", "person3", "person4", "person5"};   // length = 5

        //  tipo de variable del Array nombre que le das al for: nombre del array
        for (String name : names) {
            System.out.println(name);
        }

        // Ejemplo con Array de números (precios)
        double[] prices = {5.99, 3.99, 2.11};

        for (double price : prices) {
            System.out.println(price);
        }
    }
}
