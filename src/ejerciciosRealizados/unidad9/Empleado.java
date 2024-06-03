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

public abstract class Empleado {
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

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n",
                "nombre y apellido", getPrimerNombre(), getApellidoPaterno(),
                "número seguro social", getNumeroSeguroSocial());
    }
}