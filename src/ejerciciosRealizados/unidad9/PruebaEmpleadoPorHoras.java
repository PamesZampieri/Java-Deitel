/*
9.15 (Creación de una nueva subclase de Empleado) Otros tipos de objetos Empleado podrían incluir objetos
EmpleadoAsalariado que reciban un salario semanal fijo, TrabajadoresPiezas a quienes se les pague por el número de piezas
que produzcan, o EmpleadosPorHoras que reciban un sueldo por horas con tiempo y medio (1.5 veces el sueldo por horas)
por las horas trabajadas que sobrepasen las 40 horas.
Cree la clase EmpleadoPorHoras que herede de la clase Empleado (ejercicio 9.14) y tenga la variable de instancia horas
(de tipo double) que represente las horas trabajadas, la  variable de instancia sueldo (de tipo double) que represente
los sueldos por hora, un constructor que reciba como argumentos el primer nombre, el apellido paterno, el número de
seguro social, el sueldo por horas y el número de horas trabajadas, métodos establecer y obtener para manipular las
variables hora y sueldo, un método ingresos para calcular los ingresos de un EmpleadoPorHoras con base en las horas
trabajadas, y un método toString que devuelva la representación String del EmpleadoPorHoras. El método establecerSueldo
debe asegurarse de que sueldo sea mayor o igual a 0, y establecerHoras debe asegurar que el valor de horas esté entre 0
y 168 (el número total de horas en una semana).
Use la clase EmpleadoPorHoras en un programa de prueba que sea similar al de la figura 9.5.
*/

package ejerciciosRealizados.unidad9;

public class PruebaEmpleadoPorHoras {
    public static void main(String[] args) {
        EmpleadoPorHoras empleado = new EmpleadoPorHoras("Sue", "Jones",
                "222-22-2222", 10, 500.0);

        System.out.println("Información del empleado obtenida por los métodos establecer:");
        System.out.printf("%n%s %s%n", "El primer nombre es", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "El apellido paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "El número de seguro social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f%n", "Las horas trabajadas son", empleado.getHorasTrabajadas());
        System.out.printf("%s %.2f%n", "El sueldo por hora es", empleado.getSueldoPorHora());

        System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado, obtenida mediante toString", empleado);

        try {
            empleado.setHorasTrabajadas(169);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            empleado.setSueldoPorHora(-12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%nIngresos obtenidos: %.2f%n", empleado.ingresos());
    }
}