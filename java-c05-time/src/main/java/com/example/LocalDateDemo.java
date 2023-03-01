package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * LocalDate: Representa fechas sin tiempo, es decir sin hora, minuto ni segundo.
 */
public class LocalDateDemo {

    public static void main(String[] args) {
        /**
         * OJO: EN ESTE MÉTODO NO SE COLOCA new
         */

        // LocalDate date1 = new LocalDate();  ¡¡¡FORMA INCORRECTA!!!

        // FORMA CORRECTA
        LocalDate date1 = LocalDate.of(2023, 1,1);
        LocalDate date2 =LocalDate.of(2023, Month.JANUARY,13);
        LocalDate date3 =LocalDate.now();

        // FORMATO: YYY-MM-DD
        System.out.println(date1);
        System.out.println(date3);

        // Extraer información:
        System.out.println(date1.getYear());    // Imprime Año
        System.out.println(date1.getMonthValue());  // Imprime Mes
        System.out.println(date1.getDayOfMonth());  // Imprime Día
        System.out.println(date1.getDayOfWeek());   // Imprime Día de la Semana (Lunes)
        System.out.println(date1.getDayOfYear());   // Imprime Día del Año

        // Operaciones:
        System.out.println(date1.plusDays(10)); // devuelve la fecha modificada sumada
        System.out.println(date1.plusWeeks(2));
        System.out.println(date1.plusMonths(3));
        System.out.println(date1.plusYears(1));
        System.out.println(date1);  // la fecha original se mantiene sin modificar

        System.out.println(date1.minusDays(10)); // devuelve la fecha modificada restada
        System.out.println(date1.minusWeeks(2));
        System.out.println(date1.minusMonths(3));
        System.out.println(date1.minusYears(1));
        System.out.println(date1);  // la fecha original se mantiene sin modificar

        //Pasar de String a LocalDate
        // Formato: YYY-MM-DD
        LocalDate date4 = LocalDate.parse("2023-05-21");
        System.out.println(date4);

        // Excepciones:
        try {
            LocalDate date5 = LocalDate.parse("2023-50-21");
            System.out.println(date5);
        }catch (DateTimeParseException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Ha ocurrido un error desconocido");
            e.printStackTrace();
        }
        System.out.println("fin");

        /**
         * Leer la fecha de consola
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha (YYYY-MM-DD): ");

        try{
            String userDate = scanner.next();
            LocalDate date5 = LocalDate.parse(userDate);
            System.out.println(date5);

        }catch (DateTimeParseException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Ha ocurrido un error desconocido");
            e.printStackTrace();
        }
        System.out.println("fin");

    }
}
