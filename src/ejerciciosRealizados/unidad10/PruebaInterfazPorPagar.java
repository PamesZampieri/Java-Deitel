/*
10.15 (Modificación al sistema de cuentas por pagar) En este ejercicio modificaremos la aplicación de cuentas por pagar
de las figuras 10.11 a 10.15, para incluir la funcionalidad completa de la aplicación de nómina de las figuras 10.4 a
10.9. La aplicación debe aún procesar dos objetos Factura, pero ahora debe procesar un objeto de cada una de las cuatro
subclases de Empleado. Si el objeto que se está procesando en un momento dado es EmpleadoBasePorComision, la aplicación
debe incrementar el salario base del EmpleadoBasePorComision por un 10%. Por último, la aplicación debe imprimir el
monto del pago para cada objeto. Complete los siguientes pasos para crear la nueva aplicación:
a) Modifique las clases EmpleadoPorHoras (figura 10.6) y EmpleadoPorComision (figura 10.7) para colocarlas en la
jerarquía PorPagar como subclases de la versión de Empleado (figura 10.13) que implementa a PorPagar. [Sugerencia:
cambie el nombre del método ingresos a obtenerMontoPago en cada subclase, de manera que la clase cumpla con su contrato
heredado con la interfaz PorPagar].
b) Modifique la clase EmpleadoBaseMasComision (figura 10.8), de tal forma que extienda la versión de la clase
EmpleadoPorComision que se creó en el inciso (a).
c) Modifique PruebaInterfazPorPagar (figura 10.15) para procesar mediante el polimorfismo dos objetos Factura, un
EmpleadoAsalariado, un EmpleadoPorHoras, un EmpleadoPorComision y un EmpleadoBaseMasComision. Primero imprima una
representación de cadena de cada objeto PorPagar. Después, si un objeto es un EmpleadoBaseMasComision, aumente su
salario base por un 10%. Por último, imprima el monto del pago para cada objeto PorPagar.
*/

package ejerciciosRealizados.unidad10;

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[6];

        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith",
                "111-11-1111", new Fecha(5, 5, 1990), 800.00);
        objetosPorPagar[3] = new EmpleadoPorHoras("María Laura", "Paván",
                "222-22-2222", new Fecha(6, 1, 1987), 16.75, 40);
        objetosPorPagar[4] = new EmpleadoPorComision("Sue", "Jones",
                "333-33-3333", new Fecha(12, 24, 1990), 10000, .06);
        objetosPorPagar[5] = new EmpleadoBaseMasComision("Bob",
                "lewis", "444-44-4444", new Fecha(7, 5, 1959),
                5000, .04, 300);

        System.out.println("Facturas y Empleados:");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.printf("%n%s %n%s: $%,.2f%n", porPagarActual, "pago vencido", porPagarActual.getMontoPago());
        }

        System.out.println("\nFacturas y Empleados procesados en forma polimórfica:\n");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.println(porPagarActual);

            if (porPagarActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) porPagarActual;

                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f%n", empleado.getSalarioBase());
            }

            System.out.printf("pago vencido: $%,.2f%n%n", porPagarActual.getMontoPago());
        }
    }
}