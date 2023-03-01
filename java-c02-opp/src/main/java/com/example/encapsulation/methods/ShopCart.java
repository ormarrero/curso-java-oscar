package com.example.encapsulation.methods;

public class ShopCart {
    // Atributos:
    Integer quantity;
    Double price;
    Integer points;

    // Constructor vacio
    public ShopCart() {}

    // Constructor con parámetros
    public ShopCart(Integer quantity, Double price, Integer points) {
        this.quantity = quantity;
        this.price = price;
        this.points = points;
    }

    public Double calculateTotalPrice(){
        Double shippingCost = this.calculateShippingCost();
        Double fragileCost = this.calculateFragilCost();
        return price + shippingCost + fragileCost;
    }

    private Double calculateShippingCost(){
        return 5d;
    }

    private Double calculateFragilCost(){
        return 1d;
    }
}
