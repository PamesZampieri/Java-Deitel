/*
10.15 (Modificación al sistema de cuentas por pagar) En este ejercicio modificaremos la aplicación de cuentas por pagar
de las figuras 10.11 a 10.15, para incluir la funcionalidad completa de la aplicación de nómina de las figuras 10.4 a
10.9. La aplicación debe aún procesar dos objetos Factura, pero ahora debe procesar un objeto de cada una de las cuatro
subclases de Empleado. Si el objeto que se está procesando en un momento dado es EmpleadoBasePorComision, la aplicación
debe incrementar el salario base del EmpleadoBasePorComision por un 10%. Por último, la aplicación debe imprimir el
monto del pago para cada objeto. Complete los siguientes pasos para crear la nueva aplicación:
a) Modifique las clases EmpleadoPorHoras (figura 10.6) y EmpleadoPorComision (figura 10.7) para colocarlas en la
jerarquía PorPagar como subclases de la versión de Empleado (figura 10.13) que implementa a PorPagar. [Sugerencia:
cambie el nombre del método ingresos a obtenerMontoPago en cada subclase, de manera que la clase cumpla con su contrato
heredado con la interfaz PorPagar].
b) Modifique la clase EmpleadoBaseMasComision (figura 10.8), de tal forma que extienda la versión de la clase
EmpleadoPorComision que se creó en el inciso (a).
c) Modifique PruebaInterfazPorPagar (figura 10.15) para procesar mediante el polimorfismo dos objetos Factura, un
EmpleadoAsalariado, un EmpleadoPorHoras, un EmpleadoPorComision y un EmpleadoBaseMasComision. Primero imprima una
representación de cadena de cada objeto PorPagar. Después, si un objeto es un EmpleadoBaseMasComision, aumente su
salario base por un 10%. Por último, imprima el monto del pago para cada objeto PorPagar.
*/

package ejerciciosRealizados.unidad10;

public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        }

        if (precioPorArticulo < 0.0) {
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0");
        }

        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        }

        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0) {
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0");
        }

        this.precioPorArticulo = precioPorArticulo;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public double getMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "factura", "numero de pieza", getNumeroPieza(), getDescripcionPieza(),
                "cantidad", getCantidad(), "precio por articulo", getPrecioPorArticulo());
    }
}
