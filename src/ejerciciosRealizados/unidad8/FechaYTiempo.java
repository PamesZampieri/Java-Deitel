/*
8.12 (Clase Fecha y Tiempo) Cree una clase llamada FechaYTiempo, que combine la clase Tiempo2 modificada del ejercicio
8.7 y la clase Fecha alterada del ejercicio 8.8. Cambie el método incrementarHora para llamar al método siguienteDia si
el tiempo se incrementa hasta el siguiente día. Modifique los métodos toString y aStringUniversal para imprimir la fecha,
junto con la hora. Escriba un programa para evaluar la nueva clase FechaYTiempo. En específico, pruebe incrementar la
hora para que cambie al siguiente día.
*/

package ejerciciosRealizados.unidad8;

public class FechaYTiempo {
    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año
    private int hora;  // 0 - 23
    private int minuto;  // 0 - 59
    private int segundo;  // 0 - 59

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public FechaYTiempo(int mes, int dia, int anio, int hora, int minuto, int segundo) {
        // revisa si el mes está en el rango
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        }

        // revisa si dia está en el rango para mes
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si no es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si año está en el rango
        if (anio <= 0) {
            throw new IllegalArgumentException("anio (" + anio + ") debe mayor a 0");
        }

        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

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

    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");

        this.hora = hora;
    }

    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");

        this.minuto = minuto;
    }

    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");

        this.segundo = segundo;
    }

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
            siguienteDia();
        }
    }

    public void siguienteDia() {
        dia++;

        if (dia > diasPorMes[mes]) {
            dia = 1;
            siguienteMes();
        }
    }

    public void siguienteMes() {
        mes++;

        if (mes == 13) {
            mes = 1;
            siguienteAnio();
        }
    }

    public void siguienteAnio() {
        anio++;
    }

    public String aStringUniversal() {
        return String.format("%d/%d/%d %02d:%02d:%02d", mes, dia, anio, obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    public String toString() {
        return String.format("%d/%d/%d %d:%02d:%02d %s", mes, dia, anio,
                ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),
                obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }
}