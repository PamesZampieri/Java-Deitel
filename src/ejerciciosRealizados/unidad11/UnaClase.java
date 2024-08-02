/*
11.19 (Falla del constructor) Escriba un programa que muestre cómo un constructor pasa información sobre la falla del
constructor a un manejador de excepciones. Defina la clase UnaClase, que lance una excepción Exception en el
constructor. Su programa deberá tratar de crear un objeto de tipo UnaClase y atrapar la excepción que se lance desde el
constructor.
*/

package ejerciciosRealizados.unidad11;

public class UnaClase {
    private final String nombre;
    private final String apellido;
    private double salario;

    public UnaClase(String nombre, String apellido, double salario) throws Exception {
        if (salario < 0.0) {
            throw new Exception("El salario debe ser mayor o igual que 0.0");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if (salario < 0.0) {
            throw new Exception("El salario debe ser mayor o igual que 0.0");
        }

        this.salario = salario;
    }
}