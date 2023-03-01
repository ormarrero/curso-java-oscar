package com.example.services;

import com.example.dto.EmployeeStats;
import com.example.entities.Employee;
import com.example.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * SIN LOMBOK
 */
@Service    // Se coloca para evitar una exception e implemente los servicios.
public class EmployeeServiceImpl implements EmployeeService {

    // Añadir una dependencia de Maven(en este caso va a ser un repositorio)
    //Atributos:
    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
    private EmployeeRepository employeeRepo;

    // Constructores (se agrega desde generar):
    public EmployeeServiceImpl(EmployeeRepository employeeRepo) { this.employeeRepo = employeeRepo; }

    // Métodos:

    @Override
    public List<Employee> findAll() {
        log.info("Ejecutando findAll()");
        return this.employeeRepo.findAll(); }

    @Override
    public Optional<Employee> findById(Long id) {
        log.info("findById {}", id);
        return this.employeeRepo.findById(id); }

    @Override
    public Optional<Employee> findByNif(String nif) {
        log.info("findByNif {}", nif);
        return this.employeeRepo.findByNif(nif);
    }

    @Override
    public List<Employee> findAllActive() {
        log.info("findAllActiveTrue {}");
        return this.employeeRepo.findAllByActiveTrue();
    }

    @Override
    public Employee save(Employee employee) {
        log.info("save employee {}", employee);

        try{
            this.employeeRepo.save(employee);
        }catch (Exception e) {
            log.error("Error al guardar employee", e);;
        }
        return employee;
    }

    @Override
    public void deleteById(Long id) {
        log.info("deleteById {}", id);

        try{
            this.employeeRepo.deleteById(id);
        }catch (Exception e) {
            log.error("Error al borrar Employee", e);;
        }
    }

    @Override
    public void raiseSalary(Long employeeId, Double quantity) {
        Optional<Employee> employeeOpt = this.findById(employeeId);
        if(employeeOpt.isEmpty())
            return;

        Employee employee = employeeOpt.get();

        Double baseSalary = employee.getSalary() !=null ? employee.getSalary() : 0.0;
        Double updateSalary = baseSalary + quantity;
        log.info("Actualizando salario de empleado con id {} de {} a {}: ", employeeId, baseSalary, updateSalary);
        employee.setSalary(updateSalary);

        employeeRepo.save(employee);
    }

    @Override
    public void raiseBonus(Long employeeId, Double quantity) {
        Optional<Employee> employeeOpt = this.findById(employeeId);
        if(employeeOpt.isEmpty())
            return;

        Employee employee = employeeOpt.get();

        double baseBonus = employee.getBonus() != null ? employee.getBonus() : 0.0;
        Double updatedBonus = baseBonus + quantity;
        log.info("Actualizando bonus de empleado con id {} de {} a {}", employeeId, baseBonus, updatedBonus);
        employee.setBonus(updatedBonus);

        try {
            this.employeeRepo.save(employee);
        } catch (Exception e) {
            log.error("Error al guardar Employee", e);
        }

    }

    @Override
    public void raiseAllBonusByWorkedYears(double quantity) {

    List<Employee> employees = this.employeeRepo.findAllByRegisterDateIsNotNull();
        for (Employee employee : employees) {

            //calcular años de antigüedad a partir de registerDate
            int workedYears = LocalDate.now().getYear() - employee.getRegisterDate().getYear();

            // calcular bono: multiplicar quantity por años
            double bonus = quantity * workedYears;

            // cambiar bono:
            employee.setBonus(bonus);

        }
        // guardar empleado:
        employeeRepo.saveAll(employees);
    }

    @Override
    public EmployeeStats calculateStats() {
        long count = this.employeeRepo.count();

        List<Employee> employees = this.employeeRepo.findAll();
        double sumBonus = 0d;
        double sumSalary = 0d;

        for (Employee employee : employees) {
            sumBonus += employee.getBonus() != null ? employee.getBonus() : 0.0;
            sumSalary += employee.getSalary() != null ? employee.getSalary() : 0.0;
        }
        double meanSalary = sumSalary / count;

        EmployeeStats stats = new EmployeeStats(count, sumBonus, sumSalary, meanSalary);
        log.info("Estadísticas de Employee calculadas: {}", stats);
        return stats;
    }

}
