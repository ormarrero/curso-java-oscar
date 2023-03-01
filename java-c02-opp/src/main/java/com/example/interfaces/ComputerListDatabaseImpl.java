package com.example.interfaces;

import java.util.ArrayList;

/**
 * Clase que implementa una interfaz:
 * La interfaz dice lo que hay que hacer: save(), findAll()
 * La clase lo implementa, lo hace:proporciona el body de save(), findAll(),...
 */

/**
 * La ventaja de trabajar con la Interface es el uso de las implmentaciones:
 * Esta Implementación como está trabajando con ArrayList: va a ser una lista de implementaciones
 */
public class ComputerListDatabaseImpl implements ComputerDatabase {
    // Vamos a utilizar un ArrayList como BD en Memoria
// 1. Atributos: Esta va a ser la Base de Datos.
    ArrayList<Computer> database = new ArrayList<>();

// 2. Contructores: Sino se coloca nada es como tener el constructor vacío.
    public ComputerListDatabaseImpl() { }

    // getter y setter

// Métodos:
// Método1:
    @Override
    public boolean save(Computer computer) {
        // return false;    // se cambia esta linea por la siguiente
        return database.add(computer);
    }
//Método2:
    @Override
    public ArrayList<Computer> findAll() {
        //  return null;    // se cambia por la siguiente línea.
        return database;
    }

// 3. Forma de crear el último método, se tipea:
// public más el nombre del nuevo método:  public Computer findById(Long id)
// y luego se agrega con el error.
    @Override
    public Computer findById(Long id) {
        if (id == null || id<= 0)
            return null;
//return null;  // se sustituye por la siguiente línea
//para buscar en la database por el id
        for (Computer computer : database) {    // Para buscar el ordenador se itera con el for
            if (computer.getId() == id) {   // Compara el id que trae la BD co el id solicitado
                return computer;
            }
        }
        return null;
    }
}
