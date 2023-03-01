package com.example.classemployee;

public class Main {

    public static void main(String[] args) {

        String text = "Hola Mundo";
        int age = 20;

        /**
         *  1. Crear OBJETO a partir de una CLASE:
         *  NombreClase nombreObjeto = new métodoconstructor();
        */

        Employee employee1 = new Employee();
        employee1.name = "employee1";
        employee1.surname = "surname1";
        employee1.email = "email1";
        employee1.nif = "123456789A";
        employee1.age = 30;
        employee1.salary = 2500.0d; // la d minúscula representa que el número es double

        Employee employee2 = new Employee("emp2");
        Employee employee3 = new Employee("emp3", "surname3");

        // Ctrl+P dentro de parénteesis muestra las distintas opciones disponibles
        Employee employee4 = new Employee("emp4", "surname4", "896532471S", "emp4@email.com", 1000.0, 40);
        System.out.println(employee1.name + " " + employee1.surname + " " + employee1.email + " " + employee1.nif + " " + employee1.age + " " + employee1.salary);
        System.out.println(employee2);// imprime asi: com.example.classemployee.Employee@3d494fbf
        System.out.println(employee3);// para ver los datos correctos se debe imprimir de la forma de employee1
        System.out.println(employee4);// o creando un archivo toString

        /**
         * No static, no podemos acceder sin crear un objeto de Employee
         * System.out.println(Employee4.name);
         */

        /**
         * static, podemos acceder sin crear un objeto de Employee
         * ya que static hace la variable pertenezca a la clase no a los objetos
         * System.out.println(Employee.BONUS;
         */
        System.out.println(Employee.BONUS);
    }
}
