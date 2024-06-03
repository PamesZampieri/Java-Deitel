/*
8.11 (Números complejos) Cree una clase llamada Complejo para realizar operaciones aritméticas con números complejos.
Estos números tienen la forma
parteReal + parteImaginaria * i
en donde i es igual a:
Raiz Cuadrada de – 1
Escriba un programa para probar su clase. Use variables de punto flotante para representar los datos private de la
clase. Proporcione un constructor que permita que un objeto de esta clase se inicialice al declararse. Proporcione un
constructor sin argumentos con valores predeterminados, en caso de que no se proporcionen inicializadores. Ofrezca
métodos public que realicen las siguientes operaciones:
a) Sumar dos números Complejo: las partes reales se suman entre sí y las partes imaginarias también.
b) Restar dos números Complejo: la parte real del operando derecho se resta de la parte real del operando
izquierdo, y la parte imaginaria del operando derecho se resta de la parte imaginaria del operando izquierdo.
c) Imprimir números Complejo en la forma (parteReal, parteImaginaria).
*/

package ejerciciosRealizados.unidad8;

public class PruebaComplejo {
    public static void main(String[] args) {
        Complejo complejo1 = new Complejo(3, 4);
        Complejo complejo2 = new Complejo(2, -6);
        Complejo complejo3 = complejo1.sumar(complejo2);
        complejo3.imprimir();

        Complejo complejo4 = complejo1.restar(complejo2);
        complejo4.imprimir();
    }
}