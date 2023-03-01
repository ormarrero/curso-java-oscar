package com.example.repositories;

import com.example.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//8. Se crea la interface EmployeeRepository
//9. Se agrega en public interface (extends JpaRepository<Employee, Long>, y se importa la clase)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//  *****************   OJO   CON CAMBIO   ********************
//    interface UserRepository extends JpaRepository<User, Long> {
//    }
}
