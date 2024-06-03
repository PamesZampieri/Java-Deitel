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

public class Cuadrado extends FiguraBidimensional {
    private final Punto punto1;
    private final Punto punto2;
    private final Punto punto3;
    private final Punto punto4;

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
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

    public double getBase() {
        return getPunto4().getCoordenadaX() - getPunto3().getCoordenadaX();
    }

    public double getAltura() {
        return getPunto1().getCoordenadaY() - getPunto3().getCoordenadaY();
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return String.format("%scuadrado.%n", super.toString());
    }
}