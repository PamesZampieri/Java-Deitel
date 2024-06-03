/*
9.8 (Jerarquía de herencia Cuadrilatero) Escriba una jerarquía de herencia para las clases Cuadrilatero, Trapezoide,
Paralelogramo, Rectangulo y Cuadrado. Use Cuadrilatero como la superclase de la jerarquía. Cree y use una clase Punto
para representar los puntos en cada figura. Agregue todos los niveles que sea posible a la jerarquía. Especifique las
variables de instancia y los métodos para cada clase. Las variables de instancia private de Cuadrilatero deben ser los
pares de coordenadas x-y para los cuatro puntos finales del Cuadrilatero. Escriba un programa que cree instancias de
objetos de sus clases, y que imprima el área de cada objeto (excepto Cuadrilatero).
*/

package ejerciciosRealizados.unidad9;

public class Punto {
    private double coordenadaX;
    private double coordenadaY;

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}