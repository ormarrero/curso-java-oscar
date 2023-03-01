package com.example.methods;

/**
 * Alcances de una Variable:
 * 1. Dentro de una clase.
 * 2. Dentro de un método/función.
 * 3. Dentro de una estructura de control: if, switch, for, else, while...
 * 4. Una estructura de control, dentro de otra estructura de control.
 */

// da error
// static String name = "person1"; // variable de tipo String

public class MethodsScopeGlobal {

    static String name = "person1"; // Variable String

    public static void main(String[] args) {
        int number1 = 1;
        System.out.println(name);

/*        if(true){
            int number2 = 2;
            if(true){
                int number3 = 3;
                System.out.println(number2);
            }
            //number3;
        }*/
    }
    public static void hello(){
        //System.out.println(number1);
        System.out.println(name);
    }
}
