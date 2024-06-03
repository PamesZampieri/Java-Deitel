/*
8.16 (Clase Entero Enorme) Cree una clase llamada EnteroEnorme que utilice un arreglo de 40 elementos de dígitos, para
guardar enteros de hasta 40 dígitos de longitud cada uno. Proporcione los métodos parse, toString, sumar y restar. El
método parse debe recibir un String, extraer cada dígito mediante el método charAt y colocar el equivalente entero de
cada dígito en el arreglo de enteros. Para comparar objetos EnteroEnorme, proporcione los siguientes métodos: esIgualA,
noEsIgualA, esMayorQue, esMenorQue, esMayorOIgualA, y esMenorOIgualA. Cada uno de estos métodos deberá ser un método
predicado que devuelva true si la relación se aplica entre los dos objetos EnteroEnorme, y false si no se aplica.
Proporcione un método predicado llamado esCero. Si desea ir más allá, proporcione también los métodos multiplicar,
dividir y residuo. [Nota: los valores boolean primitivos pueden imprimirse como la palabra “true” o la palabra “false”,
con el especificador de formato %b].
*/

package ejerciciosRealizados.unidad8;

public class EnteroEnorme {
    private final int[] digitos;

    public EnteroEnorme() {
        this.digitos = new int[40];
    }

    public int[] getDigitos() {
        return digitos;
    }

    private int getDigito(int indice) {
        return digitos[indice];
    }

    private void setDigito(int indice, int valor) {
        digitos[indice] = valor;
    }

    public void parse(String cadena) {
        for (int i = digitos.length - 1, j = cadena.length() - 1; i >= 0 && j >= 0; i--, j--) {
            int digito = Character.getNumericValue(cadena.charAt(j));

            if (digito < 0 || digito > 9) {
                throw new IllegalArgumentException("Debe ser un dígito (0-9).");
            }

            digitos[i] = digito;
        }
    }

    public static EnteroEnorme sumar(EnteroEnorme a, EnteroEnorme b) {
        EnteroEnorme c = new EnteroEnorme();

        for (int i = a.getDigitos().length - 1; i >= 0; i--) {
            if (a.getDigito(i) + b.getDigito(i) >= 10) {
                c.setDigito(i, c.getDigito(i) + (a.getDigito(i) + b.getDigito(i)) % 10);
                c.getDigitos()[i - 1] = 1;
            } else {
                c.setDigito(i, c.getDigito(i) + a.getDigito(i) + b.getDigito(i));
            }

            if (a.getDigito(0) + b.getDigito(0) >= 10) {
                throw new IllegalArgumentException("Se desbordó la capacidad de EnteroEnorme.");
            }
        }

        return c;
    }

    public static EnteroEnorme restar(EnteroEnorme a, EnteroEnorme b) {
        EnteroEnorme c = new EnteroEnorme();

        for (int i = a.getDigitos().length - 1; i >= 0; i--) {
            c.setDigito(i, a.getDigito(i) - b.getDigito(i));
        }

        return c;
    }

    public static boolean esIgualA(EnteroEnorme x, EnteroEnorme y) {
        for (int i = 0; i < x.getDigitos().length; i++) {
            if (x.getDigito(i) != y.getDigito(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean noEsIgualA(EnteroEnorme x, EnteroEnorme y) {
        return !esIgualA(x, y);
    }

    public static boolean esMayorQue(EnteroEnorme x, EnteroEnorme y) {
        for (int i = 0; i < x.getDigitos().length; i++) {
            if (x.getDigito(i) > y.getDigito(i)) {
                return true;
            }

            if (x.getDigito(i) < y.getDigito(i)) {
                return false;
            }
        }

        return false;
    }

    public static boolean esMayorOIgualA(EnteroEnorme x, EnteroEnorme y) {
        for (int i = 0; i < x.getDigitos().length; i++) {
            if (x.getDigito(i) > y.getDigito(i)) {
                return true;
            }

            if (x.getDigito(i) < y.getDigito(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean esMenorQue(EnteroEnorme x, EnteroEnorme y) {
        for (int i = 0; i < x.getDigitos().length; i++) {
            if (x.getDigito(i) < y.getDigito(i)) {
                return true;
            }

            if (x.getDigito(i) > y.getDigito(i)) {
                return false;
            }
        }

        return false;
    }

    public static boolean esMenorOIgualA(EnteroEnorme x, EnteroEnorme y) {
        for (int i = 0; i < x.getDigitos().length; i++) {
            if (x.getDigito(i) < y.getDigito(i)) {
                return true;
            }

            if (x.getDigito(i) > y.getDigito(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean esCero(EnteroEnorme x) {
        for (int i = 0; i < x.getDigitos().length; i++) {
            if (x.getDigito(i) != 0) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String resultado = "";

        for (int i : digitos) {
            resultado += i;
        }

        return resultado;
    }
}