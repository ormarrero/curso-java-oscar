# TIME

## 1. DurationDemo: 
Calcula la diferencia de Hora, Minuto y Segundo entre init y end. 
A través de (duration), con el uso de (LocalTime).

## 2. LocalDateDemo:
Representa fechas sin tiempo, es decir sin hora, minuto ni segundo.
Con el Formato: YYYY-MM-DD

 * Al momento de crear no se debe colocar new (FORMA INCORRECTA):
```java
LocalDate date1 = new LocalDate();
```
 * FORMA CORRECTA:
```java
   LocalDate date1 = LocalDate.of(2023, 1,1);
   LocalDate date2 =LocalDate.of(2023, Month.JANUARY,13);
   LocalDate date3 =LocalDate.now();
```
Entre las operaciones se le puede sumar, restar (día, mes y año); así como también
se puede Pasar de String a LocalDate:
```java
LocalDate date4 = LocalDate.parse("2023-05-21");
```

Para mejorar el código se puede utilizar esta exception: (DateTimeParseException).

# LocalDateTimeDemo:
Muestra la fecha con YYYY-MM-DIA DEL MES-hh-mm-ss:
```java
LocalDateTime date2 = LocalDateTime.now();
```
2023-01-26T17:44:58.698664800

# LocalTimeDemo
LocalTime: Refleja hora, minuto, segundo.
* Ejemplos:
* hora de entrada
* hora de salida
* horario de inicio de un partido
* horario de fin de un partido

```java
        LocalTime time1 = LocalTime.of(15, 30, 0);
        LocalTime time2 = LocalTime.of( 16, 30);
```

*  Pasar de texto a tiempo (HH:mm:ss)
```java
LocalTime time4 = LocalTime.parse("21:34:00");
System.out.println(time4);
```

## OldWay:
Muestra la hora en Calendario Gregoriano:
```java
Date fecha = new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime();
```
Día de la Semana MM DD hh:mm:ss CET YYYY
Fri Jan 20 00:00:00 CET 2023

## PeriodDemo:
* Sirve para calcular Período transcurrido en (YYYY-MM-DD).
* Permite extraer la cantidad de años/meses/ días transcurridos entre dos fechas: Por ejemplo el Cumpleaños
```java
        LocalDate birtDate = LocalDate.of(1991, 5, 12);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birtDate, today);
```