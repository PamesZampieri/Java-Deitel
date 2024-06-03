/*
8.12 (Clase Fecha y Tiempo) Cree una clase llamada FechaYTiempo, que combine la clase Tiempo2 modificada del ejercicio
8.7 y la clase Fecha alterada del ejercicio 8.8. Cambie el método incrementarHora para llamar al método siguienteDia si
el tiempo se incrementa hasta el siguiente día. Modifique los métodos toString y aStringUniversal para imprimir la fecha,
junto con la hora. Escriba un programa para evaluar la nueva clase FechaYTiempo. En específico, pruebe incrementar la
hora para que cambie al siguiente día.
*/

package ejerciciosRealizados.unidad8;

public class PruebaFechaYTiempo {
    public static void main(String[] args) {
        FechaYTiempo fechaYTiempo = new FechaYTiempo(12, 1, 2023, 23, 59, 59);
        mostrarFechaYTiempo("Objeto fechaYTiempo: ", fechaYTiempo);

        fechaYTiempo.incrementarHora();
        System.out.println();
        mostrarFechaYTiempo("Objeto fechaYTiempo después de incrementar en 1 la hora: ", fechaYTiempo);
    }

    private static void mostrarFechaYTiempo(String encabezado, FechaYTiempo fechaYTiempo) {
        System.out.printf("%s%n  %s%n  %s%n", encabezado, fechaYTiempo.aStringUniversal(), fechaYTiempo.toString());
    }
}