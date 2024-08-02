/*
11.18 (Orden de los bloques catch) Escriba un programa que demuestre que el orden de los bloques catch es importante. Si
trata de atrapar un tipo de excepción de superclase antes de un tipo de subclase, el compilador debe generar errores.
*/

package ejerciciosRealizados.unidad11;

public class OrdenBloquesCatch {
    public static void main(String[] args) {
        try {
            excepcionBThrower();
        } catch (ExcepcionA e) {
            e.printStackTrace();
        } /* catch (ExcepcionB e) { Los catch se evalúan en orden. Un catch anterior no puede capturar una excepción de
                                    una superclase de un catch posterior.
            e.printStackTrace();
        } */
    }

    public static void excepcionAThrower() throws ExcepcionA {
        throw new ExcepcionA("Se lanzó ExcepcionA");
    }

    public static void excepcionBThrower() throws ExcepcionB {
        throw new ExcepcionB("Se lanzó ExcepcionB");
    }
}