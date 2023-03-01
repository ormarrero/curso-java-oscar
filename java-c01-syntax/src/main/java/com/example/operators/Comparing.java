package com.example.operators;

public class Comparing {

    public static void main(String[] args) {
        //  =  (Es una igualdad)
        int num1 = 5;
        int num2 = 5;
        String text1 = "hola";
        String text2 = "adios";


        // ==   (Sirve para comparar y da como resultado un boolean)
        boolean areEquals = 5 == 5;
        boolean areEquals2 = num1 == num2;
        boolean areEquals3 = text1.equals(text2);

        System.out.println(areEquals);
        System.out.println(areEquals2);
        System.out.println(areEquals3);

        // !=   (Sirve para comparar y da como resultado un boolean)
        boolean diferente = 5 != 5; // false
        boolean diferente2 = 5 != 10;    // true

        // >=   (Sirve para comparar y da como resultado un boolean)
        double precio1 = 4.99;
        double precio2 = 4.99;

        boolean MayorIgualQue = precio1 >= precio2; //false
        System.out.println(MayorIgualQue);

        // >   (Sirve para comparar y da como resultado un boolean)
        boolean MayorQue = precio1 > precio2; //false
        System.out.println(MayorQue);

        // <   (Sirve para comparar y da como resultado un boolean)
        boolean MenorQue = precio1 < precio2; //false
        System.out.println(MenorQue);

        // <=>   (Sirve para comparar y da como resultado un boolean)
        boolean MenorIgualQue = precio1 <= precio2; //true
        System.out.println(MenorIgualQue);
    }
}