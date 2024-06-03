package ejemplosTeoricos.unidad9;

// Los miembros private de la superclase no se pueden utilizar en una subclase.
public class EmpleadoBaseMasComision1 extends EmpleadoPorComision1 {
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision1(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                    double ventasBrutas, double tarifaComision, double salarioBase) {

        // llamada explícita al constructor de la superclase EmpleadoPorComision1
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

    @Override
    public double ingresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }

    // devuelve representación String de EmpleadoBaseMasComision1
    @Override
    public String toString() {
        // no está permitido: intentos por acceder a los miembros private de la superclase, por lo cual se cambiaron a protected
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "empleado por comisión con sueldo base", primerNombre, apellidoPaterno,
                "número seguro social", numeroSeguroSocial,
                "ventas brutas", ventasBrutas,
                "tarifa de comisión", tarifaComision,
                "salario base", salarioBase);
    }
}