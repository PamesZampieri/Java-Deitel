/*
8.4 (Clase Rectangulo) Cree una clase llamada Rectangulo con los atributos longitud y anchura, cada uno
con un valor predeterminado de 1. Debe tener métodos para calcular el perímetro y el área del rectángulo. Debe
tener métodos establecer y obtener para longitud y anchura. Los métodos establecer deben verificar que longitud y
anchura sean números de punto flotante mayores de 0.0, y menores de 20.0. Escriba un programa para probar la
clase Rectangulo
*/

package ejerciciosRealizados.unidad8;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println(rectangulo.toString());

        Rectangulo rectangulo1 = new Rectangulo(15, 14);

        mostrarAreaRectangulo(rectangulo1, 15, 14);
        mostrarPerimetroRectangulo(rectangulo1, 15, 14);

        try {
            Rectangulo rectangulo2 = new Rectangulo(0, 25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        rectangulo1.setLongitud(12);
        rectangulo1.setAnchura(4);
        System.out.println(rectangulo1.toString());
    }

    private static void mostrarPerimetroRectangulo(Rectangulo rectangulo, double longitud, double anchura) {
        System.out.printf("El perimetro del rectángulo es: %.2f%n", rectangulo.calcularPerimetro(longitud, anchura));
    }

    private static void mostrarAreaRectangulo(Rectangulo rectangulo, double longitud, double anchura) {
        System.out.printf("El área del rectángulo es: %.2f%n", rectangulo.calcularArea(longitud, anchura));
    }
}