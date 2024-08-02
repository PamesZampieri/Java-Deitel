/*
11.20 (Relanzamiento de excepciones) Escriba un programa que ilustre cómo volver a lanzar una excepción. Defina los
métodos unMetodo y unMetodo2. El método unMetodo2 debe lanzar al principio una excepción. El método unMetodo debe
llamar a unMetodo2, atrapar la excepción y volver a lanzarla. Llame a unMetodo desde el método main, y atrape la
excepción que se volvió a lanzar. Imprima el rastreo de la pila de esta excepción.
*/

package ejerciciosRealizados.unidad11;

public class RelanzamientoDeExcepciones {
    public static void main(String[] args) {
        try {
            unMetodo();
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("\nRastreo de la pila de getStackTrace:");
            System.out.println("Clase\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tArchivo\t\t\t\t\t\t\t\tLinea\tMetodo");

            for (StackTraceElement elemento : e.getStackTrace()) {
                System.out.printf("%s\t\t", elemento.getClassName());
                System.out.printf("%s\t\t", elemento.getFileName());
                System.out.printf("%s\t\t", elemento.getLineNumber());
                System.out.printf("%s\t%n", elemento.getMethodName());
            }
        }
    }

    public static void unMetodo() throws Exception {
        try {
            unMetodo2();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void unMetodo2() throws Exception {
        throw new Exception("La excepción se lanzó en unMetodo2");
    }
}