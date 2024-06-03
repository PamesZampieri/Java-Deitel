/*
4.23 (Encontrar los dos números más grandes) Utilizando una metodología similar a la del ejercicio 4.21, encuentre los
 dos valores más grandes de los 10 que se introdujeron. [Nota: puede introducir cada número sólo una vez].
 */

package ejerciciosRealizados.unidad4;

import java.util.Scanner;

public class ejercicio_4_23_EncontrarLosDosNumerosMasGrandes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero: ");
        int mayor1 = entrada.nextInt();

        System.out.print("Escriba un número entero: ");
        int mayor2 = entrada.nextInt();

        int contador = 0;

        while (contador < 8) {
            System.out.print("Escriba un número entero: ");
            int numero = entrada.nextInt();

            if (numero > mayor1) {
                if (mayor1 > mayor2) {
                    mayor2 = mayor1;
                }
                mayor1 = numero;
            } else if (numero > mayor2) {
                mayor2 = numero;
            }
            contador++;
        }

        System.out.printf("Los dos números mayores son %d y %d%n", mayor1, mayor2);
    }
}