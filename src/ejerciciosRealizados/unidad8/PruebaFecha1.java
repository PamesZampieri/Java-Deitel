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

public class PruebaFecha1 {
    public static void main(String[] args) {
        Fecha1 fecha1 = new Fecha1("julio", 15, 1992);
        mostrarFecha(fecha1);
        System.out.println();

        Fecha1 fecha2 = new Fecha1(2, 16, 2023);
        mostrarFecha(fecha2);
        System.out.println();

        Fecha1 fecha3 = new Fecha1(80, 2023);
        mostrarFecha(fecha3);
        System.out.println();

        Fecha1 fecha4 = new Fecha1(250, 2012);
        mostrarFecha(fecha4);
    }

    private static void mostrarFecha(Fecha1 fecha) {
        System.out.printf("Fecha:%nFecha utilizando llamando al método toString(): %s%nFecha llamando al método " +
                        "aFormatoMesString(): %s%nFecha llamando al método aFormatoDiaAnio(): %s%n", fecha.toString(),
                fecha.aFormatoMesString(), fecha.aFormatoDiaAnio());
    }
}