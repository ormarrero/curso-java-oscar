package com.example.encapsulation.constructor;

public class Main {

    public static void main(String[] args) {

        /* Como es static no es necesario crear objeto.*/
        System.out.println(MessageConstants.getMessage());
        System.out.println(MessageConstants.ES_WELCOME);

        /*  Encapsulación de Constructor: si el constructor es private no se puede crear un objeto
         El objetivo es que nadie instancie la clase, simplemente la use de forma directa

        MessageConstants obj = new MessageConstants();
        */
    }
}
