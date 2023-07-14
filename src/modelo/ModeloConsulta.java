package modelo;

import consultas.ConsultaMedica;

public class ModeloConsulta {

    private ConsultaMedica consulta;
    private int idConsulta;

    public ModeloConsulta() {
        this.consulta = new ConsultaMedica();
    }

    private void setDatosConsulta(String fecha, String hora, int edad, int tiempoEnfermedad, String apetito, String sueño, String sed, String estadoAnimo, String motivo) {
        consulta.setFecha(fecha);
        consulta.setHora(hora);
        consulta.setEdad(edad);
        consulta.setTiempoEnfermedad(tiempoEnfermedad);
        consulta.setApetito(apetito);
        consulta.setSueño(sueño);
        consulta.setEstadoAnimo(estadoAnimo);
        consulta.setSed(sed);
        consulta.setMotivo(motivo);
    }

}
