package ejemplosTeoricos.unidad10;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase; // salario base por semana

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {

        // llamada explícita al constructor de la superclase EmpleadoPorComision
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);

        // si  si salarioBase es inválido, lanza excepción
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.salarioBase = salarioBase;
    }

    // establece el salario base
    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    /* calcula los ingresos; sobrescribe el método ingresos en EmpleadoPorComision
    @Override
    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }
     */

    // calcula los ingresos; implementa el método de la interfaz PorPagar que era abstracto en la superclase Empleado
    @Override
    public double getMontoPago() {
        return getSalarioBase() + super.getMontoPago();
    }

    // devuelve representación String de un objeto EmpleadoBaseMasComision
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "con salario base", super.toString(), "salario base", getSalarioBase());
    }
}