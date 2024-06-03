package ejemplosTeoricos.unidad10;
// Asignación de referencias a la superclase y la subclase, a variables de la superclase y la subclase.

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        // asigna la referencia a la superclase a una variable de la superclase
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones",
                "222-22-2222", 10000, .06);

        // asigna la referencia a la subclase a una variable de la subclase
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis",
                "333-33-3333", 5000, .04, 300);

        // invoca a toString en un objeto de la superclase, usando una variable de la superclase
        System.out.printf("%s:%n%n%s%n%n", "Llamada a toString de EmpleadoPorComision con referencia de superclase a " +
                "un objeto de la superclase", empleadoPorComision);

        // invoca a toString en un objeto de la subclase, usando una variable de la subclase
        System.out.printf("%s:%n%n%s%n%n", "Llamada a toString de EmpleadoBaseMasComision con referencia de subclase a " +
                "un objeto de la subclase", empleadoBaseMasComision);

        // invoca a toString en un objeto de la subclase, usando una variable de la superclase
        EmpleadoPorComision empleadoPorComision2 = empleadoBaseMasComision;

        System.out.printf("%s:%n%n%s%n%n", "Llamada a toString de EmpleadoBaseMasComision con referencia de superclase a " +
                "un objeto de la subclase", empleadoPorComision2);
    }
}