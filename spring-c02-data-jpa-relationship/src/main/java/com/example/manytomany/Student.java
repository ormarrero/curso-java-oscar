package com.example.manytomany;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    /**
     * Cuando las relaciones terminan en Many lo más conveniente es no colocar ese atributo en el constructor,
     * solo añadirlos en getter y setter.
     */
    @ManyToMany
    private Set<Subject> subjectSet = new HashSet<>();

    public Student() {
    }

    /**
     * Se eliminó id y subject para pasarlos directamente al objeto
     */
    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public Student setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public Student setSubjectSet(Set<Subject> subjectSet) {
        this.subjectSet = subjectSet;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
