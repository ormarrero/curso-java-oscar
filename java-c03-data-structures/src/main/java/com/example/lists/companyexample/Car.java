package com.example.lists.companyexample;

import com.sun.jdi.CharType;

public class Car {

    private String model;
    private CarType type;
    private Double price;
    ///private Employee employee;  // Así sería una asociación bidireccional con Employee

    public Car() {
    }

    public Car(String model, CarType type, Double price) {
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
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
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
