package com.example.lists.companyexample;

import java.util.ArrayList;

public class Company {

    private String name;
    private String cif;
    private ArrayList<Employee> employees = new ArrayList<>();  // Relación Company-Employee

    public Company() {
    }

    public Company(String name, String cif, ArrayList<Employee> employees) {
        this.name = name;
        this.cif = cif;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", employees=" + employees +
                '}';
    }
}
