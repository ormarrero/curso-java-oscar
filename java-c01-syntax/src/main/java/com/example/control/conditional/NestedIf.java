package com.example.control.conditional;

public class NestedIf {     //Nested = Anidados

    public static void main(String[] args) {

        double price = 5.0d;
        // Se hace por categoría y se activa la categoría que se desea ejecutar (no funcionan ambas activas)
        //String category = "Clothes";
        String category = "Food";

        if (category.equalsIgnoreCase("Food")) {

            if (price > 4.0 && price < 6.0) {
                System.out.println("comida barata");
            } else {
                System.out.println("comida cara");
            }
        } else if (category.equalsIgnoreCase("Clothes")) {
            if (price < 30){
                System.out.println("ropa barata");
            } else {
                System.out.println("ropa cara");
            }
        }
    }
}
