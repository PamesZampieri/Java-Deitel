/*
8.16 (Clase Entero Enorme) Cree una clase llamada EnteroEnorme que utilice un arreglo de 40 elementos de dígitos, para
guardar enteros de hasta 40 dígitos de longitud cada uno. Proporcione los métodos parse, toString, sumar y restar. El
método parse debe recibir un String, extraer cada dígito mediante el método charAt y colocar el equivalente entero de
cada dígito en el arreglo de enteros. Para comparar objetos EnteroEnorme, proporcione los siguientes métodos: esIgualA,
noEsIgualA, esMayorQue, esMenorQue, esMayorOIgualA, y esMenorOIgualA. Cada uno de estos métodos deberá ser un método
predicado que devuelva true si la relación se aplica entre los dos objetos EnteroEnorme, y false si no se aplica.
Proporcione un método predicado llamado esCero. Si desea ir más allá, proporcione también los métodos multiplicar,
dividir y residuo. [Nota: los valores boolean primitivos pueden imprimirse como la palabra “true” o la palabra “false”,
con el especificador de formato %b].
*/

package ejerciciosRealizados.unidad8;

public class PruebaEnteroEnorme {
    public static void main(String[] args) {
        EnteroEnorme a = new EnteroEnorme();
        a.parse("99");
        System.out.println(a);

        EnteroEnorme b = new EnteroEnorme();
        b.parse("12");
        System.out.println(b);

        EnteroEnorme c = EnteroEnorme.sumar(a, b);
        System.out.println(c);

        EnteroEnorme d = EnteroEnorme.restar(a, b);
        System.out.println(d);

        System.out.println(EnteroEnorme.esIgualA(a, b));
        System.out.println(EnteroEnorme.noEsIgualA(a, b));
        System.out.println(EnteroEnorme.esMayorQue(a, b));
        System.out.println(EnteroEnorme.esMayorOIgualA(a, b));
        System.out.println(EnteroEnorme.esMenorQue(a, b));
        System.out.println(EnteroEnorme.esMenorOIgualA(a, b));
        System.out.println(EnteroEnorme.esCero(a));

        try {
            EnteroEnorme e = new EnteroEnorme();
            e.parse("a");
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            EnteroEnorme f = new EnteroEnorme();
            f.parse("9900000000000000000000000000000000000000");
            System.out.println(f);

            EnteroEnorme g = new EnteroEnorme();
            g.parse("1000000000000000000000000000000000000000");
            System.out.println(g);

            EnteroEnorme h = EnteroEnorme.sumar(f, g);
            System.out.println(h);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}