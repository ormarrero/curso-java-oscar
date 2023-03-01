package com.example.repositories;

import com.example.entities.User;
import com.example.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * CONSULTAS DERIVADAS:
     */
    List<User> findAllByName(String name);

    List<User> findAllByUserType(UserType type);

    User findByEmail(String email);

    List<User> findAllByEntryHour(LocalTime entryHour);

    List<User> findBySalaryGreaterThanEqual(double salary);

    List<User> findBySalaryBetween(double salaryStart, double salaryEnd);

//  *********************   LUNES 06-02-23  ***************************

    List<User> findAllByEntryHourBefore(LocalTime entryHour);
    List<User> findAllByEntryHourAfter(LocalTime entryHour);
    List<User> findBySalaryLessThanEqual(Double salary);

    List<User> findAllByBirthDateAfter(LocalDate birthDate);
    List<User> findAllByBirthDateBefore(LocalDate birthDate);
    List<User> findAllByBirthDateBetween(LocalDate dateStart,LocalDate dateEnd);
    List<User> findAllByActiveTrue();
    List<User> findAllByActiveFalse();
    // puede haber varios usuarios con mismo nombre y apellido
    List<User> findAllByNameAndSurname(String name, String surname);

   //Iterable<Object> findAllByNameAndSurname(String javier, String garcía);

    List<User> findAllByAddressCity(String city);

    List<User> findAllByAddressStreetAndAddressCity(String street, String city);

   // comprobar si existe un usuario por su email, puede servir para saber si un email ya está ocupado en un registro de un nuevo usuario
   boolean existsByEmail(String email);
    // Optional<User> findByEmail(String email);
}
