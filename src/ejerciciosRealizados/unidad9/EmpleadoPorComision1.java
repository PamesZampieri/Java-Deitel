/*
9.14 (Jerarquía Empleado) En este capítulo estudió una jerarquía de herencia en donde la clase EmpleadoBaseMasComision
heredó de la clase EmpleadoPorComision. Sin embargo, no todos los tipos de empleados son EmpleadoPorComision. En este
ejercicio, creará una superclase Empleado más general que extraiga los atributos y comportamientos de la clase
EmpleadoPorComision que son comunes para todos los objetos Empleado. Los atributos y comportamientos comunes de todos
los objetos Empleado son: primerNombre, apellidoPaterno, numeroSeguroSocial, obtenerPrimerNombre, obtenerApellidoPaterno,
obtenerNumeroSeguroSocial y una parte del método toString.
Cree una nueva superclase Empleado que contenga estas variables y métodos de instancia, además de un constructor. A
continuación, vuelva a escribir la clase EmpleadoPorComision de la sección 9.4.5 como una subclase de Empleado. La clase
EmpleadoPorComision debe contener sólo las variables y métodos de instancia que no se declaren en la superclase Empleado.
El constructor de la clase EmpleadoPorComision debe invocar al constructor de la clase Empleado y el método toString de
EmpleadoPorComision debe invocar al método toString de Empleado.
Una vez que complete estas modificaciones, ejecute las aplicaciones PruebaEmpleadoPorComision y
PruebaEmpleado-BaseMasComision usando estas nuevas clases para asegurar que las aplicaciones sigan mostrando los mismos
resultados para un objeto EmpleadoPorComision y un objeto EmpleadoBaseMasComision, respectivamente.
*/

package ejerciciosRealizados.unidad9;

public class EmpleadoPorComision1 extends Empleado {
    private double ventasBrutas; //ventas totales por semana
    private double tarifaComision; //porcentaje de comisión

    // constructor con cinco argumentos
    public EmpleadoPorComision1(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                double ventasBrutas, double tarifaComision) {

        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // si ventasBrutas no es válida, lanza excepción
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        // si tarifaComision no es válida, lanza excepción
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
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

    @Override
    public String toString() {
        return String.format("%s%s: %.2f%n%s: %.2f",
                super.toString(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comisión", getTarifaComision());
    }
}