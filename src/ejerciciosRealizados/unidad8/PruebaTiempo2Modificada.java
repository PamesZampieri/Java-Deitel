/*
8.7 (Mejora a la clase Tiempo2) Modifique la clase Tiempo2 de la figura 8.5 para incluir un método tictac, que aumente
el tiempo almacenado en un objeto Tiempo2 en un segundo. Proporcione el método incrementarMinuto para incrementar en uno
el minuto, y el método incrementarHora para adelantar en uno la hora. Escriba un programa para probar los métodos
tictac, incrementarMinuto e incrementarHora, para asegurarse de que funcionen de manera correcta. Asegúrese de probar
los siguientes casos:
a) incrementar el minuto, de manera que cambie al siguiente minuto.
b) aumentar la hora, de manera que cambie a la siguiente hora, y
c) adelantar el tiempo de manera que cambie al siguiente día (por ejemplo, de 11:59:59 PM a 12:00:00 AM)
*/

package ejerciciosRealizados.unidad8;

public class PruebaTiempo2Modificada {
    public static void main(String[] args) {
        Tiempo2Modificada t1 = new Tiempo2Modificada(); // 00:00:00
        Tiempo2Modificada t2 = new Tiempo2Modificada(2); // 02:00:00
        Tiempo2Modificada t3 = new Tiempo2Modificada(21, 34); // 21:34:00
        Tiempo2Modificada t4 = new Tiempo2Modificada(12, 25, 42); // 12:25:42
        Tiempo2Modificada t5 = new Tiempo2Modificada(t4); // 12:25:42

        System.out.println("Se construyó con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: se especificó hora; minuto y segundo predeterminados", t2);
        mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado", t3);
        mostrarTiempo("t4: se especificaron hora, minuto y segundo", t4);
        mostrarTiempo("t5: se especificó el objeto Tiempo2 llamado t4", t5);

        // intento de inicializar t6 con valores inválidos
        try {
            Tiempo2Modificada t6 = new Tiempo2Modificada(27, 74, 99); // valores inválidos
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepción al inicializar t6: %s%n", e.getMessage());
        }

        Tiempo2Modificada t6 = new Tiempo2Modificada(23, 59, 59);
        t6.tictac();
        mostrarTiempo("\nt6 luego de incrementar en 1 segundo: ", t6);

        t6.incrementarMinuto();
        mostrarTiempo("\nt6 luego de incrementar en 1 minuto: ", t6);

        t6.incrementarHora();
        mostrarTiempo("\nt6 luego de incrementar en 1 hora: ", t6);
    }

    // muestra un objeto Tiempo2Modificada en formatos de 24 y 12 horas
    private static void mostrarTiempo(String encabezado, Tiempo2Modificada t) {
        System.out.printf("%s%n  %s%n  %s%n", encabezado, t.aStringUniversal(), t.toString());
    }
}