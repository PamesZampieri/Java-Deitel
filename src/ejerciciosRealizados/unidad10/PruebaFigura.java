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

public class PruebaFigura {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];

        figuras[0] = new Circulo(2, new Punto(4, 1));
        figuras[1] = new Cuadrado(new Punto(1, 4), new Punto(5, 4),
                new Punto(1, 0), new Punto(5, 0));
        figuras[2] = new Triangulo(new Punto(3, 5), new Punto(6, 1),
                new Punto(1, 1));
        figuras[3] = new Esfera(5);
        figuras[4] = new Cubo(3);
        figuras[5] = new Tetraedro(3);

        for (Figura figura : figuras) {
            System.out.printf("%sÁrea: %.2f%n", figura, figura.getArea());

            if (figura instanceof FiguraTridimensional) {
                System.out.printf("Volúmen: %.2f%n", ((FiguraTridimensional) figura).getVolumen());
            }

            System.out.println();
        }
    }
}