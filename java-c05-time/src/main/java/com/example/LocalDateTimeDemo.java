package com.example;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        // Creación
        LocalDateTime date1 = LocalDateTime.of(2023, 5, 24, 10, 30);
        System.out.println(date1);
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);

        // Operaciones:
        System.out.println(date1.getYear());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getHour());
        System.out.println(date1.getMinute());
        System.out.println(date1.getSecond());
        System.out.println(date1.getNano());


    }
}
