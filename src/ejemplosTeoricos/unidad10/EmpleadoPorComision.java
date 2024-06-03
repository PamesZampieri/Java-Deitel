package ejemplosTeoricos.unidad10;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas; //ventas totales por semana
    private double tarifaComision; //porcentaje de comisión

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                               double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // si tarifaComision no es válida, lanza excepción
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        // si ventasBrutas no es válida, lanza excepción
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

    /* calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
    }
     */

    // calcula los ingresos; implementa el método de la interfaz PorPagar que era abstracto en la superclase Empleado
    @Override
    public double getMontoPago() {
        return getTarifaComision() * getVentasBrutas();
    }

    // devuelve representación String de un objeto EmpleadoPorComision
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "empleado por comisión", super.toString(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comisión", getTarifaComision());
    }
}