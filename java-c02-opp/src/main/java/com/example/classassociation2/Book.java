package com.example.classassociation2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private  Long id;
    private String title;
    private Double price;

    //opcion sin asociación con otra clase
    //private List<Double> ratings = new ArrayList

    // opcion conn asociacion a otra clase
    private List<Rating> ratings = new ArrayList<>();

    public Book() {
    }

    public Book(Long id, String title, Double price, List<Rating> ratings) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
