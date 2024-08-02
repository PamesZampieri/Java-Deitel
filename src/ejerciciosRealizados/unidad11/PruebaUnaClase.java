/*
11.19 (Falla del constructor) Escriba un programa que muestre cómo un constructor pasa información sobre la falla del
constructor a un manejador de excepciones. Defina la clase UnaClase, que lance una excepción Exception en el
constructor. Su programa deberá tratar de crear un objeto de tipo UnaClase y atrapar la excepción que se lance desde el
constructor.
*/

package ejerciciosRealizados.unidad11;

public class PruebaUnaClase {
    public static void main(String[] args) {
        try {
            UnaClase unaClase = new UnaClase("Pamela", "Zampieri", -1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}