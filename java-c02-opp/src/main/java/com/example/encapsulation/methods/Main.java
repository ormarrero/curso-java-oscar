package com.example.encapsulation.methods;

public class Main {

    public static void main(String[] args) {

        ShopCart cart1 = new ShopCart(5, 90.0, 10);

        Double totalPrice = cart1.calculateTotalPrice();
        System.out.println(totalPrice);

        // Métodos private no pueden ser accedidos desde fuera de la clase
        //cart1.calculateTotalPrice();
    }
}
