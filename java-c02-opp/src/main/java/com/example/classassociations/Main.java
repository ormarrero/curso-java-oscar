package com.example.classassociations;

public class Main {

    public static void main(String[] args) {
        // Crear 3 habitaciones
        Room room1 = new Room(10, 1, true);
        Room room2 = new Room(10, 2, false);
        Room room3 = new Room(10, 0, true);

        // Crear una casa
        Room[] rooms = {room1, room2, room3};   // Se crea un array para colocar el 4to parámetro de la casa
        House house1 = new House(50, 100000d, EnergyLevel.LEVEL_0, rooms);  // Para el 4to parámetro hay que pasar un array
        House house2 = new House(50, 100000d, EnergyLevel.LEVEL_0, new Room[]{room1, room2, room3});

    // Métodos que calcule:
        // m2 de las habitaciones:
        int roomsM2 = house1.calculateM2Rooms();
        System.out.println("Metros cuadrados totales ocupados por las habitaciones: " + roomsM2);

        // m2 del RESTO DE LA CASA: pasillos, escaleras, descansillo...
        int hallsM2 = house1.calculateM2Halls();
        System.out.println("Metros cuadrados totales ocupados por pasillos: " + hallsM2);
    }
}
