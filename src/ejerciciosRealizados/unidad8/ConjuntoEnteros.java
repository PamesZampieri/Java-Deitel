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

import java.util.Arrays;

public class ConjuntoEnteros {
    private boolean[] conjunto;

    public ConjuntoEnteros() {
        this.conjunto = new boolean[101];
    }

    public boolean[] getConjunto() {
        return conjunto;
    }

    public void setConjunto(boolean[] conjunto) {
        this.conjunto = conjunto;
    }

    public boolean contiene(int numero) {
        return conjunto[numero];
    }

    public void insertarElemento(int numero) {
        conjunto[numero] = true;
    }

    public void eliminarElemento(int numero) {
        conjunto[numero] = false;
    }

    public boolean esIgualA(ConjuntoEnteros conjunto2) {
        return Arrays.equals(conjunto, conjunto2.getConjunto());
    }

    public static ConjuntoEnteros union(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros conjunto3 = new ConjuntoEnteros();

        for (int i = 0; i <= 100; i++) {
            if (conjunto1.contiene(i) || conjunto2.contiene(i)) {
                conjunto3.insertarElemento(i);
            }
        }

        return conjunto3;
    }

    public static ConjuntoEnteros interseccion(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros conjunto3 = new ConjuntoEnteros();

        for (int i = 0; i <= 100; i++) {
            if (conjunto1.contiene(i) && conjunto2.contiene(i)) {
                conjunto3.insertarElemento(i);
            }
        }

        return conjunto3;
    }

    public String toString() {
        String resultado = "";

        for (int i = 0; i <= 100; i++) {
            resultado += conjunto[i] ? i + " " : "--- ";
        }

        return resultado;
    }
}