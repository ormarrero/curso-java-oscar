# EXCEPTION.
## 2. Throwexception:

## 3. Try - Catch:
* 3.1 Simple (Main1): Captura el error que indica que el dato (Muestra un error cuando se escribe un dato distinto a un long)
```java
 try {
            long option = scanner.nextLong();
        } catch (InputMismatchException e){
        e.printStackTrace();    // imprime por consola el error y continua el programa
         }

        System.out.println("fin");
```
* 3.2 Try Múltiples Catch(Main2):
Ejemplo de try múltiples catch, para cada tipo de excepción:
```java
    Scanner scanner = new Scanner(System.in);
            try {
                // Excetion1:
                long option = scanner.nextLong();

                // Exception 2:
            // long operation / 0L;
                long operation = option / 1L;

                // Exception 3
                int[] array = new int[2];
                array[5] = 5;

            } catch (InputMismatchException e){
                e.printStackTrace();

            } catch (ArithmeticException e){
                e.printStackTrace();

            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
            // Exception para asegurarse de capturar la excepción sea cual sea.

            System.out.println("fin");
```

* 3.3. Try Multicatch (Main3):
Ejemplo de try multicatch en caso de que el tratamiento sea el mismo para todos:
```java
Scanner scanner = new Scanner(System.in);
        try {
            // Exception1:
            long option = scanner.nextLong();

            // Exception2:
            //    long operation = option / 0L;
            long operation = option / 1L;

        // Exception 3:
            int[] array = new int[2];
            array[5] = 5;

        } catch (InputMismatchException | ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("fin");
```
* 3.4. Try Multicatch (Main4):
  Ejemplo de try multicatch en caso de que el tratamiento sea el mismo para todos los errores:
```java
Scanner scanner = new Scanner(System.in);
        try {
            // Exception1:
            long option = scanner.nextLong();

            // Exception2:
            //    long operation = option / 0L;
            long operation = option / 1L;

            // Exception 3:
            int[] array = new int[2];
            array[5] = 5;

        } catch (Exception e) { // Captura cualquier tipo de excepción
            e.printStackTrace();
        }
        //Exception para asegurarse de capturar la exception sea la que sea.
        System.out.println("fin");
``` 

4. Try - Catch - Finally:
Se utiliza finally para cerrar recursos independientemente de si se ha ejecutado bien 
el try o se ha ejecutado el catch.
Ejemplos:
- Cerrar conexión a base de datos
- Cerrar scanner
- Cerrar flujos de datos a archivos
- Cerrar conexiones socket
