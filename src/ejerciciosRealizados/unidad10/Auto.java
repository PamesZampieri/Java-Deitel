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

public class Auto implements ImpactoEcologico {
    private final String marca;
    private final String modelo;
    private final String anio;
    private double distanciaRecorridaAnual;
    private double consumoCombustible;
    private double factorEmisionCo2Gasolina;

    public Auto(String marca, String modelo, String anio, double distanciaRecorridaAnual, double consumoCombustible,
                double factorEmisionCo2Gasolina) {
        if (distanciaRecorridaAnual < 0.0) {
            throw new IllegalArgumentException("La distancia recorrida anual debe ser >= 0.0");
        }

        if (consumoCombustible < 0.0) {
            throw new IllegalArgumentException("El consumo del combustible debe ser >= 0.0");
        }

        if (factorEmisionCo2Gasolina < 0.0) {
            throw new IllegalArgumentException("El factor de emisión de CO2 de gasolina debe ser >= 0.0");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.distanciaRecorridaAnual = distanciaRecorridaAnual;
        this.consumoCombustible = consumoCombustible;
        this.factorEmisionCo2Gasolina = factorEmisionCo2Gasolina;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    public double getDistanciaRecorridaAnual() {
        return distanciaRecorridaAnual;
    }

    public void setDistanciaRecorridaAnual(double distanciaRecorridaAnual) {
        if (distanciaRecorridaAnual < 0.0) {
            throw new IllegalArgumentException("La distancia recorrida anual debe ser >= 0.0");
        }

        this.distanciaRecorridaAnual = distanciaRecorridaAnual;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        if (consumoCombustible < 0.0) {
            throw new IllegalArgumentException("El consumo del combustible debe ser >= 0.0");
        }

        this.consumoCombustible = consumoCombustible;
    }

    public double getFactorEmisionCo2Gasolina() {
        return factorEmisionCo2Gasolina;
    }

    public void setFactorEmisionCo2Gasolina(double factorEmisionCo2Gasolina) {
        if (factorEmisionCo2Gasolina < 0.0) {
            throw new IllegalArgumentException("El factor de emisión de CO2 de gasolina debe ser >= 0.0");
        }

        this.factorEmisionCo2Gasolina = factorEmisionCo2Gasolina;
    }

    @Override
    public double getImpactoEcologico() {
        return getConsumoAnualCombustible() * getFactorEmisionCo2Gasolina();
    }

    private double getConsumoAnualCombustible() {
        return (distanciaRecorridaAnual / 100) * consumoCombustible;
    }

    @Override
    public String toString() {
        return String.format("Auto:%nMarca: %s%nModelo: %s%nAño: %s%nDistancia recorrida anual: %s%nConsumo " +
                        "combustible cada 100 Km: %s%nFactor emisión de CO2 por litro de gasolina: %s%n",
                getMarca(), getModelo(), getAnio(), getDistanciaRecorridaAnual(), getConsumoCombustible(),
                getFactorEmisionCo2Gasolina());
    }
}