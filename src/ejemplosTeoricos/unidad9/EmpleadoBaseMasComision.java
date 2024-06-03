package ejemplosTeoricos.unidad9;

// La clase EmpleadoBaseMasComision representa a un empleado que recibe un salario base, además de la comisión.
public class EmpleadoBaseMasComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas; //ventas totales por semana
    private double tarifaComision; //porcentaje de comisión
    private double salarioBase; //salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {
        // la llamada implícita al constructor predeterminado de Object ocurre aquí

        // si ventasBrutas no es válida, lanza excepción
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        // si tarifaComision no es válida, lanza excepción
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        // si  si salarioBase es inválido, lanza excepción
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // establece el monto de ventas brutas
    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    // establece la tarifa de comisión
    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
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

    // calcula los ingresos
    public double ingresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }

    // devuelve representación String del objeto EmpleadoBaseMasComision
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "empleado por comisión con sueldo base", primerNombre, apellidoPaterno,
                "número seguro social", numeroSeguroSocial,
                "ventas brutas", ventasBrutas,
                "tarifa de comisión", tarifaComision,
                "salario base", salarioBase);
    }
}