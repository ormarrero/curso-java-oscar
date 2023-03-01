package com.example.exceptionloops;

import java.time.LocalDate;

/**
 * Menu de book.
 * 1. Delegar la lectura en una clase separada e invocarla desde Main.
 * 2. Guardamos las lecturas en variables y finalmente creamos un Book con esas variables.
 */

public class Main2 {

    public static void main(String[] args) {

        ScannerReader reader = new ScannerReader();

        String title = reader.readString("title");
        String description = reader.readString("description");
        int num_Pages = reader.readInt("Número de Páginas");
        String isbn = reader.readString("isbn");
        String language = reader.readString("Lenguaje");
        boolean available = reader.readBoolean("Disponible");
        double price = reader.readDouble("Precio");

        int day = reader.readInt("Día");
        int month = reader.readInt("Mes");
        int year = reader.readInt("Año");
        LocalDate endDate = LocalDate.of(year, month, day);

        Book book = new Book(null, title, description, num_Pages, isbn, language, available, price, LocalDate.now(), endDate);

        reader.close();
    }
}
