package com.example.inheritance;
//(1)
/**
 * HERENCIA: Mecanismo de reutilización de ccódigo. Permite evitar duplicar código(atributos, métodos)
 * a la hora de crear nuevas clases.
 *
 * Vehicle: Es una clase Padre.
 *
 * Para crear la clase hija, se marca el nombre de la clase, boton derecho, show context action
 * se pulsa creat una subclase y se le coloca nombre y se le da generar los dos contructores.
 *
 *
 */
public class Vehicle {
    private Long id;
    private Integer numWheels;
    private String color;
    private Double weight;

    public Vehicle() {
    }

    public Vehicle(Long id, Integer numWheels, String color, Double weight) {
        this.id = id;
        this.numWheels = numWheels;
        this.color = color;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", numWheels=" + numWheels +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void speedUp() {
    }
}
