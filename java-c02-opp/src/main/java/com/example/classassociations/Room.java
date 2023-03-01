package com.example.classassociations;  //  (2)

public class Room {

// Atributos Encapsulados:
    private Integer m2; //  Metros cuadrados de la habitación
    private  Integer numWindows;    // Nº de ventanas
    private Boolean airConditioner; // Posee AA? Si o No?

// Contructores:
    // Vacío:
    public Room() { }

    // Con parámetros:
    public Room(Integer m2, Integer numWindows, Boolean airConditioner) {
        this.m2 = m2;
        this.numWindows = numWindows;
        this.airConditioner = airConditioner;
    }

// Métodos getter y setter

    public Integer getM2() { return m2; }

    public void setM2(Integer m2) { this.m2 = m2; }

    public Integer getNumWindows() { return numWindows; }

    public void setNumWindows(Integer numWindows) { this.numWindows = numWindows; }

    public Boolean getAirConditioner() { return airConditioner; }

    public void setAirConditioner(Boolean airConditioner) { this.airConditioner = airConditioner; }

// toString:

    @Override
    public String toString() {
        return "Room{" +
                "m2=" + m2 +
                ", numWindows=" + numWindows +
                ", airConditioner=" + airConditioner +
                '}';
    }
}
