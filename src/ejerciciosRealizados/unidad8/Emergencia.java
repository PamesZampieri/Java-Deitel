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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Emergencia {
    private long id = 0;
    private String nombreAfectado;
    private String apellidoAfectado;
    private String telefono;
    private String ubicacion;
    private LocalDateTime fechaHoraReporte;
    private NaturalezaEmergencia naturalezaEmergencia;
    private List<CambioEstado> cambiosEstado;
    private RadioOperador radioOperador;

    public Emergencia(String nombreAfectado, String apellidoAfectado, String telefono, String ubicacion,
                      LocalDateTime fechaHoraReporte, NaturalezaEmergencia naturalezaEmergencia, Estado estado,
                      RadioOperador radioOperador) {
        this.nombreAfectado = nombreAfectado;
        this.apellidoAfectado = apellidoAfectado;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.fechaHoraReporte = fechaHoraReporte;
        this.naturalezaEmergencia = naturalezaEmergencia;
        this.cambiosEstado = new ArrayList<>();
        this.cambiosEstado.add(new CambioEstado(fechaHoraReporte, null, estado));
        this.radioOperador = radioOperador;
        id++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreAfectado() {
        return nombreAfectado;
    }

    public void setNombreAfectado(String nombreAfectado) {
        this.nombreAfectado = nombreAfectado;
    }

    public String getApellidoAfectado() {
        return apellidoAfectado;
    }

    public void setApellidoAfectado(String apellidoAfectado) {
        this.apellidoAfectado = apellidoAfectado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFechaHoraReporte() {
        return fechaHoraReporte;
    }

    public void setFechaHoraReporte(LocalDateTime fechaHoraReporte) {
        this.fechaHoraReporte = fechaHoraReporte;
    }

    public NaturalezaEmergencia getNaturalezaEmergencia() {
        return naturalezaEmergencia;
    }

    public void setNaturalezaEmergencia(NaturalezaEmergencia naturalezaEmergencia) {
        this.naturalezaEmergencia = naturalezaEmergencia;
    }

    public List<CambioEstado> getCambiosEstado() {
        return cambiosEstado;
    }

    public void setCambiosEstado(List<CambioEstado> cambiosEstado) {
        this.cambiosEstado = cambiosEstado;
    }

    public RadioOperador getRadioOperador() {
        return radioOperador;
    }

    public void setRadioOperador(RadioOperador radioOperador) {
        this.radioOperador = radioOperador;
    }

    private CambioEstado obtenerUltimoCambioEstado() {
        CambioEstado actual = null;
        for (CambioEstado cambioEstado : cambiosEstado) {
            if (cambioEstado.esUltimo()) {
                actual = cambioEstado;
            }
        }

        return actual;
    }

    public boolean estaReportada() {
        CambioEstado actual = obtenerUltimoCambioEstado();

        return actual.esEstadoReportada();
    }

    public boolean estaEnProceso() {
        CambioEstado actual = obtenerUltimoCambioEstado();

        return actual.esEstadoEnProceso();
    }

    public void actualizarAEnProceso(Estado estado, LocalDateTime fechaHora) {
        CambioEstado actual = obtenerUltimoCambioEstado();
        actual.setFechaHoraFin(fechaHora);

        this.cambiosEstado.add(new CambioEstado(fechaHora, null, estado));
    }

    public String toString() {
        return String.format("%nEmergencia reportada: %d%nNombre afectado: %s%nApellido afectado: %s%n" +
                        "Teléfono afectado: %s%nUbicación afectado: %s%nFecha-hora emergencia: %s%n" +
                        "Naturaleza emergencia: %s%nRadio Operador: %s %s%n", id, nombreAfectado, apellidoAfectado,
                telefono, ubicacion, fechaHoraReporte, naturalezaEmergencia.getNombre(), radioOperador.getNombre(),
                radioOperador.getApellido());
    }
}