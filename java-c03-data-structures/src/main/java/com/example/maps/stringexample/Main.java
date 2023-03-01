package com.example.maps.stringexample;
import java.util.HashMap;
import java.util.Map;

/**
 * Python: lista, tuplas, conjuntos, diccionarios
 *
 * Mapas:
 * Estructura de pares de clave valor
 * HashMap<K, V>
 *     La clave (K) debe ser única, no se puede repetir.
 *     El valor (V) se puede repetir.
 *
 * Ejemplo de como crear:
 *
 * Usando interfaces: polimorfismo: izquierda el tipo abstracto (interfaz y a la derecha la clase correcta
 * Map<String, Employee> employees = new HashSet<HashMap>();
 */
public class Main {

    public static void main(String[] args) {
        // 1. Crear un Mapa:
        HashMap<String, String> identities = new HashMap<>();

        // 2. Añadir elementos en el Mapa.
        identities.put("11111111A", "Rodolfo García");
        identities.put("22222222B", "Rodolfo López");
        identities.put("33333333C", "Patricia Martínez");
        identities.put("11111111A", "Rodolfo García evolucionado");

        System.out.println("1º: " + identities);
        /* Este punto dos lo que hace es imprimir todos los elementos del mapa,
        como Rodolfo García está repetido, lo que hace es actualizar el valor no repetirlo
         */

        // obtener elementos: Muestra el valor de la clave solicitada
        String person = identities.get("22222222B");
        System.out.println("La clave (22222222B) tiene por nombre: " + person);

        // borrar elementos: Elimina el elemento de Patricia
        String patricia = identities.remove("33333333C");
        System.out.println(patricia);
        System.out.println("2º: " + identities);

        // es un boolean para ver si contiene el elemento 33333333C. true o false?
        boolean exist = identities.containsKey("33333333C");
        System.out.println(exist);

        // intenta agregar 11111111A si no existe, como exisste arroja lo que ya contiene y no lo cambia
        identities.putIfAbsent("11111111A", "Rodolfo García superevolucionado");
        System.out.println(identities);

        // Esta instruccion te imprime las claves que contiene el mapa
        System.out.println("claves: " + identities.keySet());

        // Esta instruccion te imprime los valores que contiene el mapa
        System.out.println("valores: " + identities.values());

        // Lee las variables de entorno del sistema, para determinar el S.O.
        Map<String, String> properties = System.getenv();
        System.out.println("Variables de Entorno: " + properties);

        // Bucles for con Maps:
        for (String dni : identities.keySet()){
            System.out.println(dni);
        }

        for (String fullName : identities.values()){
            System.out.println(fullName);
        }
    // PAra obetener la clave y el valor a la vez
        for (Map.Entry<String, String> customer : identities.entrySet()) {
            System.out.println(customer.getKey());
            System.out.println(customer.getValue());
        }
/*
    Ejemplo de mapa con variables de entorno del sistema
        Map<String, String> properties = System.getenv();
        System.out.println(properties);
*/
    }
}
