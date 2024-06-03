/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.
*/

package ejerciciosRealizados.unidad10;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento,
                               double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        this.tarifaComision = tarifaComision;
        this.ventasBrutas = ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    @Override
    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "empleado por comisión", super.toString(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comisión", getTarifaComision());
    }
}