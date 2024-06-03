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
import java.util.Scanner;

public class PruebaEmergencia {
    public static void main(String[] args) {
        TipoRespuesta ambulancia = new TipoRespuesta("Ambulancia", "Emergencias médicas");
        TipoRespuesta policia = new TipoRespuesta("Policia", "Emergencias de delitos");
        TipoRespuesta bomberos = new TipoRespuesta("Bomberos", "Emergencias de incendios o siniestros");
        TipoRespuesta defensaCivil = new TipoRespuesta("Defensa Civil", "Emergencias de ciudadanos");

        List<TipoRespuesta> tiposRespuesta = new ArrayList<>();
        tiposRespuesta.add(ambulancia);
        tiposRespuesta.add(policia);
        tiposRespuesta.add(bomberos);
        tiposRespuesta.add(defensaCivil);

        List<NaturalezaEmergencia> naturalezasEmergencia = new ArrayList<>();
        naturalezasEmergencia.add(new NaturalezaEmergencia("Desastre natural", "desc", defensaCivil));
        naturalezasEmergencia.add(new NaturalezaEmergencia("Médica", "desc", ambulancia));
        naturalezasEmergencia.add(new NaturalezaEmergencia("Seguridad pública", "desc", policia));
        naturalezasEmergencia.add(new NaturalezaEmergencia("Protección civil", "desc", policia));
        naturalezasEmergencia.add(new NaturalezaEmergencia("Violencia de género", "desc", policia));
        naturalezasEmergencia.add(new NaturalezaEmergencia("Incendio", "desc", bomberos));

        List<Estado> estados = new ArrayList<>();
        estados.add(new Estado("Reportada", "desc"));
        estados.add(new Estado("EnProceso", "desc"));
        estados.add(new Estado("Solucionada", "desc"));
        estados.add(new Estado("Cancelada", "desc"));
        estados.add(new Estado("SinSolucion", "desc"));

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del afectado: ");
        String nombreAfectado = entrada.nextLine();

        System.out.println("Ingrese el apellido del afectado: ");
        String apellidoAfectado = entrada.nextLine();

        System.out.println("Ingrese el teléfono del afectado: ");
        String telefonoAfectado = entrada.nextLine();

        System.out.println("Ingrese la ubicacion del afectado: ");
        String ubicacionAfectado = entrada.nextLine();

        LocalDateTime fechaHoraReporte = LocalDateTime.now();

        System.out.println("Ingrese la naturaleza de la emergencia: ");
        for (int i = 0; i < naturalezasEmergencia.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, naturalezasEmergencia.get(i).getNombre());
        }
        int indiceNaturalezaEmergencia = entrada.nextInt();
        NaturalezaEmergencia naturalezaEmergencia = naturalezasEmergencia.get(indiceNaturalezaEmergencia - 1);

        Estado estadoInicial = buscarEstadoReportada(estados);

        RadioOperador radioOperador = new RadioOperador("1234", "Pamela", "Zampieri");

        Emergencia emergencia = new Emergencia(nombreAfectado, apellidoAfectado, telefonoAfectado, ubicacionAfectado,
                fechaHoraReporte, naturalezaEmergencia, estadoInicial, radioOperador);

        System.out.println(emergencia);
    }

    private static void actualizarEmergenciaAEnProceso(List<Estado> estados, Emergencia emergencia) {
        Estado estadoActual = buscarEstadoEnProceso(estados);
        LocalDateTime fechaHoraInicio = LocalDateTime.now();

        emergencia.actualizarAEnProceso(estadoActual, fechaHoraInicio);
    }

    private static Estado buscarEstadoEnProceso(List<Estado> estados) {
        for (Estado estado : estados) {
            if (estado.esEnProceso()) {
                return estado;
            }
        }

        return null;
    }

    private static Estado buscarEstadoReportada(List<Estado> estados) {
        for (Estado estado : estados) {
            if (estado.esReportada()) {
                return estado;
            }
        }

        return null;
    }
}