/*
5.19 Suponga que i = 1, j = 2, k = 3 y m = 2. ¿Qué es lo que imprime cada una de las siguientes instrucciones?
a) System.out.println(i == 1);
b) System.out.println(j == 3);
c) System.out.println((i >= 1) && (j < 4));
d) System.out.println((m <= 99) & (k < m));
e) System.out.println((j >= i) || (k == m));
f) System.out.println((k + m < j) | (3 – j >= k));
g) System.out.println(!(k > m));
*/

package ejerciciosRealizados.unidad5;

public class ejercicio_5_19 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;

        System.out.println(i == 1);//true
        System.out.println(j == 3);//false
        System.out.println((i >= 1) && (j < 4));//true
        System.out.println((m <= 99) & (k < m));//false
        System.out.println((j >= i) || (k == m));//true
        System.out.println((k + m < j) | (3 - j >= k));//false
        System.out.println(!(k > m));//false
    }
}