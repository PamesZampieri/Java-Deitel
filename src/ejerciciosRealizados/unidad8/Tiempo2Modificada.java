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

public class Tiempo2Modificada {
    private int hora;  // 0 - 23
    private int minuto;  // 0 - 59
    private int segundo;  // 0 - 59

    // Constructor de Tiempo2Modificada sin argumentos:
    // inicializa cada variable de instancia a cero
    public Tiempo2Modificada() {
        this(0, 0, 0);
    }

    // Constructor de Tiempo2Modificada: se suministra hora, minuto y segundo con valor predeterminado de 0
    public Tiempo2Modificada(int hora) {
        this(hora, 0, 0);
    }

    // Constructor de Tiempo2Modificada: se suministra hora y minuto, segundo con valor predeterminado de 0
    public Tiempo2Modificada(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    // Constructor de Tiempo2Modificada: se suministran hora, minuto y segundo
    public Tiempo2Modificada(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Constructor de Tiempo2Modificada: se suministra otro objeto Tiempo2Modificada
    public Tiempo2Modificada(Tiempo2Modificada tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
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

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // valida y establece la hora
    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        this.hora = hora;
    }

    // valida y establece el minuto
    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        this.minuto = minuto;
    }

    // valida y establece el segundo
    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundo = segundo;
    }

    // Métodos Obtener
    // obtiene el valor de la hora
    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    public void tictac() {
        segundo++;

        if (segundo == 60) {
            segundo = 0;
            incrementarMinuto();
        }
    }

    public void incrementarMinuto() {
        minuto++;

        if (minuto == 60) {
            minuto = 0;
            incrementarHora();
        }
    }

    public void incrementarHora() {
        hora++;

        if (hora == 24) {
            hora = 0;
        }
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),
                obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }
}