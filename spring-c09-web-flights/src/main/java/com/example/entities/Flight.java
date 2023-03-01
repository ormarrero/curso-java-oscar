package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plane;
    private String airportFrom;
    private String airportTo;
    private LocalDateTime dateTimeFrom; // departure
    private LocalDateTime dateTimeTo;   // arrival
    private Integer seats;
}
