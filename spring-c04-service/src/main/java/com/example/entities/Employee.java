package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

/**
 * @Data Lombok: introduce getter y setter, toString y varios mas, por lo que es recomendable introducirlos por separado.
 * Lombok: https://projectlombok.org/features/
 */
@ToString
@Getter
@Setter
@NoArgsConstructor  // Constructor vacío
@AllArgsConstructor // Constructor con parámetros
@Builder    // Patrón builder para crear objetos
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nif;
    private Double salary;
    private Double bonus;
    private LocalDate registerDate;
    private  Boolean active;

}
