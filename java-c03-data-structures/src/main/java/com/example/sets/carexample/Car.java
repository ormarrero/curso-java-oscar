package com.example.sets.carexample;

import java.util.Objects;

public class Car {
    private String model;
   // private CarType type;
    private Double price;
    ///private Employee employee;  // Así sería una asociación bidireccional con Employee

    public Car() {
    }

    public Car(String model, Double price) {
        this.model = model;
     //   this.type = type;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    // Generar equals: se generan dos métodos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}

