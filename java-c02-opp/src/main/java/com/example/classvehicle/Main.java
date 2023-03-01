package com.example.classvehicle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Velocidad Máxima: " + Vehicle.MAX_SPEED);

        Vehicle fordFiesta = new Vehicle("Ford", "Fiesta", 1.2, "SEDAN", 0, false, 20000.0, 2005);
        System.out.println(fordFiesta.manufacturer);
        System.out.println(fordFiesta.price);
        System.out.println(fordFiesta.year);

      //  Vehicle hondaCivic = Vehicle("Honda Civic", "149", 1.9, "SEDAN");
        Vehicle alfaRomeo = new Vehicle("Alfa Romeo", "149", 1.9, "SEDAN");

        /**
         * Los métodos cambian el estado del vehículo, es decir
         * los valores de sus atributos
         */

        alfaRomeo.turnOn();

        alfaRomeo.speedUp(50);

        alfaRomeo.speedUp(100);

        alfaRomeo.speedDown(40);

        alfaRomeo.speedDown(40);

        alfaRomeo.turnOff();

        /**
         * Evolucionar la clase Vehiculo
         */
        //TODO imprimir modelo completo
        String alfaRomeoFullName = alfaRomeo.getFullName();
        System.out.println(alfaRomeoFullName);

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.getFullName());

        // TODO agregar precio

        }
    }