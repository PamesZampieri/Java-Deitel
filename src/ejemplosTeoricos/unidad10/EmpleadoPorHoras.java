package ejemplosTeoricos.unidad10;

public class EmpleadoPorHoras extends Empleado {
    private double sueldo; // sueldo por hora
    private double horas; // horas trabajadas por semana

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo,
                            double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (sueldo < 0.0) { // valida sueldo
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }

        if (horas < 0.0 || horas > 168.0) { // valida horas
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }

        this.sueldo = sueldo;
        this.horas = horas;
    }

    // establece el sueldo
    public void setSueldo(double sueldo) {
        if (sueldo < 0.0) { // valida sueldo
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }

        this.sueldo = sueldo;
    }

    // devuelve el sueldo
    public double getSueldo() {
        return sueldo;
    }

    // establece las horas trabajadas
    public void setHoras(double horas) {
        if (horas < 0.0 || horas > 168.0) { // valida horas
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }

        this.horas = horas;
    }

    // devuelve las horas trabajadas
    public double getHoras() {
        return horas;
    }

    /* calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos() {
        if (getHoras() <= 40) { // no hay tiempo extra
            return getSueldo() * getHoras();
        } else {
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }
     */

    // calcula los ingresos; implementa el método de la interfaz PorPagar que era abstracto en la superclase Empleado
    @Override
    public double getMontoPago() {
        if (getHoras() <= 40) { // no hay tiempo extra
            return getSueldo() * getHoras();
        } else {
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }

    // devuelve representación String de un objeto EmpleadoPorHoras
    @Override
    public String toString() {
        return String.format("empleado por horas: %s%n%s: $%,.2f; %s: %,.2f", super.toString(),
                "sueldo por hora", getSueldo(),
                "horas trabajadas", getHoras());
    }
}