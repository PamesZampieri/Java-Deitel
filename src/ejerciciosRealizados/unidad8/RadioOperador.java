/*
8.19 (Proyecto: clase de respuesta de emergencia) El servicio de respuesta de emergencia estadounidense, 9-1-1, conecta
a los que llaman a un Punto de respuesta del servicio público (PSAP) local. Por tradición, el PSAP pide al que llama
cierta información de identificación, incluyendo su dirección, número telefónico y la naturaleza de la emergencia.
Después despacha los servicios de emergencia apropiados (como la policía, una ambulancia o el departamento de bomberos).
El 9-1-1 mejorado (o E9-1-1) usa computadoras y bases de datos para determinar el domicilio del que llama, dirige la
llamada al PSAP más cercano y muestra tanto el número de teléfono como la dirección del que llama a la persona que toma
la llamada. El 9-1-1 mejorado inalámbrico proporciona a los encargados de tomar las llamadas, la información de
identificación para las llamadas desde dispositivos móviles.
Este sistema se desplegó en dos fases; durante la primera fase, las empresas de telecomunicaciones tuvieron que
proporcionar el número del teléfono celular y la ubicación del sitio de la estación base que transmitía la llamada. En
la segunda fase, las empresas de telecomunicaciones tuvieron que proveer la ubicación del que hacía la llamada (mediante
el uso de tecnologías como GPS). Para aprender más sobre el 9-1-1, visite:
www.fcc.gov/pshs/services/911-services/Welcome.html y people.howstuffworks.com/9-1-1.htm.
Una parte importante de crear una clase es determinar sus atributos (variables de instancia). Para este ejercicio de
diseño de clases, investigue los servicios 9-1-1 en Internet. Después, diseñe una clase llamada Emergencia que podría
utilizarse en un sistema de respuesta de emergencia 9-1-1 orientado a objetos. Liste los atributos que podría usar un
objeto de esta clase para representar la emergencia. Por ejemplo, la clase podría contener información sobre quién
reportó la emergencia (como su número telefónico), la ubicación de la emergencia, la hora del reporte, la naturaleza de
la emergencia, el tipo de respuesta y el estado de la misma. Los atributos de la clase deben describir por completo la
naturaleza del problema y lo que está ocurriendo para resolverlo.
*/

package ejerciciosRealizados.unidad8;

public class RadioOperador {
    private String id;
    private String nombre;
    private String apellido;

    public RadioOperador(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}