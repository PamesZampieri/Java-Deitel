/*
8.15 (Números racionales) Cree una clase llamada Racional para realizar operaciones aritméticas con fracciones.
Escriba un programa para probar su clase. Use variables enteras para representar las variables de instancia private de
la clase:el numerador y el denominador. Proporcione un constructor que permita que un objeto de esta clase se inicialice
al ser declarado. El constructor debe almacenar la fracción en forma reducida. La fracción
2 / 4
es equivalente a 1/2 y debe guardarse en el objeto como 1 en el numerador y 2 en el denominador. Proporcione un
constructor sin argumentos con valores predeterminados, en caso de que no se proporcionen inicializadores. Proporcione
métodos public que realicen cada una de las siguientes operaciones:
a) Sumar dos números Racional: el resultado de la suma debe almacenarse en forma reducida. Implemente esto como un
método static.
b) Restar dos números Racional: el resultado de la resta debe almacenarse en forma reducida. Implemente esto como un
método static.
c) Multiplicar dos números Racional: el resultado de la multiplicación debe almacenarse en forma reducida. Implemente
esto como un método static.
d) Dividir dos números Racional: el resultado de la división debe almacenarse en forma reducida. Implemente esto como un
método static.
e) Devolver una representación String de un número Racional en la forma a/b, en donde a es el numerador y b es el
denominador.
f) Devolver una representación String de un número Racional en formato de punto flotante. (Considere proporcionar
capacidades de formato, que permitan al usuario de la clase especificar el número de dígitos de precisión a la derecha
del punto decimal).
*/

package ejerciciosRealizados.unidad8;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        int mcd = getMcd(numerador, denominador);

        if (numerador > 0 && denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }

        if (numerador < 0 && denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }

        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    public Racional() {
        this(0, 0);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    private static int getMcd(int numerador, int denominador) {
        int menor = Math.min(Math.abs(numerador), Math.abs(denominador));

        for (int i = menor; i > 1; i--) {
            if (numerador % i == 0 && denominador % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public static Racional sumar(Racional x, Racional y) {
        return new Racional(x.getNumerador() * y.getDenominador() + x.getDenominador() * y.getNumerador(),
                x.getDenominador() * y.getDenominador());
    }

    public static Racional restar(Racional x, Racional y) {
        return new Racional(x.getNumerador() * y.getDenominador() - x.getDenominador() * y.getNumerador(),
                x.getDenominador() * y.getDenominador());
    }

    public static Racional multiplicar(Racional x, Racional y) {
        return new Racional(x.getNumerador() * y.getNumerador(),
                x.getDenominador() * y.getDenominador());
    }

    public static Racional dividir(Racional x, Racional y) {
        return new Racional(x.getNumerador() * y.getDenominador(),
                x.getDenominador() * y.getNumerador());
    }

    public String toString() {
        return String.format("%d / %d", numerador, denominador);
    }

    public String aStringFormatoFlotante(int cantidadDecimales) {
        String s = "%." + cantidadDecimales + "f";
        return String.format(s, (double) numerador / denominador);
    }
}