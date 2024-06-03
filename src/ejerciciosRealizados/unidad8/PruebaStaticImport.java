/*
8.9 Vuelva a escribir el código de la figura 8.14, de manera que utilice una declaración import separada para cada
miembro static de la clase Math que se utilice en el ejemplo.
*/

package ejerciciosRealizados.unidad8;

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.E;
import static java.lang.Math.PI;

public class PruebaStaticImport {
    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
    }
}