/*
11.17 (Atrapar excepciones mediante el uso de la clase Exception) Escriba un programa que demuestre cómo se atrapan las
diversas excepciones con
catch ( Exception excepcion )
Esta vez, defina las clases ExcepcionA (que hereda de la clase Exception) y ExcepcionB (que hereda de la clase
ExcepcionA). En su programa, cree bloques try que lancen excepciones de los tipos ExcepcionA, ExcepcionB,
NullPointerException e IOException. Todas las excepciones deberán atraparse con bloques catch que especifiquen el tipo
Exception
*/

package ejerciciosRealizados.unidad11;

import java.io.IOException;

public class UsoDeExcepciones1 {
    public static void main(String[] args) {
        try {
            excepcionAThrower();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            excepcionBThrower();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            nullPointerExceptionThrower(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ioExceptionThrower();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void excepcionAThrower() throws ExcepcionA {
        throw new ExcepcionA("Se lanzó ExcepcionA");
    }

    public static void excepcionBThrower() throws ExcepcionB {
        throw new ExcepcionB("Se lanzó ExcepcionB");
    }

    public static void nullPointerExceptionThrower(String cadena) throws NullPointerException {
        cadena.concat("hola");
    }

    public static void ioExceptionThrower() throws IOException {
        throw new IOException("Se lanzó IOException");
    }
}