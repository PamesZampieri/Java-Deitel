/*
9.3 (Uso de la composición en vez de la herencia) Muchos programas escritos con herencia podrían escribirse mediante la
composición, y viceversa. Vuelva a escribir la clase EmpleadoBaseMasComision (figura 9.11) de la jerarquía
EmpleadoPorComision-EmpleadoBaseMasComision para usar la composición en vez de la herencia.
*/

package ejerciciosRealizados.unidad9;

public class EmpleadoPorComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas; //ventas totales por semana
    private double tarifaComision; //porcentaje de comisión

    // constructor con cinco argumentos
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
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
        return getTarifaComision() * getVentasBrutas();
    }

    // devuelve representación String del objeto EmpleadoPorComision
    @Override  // indica que este método sobrescribe el método de una superclase
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "empleado por comisión", getPrimerNombre(), getApellidoPaterno(),
                "número seguro social", getNumeroSeguroSocial(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comisión", getTarifaComision());
    }
}