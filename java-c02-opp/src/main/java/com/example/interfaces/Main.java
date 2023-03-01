package com.example.interfaces;

/**
 * Con el uso del Interface se puede implementar dos clases diferentes:
 * 1. Clase ArrayList: que es una Lista.
 * 2. La Clase HashSet: que es un Conjunto.
 * Se pueden implementar una u otra sin tener que cambiar el código
 */
public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer(1L, "Asus A55A", 8, 4);
        Computer computer2 = new Computer(2L, "MSI Modern 15", 32, 8);
        Computer computer3 = new Computer(3L, "Acer 45G", 32, 8);

        // Operaciones con objetos computers

        // Guardar, recuperar, actualizar, borrar

        // Cálculos en variables numéricas

        // Cálculos en variables numéricas agrupando por variables categóricas

        //Lo de la izquierda del igual es abstracto y lo de la derecha es tipo concreto
        // Tipo abstracto (interfaz)                  Tipo Concreto (clase)
        // ComputerDatabase computerDatabase = new ComputerDatabase();   // No puede ser instanciada
         ComputerSetDatabaseImpl computerDatabase = new ComputerSetDatabaseImpl();
        //ComputerListDatabaseImpl computerDatabase = new ComputerListDatabaseImpl();

        computerDatabase.save(computer1);
        computerDatabase.save(computer2);
        computerDatabase.save(computer3);

        System.out.println(computerDatabase.findAll());

        // Buscar el compurador 1L
        Computer computer1FromDB = computerDatabase.findById(1L);
        System.out.println(computer1FromDB);
    }
}
