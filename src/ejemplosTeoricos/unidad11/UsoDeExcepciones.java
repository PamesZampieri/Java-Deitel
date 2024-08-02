package ejemplosTeoricos.unidad11;

public class UsoDeExcepciones {
    public static void main(String[] args) {
        try {
            lanzaExcepcion();
        } catch (Exception exception) { // excepción lanzada por ThrowException
            System.out.println("La excepción se manejó en main");
        }

        noLanzaExcepcion();
    }

    // demuestra los bloques try...catch...finally
    public static void lanzaExcepcion() throws Exception {
        try { // lanza una excepción y la atrapa de inmediato
            System.out.println("Método lanzaExcepcion");
            throw new Exception(); // genera la excepción
        } catch (Exception exception) { // atrapa la excepción lanzada en el bloque try
            System.out.println("La excepción se manejó en el método lanzaExcepcion");
            throw exception; // vuelve a lanzar para procesarla más adelante

            // no se llegaría al código que se coloque aquí; se producirían errores de compilación
        } finally { // se ejecuta sin importar lo que ocurra en los bloques try...catch
            System.out.println("Se ejecutó finally en lanzaExcepcion");
        }
        // no se llegaría al código que se coloque aquí; se producirían errores de compilación
    }

    // demuestra el uso de finally cuando no ocurre una excepción
    public static void noLanzaExcepcion() {
        try { // el bloque try no lanza una excepción
            System.out.println("Método noLanzaExcepcion");
        } catch (Exception exception) {
            System.out.println(exception); // no se ejecuta
        } finally { // se ejecuta sin importar lo que ocurra en los bloques try...catch
            System.out.println("Se ejecutó finally en noLanzaExcepcion");
        }

        System.out.println("Fin del metodo noLanzaExcepcion");
    }
}