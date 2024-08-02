/*
11.16 (Atrapar excepciones con las superclases) Use la herencia para crear una superclase de excepción llamada
ExcepcionA, así como las subclases de excepción ExcepcionB y ExcepcionC, en donde ExcepcionB hereda de ExcepcionA y
ExcepcionC hereda de ExcepcionB. Escriba un programa para demostrar que el bloque catch para el tipo ExcepcionA atrapa
excepciones de los tipos ExcepcionB y ExcepcionC.
*/

package ejerciciosRealizados.unidad11;

public class UsoDeExcepciones {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (ExcepcionA e) {
            e.printStackTrace();
        }
    }

    public static void metodo1() throws ExcepcionB {
        try {
            metodo2();
        } catch (ExcepcionB e) {
            throw new ExcepcionB("La excepción se lanzó en metodo1", e);
        }
    }

    public static void metodo2() throws ExcepcionC {
        throw new ExcepcionC("La excepción se lanzó en metodo3");
    }
}