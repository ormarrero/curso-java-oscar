package com.example.StringMethods;

public class StringBlocks {

    public static void main(String[] args) {
        String texto1 = "Hola mundo nuevo";
        // De esta manera une los tres textos en una línea
        // si se coloca \n antes del mas te da un salto de línea
        String texto2 = "Hola mundo nuevo" + "\n" +
                "viejo" + "\n" +
                "y de ahora";
        System.out.println(texto2);

        //Con el uso de tres comillas ("""), te imprime los tres textos con salto de página
        String texto3 = """
                Hola mundo nuevo
                viejo
                y de ahora
                """;
        System.out.println(texto3);
    }
}
