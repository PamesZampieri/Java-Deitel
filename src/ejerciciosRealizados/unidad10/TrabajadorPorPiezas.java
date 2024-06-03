/*
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

public class TrabajadorPorPiezas extends Empleado {
    private double sueldo;
    private int piezas;

    public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                               Fecha fechaNacimiento, double sueldo, int piezas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);

        if (sueldo < 0.0) {
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }

        if (piezas < 0) {
            throw new IllegalArgumentException("El número de piezas producidas debe ser >= 0");
        }

        this.sueldo = sueldo;
        this.piezas = piezas;
    }

    public void setSueldo(double sueldo) {
        if (sueldo < 0.0) {
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }

        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setPiezas(int piezas) {
        if (piezas < 0) {
            throw new IllegalArgumentException("El número de piezas producidas debe ser >= 0");
        }

        this.piezas = piezas;
    }

    public int getPiezas() {
        return piezas;
    }

    @Override
    public double ingresos() {
        return getPiezas() * getSueldo();
    }

    @Override
    public String toString() {
        return String.format("trabajador por piezas: %s%n%s: $%,.2f; %s: %d", super.toString(),
                "sueldo por pieza producida", getSueldo(),
                "piezas producidas", getPiezas());
    }
}