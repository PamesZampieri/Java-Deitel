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

public class Fecha {
    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirma el valor apropiado para el mes y el día, dado el año;
    public Fecha(int mes, int dia, int anio) {
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

        this.mes = mes;
        this.dia = dia;
        this.anio = anio;

        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
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

    // devuelve un objeto String de la forma mes/dia/anio
    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}