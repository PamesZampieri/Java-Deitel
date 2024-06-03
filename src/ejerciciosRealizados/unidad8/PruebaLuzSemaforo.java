/*
8.10 Escriba un tipo enum llamado LuzSemaforo, cuyas constantes (ROJO, VERDE, AMARILLO) reciban un parámetro: la
duración de la luz. Escriba un programa para probar la enum LuzSemaforo, de manera que muestre las constantes de la enum
y sus duraciones.
*/

package ejerciciosRealizados.unidad8;

public class PruebaLuzSemaforo {
    public static void main(String[] args) {
        System.out.println("Las constantes de LuzSemaforo de tipo enum son:\n");

        for (LuzSemaforo luzSemaforo : LuzSemaforo.values()) {
            System.out.printf("%s %d%n", luzSemaforo.getTitulo(), luzSemaforo.getDuracionDeLuz());
        }

        LuzSemaforo semaforo = LuzSemaforo.ROJO;
        System.out.println(semaforo.getDuracionDeLuz());
    }
}