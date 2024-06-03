package ejerciciosRealizados.unidad7;

import java.util.Random;
import java.util.Scanner;

public class GeneradorNumerosAleatorios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random numerosAleatorios = new Random();

        System.out.print("Escriba un número o (-1) para terminar: ");
        int numero = entrada.nextInt();

        while (numero != -1) {
            System.out.println(numerosAleatorios.nextInt(numero));

            System.out.print("Escriba un número o (-1) para terminar: ");
            numero = entrada.nextInt();
        }
    }
}