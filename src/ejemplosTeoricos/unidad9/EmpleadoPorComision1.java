package ejemplosTeoricos.unidad9;

// La clase EmpleadoPorComision1 representa a un empleado que recibe como sueldo un porcentaje de las ventas brutas.
public class EmpleadoPorComision1 extends Object {
    //Uso de variables de instancia protected
    protected final String primerNombre;
    protected final String apellidoPaterno;
    protected final String numeroSeguroSocial;
    protected double ventasBrutas; //ventas totales por semana
    protected double tarifaComision; //porcentaje de comisión

    public EmpleadoPorComision1(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                double ventasBrutas, double tarifaComision) {
        // la llamada implícita al constructor predeterminado de Object ocurre aquí

        // si ventasBrutas no es válida, lanza excepción
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        // si tarifaComision no es válida, lanza excepción
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
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

    // calcula los ingresos
    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    // devuelve representación String del objeto EmpleadoPorComision1
    @Override  // indica que este método sobrescribe el método de una superclase
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "empleado por comisión", primerNombre,
                apellidoPaterno, "número seguro social", numeroSeguroSocial, "ventas brutas", ventasBrutas, "tarifa de " +
                        "comisión", tarifaComision);
    }
}