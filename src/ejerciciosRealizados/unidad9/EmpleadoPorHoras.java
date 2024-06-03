/*
9.15 (Creación de una nueva subclase de Empleado) Otros tipos de objetos Empleado podrían incluir objetos
EmpleadoAsalariado que reciban un salario semanal fijo, TrabajadoresPiezas a quienes se les pague por el número de piezas
que produzcan, o EmpleadosPorHoras que reciban un sueldo por horas con tiempo y medio (1.5 veces el sueldo por horas)
por las horas trabajadas que sobrepasen las 40 horas.
Cree la clase EmpleadoPorHoras que herede de la clase Empleado (ejercicio 9.14) y tenga la variable de instancia horas
(de tipo double) que represente las horas trabajadas, la  variable de instancia sueldo (de tipo double) que represente
los sueldos por hora, un constructor que reciba como argumentos el primer nombre, el apellido paterno, el número de
seguro social, el sueldo por horas y el número de horas trabajadas, métodos establecer y obtener para manipular las
variables hora y sueldo, un método ingresos para calcular los ingresos de un EmpleadoPorHoras con base en las horas
trabajadas, y un método toString que devuelva la representación String del EmpleadoPorHoras. El método establecerSueldo
debe asegurarse de que sueldo sea mayor o igual a 0, y establecerHoras debe asegurar que el valor de horas esté entre 0
y 168 (el número total de horas en una semana).
Use la clase EmpleadoPorHoras en un programa de prueba que sea similar al de la figura 9.5.
*/

package ejerciciosRealizados.unidad9;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double sueldoPorHora;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double horasTrabajadas,
                            double sueldoPorHora) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (horasTrabajadas < 0.0 || horasTrabajadas > 168.0) {
            throw new IllegalArgumentException("Horas trabajadas deben ser mayor e igual que cero (0) y menor o igual " +
                    "que 168.");
        }

        if (sueldoPorHora < 0.0) {
            throw new IllegalArgumentException("Sueldo debe ser mayor o igual que cero.");
        }

        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0.0 || horasTrabajadas > 168.0) {
            throw new IllegalArgumentException("Horas trabajadas deben ser mayor e igual que cero (0) y menor o igual " +
                    "que 168.");
        }

        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        if (sueldoPorHora < 0.0) {
            throw new IllegalArgumentException("Sueldo debe ser mayor o igual que cero.");
        }

        this.sueldoPorHora = sueldoPorHora;
    }

    public double ingresos() {
        return getHorasTrabajadas() * getSueldoPorHora();
    }

    @Override
    public String toString() {
        return String.format("%s%s: %s%n%s: %s%n", super.toString(), "horas trabajadas", getHorasTrabajadas(),
                "sueldo por hora", getSueldoPorHora());
    }
}