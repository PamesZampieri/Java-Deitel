/*
9.8 (Jerarquía de herencia Cuadrilatero) Escriba una jerarquía de herencia para las clases Cuadrilatero, Trapezoide,
Paralelogramo, Rectangulo y Cuadrado. Use Cuadrilatero como la superclase de la jerarquía. Cree y use una clase Punto
para representar los puntos en cada figura. Agregue todos los niveles que sea posible a la jerarquía. Especifique las
variables de instancia y los métodos para cada clase. Las variables de instancia private de Cuadrilatero deben ser los
pares de coordenadas x-y para los cuatro puntos finales del Cuadrilatero. Escriba un programa que cree instancias de
objetos de sus clases, y que imprima el área de cada objeto (excepto Cuadrilatero).
*/

package ejerciciosRealizados.unidad9;

public abstract class Cuadrilatero {
    private final Punto punto1;
    private final Punto punto2;
    private final Punto punto3;
    private final Punto punto4;

    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public Punto getPunto4() {
        return punto4;
    }

    public double calcularArea() {
        return getBase() * getAltura();
    }

    public abstract double getBase();

    public abstract double getAltura();
}