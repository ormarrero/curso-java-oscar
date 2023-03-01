package com.example.staticmodifier;

/**
 * Clases de Constantes con todas las variables constantes para la aplicación. *
 * Para poder usarlas en otros archivos hay dos opciones:
 *
 * 1. Utilizar import desde el otro archivo: import static com.example...
 * 2. Utilizar el nombre de la clase y el nombre de la constante, ejemplo: Constants.IVA
 */
public class Constants {

    /**
     * Constante IVA - Impuesto Valor Añadido sobre los productos de consumo
     */
    public static final double IVA =0.21;

    /**
     * Edad mínima para empezar a trabajar
     */
    public static final int MIN_AGE =16;

    /**
     * Categoría por defecto para empleados recién contratados
     */
    public static final String WORK_CATEGORY = "MARKETING";
}
