/*
11.21 (Atrapar excepciones mediante el uso de alcances exteriores) Escriba un programa que muestre que un método con su
propio bloque try no tiene que atrapar todos los posibles errores que se generen dentro del try. Algunas  excepciones
pueden pasarse hacia otros alcances, en donde se manejan.
*/

package ejerciciosRealizados.unidad11;

public class AtraparExcepciones {
    public static void main(String[] args) {
        try {
            unMetodo();
        } catch (ExcepcionA e) {
            System.out.println("Se maneja excepción de unMetodo2");
            e.printStackTrace();
        }
    }

    public static void unMetodo() {
        try {
            unMetodo2();
        } catch (ExcepcionB e) {
            e.printStackTrace();
        }
    }

    public static void unMetodo2() {
        throw new ExcepcionA("La excepción se lanzó en unMetodo2");
    }
}