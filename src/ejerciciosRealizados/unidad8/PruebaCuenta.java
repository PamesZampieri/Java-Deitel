/*
8.18 (Clase Cuenta con saldo tipo BigDecimal) Vuelva a escribir la clase Cuenta de la sección 3.5 para almacenar el
saldo como un objeto BigDecimal y realizar todos los cálculos usando objetos BigDecimal.
*/

package ejerciciosRealizados.unidad8;

import java.math.BigDecimal;
import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("Jane Green", BigDecimal.valueOf(-7.53));
        mostrarCuenta(cuenta1);

        try {
            cuenta1.setSaldo(BigDecimal.valueOf(-3.0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int opcion;

        do {
            System.out.println("Escriba la operación que quiere realizar:");
            System.out.println("1- DEPOSITAR");
            System.out.println("2- RETIRAR");
            System.out.println("3- SALIR");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("Escriba el monto a depositar:");
                BigDecimal montoDeposito = entrada.nextBigDecimal();
                System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
                cuenta1.depositar(montoDeposito);

                mostrarCuenta(cuenta1);
            }

            if (opcion == 2) {
                System.out.print("Escriba el monto a retirar: ");
                BigDecimal montoRetiro = entrada.nextBigDecimal();

                System.out.printf("%nrestando %.2f al saldo de cuenta1%n%n", montoRetiro);
                cuenta1.retirar(montoRetiro);

                mostrarCuenta(cuenta1);
            }
        } while (opcion != 3);
    }

    public static void mostrarCuenta(Cuenta cuentaAMostrar) {
        System.out.printf("Saldo de %s: $%.2f%n%n", cuentaAMostrar.getNombre(), cuentaAMostrar.getSaldo());
    }
}