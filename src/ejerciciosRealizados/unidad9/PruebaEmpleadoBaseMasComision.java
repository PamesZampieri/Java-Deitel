/*
9.3 (Uso de la composición en vez de la herencia) Muchos programas escritos con herencia podrían escribirse mediante la
composición, y viceversa. Vuelva a escribir la clase EmpleadoBaseMasComision (figura 9.11) de la jerarquía
EmpleadoPorComision-EmpleadoBaseMasComision para usar la composición en vez de la herencia.
*/

package ejerciciosRealizados.unidad9;

public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Bob", "Lewis",
                "333-33-3333", 5000, .04);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(empleadoPorComision, 300);

        System.out.println("Información del empleado obtenida por los métodos establecer:");
        System.out.printf("%n%s %s%n", "El primer nombre es", empleadoPorComision.getPrimerNombre());
        System.out.printf("%s %s%n", "El apellido es", empleadoPorComision.getApellidoPaterno());
        System.out.printf("%s %s%n", "El número de seguro social es", empleadoPorComision.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "Las ventas brutas son", empleadoPorComision.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comisión es", empleadoPorComision.getTarifaComision());
        System.out.printf("%s %.2f%n", "El salario base es", empleadoBaseMasComision.getSalarioBase());

        empleadoBaseMasComision.setSalarioBase(1000);

        System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado, obtenida mediante toString",
                empleadoBaseMasComision);

        System.out.printf("ingresos: %.2f", empleadoBaseMasComision.ingresos());
    }
}