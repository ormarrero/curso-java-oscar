package com.example;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Para calcular Tiempo transcurrido en tiempo (HH:mm:ss)
 *
 * DURATION: Permite extraer el tiempo extraído entre dos tiempos.
 */
public class DurationDemo {

    public static void main(String[] args) {

        LocalTime init = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(14, 0);

        Duration duration = Duration.between(init, end);
        System.out.println("0. De las 09h a las 14h hay: " + duration);

        // Ampliamos la clase 30 minutos
        duration = duration.plus(Duration.ofMinutes(30));
        System.out.println("1. 30 minutos mas tarde: " + duration);

        // Horas transcurridas
        System.out.println("2. Diferencia de hora entre la inicial y la final: " + duration.toHours()+"H");

        // Minutos restantes
        System.out.println("3. Diferencia en minutos entre la inicial y la final: " + duration.toMinutesPart()+"m");

    }
}
