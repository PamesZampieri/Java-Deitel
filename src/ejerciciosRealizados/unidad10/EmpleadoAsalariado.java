/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.
*/

package ejerciciosRealizados.unidad10;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento,
                              double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);

        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        }

        this.salarioSemanal = salarioSemanal;
    }

    // establece el salario
    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        }

        this.salarioSemanal = salarioSemanal;
    }

    // devuelve el salario
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    // calcula los ingresos; implementa el método de la interfaz PorPagar que era abstracto en la superclase Empleado
    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    // devuelve representación String de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return String.format("empleado asalariado: %s%n%s: $%,.2f", super.toString(), "salario semanal", getSalarioSemanal());
    }
}