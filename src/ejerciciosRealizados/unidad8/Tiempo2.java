/*
8.5 (Modificación de la representación de datos interna de una clase) Sería perfectamente razonable para la
clase Tiempo2 de la figura 8.5 representar la hora internamente como el número de segundos transcurridos desde
medianoche, en vez de usar los tres valores enteros hora, minuto y segundo. Los clientes podrían usar los mismos métodos
public y obtener los mismos resultados. Modifique la clase Tiempo2 de la figura 8.5 para implementar el tiempo
como el número de segundos transcurridos desde medianoche, y mostrar que no hay cambios visibles para los clientes
de la clase.
*/

package ejerciciosRealizados.unidad8;

public class Tiempo2 {
    private int segundos;

    // Constructor de Tiempo2 sin argumentos:
    // inicializa cada variable de instancia a cero
    public Tiempo2() {
        this(0, 0, 0);
    }

    // Constructor de Tiempo2: se suministra hora, minuto y segundo con valor predeterminado de 0
    public Tiempo2(int hora) {
        this(hora, 0, 0);
    }

    // Constructor de Tiempo2: se suministra hora y minuto, segundo con valor predeterminado de 0
    public Tiempo2(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    // Constructor de Tiempo2: se suministran hora, minuto y segundo
    public Tiempo2(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundos = hora * 3600 + minuto * 60 + segundo;
    }

    // Constructor de Tiempo2: se suministra otro objeto Tiempo2:
    public Tiempo2(Tiempo2 tiempo) {
        this(tiempo.obtenerHoras(), tiempo.obtenerMinutos(), tiempo.obtenerSegundos());
    }

    // Métodos Establecer
    // establece un nuevo valor de tiempo usando la hora universal;
    // valida los datos
    public void establecerTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundos = hora * 3600 + minuto * 60 + segundo;
    }

    // valida y establece la hora
    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        this.segundos = obtenerSegundos() + obtenerMinutos() * 60 + hora * 3600;
    }

    // valida y establece el minuto
    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        this.segundos = obtenerSegundos() + minuto * 60 + obtenerHoras() * 3600;
    }

    // valida y establece el segundo
    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundos = segundo + obtenerMinutos() * 60 + obtenerHoras() * 3600;
    }

    // Métodos Obtener
    // obtiene el valor de la hora
    public int obtenerHoras() {
        return segundos / 3600;
    }

    public int obtenerMinutos() {
        return segundos % 3600 / 60;
    }

    public int obtenerSegundos() {
        return segundos % 3600 % 60;
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", obtenerHoras(), obtenerMinutos(), obtenerSegundos());
    }

    // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((obtenerHoras() == 0 || obtenerHoras() == 12) ? 12 : obtenerHoras() % 12),
                obtenerMinutos(), obtenerSegundos(), (obtenerHoras() < 12 ? "AM" : "PM"));
    }
}