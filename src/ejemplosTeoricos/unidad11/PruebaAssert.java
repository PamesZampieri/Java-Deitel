package ejemplosTeoricos.unidad11;

import java.util.Scanner;

// Comprobar mediante assert que un valor esté dentro del rango.
public class PruebaAssert {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entre 0 y 10:  ");
        int numero = entrada.nextInt();

        // asegura que el valor sea >= 0 y <= 10
        assert (numero >= 0 && numero <= 10) : "numero incorrecto: " + numero;
        System.out.printf("Usted escribió: %d%n", numero);
    }
}