package com.example.exceptionloops;

public class Main {

    public static void main(String[] args) {

        /**
         *  CÓDIGO CORRECTO REDUCIDO
         */

        /**
         * Ahora con este código podemos llamar a un método para pedir precio, peso y altura
         */
        ScannerReader reader = new ScannerReader();     // 1. Se crea un ScannerReader(objeto)
        //Scanner scanner = new Scanner(System.in);       // 2. Se crea un Scanner
        /**
         * Para solucionar el error al compilar, se pulsa botón derecho sobre scanner y se añade Scanner como 1º
         * parámetro en el método ReadDouble
         */
        double price = reader.readDouble("price");
        System.out.println("Precio correcto: " + price);
        double weight = reader.readDouble("weight");
        System.out.println("Peso correcto: " + weight);
        double height = reader.readDouble("height");
        System.out.println("Altura correcta: " + height);
        /**
         * Para el Scanner Boolean se crea esta variable para probar disponibilidad
         */
        boolean available = reader.readBoolean("available");
        System.out.println("Disponibilidad: " + available);
        int entero = reader.readInt("Entero");
        System.out.println("num entero: " + entero);
        String text = reader.readString("texto");
        System.out.println("texto: " + text);

        System.out.println("Datos leidos: " + price + " " + weight + " " + height);

        reader.close(); // Se llama el método, para cerrar el ScannerReader
    }
}
         /**
          * CODIGO AMPLIADO
          * /
 //       Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Introduce el precio del libro: ");
//        double price = 0;
//        do {
//            try {
//                price = scanner.nextDouble();
//                break;
//            } catch (Exception e) {
//                System.out.println("Formato incorrecto, introduce de nuevo el precio (Ejemplo 4,55): ");
//                scanner.nextLine(); /*Evita que se quede en un bucle infinito (desplaza el scanner debajo del texto
//                para que se pueda leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
//                */
//            }
//        } while (true);
//        System.out.println("El precio es: " + price);

        //OTRO  EN BOOLEAN PARA DETERMINAR TRUE/FALSE.
/*        System.out.println("Introduce si el libro está disponible (true o false) ");
        boolean available;
        do{
            try{
                available = scanner.nextBoolean();
                break;
            }catch (Exception e){
                System.out.println("Formato incorrecto, introduce de nuevo la disponibilidad (true/false): ");
                scanner.nextLine();
            }
        }while (true);
        System.out.println("El disponible es: " + available);
*/
