package com.example.classassociations;  //  (1)

import java.util.Arrays;

public class House {

// Atributos Encapsulados:
    private Integer m2; // Metros cuadrados totales de la casa
    private Double price;   // Precio de la casa

// Asociaciones:
    private EnergyLevel energyLevel;    // Certificado energético de la casa (es un enum)
   private Room[] rooms;    // Habitaciones; es una casa y se crea un Array

// Constructores:
   // Vacío:
    public House() { }

    // Con Parámetros:
    // Se agrega (Room[] rooms) como parámetro:
    public House(Integer m2, Double price, EnergyLevel energyLevel, Room[] rooms) {
        this.m2 = m2;
        this.price = price;
        this.energyLevel = energyLevel;
    // Se agrega this.rooms = rooms;
        this.rooms = rooms;
    }

// Métodos getter y setter:

    public Integer getM2() { return m2; }

    public void setM2(Integer m2) { this.m2 = m2; }

    public Double getPrice() { return price; }

    public void setPrice(Double price) { this.price = price; }

    public EnergyLevel getEnergyLevel() { return energyLevel; }

    public void setEnergyLevel(EnergyLevel energyLevel) { this.energyLevel = energyLevel; }

// Se agrega el get y el set de Rooms

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

// toString:
// se vuelve a generar el toString para agregar rooms

    @Override
    public String toString() {
        return "House{" +
                "m2=" + m2 +
                ", price=" + price +
                ", energyLevel=" + energyLevel +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }

    public int calculateM2Rooms(){
        int totalM2 = 0;

        for (Room room: this.getRooms()) {    // Colocar: this.getRooms() es igual a colocar Arrays.asList(getRooms()
            if(room.getM2() != null)
                totalM2 += room.getM2();
        }
        return totalM2;
    }

    public int calculateM2Halls(){
        return m2 - this.calculateM2Rooms();
    }
}
