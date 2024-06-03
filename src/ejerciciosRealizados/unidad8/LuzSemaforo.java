/*
8.10 Escriba un tipo enum llamado LuzSemaforo, cuyas constantes (ROJO, VERDE, AMARILLO) reciban un parámetro: la
duración de la luz. Escriba un programa para probar la enum LuzSemaforo, de manera que muestre las constantes de la enum
y sus duraciones.
*/

package ejerciciosRealizados.unidad8;

public enum LuzSemaforo {
    ROJO("Duración de la luz de ROJO:", 500),
    VERDE("Duración de la luz de VERDE:", 1000),
    AMARILLO("Duración de la luz de AMARILLO:", 1500);

    private final String titulo;
    private final int duracionDeLuz;

    LuzSemaforo(String titulo, int duracionDeLuz) {
        this.titulo = titulo;
        this.duracionDeLuz = duracionDeLuz;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionDeLuz() {
        return duracionDeLuz;
    }
}