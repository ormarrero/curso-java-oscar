package com.example.services;

import com.example.dto.EmployeeStats;
import com.example.entities.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    // CRUD:
    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    Optional<Employee> findByNif(String nif);
    List<Employee> findAllActive();
    Employee save(Employee employee);
    void deleteById(Long id);

    // LÓGICA DE NEGOCIO:

    //Aumenta el salario a un empleado:
    void raiseSalary(Long employeeId, Double quantity); // Para subir el salario

    //Aumenta el bono a un empleado:
    void raiseBonus(Long employeeId, Double quantity);  // Para calcular el bono según la antigüedad

    //Aumenta el bono a todos los empleados en base a los años trabajando:
    void raiseAllBonusByWorkedYears(double quantity);

    // Calcula estadísticas de Empleados:
    EmployeeStats calculateStats();
}