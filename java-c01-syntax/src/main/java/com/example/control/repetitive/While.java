package com.example.control.repetitive;

import java.util.Scanner;   //libreria

public class While {

    public static void main(String[] args) {
/*
        int cont = 0;
        while (cont < 100) {
            System.out.println("Número: " + cont);
            cont++;
        }
*/

        while (true) {
            System.out.println("""
                    Bienvnido a aplicacion de ecommerce:
                    1. Consultar todos los productos.
                    2. Consultar un producto.
                    3. Crear un nuevo producto.
                    4. Salir.
                    """);
            // leer opcion elegida por el usuario
            int option = 4;

            if (option == 1) {
                findAllProducts();

            } else if (option == 2) {
                findProductById(44);

            } else if (option == 3) {
                //saveProduct(product); // No esta el producto por eso se coloca como comentario

            } else if (option == 4) {
                System.out.println("Gracias por usar la aplicación. Hasta la próxima");
                break;
                
            } else {
                System.out.println("No se ha seleccionado una opción válida");
            }
        }
    }
    private static void findAllProducts(){
    }
    private static void findProductById(int i) {
    }
    private static void saveProduct(){
    }
}
