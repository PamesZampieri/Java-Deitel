package ejemplosTeoricos.unidad9;

// La clase EmpleadoBaseMasComision2 hereda de EmpleadoPorComision2 y accede a los datos private de la superclase a
// través de los métodos public heredados.
public class EmpleadoBaseMasComision2 extends EmpleadoPorComision2 {
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision2(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                    double ventasBrutas, double tarifaComision, double salarioBase) {

        // llamada explícita al constructor de la superclase EmpleadoPorComision2
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
        return getSalarioBase() + super.ingresos();
    }

    // devuelve representación String de EmpleadoBaseMasComision2
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "con sueldo base", super.toString(), "sueldo base", getSalarioBase());
    }
}