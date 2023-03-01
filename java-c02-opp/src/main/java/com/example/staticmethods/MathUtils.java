package com.example.staticmethods;

/**
 * Clase con constantes y métodos static
 */
public class MathUtils {

    // Constantes
    public static final double PI = 3.14;

    // Atributos

    // Constructores


    // Métodos
    public static double sum (int num1, int num2){
        return num1+ num2;
    }

    public static double multiply(int num1, int num2){
        return num1 * num2;
    }

    // No es static, por lo tanto hay que crear un objeto
    public  String hello(){
        return "hello1";
    }

}
