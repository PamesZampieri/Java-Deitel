/*
10.17 (Interfaz ImpactoEcologico: polimorfismo) Mediante el uso de interfaces, como aprendió en este capítulo, es
posible especificar comportamientos similares para clases que pueden ser dispares. Los gobiernos y las compañías entodo
el mundo se están preocupando cada vez más por el impacto ecológico del carbono (las liberaciones anuales de dióxido de
carbono en la atmósfera), debido a los edificios que consumen diversos tipos de combustibles para obtener calor, los
vehículos que queman combustibles para producir energía, y demás. Muchos científicos culpan a estos gases de invernadero
por el fenómeno conocido como calentamiento global. Cree tres pequeñas clases no relacionadas por herencia: las clases
Edificio, Auto y Bicicleta. Proporcione a cada clase ciertos atributos y comportamientos apropiados que sean únicos, que
no tengan en común con otras clases. Escriba la interfaz ImpactoEcologico con un método obtenerImpactoEcologico. Haga
que cada una de sus clases implementen a esa interfaz, de modo que su método obtenerImpactoEcologico calcule el impacto
ecológico del carbono apropiado para esa clase (consulte sitios Web que expliquen cómo calcular el impacto ecológico del
carbono). Escriba una aplicación que cree objetos de cada una de las tres clases, coloque referencias a esos objetos en
ArrayList<ImpactoEcologico> y después itere a través del objeto ArrayList, invocando en forma polimórfica el método
obtenerImpactoEcologico de cada objeto. Para cada objeto imprima cierta información de identificación, además de su
impacto ecológico.
*/

package ejerciciosRealizados.unidad10;

import java.util.ArrayList;
import java.util.List;

public class PruebaImpactoEcologico {
    public static void main(String[] args) {
        List<ImpactoEcologico> impactoEcologico = new ArrayList<>();

        impactoEcologico.add(new Auto("Ford", "Fiesta", "2014", 15000,
                8, 2.31));
        impactoEcologico.add(new Edificio("Argentina", "Córdoba", 100000,
                20000, 50000, 1000, 0.5,
                1.88, 1.2, 0.298));
        impactoEcologico.add(new Bicicleta(10, 240, 5));

        System.out.println("Impacto ecológico del carbono en los siguientes objetos:\n");

        for (ImpactoEcologico objeto : impactoEcologico) {
            System.out.print(objeto);

            System.out.printf("Impacto ecológico: %.2f %s de CO2.%n%n",
                    objeto.getImpactoEcologico() > 1000 ? objeto.getImpactoEcologico() / 1000 : objeto.getImpactoEcologico(),
                    objeto.getImpactoEcologico() > 1000 ? "toneladas" : "kg");
        }
    }
}