package com.example.variables;

import java.util.Arrays;
public class ArrayDataStructure {

    public static void main(String[] args) {
        double precio1 = 4.99;
        double precio2 = 3.99;
        double precio3 = 1.99;

        //Cuando se crea un objetos en forma de array se coloca el nombre en Plural
        double[] precios = new double[3];
        precios[0] = precio1;
        precios[1] = precio2;
        precios[2] = precio3;

        System.out.println(precios[1]); // Para imprimir el precio 2 que está en la posición 1
        System.out.println(Arrays.toString(precios));   //Para imprimir todos los precios

        // Otra forma de crear un objeto
        double[] precios2 = {precio1, precio2, precio3};
        System.out.println(Arrays.toString(precios2));
    }
}
