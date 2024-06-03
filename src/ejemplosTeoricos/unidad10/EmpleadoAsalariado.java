package ejemplosTeoricos.unidad10;

// La clase EmpleadoAsalariado que implementa la interfaz PorPagar.
// La clase concreta EmpleadoAsalariado extiende a la clase abstracta Empleado.
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                              double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

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

    /* calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }
     */

    // calcula los ingresos; implementa el método de la interfaz PorPagar que era abstracto en la superclase Empleado
    @Override
    public double getMontoPago() {
        return getSalarioSemanal();
    }

    // devuelve representación String de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return String.format("empleado asalariado: %s%n%s: $%,.2f", super.toString(), "salario semanal", getSalarioSemanal());
    }
}