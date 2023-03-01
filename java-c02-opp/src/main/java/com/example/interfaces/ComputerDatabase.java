package com.example.interfaces;

import java.util.ArrayList;

/**
 * Declara métodos.
 *
 * Dice lo que hay que hacer, pero no lo hace
 * ¿Quién lo hace?
 * Las implementaciones de la interfaz, es decir, clases
 * Se da por hecho que los métodos de las interfaces son públicos por defecto
 *
 * Los métodos de la interfaz son abstractos, es decir, solo se declaran no tienen cuerpo
 *
 */

/**
 * Para implementar otra clase se remarca ComputerDatabase, se le da botón derecho,
 * se seleccciona Show Context Actions, Se selecciona Implement Interface y se renombra de acuerdo a lo que haga
 */
public interface ComputerDatabase {     // ESTA INTERFACE VA A SIMULAR UNA BASE DE DATOS
//método 1: // Esta indica true/false si ha guardado o no un ordenador.
    // Se declara la asignatura de los métodos, pero no proporciona el cuerpo
    boolean save(Computer computer);

//metodo 2: Esta va a devolver una lista de ordenadores.
    ArrayList<Computer> findAll();

//3. Agregar otro método y evolucionar:
// Encontrar un ordenador por su Clave Primaria (id)
    Computer findById(Long id);
}
