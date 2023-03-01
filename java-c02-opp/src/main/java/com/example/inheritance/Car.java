package com.example.inheritance;
/**
 * Car: Clase hija 1.
 *      Clase hija de Car:
 *          Clase hija 1: ElectricCar.
 *          Clase hija 2: CombustionCar.
 *          Clase hija 3: HidrogenCar
 *
 * Car es una clase que extiende a la lase Vehicle, posibles nomenclaturas:
 * La clase inferior de la herencia: la clase hija utiliza para extender a otra.
 * 1. Clase hija.
 * 2. Clase derivada.
 * 3. Superclase.
 *
 * La clase superior de la herencia:
 * 1. Clase padre.
 * 2. Clase base
 * 3. Superclase
 *
 * La palabra super permite invocar a la desde superior desde una clase hija.
 *
 * Se utiliza normalmente para invocar al constructor de la clase superior para rellenar los atributos
 */

public class Car extends Vehicle {
    /* Se pueden generar los atributos de la clase padre, o se pueden generar desde cero, por las nuevas que
    se agreguen en esta clase hija.
     */

    // Atributos:
    private Integer numDoors;
    private Integer numPassengers;

    // Constructores:

    /**
     * OJO REVISAR SI EL CODIGO VACIO ESTA SIN PARAMETRO.
     */
//    public Car() {
//    }

    public Car(Long id, Integer numWheels, String color, Double weight) {
        super(id, numWheels, color, weight);    // super invoca el constructor de la clase Vehicle
        // Se tiene que agregar los this de los atributos creados en esta clase porque no existen en la clase padre (Vehicle)
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
    }

    public Car(long l, int i, String red, double v, int i1, int i2) {
    }

    // getter y setter:

    public Integer getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(Integer numDoors) {
        this.numDoors = numDoors;
    }

    public Integer getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }

    // Para generar todos las variables se selecciona en template: String concat (+) and super.toString()
    // el super.toString() llama al toString generado en Vehicle

    /**
     * OJO: BUSCAR EN EL CODIGO DEL PROFESOR OTRA FORMA DE HACER
     */
    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", numPassengers=" + numPassengers +
                "} " + super.toString();
    }
}
