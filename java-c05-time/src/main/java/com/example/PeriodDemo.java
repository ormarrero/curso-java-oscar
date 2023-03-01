package com.example;
import java.time.LocalDate;
import java.time.Period;

/**
 * Para calcular Período transcurrido en (YYYY-MM-DD)
 * Permite extraer la cantidad de años/meses/ días transcurridos entre dos fechas
 */
public class PeriodDemo {

    public static void main(String[] args) {

        LocalDate birtDate = LocalDate.of(1991, 5, 12);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birtDate, today);

        System.out.println("El customer tiene edad: " + period.getYears() + " años");
        System.out.println("El customer tiene edad: " + period.getMonths() + " meses");

    }
}
