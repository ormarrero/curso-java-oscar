package com.example.classfilm;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film();

        film1.title = "Origen";
        film1.duration = 130;
        film1.rating = 4.9;
        film1.category = "ACCIÓN";

        Film film2 = new Film("Gran Gatsby", 150, 4.9, "COMEDIA");

        // Mostrar en pantalla ambas peliculas
        System.out.println(film1);
        System.out.println(film2);

    }
}
