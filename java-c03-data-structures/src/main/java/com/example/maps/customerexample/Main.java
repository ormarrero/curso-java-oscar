package com.example.maps.customerexample;
import java.util.HashMap;
/**
 * Mapas:
         * Estructura de pares de clave valor
         * HashMap<K, V>
 *     La clave (K) debe ser única, no se puede repetir.
         *     El valor (V) se puede repetir.
         */
public class Main {
    public static void main(String[] args) {

        Customer cust1 = new Customer("cust1@email.com", 20);
        Customer cust2 = new Customer("cust2@email.com", 26);
        Customer cust3 = new Customer("cust3@email.com", 25);
        Customer cust4 = new Customer("cust4@email.com", 29);

        /* 1. La clave es un valor único: para este ejemplo es el email.
            El valor puede ser cualquier cosa, normalmente objetos de una clase ejemplo Customer
            forma original: HashMap<String, Customer> customers = new HashMap<>();     */

        HashMap<String, Customer> customers = null;

        /* 2. Otra forma de crear el mapa:
            var customer 2 = new HashMap<String, Customer>();           */

        // Antes de hacer nada asegurarse de que está inicializado distinto que nulo
        if (customers == null)
            customers = new HashMap<>();// se inicializa

        // esta opción es para agregar:
        customers.put(cust1.getEmail(), cust1);

        // otra forma de agregar
        customers.put("cust2@email.com", new Customer("cust2@email.com", 40));

        // Actualizar un dato en el mapa
        customers.get("cust2@email.com").setAge(45);

        System.out.println(customers);
        /**
         * En las listas se puede hacer:  customers.get(0);
         * En los mapas daría un error
         */
    }
}
