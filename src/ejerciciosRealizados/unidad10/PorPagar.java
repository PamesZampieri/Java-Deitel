/*
10.12 (Modificación al sistema de nómina) Modifique el sistema de nómina de las figuras 10.4 a 10.9 para incluir la
variable de instancia private llamada fechaNacimiento en la clase Empleado. Use la clase Fecha de la figura 8.7 para
representar el cumpleaños de un empleado. Agregue métodos obtener a la clase Fecha. Suponga que la nómina se procesa una
vez al mes. Cree un arreglo de variables Empleado para guardar referencias a los diversos objetos empleado. En un ciclo,
calcule la nómina para cada Empleado (mediante el polimorfismo) y agregue una bonificación de $100.00 a la cantidad de
pago de nómina de la persona, si el mes actual es el mes en el que ocurre el cumpleaños de ese Empleado.
*/

package ejerciciosRealizados.unidad10;

public interface PorPagar {
    double getMontoPago();
}