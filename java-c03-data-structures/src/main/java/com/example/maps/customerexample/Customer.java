package com.example.maps.customerexample;

public class Customer {
    private String email;
    private Integer age;

    public Customer() {
    }

    public Customer(String email, Integer age) {
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
