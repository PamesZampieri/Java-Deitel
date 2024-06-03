/*
8.4 (Clase Rectangulo) Cree una clase llamada Rectangulo con los atributos longitud y anchura, cada uno
con un valor predeterminado de 1. Debe tener métodos para calcular el perímetro y el área del rectángulo. Debe
tener métodos establecer y obtener para longitud y anchura. Los métodos establecer deben verificar que longitud y
anchura sean números de punto flotante mayores de 0.0, y menores de 20.0. Escriba un programa para probar la
clase Rectangulo
*/

package ejerciciosRealizados.unidad8;

public class Rectangulo {
    private double longitud = 1;
    private double anchura = 1;

    public Rectangulo() {

    }

    public Rectangulo(double longitud, double anchura) {
        if (longitud <= 0.0 || longitud >= 20.0) {
            throw new IllegalArgumentException("Longitud inválida");
        }

        if (anchura <= 0.0 || anchura >= 20.0) {
            throw new IllegalArgumentException("Anchura inválida");
        }

        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setLongitud(double longitud) {
        if (longitud <= 0.0 || longitud >= 20.0) {
            throw new IllegalArgumentException("Longitud inválida");
        }

        this.longitud = longitud;
    }

    public void setAnchura(double anchura) {
        if (anchura <= 0.0 || anchura >= 20.0) {
            throw new IllegalArgumentException("Anchura inválida");
        }

        this.anchura = anchura;
    }

    public double calcularPerimetro(double longitud, double anchura) {
        return 2 * longitud + 2 * anchura;
    }

    public double calcularArea(double longitud, double anchura) {
        return longitud * anchura;
    }

    public String toString() {
        return String.format("Longitud del rectángulo es: %.2f%nAnchura del rectángulo es: %.2f%n", longitud, anchura);
    }
}