package com.example.classvehicle;

public class MainToString {

    public static void main(String[] args) {

        Vehicle honda = new Vehicle("Honda", "civic", 2.1, "SEDAN", 0, false, 20000.0, 2000);
        System.out.println(honda.manufacturer);
        System.out.println(honda.model);
        System.out.println(honda.price);
        System.out.println(honda.cc);
        System.out.println(honda.type);
        System.out.println(honda.speed);
        System.out.println(honda.status);
        System.out.println(honda.price);
        System.out.println(honda.year);

        Vehicle alfaRomeo = new Vehicle();
        System.out.println("alfaRomeo" + alfaRomeo);
    }
}
