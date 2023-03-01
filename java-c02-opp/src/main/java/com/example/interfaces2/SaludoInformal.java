package com.example.interfaces2;
/**
 * (2) Se crea después una interfaz de SaludoInformal
 */
public class SaludoInformal implements Saludo {
    @Override
    public String saludar() { return "Whats up  guys! "; }

// Se genera el toString para enviar el mensaje y no la dirección en memoria
    @Override
    public String toString() {
        return "SaludoInformal: Whats up  guys!";
    }
}
