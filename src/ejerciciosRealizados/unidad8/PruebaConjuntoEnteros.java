/*
8.13 (Conjunto de enteros)Cree la clase ConjuntoEnteros. Cada objeto ConjuntoEnteros puede almacenar enteros en el rango
de 0 a 100. El conjunto se representa mediante un arreglo de valores boolean. El elemento del arreglo a[i] es true si el
entero i se encuentra en el conjunto. El elemento del arreglo a[j] es false si el entero j no se encuentra dentro del
conjunto. El constructor sin argumentos inicializa el arreglo con el “conjunto vacío” (es decir, sólo valores false).
Proporcione los siguientes métodos: el método static union debe crear un conjunto que sea la unión teórica de conjuntos
para los dos conjuntos existentes (es decir, un elemento del nuevo arreglo se establece en true si ese elemento es true
en cualquiera o en ambos de los conjuntos existentes; en caso contrario, el elemento del nuevo conjunto se establece en
false). El método static interseccion debe crear un tercer conjunto que sea la intersección teórica de conjuntos para
los dos conjuntos existentes (es decir, un elemento del arreglo del nuevo conjunto se estableceen false si eseelemento
es false en uno o ambos de los conjuntos existentes; en caso contrario, el elemento del nuevo conjunto se establece en
true). El método insertarElemento debe insertar un nuevo entero k en un conjunto (estableciendo a[k] en true). El método
eliminarElemento debe eliminar el entero m (estableciendo a[m] en false).
El método toString debe devolver un String que contenga un conjunto como una lista de números separados por espacios.
Incluya sólo aquellos elementos que estén presentes en el conjunto. Use --- para representar un conjunto vacío. El
método esIgualA debe determinar si dos conjuntos son iguales. Escriba un programa para probar la clase ConjuntoEnteros.
Cree instancias de varios objetos ConjuntoEnteros. Pruebe que todos sus métodos funcionen de manera correcta.
*/

package ejerciciosRealizados.unidad8;

public class PruebaConjuntoEnteros {
    public static void main(String[] args) {
        ConjuntoEnteros conjuntoEnteros1 = new ConjuntoEnteros();
        ConjuntoEnteros conjuntoEnteros2 = new ConjuntoEnteros();

        for (int i = 0; i <= 50; i++) {
            conjuntoEnteros1.insertarElemento(i);
        }

        System.out.println("conjuntoEnteros1:");
        System.out.printf("%s%n%n", conjuntoEnteros1);

        System.out.println("conjuntoEnteros2:");
        System.out.printf("%s%n%n", conjuntoEnteros2);

        ConjuntoEnteros conjuntoEnteros3 = ConjuntoEnteros.union(conjuntoEnteros1, conjuntoEnteros2);
        System.out.println("conjuntoEnteros3, utilizando el método .union(conjuntoEnteros1, conjuntoEnteros2):");
        System.out.printf("%s%n%n", conjuntoEnteros3);

        for (int i = 0; i <= 60; i++) {
            conjuntoEnteros2.insertarElemento(i);
        }

        System.out.println("conjuntoEnteros2:");
        System.out.printf("%s%n%n", conjuntoEnteros2);

        ConjuntoEnteros conjuntoEnteros4 = ConjuntoEnteros.interseccion(conjuntoEnteros1, conjuntoEnteros2);
        System.out.println("conjuntoEnteros4, utilizando el método .interseccion(conjuntoEnteros1, conjuntoEnteros2):");
        System.out.printf("%s%n%n", conjuntoEnteros4);

        ConjuntoEnteros conjuntoEnteros5 = new ConjuntoEnteros();
        System.out.println("conjuntoEnteros5:");
        System.out.printf("%s%n%n", conjuntoEnteros5);

        conjuntoEnteros5.insertarElemento(5);
        System.out.println("conjuntoEnteros5, utilizando el método .insertarElemento(5):");
        System.out.printf("%s%n%n", conjuntoEnteros5);

        conjuntoEnteros5.eliminarElemento(5);
        System.out.println("conjuntoEnteros5, utilizando el método .eliminarElemento(5):");
        System.out.printf("%s%n%n", conjuntoEnteros5);

        ConjuntoEnteros conjuntoEnteros6 = new ConjuntoEnteros();
        System.out.println("conjuntoEnteros6:");
        System.out.printf("%s%n%n", conjuntoEnteros6);

        System.out.println("conjuntoEnteros5, utilizando el método .esIgualA(conjuntoEnteros6):");
        System.out.println(conjuntoEnteros5.esIgualA(conjuntoEnteros6));
    }
}