/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.
*/

package ejerciciosRealizados.unidad10;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {

        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento, ventasBrutas, tarifaComision);

        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "con salario base", super.toString(), "salario base", getSalarioBase());
    }
}