package com.example.classfilm;

public class Film {

    // Atributos
    String title;
    Integer duration;
    Double rating;
    String category;

    // Constructores
    // vacio: Siempre se añade el constructor vacio, porque muchos framework lo necesitan
    public Film(){}


    // con parametros:
    public Film(String title, Integer duration, Double rating, String category) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.category = category;
    }

    // Métodos

    /*  toString: es necesario generarlo para que pueda imprimir correctamente los resultados
    Sino se coloca, imprime la referencia en memoria. */

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                ", category='" + category + '\'' +
                '}';
    }
}
