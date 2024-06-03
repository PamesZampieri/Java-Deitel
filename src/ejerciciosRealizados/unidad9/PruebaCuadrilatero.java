/*
9.8 (Jerarquía de herencia Cuadrilatero) Escriba una jerarquía de herencia para las clases Cuadrilatero, Trapezoide,
Paralelogramo, Rectangulo y Cuadrado. Use Cuadrilatero como la superclase de la jerarquía. Cree y use una clase Punto
para representar los puntos en cada figura. Agregue todos los niveles que sea posible a la jerarquía. Especifique las
variables de instancia y los métodos para cada clase. Las variables de instancia private de Cuadrilatero deben ser los
pares de coordenadas x-y para los cuatro puntos finales del Cuadrilatero. Escriba un programa que cree instancias de
objetos de sus clases, y que imprima el área de cada objeto (excepto Cuadrilatero).
*/

package ejerciciosRealizados.unidad9;

public class PruebaCuadrilatero {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 4);
        Punto punto2 = new Punto(6, 4);
        Punto punto3 = new Punto(1, 2);
        Punto punto4 = new Punto(6, 4);

        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        System.out.printf("El área del rectángulo es: %.2f%n", rectangulo.calcularArea());

        punto1.setCoordenadaX(2);
        punto1.setCoordenadaY(4);
        punto2.setCoordenadaX(4);
        punto2.setCoordenadaY(4);
        punto3.setCoordenadaX(2);
        punto3.setCoordenadaY(2);
        punto4.setCoordenadaX(4);
        punto4.setCoordenadaY(2);

        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        System.out.printf("El área del cuadrado es: %.2f", cuadrado.calcularArea());
    }
}