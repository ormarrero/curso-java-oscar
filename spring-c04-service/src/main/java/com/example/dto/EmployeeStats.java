package com.example.dto;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeStats {
    private Long count;
    private Double maxSalary;
    private Double meanSalary;

    public EmployeeStats(long count, double sumBonus, double sumSalary, double meanSalary) {
    }
}
