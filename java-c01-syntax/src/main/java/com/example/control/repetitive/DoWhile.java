package com.example.control.repetitive;

public class DoWhile {

    public static void main(String[] args) {

        // DoWhile: se ejecuta al menos 1 vez

        String[] names = {"person1", "person2", "person3", "person4", "person5"};   // length = 5
        boolean found = true;
        int cont = 0;
/**
 * Este código lo que hace es comparar la primera posición (0) si es igual a person3
 * como no es igual, hace otro ciclo y compara la posición 1 con person3
 * como no es igual, hace otro ciclo y compara la posición 2 con person3
 * como son iguales salta al while, cambia el found a false y termina de ejecutarse
 */
        do{
            if(names[cont].equalsIgnoreCase("person3"));
            found = true;
            System.out.println(names[cont]);//Prueba1
            cont++;
        } while (!found);
        System.out.println(names[cont]);//Prueba2
    }
}
