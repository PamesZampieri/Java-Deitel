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

public class Cubo extends FiguraTridimensional {
    private final double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double getVolumen() {
        return Math.pow(getLado(), 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getLado(), 2);
    }

    @Override
    public String toString() {
        return String.format("%scubo.%n", super.toString());
    }
}