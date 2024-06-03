/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.
*/

package ejerciciosRealizados.unidad10;

public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento,
                            double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);

        if (sueldo < 0.0) {
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }

        if (horas < 0.0 || horas > 168.0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }

        this.sueldo = sueldo;
        this.horas = horas;
    }

    public void setSueldo(double sueldo) {
        if (sueldo < 0.0) {
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }

        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setHoras(double horas) {
        if (horas < 0.0 || horas > 168.0) { // valida horas
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }

        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public double ingresos() {
        if (getHoras() <= 40) { // no hay tiempo extra
            return getSueldo() * getHoras();
        } else {
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("empleado por horas: %s%n%s: $%,.2f; %s: %,.2f", super.toString(),
                "sueldo por hora", getSueldo(),
                "horas trabajadas", getHoras());
    }
}