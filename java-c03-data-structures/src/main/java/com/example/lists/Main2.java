package com.example.lists;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Nombre1");
        names.add("Nombre2");
        names.add("Nombre3");


        System.out.println(names);

        for (String name : names) {
            System.out.println("10. Iterar el ArrayList: " + name);
        }
    }
}
