package com.example.book;

import java.time.LocalDate;

/*
 * id
 * id universal (uuid)
 * title
 * description
 * author (clase)
 * numPages
 * isbn
 * language
 * available
 * editorial (clase)
 * price
 * type (enum)
 * releaseDate (fecha)
 * ratings (lista)
 */
public class Book {

    private Long id;
    private String title;
    private String description;
    private Integer numPages;
    private String isbn;
    private String language;
    private Boolean available;
    private Double price;
    private LocalDate initDate;
    private LocalDate endDate;


    public Book(){}

    public Book(Long id, String title, String description, Integer numPages, String isbn, String language, Boolean available, Double price, LocalDate initDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.numPages = numPages;
        this.isbn = isbn;
        this.language = language;
        this.available = available;
        this.price = price;
        this.initDate = initDate;
        this.endDate = endDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", numPages=" + numPages +
                ", isbn='" + isbn + '\'' +
                ", language='" + language + '\'' +
                ", available=" + available +
                ", price=" + price +
                ", initDate=" + initDate +
                ", endDate=" + endDate +
                '}';
    }
}
