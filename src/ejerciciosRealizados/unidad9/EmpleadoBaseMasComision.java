/*
9.3 (Uso de la composición en vez de la herencia) Muchos programas escritos con herencia podrían escribirse mediante la
composición, y viceversa. Vuelva a escribir la clase EmpleadoBaseMasComision (figura 9.11) de la jerarquía
EmpleadoPorComision-EmpleadoBaseMasComision para usar la composición en vez de la herencia.
*/

package ejerciciosRealizados.unidad9;

public class EmpleadoBaseMasComision {
    private final EmpleadoPorComision empleadoPorComision;
    private double salarioBase; // salario base por semana

    public EmpleadoBaseMasComision(EmpleadoPorComision empleadoPorComision, double salarioBase) {
        // si  si salarioBase es inválido, lanza excepción
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.empleadoPorComision = empleadoPorComision;
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

    public double ingresos() {
        return empleadoPorComision.ingresos() + getSalarioBase();
    }

    // devuelve representación String de EmpleadoBaseMasComision
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "Con sueldo base y", empleadoPorComision, "sueldo base", getSalarioBase());
    }
}