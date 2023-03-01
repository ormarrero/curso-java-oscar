package com.example.exceptionloops;

import java.time.LocalDate;

/**
 * Fase 3: Opción más simplificada.
 *
 * 1. Se delega la lectura de consola a una clase ScannerReader.
 * Se construye el objeto Book directamente con los resultados de cada lectura.
 */

public class Main3 {

    public static void main(String[] args) {

        ScannerReader reader = new ScannerReader();

        Book book = new Book(
                null,
                reader.readString("title"),
                reader.readString("description"),
                reader.readInt("numPages"),
                reader.readString("isbn"),
                reader.readString("language"),
                reader.readBoolean("availability"),
                reader.readDouble("price"),
                LocalDate.now(),
                // TODO: utilizar reader.readLocalDate()
                LocalDate.of(
                        reader.readInt("year"),
                        reader.readInt("month"),
                        reader.readInt("day"))
        );
        reader.close();
    }
}
