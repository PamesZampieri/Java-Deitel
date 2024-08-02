package ejemplosTeoricos.unidad11;

// Limpieza de la pila y obtención de datos de un objeto excepción.
public class UsoDeExcepciones1 {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception exception) { // atrapa la excepción lanzada en metodo1
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            // obtiene la información de rastreo de la pila
            StackTraceElement[] elementosRastreo = exception.getStackTrace();

            System.out.println("\nRastreo de la pila de getStackTrace:");
            System.out.println("Clase\t\t\t\t\t\t\t\t\t\t\tArchivo\t\t\t\t\tLinea\tMetodo");

            // itera a través de elementosRastreo para obtener la descripción de la excepción
            for (StackTraceElement elemento : elementosRastreo) {
                System.out.printf("%s\t\t", elemento.getClassName());
                System.out.printf("%s\t", elemento.getFileName());
                System.out.printf("%s\t\t", elemento.getLineNumber());
                System.out.printf("%s\t%n", elemento.getMethodName());
            }
        }
    }

    // llama a metodo2; lanza las excepciones de vuelta a main
    public static void metodo1() throws Exception {
        metodo2();
    }

    // llama a metodo3; lanza las excepciones de vuelta a metodo1
    public static void metodo2() throws Exception {
        metodo3();
    }

    // lanza la excepción Exception de vuelta a metodo2
    public static void metodo3() throws Exception {
        throw new Exception("La excepción se lanzó en metodo3");
    }
}