package com.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OldWay {

    public static void main(String[] args) {

        Date fecha = new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime();
        System.out.println(fecha);
    }
}
