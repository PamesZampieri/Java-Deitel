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

public class PruebaEmpleadoPorComision1 {
    public static void main(String[] args) {
        EmpleadoPorComision1 empleado = new EmpleadoPorComision1("Sue", "Jones",
                "222-22-2222", 10000, .06);

        System.out.println("Información del empleado obtenida por los métodos establecer:");
        System.out.printf("%n%s %s%n", "El primer nombre es", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "El apellido paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "El número de seguro social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "Las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comisión es", empleado.getTarifaComision());

        empleado.setVentasBrutas(500);
        empleado.setTarifaComision(.1);

        System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado, obtenida mediante toString", empleado);
    }
}