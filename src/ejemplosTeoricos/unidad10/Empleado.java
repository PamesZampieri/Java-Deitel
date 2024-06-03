package ejemplosTeoricos.unidad10;

public abstract class Empleado implements PorPagar{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
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

    // devuelve representación String de un objeto Empleado
    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(),
                getNumeroSeguroSocial());
    }

    /* método abstracto sobrescrito por las subclases concretas
    public abstract double ingresos();// aquí no hay implementación
     */
}