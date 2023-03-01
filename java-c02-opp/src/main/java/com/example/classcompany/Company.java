package com.example.classcompany;

public class Company {

    // 1. Constantes

    // 2. Atributos
    String name;
    String cif;
    double income;
    String phone;

    /**
     * 3. Constructores: Método especial para construir y tener SOBRECARGA
     * Para crear un constructor, se debe llamar igual que la clase
      */
    // Vacío
    public Company(){}

    /**
     * Otra forma para generar un constructor: se puede hacer clic a boton derecho: generate/constructor
     * y se selecccionan todos los campos que se desean (name,cif,income,,phone)
     * Con parámetros
     */
    public Company(String name, String cif, double income, String phone) {
        this.name = name;
        this.cif = cif;
        this.income = income;
        this.phone = phone;
    }

    public Company(String name, String cif) {
        this.name = name;
        this.cif = cif;
    }

    // métodos
}