/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.

10.16 (Modificación al sistema de cuentas por pagar) Es posible incluir la funcionalidad de la aplicación de nómina
(figuras 10.4 a 10.9) en la aplicación de cuentas por pagar sin necesidad de modificar las subclases de Empleado
llamadas EmpleadoAsalariado, EmpleadoPorHoras, EmpleadoPorComision o EmpleadoBaseMasComision. Para ello, puede modificar
la clase Empleado (figura 10.4) de modo que implemente la interfaz PorPagar y declare el método obtenerMontoPago para
invocar al método ingresos. De esta forma, el método obtenerMontoPago sería heredado por las subclases en la jerarquía
de Empleado. Cuando se haga una llamada a obtenerMontoPago para un objeto de una subclase específica, se invocará
mediante el polimorfismo al método ingresos apropiado para esa subclase. Vuelva a implementar el ejercicio 10.15,
usando la jerarquía de Empleado original de la aplicación de nómina de las figuras 10.4 a 10.9. Modifique la clase
Empleado como se describe en este ejercicio, y no modifique ninguna de las subclases de Empleado.
*/

package ejerciciosRealizados.unidad10;

import java.time.LocalDate;

public abstract class Empleado implements PorPagar {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private final Fecha fechaNacimiento;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.fechaNacimiento = fechaNacimiento;
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

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean esTuMesCumpleanios() {
        return getFechaNacimiento().getMes() == LocalDate.now().getMonthValue();
    }

    protected double getBonoCumpleanios() {
        if (esTuMesCumpleanios()) {
            return 100;
        }

        return 0;
    }

    @Override
    public double getMontoPago() {
        return ingresos() + getBonoCumpleanios();
    }

    public abstract double ingresos();

    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s%nfecha de nacimiento: %s",
                getPrimerNombre(), getApellidoPaterno(),
                getNumeroSeguroSocial(), getFechaNacimiento());
    }
}