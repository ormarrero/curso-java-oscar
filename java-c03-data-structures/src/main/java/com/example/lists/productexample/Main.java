package com.example.lists.productexample;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
// OJO: SI ArrayList está en rojo es porque hay que importar la libería.
        ArrayList<String> names = new ArrayList<>();

        ArrayList<Product> products = new ArrayList<>();
    /* Otra forma de hacer el ArrayList:
        var products2 = new ArrayList<Product>();
    */

        Product product1 = new Product("prod1", 9.99, 1, "red", 5);
        Product product2 = new Product("prod2", 19.99, 2, "green", 5);
        Product product3 = new Product("prod3", 29.99, 3, "red", 5);


        // CR-U-D: Create, Retrieve-Read, Update, Delete-Remove

        // 1. Create
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product3); // mismo producto que el anterior, por tanto los cambio de uno afectan al otro
        System.out.println("1. Misma Línea: " + products); // Se imprimimen todos los productos en la misma línea,
        // separados por coma

        // 2. Read-Retrieve: Te imprime los productos, por líneas separadas
        for (Product product : products) {
            System.out.println("2. Líneas Separadas: " + product);
        }
        // Imprime la tercera posición: product3
        System.out.println("Imprime product3, la tercera posición: " + products.get(2));

        // 3. Update: Cambia el nombre de la primera posición prod1 por Nombre cambiado:
        products.get(0).setName("Nombre cambiado");

        // 4. Delete: Borra el producto con nombre cambiado
        boolean isRemoved = products.remove(product1);
        System.out.println("El product1 fue borrado: " + isRemoved);

        isRemoved = products.remove(product1);
        System.out.println("El product1 fue borrado: " + isRemoved);

    }
}