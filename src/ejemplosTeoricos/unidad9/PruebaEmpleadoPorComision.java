package ejemplosTeoricos.unidad9;

public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        // crea instancia de objeto EmpleadoPorComision
        EmpleadoPorComision empleado = new EmpleadoPorComision("Sue", "Jones",
                "222-22-2222", 10000, .06);

        // obtiene datos del empleado por comisión
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