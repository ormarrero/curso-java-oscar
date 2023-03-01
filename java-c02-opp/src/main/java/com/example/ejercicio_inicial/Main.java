package com.example.ejercicio_inicial;

import java.math.BigDecimal;

public class Main {

    // Se genera este método para poder calcular el Número Máximo
    //private static Object MayorPrecio;

    // 2. Crear una clase Main:
    public static void main(String[] args) {
// 2.1. Crear 5 productos:
        Producto producto1 = new Producto("p001", "Monitor 14", null);//60.95
        Producto producto2 = new Producto("p002", "Mouse", null);//7.39
        Producto producto3 = new Producto("p003", "Auriculares", 30.25);
        Producto producto4 = new Producto("p004", "Teclado", 15.99);
        Producto producto5 = new Producto("p005", "Memoria", 45.25);

// 2.2. Crear un array de productos:
        Producto[] Productos = {producto1, producto2, producto3, producto4, producto5};

// 3. Estadísticas:
// 3.1. Calculos:
        // 3.1.1. Calcular la Suma del Precio Total de los productos del array:
        double PrecioTotal = 0d;
        int cont_p = 0;

        for (int i = 0; i < Productos.length; i++) {
            if (Productos[i].getPrecio_producto() != null) {
                PrecioTotal += (Productos[i].getPrecio_producto());
                cont_p++;
            }
        }

        // 3.1.2. Calcular la Media del Precio Total de los productos del array:
        double Media_PrecioTotal = 0d;
        Media_PrecioTotal = PrecioTotal / cont_p;

        // 3.1.3. Calcular Precio Máximo Total de los productos del array:
        double MayorPrecio = 0d;
        for (int i = 0; i < Productos.length; i++) {
            if (Productos[i].getPrecio_producto() != null && Productos[i].getPrecio_producto() > MayorPrecio)
                MayorPrecio = Productos[i].getPrecio_producto();
        }
        

        // 3.2. Imprimir:
        // 3.2.1.
        System.out.println("El Precio Total de los Productos del Array = " + PrecioTotal + " €");
        System.out.println("Contador de Precio Total: " + cont_p);

        // 3.2.2.
        System.out.println("La Media del Precio Total de los Productos del Array = " + Media_PrecioTotal + " €");

        // 3.2.3.
        System.out.println("El Precio Mayor de los Productos del Array = " + MayorPrecio + " €");
/*
        double Precio_total2 = (producto1.getPrecio_producto() + producto2.getPrecio_producto() + producto3.getPrecio_producto() + producto4.getPrecio_producto() + producto5.getPrecio_producto());
        System.out.println("Precio Total = " + Precio_total2);

        // 2.2. Calcular la media del precio total de los productos del array
        double Media_Precio_total2 = (producto1.getPrecio_producto() + producto2.getPrecio_producto() + producto3.getPrecio_producto() + producto4.getPrecio_producto() + producto5.getPrecio_producto())/5;
        System.out.println("Media del Precio Total = " + Media_Precio_total2);

        // 2.3. Calcular el precio máximo
        double P_M_1 = Math.max(producto1.getPrecio_producto(), producto2.getPrecio_producto());
        double P_M_2 = Math.max(P_M_1, producto2.getPrecio_producto());
        double P_M_3 = Math.max(P_M_2, producto3.getPrecio_producto());
        double P_M_4 = Math.max(P_M_3, producto4.getPrecio_producto());
        double P_M_5 = Math.max(P_M_4, producto5.getPrecio_producto());
        System.out.println("El Precio Máximo es: " + P_M_5);
 */
    }
}


