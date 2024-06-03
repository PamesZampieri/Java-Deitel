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

public class Bicicleta implements ImpactoEcologico {
    public double vidaUtil;
    public double emisionCO2Produccion;
    public double emisionCO2MantenimientoAnual;

    public Bicicleta(double vidaUtil, double emisionCO2Produccion, double emisionCO2MantenimientoAnual) {
        if (vidaUtil < 0.0) {
            throw new IllegalArgumentException("La vida útil de la bicicleta debe ser >= 0.0");
        }

        if (emisionCO2Produccion < 0.0) {
            throw new IllegalArgumentException("La emisión de CO2 para su producción debe ser >= 0.0");
        }

        if (emisionCO2MantenimientoAnual < 0.0) {
            throw new IllegalArgumentException("La emisión de CO2 para su mantenimiento anual debe ser >= 0.0");
        }

        this.vidaUtil = vidaUtil;
        this.emisionCO2Produccion = emisionCO2Produccion;
        this.emisionCO2MantenimientoAnual = emisionCO2MantenimientoAnual;
    }

    public double getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(double vidaUtil) {
        if (vidaUtil < 0.0) {
            throw new IllegalArgumentException("La vida útil de la bicicleta debe ser >= 0.0");
        }

        this.vidaUtil = vidaUtil;
    }

    public double getEmisionCO2Produccion() {
        return emisionCO2Produccion;
    }

    public void setEmisionCO2Produccion(double emisionCO2Produccion) {
        if (emisionCO2Produccion < 0.0) {
            throw new IllegalArgumentException("La emisión de CO2 para su producción debe ser >= 0.0");
        }

        this.emisionCO2Produccion = emisionCO2Produccion;
    }

    public double getEmisionCO2MantenimientoAnual() {
        return emisionCO2MantenimientoAnual;
    }

    public void setEmisionCO2MantenimientoAnual(double emisionCO2MantenimientoAnual) {
        if (emisionCO2MantenimientoAnual < 0.0) {
            throw new IllegalArgumentException("La emisión de CO2 para su mantenimiento anual debe ser >= 0.0");
        }

        this.emisionCO2MantenimientoAnual = emisionCO2MantenimientoAnual;
    }

    @Override
    public double getImpactoEcologico() {
        return getEmisionesCO2ProduccionAnual() + getEmisionCO2MantenimientoAnual();
    }

    private double getEmisionesCO2ProduccionAnual() {
        return getEmisionCO2Produccion() / getVidaUtil();
    }

    @Override
    public String toString() {
        return String.format("Bicicleta:%nVida útil: %s%nEmisión de CO2 para su producción: %s%nEmisión de CO2 " +
                        "para su mantenimiento anual: %s%n",
                getVidaUtil(), getEmisionCO2Produccion(), getEmisionCO2MantenimientoAnual());
    }
}