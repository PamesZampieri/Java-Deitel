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

public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    public Complejo() {
        this(0, 0);
    }

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public Complejo sumar(Complejo complejo2) {
        return new Complejo(parteReal + complejo2.getParteReal(), parteImaginaria +
                complejo2.getParteImaginaria());
    }

    public Complejo restar(Complejo complejo2) {
        return new Complejo(parteReal - complejo2.getParteReal(), parteImaginaria -
                complejo2.getParteImaginaria());
    }

    public void imprimir() {
        System.out.printf("%.1f %.1fi%n", getParteReal(), getParteImaginaria());
    }
}