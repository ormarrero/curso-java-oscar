package com.example.classvehicle;

/**
 * this: permite diferenciar entre un atributo y un parametro/argumento
 * <p>
 * 1. constantes
 * 2. atributos
 * 3. constructores
 * 4. métodos
 */
public class Vehicle {

    // 1. constantes
    static final int MAX_SPEED = 120;
    static final int MIN_SPEED = 0;

    // 2. atributos/propiedades
    String manufacturer;
    String model;
    double cc;
    String type;
    int speed;
    boolean status;
    // Se agregan estos dos atributos a una clase que ya existe (esto es el TODO gregar precio)
    double price;
    int year;


    // 3. constructores: Suelen haber dos, el vacio y con parámetros
    // vacio
    public Vehicle() {
    }

    // con parametros: es obligatorio usar el this para diferenciarlo de los atributos/propiedades
    // Se agregan los dos parametros en el paréntesis y abajo en el this
    public Vehicle(String manufacturer, String model, double cc, String type, int speed, boolean status, double price, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.speed = speed;
        this.status = status;
        // Se agregan estos dos parámetros (esto es el TODO gregar precio)
        this.price = price;
        this.year = year;
    }

    /*
    Como todos los vehiculos van a estar apagados se puede crear este constructor
     */
    public Vehicle(String manufacturer, String model, double cc, String type) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.year = 1950; //Para que no aparezca año = 0 a los que no están definidos; valor por defecto
        // no haría falta ponerles el valor por defecto, ya que al ser datos primitivos se inicializan a 0 o false
        //this.speed = 0;
        //this.status = false;
    }

    /*  No está en el código del profesor
    public Vehicle(String honda, String civic, double v, String sedan, int i, boolean b, double v1, int i1) {
    }
    */

    // 4. métodos(comportamiento): no es obligatorio usar el this
    public void speedUp(int quantity) {
        /**
         * Si sumar cantidad a speed supera 120, entonces se pone la velocidad en 120
         * Sino, entonces la cantidad se suma la cantidad
         */
        if (this.speed + quantity > MAX_SPEED)   // 120: Límite superior
            this.speed = MAX_SPEED;
        else
            this.speed += quantity;
    }

    public void speedDown(int quantity) {
        if (this.speed - quantity < MIN_SPEED)  // 0: Límite inferior
            this.speed = MIN_SPEED;
        else
            this.speed -= quantity;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    /**
     * NULL CHECKING: Comprobar si un valor es nulo antes de utlizarlo,
     * para evitar excepciones NullPointerException
     * <p>
     * Método que te devuelva el modelo completo para cada coche
     * Ford Fiesta
     */

    public String getFullName() {
        // 1º forma: sencilla o directa
        // return this.manufacturer + " " + this.model + " " + this.cc;

        //2º forma: validando que los campos no estén vacios o nulos
        String manufacturer = "manufacturer";
        String model = "model";

        if (manufacturer != null)
            manufacturer = this.manufacturer;

        if (model != null)
            model = this.model;

        return this.manufacturer + " " + this.model + " " + this.cc;

/*        //3º forma: utilizando operador ternario
        this.manufacturer.startsWith("M");
        String manufacturer = this.manufacturer != null ? this.manufacturer : "defaultManufacturer";
        String model = this.model != null ? this.model : "defaultModel";
        return this.manufacturer + " " + this.model + " " + this.cc;
*/
    }

    //Para usar una condición ToString e imprima todos los atributos asignados a la clase, igual por generate
    // SOBREESCRITURA DE MÉTODOS. Sobreescribe el método toString de la clase Object
    // el circulo azul con la flecha roja indica que se están heredando datos
    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", status=" + status +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}