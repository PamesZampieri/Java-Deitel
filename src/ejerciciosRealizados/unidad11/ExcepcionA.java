/*
11.16 (Atrapar excepciones con las superclases) Use la herencia para crear una superclase de excepción llamada
ExcepcionA, así como las subclases de excepción ExcepcionB y ExcepcionC, en donde ExcepcionB hereda de ExcepcionA y
ExcepcionC hereda de ExcepcionB. Escriba un programa para demostrar que el bloque catch para el tipo ExcepcionA atrapa
excepciones de los tipos ExcepcionB y ExcepcionC.
*/

package ejerciciosRealizados.unidad11;

public class ExcepcionA extends RuntimeException {
    public ExcepcionA() {
    }

    public ExcepcionA(String message) {
        super(message);
    }

    public ExcepcionA(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionA(Throwable cause) {
        super(cause);
    }
}