package ejemplosTeoricos.unidad10;

// Programa de prueba para la jerarquía de Empleado.
public class PruebaSistemaNomina {
    public static void main(String[] args) {
        // crea objetos de las subclases
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith",
                "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price",
                "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones",
                "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "lewis",
                "444-44-4444", 5000, .04, 300);

        System.out.println("Empleados procesados por separado:");

        System.out.printf("%n%s%n%s: $%,.2f%n", empleadoAsalariado, "ingresos", empleadoAsalariado.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n", empleadoPorHoras, "ingresos", empleadoPorHoras.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n", empleadoPorComision, "ingresos", empleadoPorComision.getMontoPago());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.getMontoPago());

        // crea un arreglo Empleado de cuatro elementos
        Empleado[] empleados = new Empleado[4];

        // inicializa el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimórfica:\n");

        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual); // invoca a toString

            // determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                // conversión descendente de la referencia de Empleado, a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;

                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f%n", empleado.getSalarioBase());
            }

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.getMontoPago());
        }

        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s%n", j, empleados[j].getClass().getName());
        }
    }
}