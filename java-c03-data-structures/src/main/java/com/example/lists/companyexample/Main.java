package com.example.lists.companyexample;
/**
 * El ArrayList: es un Array dinámico, pero a la hora de imprimir,
 * muestra valores repetidos, para mejorar esto se utiliza la clase
 * HashSet: este no repite elementos al momento de mostrar.(Evita/Elimina duplicados)
 */

import java.util.ArrayList;
import java.util.List;


/**
 * Una Company tiene una lista de Employee
 * Un Employee tiene una lista de Car
 *
 * A partir de una Company extraer los Car asociados
 */
public class Main {

    public static void main(String[] args) {
    // 1. Se crean Cars:
        Car car1 = new Car("model1", CarType.SEDAN, 10000.0);
        Car car2 = new Car("model2", CarType.SUV, 15000.0);
        Car car3 = new Car("model3", CarType.SPORT, 30000.0);
        Car car4 = new Car("model4", CarType.COUPE, 45000.0);
        Car car5 = new Car("model5", CarType.COUPE, 45000.0);
        Car car6 = new Car("model6", CarType.COUPE, 45000.0);
        Car car7 = new Car("model7", CarType.COUPE, 45000.0);
        Car car8 = new Car("model8", CarType.COUPE, 45000.0);

        // Forma 1: Se crea un ArrayList de Car para poder rellenar el último parámetro de Employee y relacionarlos
        //ArrayList<Car> cars = new ArrayList<>(){{add(car1); add(car2); add(car3); add(car4)}};

        // Forma 2: Otra forma de crear el ArrayList de car:
        //ArrayList<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4));

        //Forma 3: ArrayList<Car> cars = new ArrayList<>();

    // 2. Se crean Employee con Cars:
        // Se crean dos empleados con dos coches diferentes, una forma de relacionar Employee-Car:
        ArrayList<Car> carsEmp1 = new ArrayList<>();
        carsEmp1.add(car1);
        carsEmp1.add(car2);

        ArrayList<Car> carsEmp2 = new ArrayList<>();
        carsEmp1.add(car2);
        carsEmp2.add(car3);
        carsEmp2.add(car4);

        ArrayList<Car> carsEmp3 = new ArrayList<>();
        carsEmp3.add(car5);
        carsEmp3.add(car6);

        ArrayList<Car> carsEmp4 = new ArrayList<>();
        carsEmp4.add(car7);
        carsEmp4.add(car8);


        Employee emp1 = new Employee("emp1", "11111111A", carsEmp1);
        Employee emp2 = new Employee("emp2", "22222222S", carsEmp2);
        Employee emp3 = new Employee("emp3", "33333333D", carsEmp3);
        Employee emp4 = new Employee("emp4", "44444444L", carsEmp4);

    // 3. Crear las Company
        // Se pueden crear Company de esta forma con List dentro del objeto, pero esta no permite modificarlas.
        // Tambien se pueden crear Company de la misma forma que el Employee
        Company comp1 = new Company("comp1", "1212A", new ArrayList<>(List.of(emp1, emp2)));
        Company comp2 = new Company("comp2", "2323B", new ArrayList<>(List.of(emp3, emp4)));

        /**
         * Para evitar duplicados es mejor utilizar HashSet e implementar los métodos equals() y hashcode()
         */

        ArrayList<Company> companies = new ArrayList<>(List.of(comp1, comp2));
        ArrayList<Car> allCars = new ArrayList<>();
        // Bucle Anidado
        for (Company company: companies) {
            for (Employee employee: company.getEmployees()) {
                allCars.addAll(employee.getCars());
            }
        }
    // Esta es una forma de imprimir los coches por línea que no se han explicado
    //    allCars.forEach(System.out::println);

    // Extraer los coches a partir de las company).
        /**
         * si el empleado2 tiene acceso al car2 del empleado1, cuando se imprime se ducplica el car2
         * ya que las listas permiten duplicar datos.
         */
        // Imprimir la listas de Cars
       for (Car car: allCars) {
            System.out.println(car);
        }


/*         // Bucle Jose Ignacio: Mientras mas bucles, mas lento
        for (Company company : companies) {
            for (Employee employee : company.getEmployees()) {
                for (Car car : employee.getCars()) {
                    System.out.println(car.toString());
                }
            }
        }
*/

    }
}