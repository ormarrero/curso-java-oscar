package com.example.methods;

public class Method2 {

    public static void main(String[] args) {

        // Sobrecarga de Métodos
        printHello();
        printHello("Oscar");
        printHello("Oscar", "Marrero");
        /*printHello("Oscar", 30);
        printHello("José", 3000.0);*/
    }

    private static void printHello() {
    }

    private static void printHello(String oscar) {
    }
    private static void printHello(String oscar, String marrero) {
    }
    /*private static void printHello(String,int){
    }

    private static void printHello(String,double){
    }*/
}
