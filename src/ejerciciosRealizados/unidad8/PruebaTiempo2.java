/*
8.5 (Modificación de la representación de datos interna de una clase) Sería perfectamente razonable para la
clase Tiempo2 de la figura 8.5 representar la hora internamente como el número de segundos transcurridos desde
medianoche, en vez de usar los tres valores enteros hora, minuto y segundo. Los clientes podrían usar los mismos métodos
public y obtener los mismos resultados. Modifique la clase Tiempo2 de la figura 8.5 para implementar el tiempo
como el número de segundos transcurridos desde medianoche, y mostrar que no hay cambios visibles para los clientes
de la clase.
*/

package ejerciciosRealizados.unidad8;

public class PruebaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2(); // 00:00:00
        Tiempo2 t2 = new Tiempo2(2); // 02:00:00
        Tiempo2 t3 = new Tiempo2(21, 34); // 21:34:00
        Tiempo2 t4 = new Tiempo2(12, 25, 42); // 12:25:42
        Tiempo2 t5 = new Tiempo2(t4); // 12:25:42

        System.out.println("Se construyó con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: se especificó hora; minuto y segundo predeterminados", t2);
        mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado", t3);
        mostrarTiempo("t4: se especificaron hora, minuto y segundo", t4);
        mostrarTiempo("t5: se especificó el objeto Tiempo2 llamado t4", t5);

        // intento de inicializar t6 con valores inválidos
        try {
            Tiempo2 t6 = new Tiempo2(27, 74, 99); // valores inválidos
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepción al inicializar t6: %s%n", e.getMessage());
        }

        Tiempo2 t6 = new Tiempo2(1, 1, 1); // 01:01:01
        mostrarTiempo("\nt6: se especificaron hora, minuto y segundo", t6);

        t6.establecerHora(2); // 02:01:01
        mostrarTiempo("Para t6: se setea 2 horas", t6);

        t6.establecerTiempo(1, 1, 1); // 01:01:01
        t6.establecerMinuto(2); // 01:02:01
        mostrarTiempo("Para t6: se setea 2 minutos", t6);

        t6.establecerTiempo(1, 1, 1); // 01:01:01
        t6.establecerSegundo(2); // 01:01:02
        mostrarTiempo("Para t6: se setea 2 segundos", t6);

        t6.establecerTiempo(1, 1, 1); // 01:01:01
        mostrarTiempo("t6: se especificaron hora, minuto y segundo", t6);
    }

    // muestra un objeto tiempo2 en formatos de 24 y 12 horas
    private static void mostrarTiempo(String encabezado, Tiempo2 t) {
        System.out.printf("%s%n  %s%n  %s%n", encabezado, t.aStringUniversal(), t.toString());
    }
}