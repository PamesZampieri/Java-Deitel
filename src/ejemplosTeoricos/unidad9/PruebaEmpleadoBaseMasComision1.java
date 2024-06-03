package ejemplosTeoricos.unidad9;

public class PruebaEmpleadoBaseMasComision1 {
    public static void main(String[] args) {
        EmpleadoBaseMasComision1 empleado = new EmpleadoBaseMasComision1("Bob", "Lewis",
                "333-33-3333", 5000, .04, 300);

        // obtiene datos del empleado por comisión con sueldo base
        System.out.println("Información del empleado obtenida por los métodos establecer:");
        System.out.printf("%s %s%n", "El primer nombre es", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "El apellido es", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "El número de seguro social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "Las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comisión es", empleado.getTarifaComision());
        System.out.printf("%s %.2f%n", "El salario base es", empleado.getSalarioBase());

        empleado.setSalarioBase(1000);

        System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado, obtenida mediante toString",
                empleado.toString());
    }
}