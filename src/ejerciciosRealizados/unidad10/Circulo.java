/*
10.13 (Proyecto: Jerarquía de figuras) Implemente la jerarquía Figura que se muestra en la figura 9.3. Cada
FiguraBidimensional debe contener el método obtenerArea para calcular el área de la figura bidimensional. Cada
FiguraTridimensional debe tener los métodos obtenerArea y obtenerVolumen para calcular el área superficial y el volumen,
respectivamente, de la figura tridimensional. Cree un programa que utilice un arreglo de referencias Figura a objetos de
cada clase concreta en la jerarquía. El programa deberá imprimir una descripción de texto del objeto al cual se refiere
cada elemento del arreglo. Además, en el ciclo que procesa a todas las figuras en el arreglo, determine si cada figura
es FiguraBidimensional o FiguraTridimensional. Si es FiguraBidimensional, muestre su área. Si es FiguraTridimensional,
muestre su área y su volumen.
*/

package ejerciciosRealizados.unidad10;

public class Circulo extends FiguraBidimensional {
    private final double radio;
    private final Punto centro;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return String.format("%scirculo.%n", super.toString());
    }
}