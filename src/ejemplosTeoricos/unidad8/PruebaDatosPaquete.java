package ejemplosTeoricos.unidad8;

// Los miembros con acceso a nivel de paquete de una clase son accesibles para las demás clases en el mismo paquete.
public class PruebaDatosPaquete {
    public static void main(String[] args) {
        DatosPaquete datosPaquete = new DatosPaquete();

        // imprime la representación String de datosPaquete
        System.out.printf("Después de instanciar:%n%s%n", datosPaquete);

        // modifica los datos con acceso a nivel de paquete en el objeto datosPaquete
        datosPaquete.numero = 77;
        datosPaquete.cadena = "Adiós";

        // imprime la representación String de datosPaquete
        System.out.printf("%nDespués de modificar valores:%n%s%n", datosPaquete);
    }
}

// clase con variables de instancia con acceso a nivel de paquete
class DatosPaquete {
    int numero; // variable de instancia con acceso a nivel de paquete (sin modificadores de acceso)
    String cadena; // variable de instancia con acceso a nivel de paquete (sin modificadores de acceso)

    // constructor
    public DatosPaquete() {
        numero = 0;
        cadena = "Hola";
    }

    // devuelve la representación String del objeto DatosPaquete
    public String toString() {
        return String.format("numero: %d; cadena: %s", numero, cadena);
    }
}