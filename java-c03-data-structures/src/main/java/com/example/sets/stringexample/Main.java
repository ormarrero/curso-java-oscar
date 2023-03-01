package com.example.sets.stringexample;
import java.util.HashSet;
/**
 *
 * Clase HashSet: Se importa la librería al principio
 * HashSet es un Conjunto:
 *  1. Evita duplicados.
 *  2. No Conservan el orden (Las Listas conservan el mismo orden en el que se agregan los elementos).
 *
 * Para verificar que los objetos no se dupliquen al momento de imprimir, se creará un método llamado equals
 */
public class Main {
    /**
     * Set: Un conjunto es una estructura de datos que no admite duplicados y tampoco conserva el orden,
     * por lo que puede ser más óptimo que una lista dinámica.
     *  1. No admite duplicados: para que esto funciones correctamente con nuestras propias clases, es
     *  necesario implementar los siguientes métodos en una clase: equals() y hashCode().
     *  2. No conservan el orden.
     *
     *  Ejemplo de como crear:
     *  HashSet<String> names = new HashSet<>();
     *  HashSet<Company> companies = new HashSet<>();
     *  var employees = new HashSet<Employee>();
     *
     *
     */
    public static void main(String[] args) {


        HashSet<String> names = new HashSet<>();
        names.add("name4");
        names.add("name2");
        names.add("name3");
        names.add("name3");// duplicado
        names.add("name6");
        names.add("name4");
        names.add("name4");// duplicado
        names.add("name5");


        System.out.println(names);
    }
}

