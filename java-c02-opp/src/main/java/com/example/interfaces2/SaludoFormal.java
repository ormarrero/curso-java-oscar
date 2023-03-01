package com.example.interfaces2;

/**
 * (1) Se crea primero una interfaz de SaludoFormal
 */
public class SaludoFormal implements Saludo {
    @Override
    public String saludar() { return " "; }

    // Se genera el toString para enviar el mensaje y no la dirección en memoria
    @Override
    public String toString() {
        return "SaludoFormal: Ladies and Gentelemen!";
    }
}
