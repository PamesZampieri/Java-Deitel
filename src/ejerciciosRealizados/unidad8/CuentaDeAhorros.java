/*
8.6 (Clase cuenta de ahorros) Cree una clase llamada CuentaDeAhorros. Use una variable static llamada tasaInteresAnual
para almacenar la tasa de interés anual para todos los cuentahabientes. Cada objeto de la clase debe contener una
variable de instancia private llamada saldoAhorros, que indique la cantidad que el ahorrador tiene actualmente en
depósito. Proporcione el método calcularInteresMensual para calcular el interés mensual, multiplicando el saldoAhorros
por la tasaInteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros. Proporcione un método static
llamado modificarTasaInteres para establecer la tasaInteresAnual en un nuevo valor. Escriba un programa para probar la
clase CuentaDeAhorros. Cree dos instancias de objetos CuentaDeAhorros, ahorrador1 y ahorrador2, con saldos de $2000.00
y $3000.00 respectivamente. Establezca la tasaInteresAnual en 4%, después calcule el interés mensual para cada uno de
los 12 meses e imprima los nuevos saldos para ambos ahorradores. Luego establezca la tasaInteresAnual en 5%, calcule el
interés del siguiente mes e imprima los nuevos saldos para ambos ahorradores.
*/

package ejerciciosRealizados.unidad8;

import java.text.NumberFormat;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void modificarTasaInteresAnual(double tasaInteresAnual) {
        CuentaDeAhorros.tasaInteresAnual = tasaInteresAnual;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public void calcularInteresMensual() {
        saldoAhorros += saldoAhorros * (tasaInteresAnual / 100) / 12;
    }

    public void mostrarSaldo() {
        System.out.printf("%s%n", NumberFormat.getCurrencyInstance().format(saldoAhorros));
    }
}