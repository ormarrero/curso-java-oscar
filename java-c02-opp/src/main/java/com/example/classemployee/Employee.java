package com.example.classemployee;

public class Employee {

    /* 1. Constantes:
    static hace que pertenezca a la clase, permite acceder sin crear objeto
    */
    public static final double BONUS = 500;

    // 2. Atributos o Propiedades
    String name;
    String surname;
    String nif;
    String email;
    double salary;
    int age;

    // 3. Constructores: métodos especiales para construir objetos de la clase
    // Vacio
    public Employee(){
    }
    // Con un parámetro
    public Employee(String name) {this.name = name;}
    // Con dos parámetros
    public Employee(String name, String surname){
        // this palabra reservada para acceder a atributos/métodos de la propia clase
        this.name = name;
        this.surname = surname;
    }
    // Con todos los parámetros
    public Employee(String name, String surname, String nif, String email, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Este toString permite  mostrar los valores de cada objeto al mandar a imprimir
     * de esta manera: System.out.println(employee2);
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nif='" + nif + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    // Comportamiento (métodos)

}
