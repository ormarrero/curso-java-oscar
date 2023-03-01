package com.example.ejercicio_inicial;

import java.util.StringJoiner;
    // 1. Crear una clase Producto.
public class Producto {

/* 1.1. Atributos Encapsulados (se coloca private), y las variables se colocan en mayúscula para envolver
las variables y evitar errores si alguna variable es null.                                             */
        private String id_producto;
        private String nombre_producto;
        private Double precio_producto;

// 1.2. Constructores:
    // 1.2.1. Constructor Vacío.
        public Producto(String p002, String mouse, Double o) { }
    // 1.2.2. Constructor con Parámetros.
        public Producto(String id_producto, String nombre_producto, double precio_producto) {
            this.id_producto = id_producto;
            this.nombre_producto = nombre_producto;
            this.precio_producto = precio_producto;
        }

// 1.3. Métodos getter y setter:

        public Double getPrecio_producto() {
            return precio_producto;
        }

        public void setPrecio_producto(Double precio_producto) {
            this.precio_producto = precio_producto;
        }


// 1.4. toString: configurado como StringJoiner sirve para llamarlo desde la misma clase

        @Override
        public String toString() {
            return new StringJoiner(", ", Producto.class.getSimpleName() + "[", "]")
                    .add("id_producto='" + id_producto + "'")
                    .add("nombre_producto='" + nombre_producto + "'")
                    .add("precio_producto=" + precio_producto)
                    .toString();
        }

    }
