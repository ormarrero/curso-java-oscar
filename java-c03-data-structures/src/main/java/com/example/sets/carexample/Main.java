package com.example.sets.carexample;

import java.util.HashSet;

/**
 * HashSet: Evita los duplicados por el objeto
 * el equals: evita los duplicados por atributo (se debe seleccionar el atributo deseado).
 *
 * Al implementar los Métodos equals() y hashcode() en la clase Car, se puede distinguir si dos objetos
 * son en realidad el mismo Car en base al modelo(atributo).
 * De esta forma evittamos duplicados de Car en la estructura de datos HashSet.
 */

public class Main {

    public static void main(String[] args) {
        // Se crean los objetos carros
        Car car1 = new Car("model1", 10000.0);
        Car car2 = new Car("model2", 15000.0);
        // para que no muestre el siguiente objeto duplicado se debe hacer la comparación por equals en el
        // atributo model
        Car car2Repeat = new Car("model2", 15000.0);// duplicado
        Car car3 = new Car("model3", 20000.0);

        // Se crea el conjunto de carros
        HashSet<Car> cars = new HashSet<>();

        // Se agregan los carros al Conjunto
        cars.add(car1);
        cars.add(car3);
        cars.add(car2);
        cars.add(car2);//duplicado
        cars.add(car2Repeat);//duplicado

        System.out.println(cars);

        /**
         * Para que el HashSet verifique si hay duplicidad por el modelo que es un atributo de Cars
         * se debe generar el equals como el toString y utilizarlo.
         */
    }
}
