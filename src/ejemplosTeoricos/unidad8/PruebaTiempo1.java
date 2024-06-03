package ejemplosTeoricos.unidad8;

public class PruebaTiempo1 {
    public static void main(String[] args) {
        // crea e inicializa un objeto Tiempo1
        Tiempo1 tiempo = new Tiempo1(); // invoca el constructor de Tiempo1

        // imprime representaciones de cadena del tiempo
        mostrarTiempo("Después de crear el objeto tiempo", tiempo);
        System.out.println();

        // modifica el tiempo e imprime el tiempo actualizado
        tiempo.establecerTiempo(13, 27, 6);
        mostrarTiempo("Después de llamar a establecerTiempo", tiempo);
        System.out.println();

        // intenta establecer el tiempo con valores inválidos;
        try {
            tiempo.establecerTiempo(99, 99, 99);  // todos los valores fuera de rango
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepción: %s%n%n", e.getMessage());
        }

        // muestra el tiempo después de tratar de establecer valores inválidos
        mostrarTiempo("Después de llamar a establecerTiempo con valores inválidos", tiempo);
    }

    // muestra un objeto Tiempo1 en formatos de 24 horas y 12 horas
    public static void mostrarTiempo(String encabezado, Tiempo1 t) {
        System.out.printf("%s%nTiempo universal: %s%nTiempo estándar: %s%n", encabezado, t.aStringUniversal(),
                t.toString());
    }
}