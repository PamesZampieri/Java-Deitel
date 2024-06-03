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

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000);

        CuentaDeAhorros.modificarTasaInteresAnual(4);

        System.out.printf("Ahorrador 1:%nTasa de Interés: %.2f%n%n", CuentaDeAhorros.getTasaInteresAnual());
        for (int i = 0; i < 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador1.mostrarSaldo();
        }

        System.out.println();

        System.out.printf("Ahorrador 2:%nTasa de Interés: %.2f%n%n", CuentaDeAhorros.getTasaInteresAnual());
        for (int i = 0; i < 12; i++) {
            ahorrador2.calcularInteresMensual();
            ahorrador2.mostrarSaldo();
        }

        CuentaDeAhorros.modificarTasaInteresAnual(5);

        System.out.printf("\nAhorrador 1:%nTasa de Interés: %.2f%n%n", CuentaDeAhorros.getTasaInteresAnual());
        ahorrador1.calcularInteresMensual();
        ahorrador1.mostrarSaldo();

        System.out.println();

        System.out.printf("Ahorrador 2:%nTasa de Interés: %.2f%n%n", CuentaDeAhorros.getTasaInteresAnual());
        ahorrador2.calcularInteresMensual();
        ahorrador2.mostrarSaldo();
    }
}