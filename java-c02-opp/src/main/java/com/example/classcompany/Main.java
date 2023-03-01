package com.example.classcompany;

public class Main {

    public static void main(String[] args) {

        Company google = new Company("Google", "CVBBFDA4");
        System.out.println(google.phone);

        Company amazon = new Company("AMZN", "CVBBFDA4", 200.0, "+34564644000");
        System.out.println(amazon.income);
    }
}
