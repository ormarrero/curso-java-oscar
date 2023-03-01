package com.example.operators;

public class Logic {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        //  &&  (AND): comprueba que todas las condiciones sean verdaderas

        boolean res1 = num1 > 5 && num1 < 100;
        boolean res2 = num1 > 5 && num1 < 100 && num2 > 1 && num2 < 100;

        // || (OR): comprueba que AL MENOS UNA sea verdadera
        boolean res3 = 5 < 10 || 20 <15;    //true || false

        // Combinar AND y OR
        boolean res4 = 5 < 5 || 50 <= 100 && 10 < 10;
        System.out.println(res4);   // f || v && f = f
    }
}
