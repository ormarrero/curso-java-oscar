package com.example.control.conditional;

public class Switch {

    public static void main(String[] args) {

        double price = 1.60d;
        String day = "Monday";

        switch (day) {
            case "Monday":
                price = 1.55d;
                break;

            case "Tuesday":
                price = 1.57d;
                break;

            case "Wenesday":
                price = 1.51d;
                break;

            case "Thursday":
                price = 1.59d;
                break;

            case "Friday":
                price = 1.65d;
                break;

            default:
                price = 1.40d;
        }
        System.out.println(price);

        // Equivalente con una expresión switch

        price = switch (day){
            case "Monday" -> 1.45d;
            case "Tuesday" -> 1.50d;
            case "Wednesday" -> 1.60d;
            case "Thursday" -> 1.71d;
            case "Friday" -> 1.80d;
            default -> 1.1d;
        };
        System.out.println(price);
    }
}
