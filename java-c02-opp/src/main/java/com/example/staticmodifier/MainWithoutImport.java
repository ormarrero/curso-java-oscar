package com.example.staticmodifier;

public class MainWithoutImport {

    public static void main(String[] args) {

        int personAge = 22;

        if (personAge >= Constants.MIN_AGE){
            System.out.println("Has superado la primera fase del proceso de contratación");
        }

        double totalPrice = 4.99 + 4.99 * Constants.IVA;
    }
}
