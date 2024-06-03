/*
8.8 (Mejora a la clase Fecha) Modifique la clase Fecha de la figura 8.7 para realizar la comprobación de errores en los
valores inicializadores para las variables de instancia mes, dia y anio (la versión actual sólo valida el mes y el día).
Proporcione un método llamado siguienteDia para adelantar el dia en uno. Escriba un programa que evalúe el método
siguienteDia en un ciclo que imprima la fecha durante cada iteración del ciclo, con el fin de mostrar que el método
funciona de forma apropiada. Pruebe los siguientes casos:
a) incrementar la fecha de manera que cambie al siguiente mes, y
b) adelantar fecha de manera que cambie al siguiente año.
*/

package ejerciciosRealizados.unidad8;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(12, 1, 2023);

        System.out.println("Se utiliza el método siguienteDia() para aumentar en 1 al día, en el objeto Fecha: ");
        System.out.println(fecha);
        for (int i = 0; i < 31; i++) {
            fecha.siguienteDia();

            System.out.println(fecha);
        }
        System.out.println();

        System.out.println("Se utiliza el método siguienteMes() para aumentar en 1 al mes, en el objeto Fecha: ");
        System.out.println(fecha);
        for (int i = 0; i < 13; i++) {
            fecha.siguienteMes();

            System.out.println(fecha);
        }
        System.out.println();

        System.out.println("Se utiliza el método siguienteAnio() para aumentar en 1 al anio, en el objeto Fecha: ");
        System.out.println(fecha);
        for (int i = 0; i < 10; i++) {
            fecha.siguienteAnio();

            System.out.println(fecha);
        }
    }
}