package com.example.encapsulation.constructor;

/**
 * Clase de Utilidad:
 * Cuando una clase tiene todos los atributos/ métodos static
 * está pensada como clase de utilidad para no ser instanciada,
 * es decir, no se crean objetos de la clase, simplemente se usan
 * directamente sus atributos/metodos.
 */
public class MessageConstants {

    // Constantes
    public static final String EN_WELCOME = "Welcome...";
    public static final String EN_BYE = "Thank you...";

    public static final String ES_WELCOME = "Bienvenidos...";
    public static final String ES_BYE = "Gracias y Adios...";

    //Constructores: private indica que no se debe instanciar
    private MessageConstants(){

    }

    // Métodos
    public static String getMessage(){
        return EN_WELCOME;
    }

}
