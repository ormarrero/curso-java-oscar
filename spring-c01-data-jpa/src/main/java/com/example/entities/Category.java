package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer minAllowAge;

    public Category() { }

    public Category(String name, Integer minAllowAge) {
        this.name = name;
        this.minAllowAge = minAllowAge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinAllowAge() {
        return minAllowAge;
    }

    public void setMinAllowAge(Integer minAllowAge) {
        this.minAllowAge = minAllowAge;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minAllowAge=" + minAllowAge +
                '}';
    }
}
