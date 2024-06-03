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

public class Edificio implements ImpactoEcologico {
    private final String pais;
    private final String ciudad;
    private double consumoElectricidad;
    private double consumoGasNatural;
    private double residuosGenerados;
    private double consumoAgua;
    private double factorEmisionCo2Electricidad;
    private double factorEmisionCo2GasNatural;
    private double factorEmisionCo2Residuosgenerados;
    private double factorEmisionCo2Agua;

    public Edificio(String pais, String ciudad, double consumoElectricidad, double consumoGasNatural,
                    double residuosGenerados, double consumoAgua, double factorEmisionCo2Electricidad,
                    double factorEmisionCo2GasNatural, double factorEmisionCo2Residuosgenerados, double factorEmisionCo2Agua) {
        if (consumoElectricidad < 0.0) {
            throw new IllegalArgumentException("El consumo de electricidad debe ser >= 0.0");
        }

        if (consumoGasNatural < 0.0) {
            throw new IllegalArgumentException("El consumo de gas natural debe ser >= 0.0");
        }

        if (residuosGenerados < 0.0) {
            throw new IllegalArgumentException("Los residuos generados deben ser >= 0.0");
        }

        if (consumoAgua < 0.0) {
            throw new IllegalArgumentException("El consumo de agua debe ser >= 0.0");
        }

        if (factorEmisionCo2Electricidad < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de electricidad debe ser >= 0.0");
        }

        if (factorEmisionCo2GasNatural < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de gas natural debe ser >= 0.0");
        }

        if (factorEmisionCo2Residuosgenerados < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de residuos generados debe ser >= 0.0");
        }

        if (factorEmisionCo2Agua < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de agua debe ser >= 0.0");
        }

        this.pais = pais;
        this.ciudad = ciudad;
        this.consumoElectricidad = consumoElectricidad;
        this.consumoGasNatural = consumoGasNatural;
        this.residuosGenerados = residuosGenerados;
        this.consumoAgua = consumoAgua;
        this.factorEmisionCo2Electricidad = factorEmisionCo2Electricidad;
        this.factorEmisionCo2GasNatural = factorEmisionCo2GasNatural;
        this.factorEmisionCo2Residuosgenerados = factorEmisionCo2Residuosgenerados;
        this.factorEmisionCo2Agua = factorEmisionCo2Agua;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getConsumoElectricidad() {
        return consumoElectricidad;
    }

    public void setConsumoElectricidad(double consumoElectricidad) {
        if (consumoElectricidad < 0.0) {
            throw new IllegalArgumentException("El consumo de electricidad debe ser >= 0.0");
        }

        this.consumoElectricidad = consumoElectricidad;
    }

    public double getConsumoGasNatural() {
        return consumoGasNatural;
    }

    public void setConsumoGasNatural(double consumoGasNatural) {
        if (consumoGasNatural < 0.0) {
            throw new IllegalArgumentException("El consumo de gas natural debe ser >= 0.0");
        }

        this.consumoGasNatural = consumoGasNatural;
    }

    public double getResiduosGenerados() {
        return residuosGenerados;
    }

    public void setResiduosGenerados(double residuosGenerados) {
        if (residuosGenerados < 0.0) {
            throw new IllegalArgumentException("Los residuos generados deben ser >= 0.0");
        }

        this.residuosGenerados = residuosGenerados;
    }

    public double getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(double consumoAgua) {
        if (consumoAgua < 0.0) {
            throw new IllegalArgumentException("El consumo de agua debe ser >= 0.0");
        }

        this.consumoAgua = consumoAgua;
    }

    public double getFactorEmisionCo2Electricidad() {
        return factorEmisionCo2Electricidad;
    }

    public void setFactorEmisionCo2Electricidad(double factorEmisionCo2Electricidad) {
        if (factorEmisionCo2Electricidad < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de electricidad debe ser >= 0.0");
        }

        this.factorEmisionCo2Electricidad = factorEmisionCo2Electricidad;
    }

    public double getFactorEmisionCo2GasNatural() {
        return factorEmisionCo2GasNatural;
    }

    public void setFactorEmisionCo2GasNatural(double factorEmisionCo2GasNatural) {
        if (factorEmisionCo2GasNatural < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de gas natural debe ser >= 0.0");
        }

        this.factorEmisionCo2GasNatural = factorEmisionCo2GasNatural;
    }

    public double getFactorEmisionCo2Residuosgenerados() {
        return factorEmisionCo2Residuosgenerados;
    }

    public void setFactorEmisionCo2Residuosgenerados(double factorEmisionCo2Residuosgenerados) {
        if (factorEmisionCo2Residuosgenerados < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de residuos generados debe ser >= 0.0");
        }

        this.factorEmisionCo2Residuosgenerados = factorEmisionCo2Residuosgenerados;
    }

    public double getFactorEmisionCo2Agua() {
        return factorEmisionCo2Agua;
    }

    public void setFactorEmisionCo2Agua(double factorEmisionCo2Agua) {
        if (factorEmisionCo2Agua < 0.0) {
            throw new IllegalArgumentException("El factor emisión de CO2 de agua debe ser >= 0.0");
        }

        this.factorEmisionCo2Agua = factorEmisionCo2Agua;
    }

    @Override
    public double getImpactoEcologico() {
        return getEmisionesCO2Electricidad() + getEmisionesCO2GasNatural() + getEmisionesCO2ResiduosGenerados()
                + getEmisionesCO2Agua();
    }

    private double getEmisionesCO2Electricidad() {
        return getConsumoElectricidad() * getFactorEmisionCo2Electricidad();
    }

    private double getEmisionesCO2GasNatural() {
        return getConsumoGasNatural() * getFactorEmisionCo2GasNatural();
    }

    private double getEmisionesCO2ResiduosGenerados() {
        return getResiduosGenerados() * getFactorEmisionCo2Residuosgenerados();
    }

    private double getEmisionesCO2Agua() {
        return getConsumoAgua() * getFactorEmisionCo2Agua();
    }

    @Override
    public String toString() {
        return String.format("Edificio:%nPais: %s%nCiudad: %s%nConsumo electricidad: %s%nConsumo gas natural: %s%n" +
                        "Residuos generados: %s%nConsumo agua: %s%nFactor emisión CO2 electricidad: %s%n" +
                        "Factor emisión CO2 gas natural: %s%nFactor emisión CO2 residuos generados: %s%n" +
                        "Factor emisión CO2 agua: %s%n",
                getPais(), getCiudad(), getConsumoElectricidad(), getConsumoGasNatural(), getResiduosGenerados(),
                getConsumoAgua(), getFactorEmisionCo2Electricidad(), getFactorEmisionCo2GasNatural(),
                getFactorEmisionCo2Residuosgenerados(), getFactorEmisionCo2Agua());
    }
}