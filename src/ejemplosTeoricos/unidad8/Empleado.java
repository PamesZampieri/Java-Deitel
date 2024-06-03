package ejemplosTeoricos.unidad8;

public class Empleado {
    private final String nombre;
    private final String apellido;
    private final Fecha fechaNacimiento;
    private final Fecha fechaContratacion;

    // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
    public Empleado(String nombre, String apellido, Fecha fechaNacimiento, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    // convierte Empleado a formato String
    public String toString() {
        return String.format("%s %s Contratado: %s Cumpleanios: %s", apellido, nombre, fechaContratacion, fechaNacimiento);
    }
}