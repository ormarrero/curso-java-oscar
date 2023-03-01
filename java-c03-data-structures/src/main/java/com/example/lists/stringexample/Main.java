package com.example.lists.stringexample;
import java.util.ArrayList;

/**
 * Listas: Es un array dinámico, es decir, permite agregar nuevos elementos, pero también borrarlos,
 * actualizarlos, recuperarlos (CRUD).
 * 1. CRUD: Creative Retieve/Read Update Delete.
 * 2. Admiten duplicados.
 * 3. Conservan el orden, los elementos se añaden uno a continuación del otro.
 *
 * Ejemplo de como crear:
 * ArrayList<String> names = new ArrayList<>();
 * ArrayList<Company> companies = new ArrayList<>();
 * var employees = new ArrayList<Employee>();
 *
 * Usando interfaces: polimorfismo:
 * List<Employee> employees = new ArrayList<>();
 */

public class Main {
    /**
     * Estructura de Datos: ArrayList = Listas Dinámicas (es una clase)
     * Admiten duplicados
     */
/* Cuando se crea un ArrayList, se genera el import de ArrayList, lo que va entre <> es el tipo de variable;
   después el nombre del Array relacionado a los datos.
 */
    public static void main(String[] args) {
// 0. Un Array
        String[] nifs = {"12345678A", "23659874S"};
        System.out.println("0. tamaño del Array String: " + nifs.length);

// 1. Crear un ArrayList:
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Boolean> activeUsers = new ArrayList<>();

// 2. Añadir elementos: se pueden agregar  nuevos elementos en cualquier momento
    // 2.1. Métodos add:
        // String:
        names.add("Nombre1");
        names.add("Nombre2");
        names.add("Nombre3");
        // Double:
        numbers.add(1000.9d);
        numbers.add(1050.2d);
        numbers.add(5050.2d);

// 3. Añadir en una posición exacta especificando el índice
        names.add(0, "3. Nuevo nombre");
        System.out.println("3. Agrega Nuevo nombre al principio del Array: " + names);

// 4. Obtener un elemento
        String name1 = names.get(0);   // obtiene el primer elemento de la lista names.
        String name2 = names.get(1);
        System.out.println("name1: " + name1);
        System.out.println("name2: " + name2);

// 10. Iterar sobre el ArrayList
        for (String name : names) {
            System.out.println("10. Iterar el ArrayList: " + name);
        }

// 11. Comprobar si una lista contiene un elemento
        if(names.contains("Nombre3"))
            System.out.println("11. Contiene Nombre3!!!!");


// 12. Imprimir el contenido
        System.out.println("12. Imprime el contenido del ArrayList: " + names);

// 5. Borrar un elemento
        names.remove(0);    // Borra el elemento 0 y crea el nuevo ArrayList de 0,1,2
        names.remove(1);    // como queda Nombre1, Nombre2 y nombre3 borra la segunda posición que es nombre 2
        System.out.println("5. borrar" + names);

// 6. Cambiar un elemento de la lista
        names.set(0, "Nombre cambiado");
        System.out.println("6. cambiar elemento" + names);

// 7. Obtener tamaño del arraylist
        System.out.println("7. tamaño del ArrayList: " + names.size());

// 8. Comprobar si un ArrayList está vacío
        System.out.println("8. Comprueba si está vacio? " + names.isEmpty());

// 9. Vaciar el ArrayList
        names.clear();
        System.out.println("9.1. ArrayList: " + names);
        System.out.println("9.2. Comprueba si está vacio? " + names.isEmpty());

    }
}
