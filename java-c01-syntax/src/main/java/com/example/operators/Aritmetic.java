package com.example.operators;

public class Aritmetic {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int sum = num1 + num2;
        int res = num1 - num2;
        int mul = num1 * num2;
    /*
    Para el caso de la división se debe colocar double dos veces para que muestre el resultado
     con decimal correcto
    */
        double div = (double) num1 / num2;
        float div2 = (float) num1 / num2;

        System.out.println(sum);
        System.out.println(res);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(div2);

        //Para calcular el resto o el módulo de un número es con %
        int a =  num2 % 2;
        System.out.println(a);
    }
}
