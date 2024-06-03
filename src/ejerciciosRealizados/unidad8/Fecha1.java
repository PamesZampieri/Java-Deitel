/*
8.14 (Clase Fecha) Cree la clase Fecha con las siguientes capacidades:
a) Imprimir la fecha en varios formatos, como
MM/DD/AAAA
Junio 14, 1992
DDD AAAA
b) Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos en la parte (a).
En el primer caso, el constructor debe recibir tres valores enteros. En el segundo, debe recibir un objeto String y dos
valores enteros. En el tercero debe recibir dos valores enteros, el primero de los cuales representa el número de día en
 el año. [Sugerencia: para convertir la representación String del mes a un valor numérico, compare los objetos String
usando el método equals. Por ejemplo, si s1 y s2 son cadenas, la llamada al método s1.equals(s2) devuelve true si los
objetos String son idénticos y devuelve false en cualquier otro caso].
*/

package ejerciciosRealizados.unidad8;

public class Fecha1 {
    private int mes;
    private int dia;
    private final int anio;

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] diasPorMesAnioBisiesto = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public Fecha1(int mes, int dia, int anio) {
        // revisa si el mes está en el rango
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        }

        // revisa si dia está en el rango para mes
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si no es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !esBisiesto(anio)) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si año está en el rango
        if (anio <= 0) {
            throw new IllegalArgumentException("anio (" + anio + ") debe mayor a 0");
        }

        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public Fecha1(String mesEnCadena, int dia, int anio) {
        for (int i = 0; i < meses.length; i++) {
            if (mesEnCadena.equalsIgnoreCase(meses[i])) {
                mes = i;
            }
        }

        // revisa si el mes está en el rango
        if (mes == 0) {
            throw new IllegalArgumentException("mes (" + mesEnCadena + ") debe ser Enero-Diciembre");
        }

        // revisa si dia está en el rango para mes
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si no es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !esBisiesto(anio)) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si año está en el rango
        if (anio <= 0) {
            throw new IllegalArgumentException("anio (" + anio + ") debe mayor a 0");
        }

        this.dia = dia;
        this.anio = anio;
    }

    public Fecha1(int dia, int anio) {
        if (dia <= 0 || (dia > 365 && !esBisiesto(anio)) || dia > 366) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango, ingrese valores del 1-365");
        }

        if (esBisiesto(anio)) {
            for (int i = 1; i <= diasPorMesAnioBisiesto.length; i++) {
                if (dia <= 31) {
                    this.dia = dia;
                    this.mes = i;
                    break;
                } else {
                    dia -= diasPorMesAnioBisiesto[i];
                }
            }
        } else {
            for (int i = 1; i <= diasPorMes.length; i++) {
                if (dia <= 31) {
                    this.dia = dia;
                    this.mes = i;
                    break;
                } else {
                    dia -= diasPorMes[i];
                }
            }
        }

        // revisa si el mes está en el rango
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        }

        // revisa si dia está en el rango para mes
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si no es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !

                esBisiesto(anio)) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si año está en el rango
        if (anio <= 0) {
            throw new IllegalArgumentException("anio (" + anio + ") debe mayor a 0");
        }

        this.anio = anio;
    }

    // devuelve un objeto String en formato MM/DD/AAAA
    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }

    // devuelve un objeto String en formato "Mes" DD, AAAA
    public String aFormatoMesString() {
        String mesString = "";

        for (int i = 1; i <= meses.length; i++) {
            if (mes == i) {
                mesString = meses[i];
            }
        }

        return String.format("%s %d, %d", mesString, dia, anio);
    }

    // devuelve un objeto String en formato DDD AAAA
    public String aFormatoDiaAnio() {
        int ddd = dia;

        if (esBisiesto(anio)) {
            for (int i = 1; i < mes; i++) {
                ddd += diasPorMesAnioBisiesto[i];
            }
        } else {
            for (int i = 1; i < mes; i++) {
                ddd += diasPorMes[i];
            }
        }

        return String.format("%d, %d", ddd, anio);
    }

    private boolean esBisiesto(int anio) {
        return anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
    }
}