package com.example.interfaces;

import java.util.ArrayList;
import java.util.HashSet;
//Esta Implementación como está trabajando con HashSet: va a ser un conjunto de implementaciones

public class ComputerSetDatabaseImpl implements ComputerDatabase {
    // Vamos a utilizar un HashSet como BD en Memoria
    HashSet<Computer> database = new HashSet<>();
    @Override
    public boolean save(Computer computer) {
        //return false; //  Se sustituye por la siguiente línea
        return database.add(computer);
    }

    @Override
    public ArrayList<Computer> findAll() {  // Devuelve una lista
        // return null; // Se sustituye por la siguiente línea
        return new ArrayList<>(database); // movemos los datos de un HashSet a un ArrayList
    }

    @Override
    public Computer findById(Long id) {// Recupera un elemento
        //return null;  // Se sustitye por las siguientes líneas
        if(id == null || id <= 0)
            return null;

        for (Computer computer : database){
            if (computer.getId() == id){
                return computer;
            }
        }
        return null;
    }
    }

