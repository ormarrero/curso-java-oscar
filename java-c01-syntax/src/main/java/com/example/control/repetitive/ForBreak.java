package com.example.control.repetitive;

public class ForBreak {

    public static void main(String[] args) {

        String[] names = {"person1", "person2", "person3", "person4", "person5"};   // length = 5

        // Comprobar si person 3 está presente en el array

        boolean isPresent = false;

        for (int i = 0; i < names.length; i++) {
            /**
             * Con este if lo que hace es comparar si i es igual a person 3,
             * mientras no sea igual se sigue repitiendo el ciclo for,
             * cuando i es igual person3, salta a la instrucción break,
             * que hace que se salga del ciclo y entre en la condición if
             */
            if (names[i].equalsIgnoreCase("person3")) {
                isPresent = true;
                break;
                /**
                 *Este break hace que se salga cuando se cumpla la condición y no siga reccorriendo el Array
                 * lo que hace que salte a la instrucción if
                 */
            }
        }
        if(isPresent)
            System.out.println("Person3 SI está en listado");
    }
}
