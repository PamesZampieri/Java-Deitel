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

public class EmpleadoBaseMasComision1 extends EmpleadoPorComision1 {
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision1(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
                                    double ventasBrutas, double tarifaComision, double salarioBase) {

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

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "empleado por comisión con sueldo base",
                super.toString(), "sueldo base", getSalarioBase());
    }
}