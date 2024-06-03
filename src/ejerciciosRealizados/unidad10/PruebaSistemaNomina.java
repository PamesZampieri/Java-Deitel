/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.

10.14 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9, para incluir una
subclase adicional de Empleado llamada TrabajadorPorPiezas, que represente a un empleado cuyo sueldo se base en el
número de piezas de mercancía producidas. La clase TrabajadorPorPiezas debe contener las variables de instancia private
llamadas sueldo (para almacenar el sueldo del empleado por pieza) y piezas (para almacenar el número de piezas
producidas). Proporcione una implementación concreta del método ingresos en la clase TrabajadorPorPiezas que calcule los
ingresos del empleado, multiplicando el número de piezas producidas por el sueldo por pieza. Cree un arreglo de
variables Empleado para almacenar referencias a objetos de cada clase concreta en la nueva jerarquía Empleado. Para cada
Empleado, muestre su representación de cadena y los ingresos.
*/

package ejerciciosRealizados.unidad10;

public class PruebaSistemaNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith",
                "111-11-1111", new Fecha(5, 5, 1990), 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("María Laura", "Paván",
                "222-22-2222", new Fecha(6, 1, 1987), 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones",
                "333-33-3333", new Fecha(12, 24, 1990), 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob",
                "lewis", "444-44-4444", new Fecha(7, 5, 1959),
                5000, .04, 300);
        TrabajadorPorPiezas trabajadorPorPiezas = new TrabajadorPorPiezas("Pamela", "Zampieri",
                "555-55-5555", new Fecha(12, 16, 1987), 1000.0, 20);

        System.out.println("Empleados procesados por separado:");

        System.out.printf("%n%s%n%s: $%,.2f%n", empleadoAsalariado, "ingresos", empleadoAsalariado.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n", empleadoPorHoras, "ingresos", empleadoPorHoras.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n", empleadoPorComision, "ingresos", empleadoPorComision.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", trabajadorPorPiezas, "ingresos", trabajadorPorPiezas.getMontoPago());

        Empleado[] empleados = new Empleado[5];

        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        empleados[4] = trabajadorPorPiezas;

        System.out.println("Empleados procesados en forma polimórfica:\n");

        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);

            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;

                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f%n", empleado.getSalarioBase());
            }

            if (empleadoActual.esTuMesCumpleanios()) {
                System.out.printf("El salario incluye un bono por cumpleaños de: $ 100.00. ¡Felíz Cumpleaños %s %s!%n",
                        empleadoActual.getPrimerNombre(), empleadoActual.getApellidoPaterno());
            }

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.getMontoPago());
        }

        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s%n", j, empleados[j].getClass().getName());
        }
    }
}