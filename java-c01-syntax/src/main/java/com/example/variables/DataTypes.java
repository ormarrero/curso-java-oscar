package com.example.variables;

public class DataTypes {

    public static void main(String[] args){
     /*
     Formato de Nombrado en Java: camelCase
     Formato de nombrado en Python: snake_case
     Formato de Nombrado en #C: PascalCase
      */
        // 1. Numéricos Enteros
        byte num1 = 127;
        short num2 = 2;
        int num3 = 500000;
        long num4 = 3434343434787L;
     /* si se coloca System.out.println(num1 + num2); imprime la suma de las dos variables
        si se coloca System.out.println(num1 + " " + num2); separa e imprime las dos variables
     */
        System.out.println(num1 + " " + num2);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // 2. Numéricos Decimales
        float num5 = 19.99f;
        double num6 = 129.999999999995d;
        System.out.println(num5);
        System.out.println(num6);

        // 3. Booleanos
        boolean validate = true;
        boolean isValidate = false;

        // 4. Textos
        char caracterA = 'a';
        //String son métodos y tienen muchos comportamientos o acciones
        String texto = "Cadena de Caracteres";
        System.out.println(caracterA);
        System.out.println(texto);
    }
}
