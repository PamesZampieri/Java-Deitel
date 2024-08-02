package ejemplosTeoricos.unidad11;

public class UsoDeExcepcionesEncadenadas {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception exception) { // excepciones lanzadas desde metodo1
            exception.printStackTrace();
        }
    }

    // llama a metodo2; lanza las excepciones de vuelta a main
    public static void metodo1() throws Exception {
        try {
            metodo2();
        } catch (Exception exception) { // excepción lanzada desde metodo2
            throw new Exception("La excepción se lanzó en metodo1", exception);
        }
    }

    // llama a metodo3; lanza las excepciones de vuelta a metodo1
    public static void metodo2() throws Exception {
        try {
            metodo3();
        } catch (Exception exception) { // excepción lanzada desde metodo3
            throw new Exception("La excepción se lanzó en metodo2", exception);
        }
    }

    // lanza excepción Exception de vuelta a metodo2
    public static void metodo3() throws Exception {
        throw new Exception("La excepción se lanzó en metodo3");
    }
}