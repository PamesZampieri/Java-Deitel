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

public class PruebaRacional {
    public static void main(String[] args) {
        Racional racional1 = new Racional(-5, 6);
        Racional racional2 = new Racional(2, -3);

        Racional racional3 = Racional.sumar(racional1, racional2);
        mostrarRacional(racional3);

        Racional racional4 = new Racional(-5, 4);
        Racional racional5 = new Racional(2, 3);

        Racional racional6 = Racional.restar(racional4, racional5);
        mostrarRacional(racional6);

        Racional racional7 = new Racional(-7, -6);
        Racional racional8 = new Racional(3, -5);

        Racional racional9 = Racional.multiplicar(racional7, racional8);
        mostrarRacional(racional9);

        Racional racional10 = new Racional(-5, 7);
        Racional racional11 = new Racional(-10, 3);

        Racional racional12 = Racional.dividir(racional10, racional11);
        mostrarRacional(racional12);
    }

    private static void mostrarRacional(Racional racional) {
        System.out.printf("Racional como fracción: %s%nRacional como punto flotante: %s%n%n", racional.toString(),
                racional.aStringFormatoFlotante(2));
    }
}