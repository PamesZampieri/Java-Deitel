package ejemplosTeoricos.unidad11;

import java.util.Scanner;

public class DivisionEntreCeroSinManejoDeExcepciones {
    // demuestra el lanzamiento de una excepción cuando ocurre una división entre cero
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador;  // posible división entre cero
    }

    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);

        System.out.print("Introduzca un numerador entero: ");
        int numerador = explorador.nextInt();

        System.out.print("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();

        int resultado = cociente(numerador, denominador);
        System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
    }
}