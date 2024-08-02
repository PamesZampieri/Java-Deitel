/*
11.16 (Atrapar excepciones con las superclases) Use la herencia para crear una superclase de excepción llamada
ExcepcionA, así como las subclases de excepción ExcepcionB y ExcepcionC, en donde ExcepcionB hereda de ExcepcionA y
ExcepcionC hereda de ExcepcionB. Escriba un programa para demostrar que el bloque catch para el tipo ExcepcionA atrapa
excepciones de los tipos ExcepcionB y ExcepcionC.
*/

package ejerciciosRealizados.unidad11;

public class ExcepcionB extends ExcepcionA {
    public ExcepcionB() {
    }

    public ExcepcionB(String message) {
        super(message);
    }

    public ExcepcionB(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionB(Throwable cause) {
        super(cause);
    }
}