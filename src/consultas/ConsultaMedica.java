package consultas;

import examenes.Examen;
import java.util.ArrayList;

public class ConsultaMedica {

    private String fecha;
    private String hora;
    private int edad;
    private String motivo;
    private int tiempoEnfermedad;
    private String apetito;
    private String sueño;
    private String sed;
    private String estadoAnimo;
    private ArrayList<Examen> examenes = new ArrayList<>();

    public ConsultaMedica() {
    }
    
    // solo para los valores por defecto.
    public ConsultaMedica(String fecha, String hora, int edad, String motivo, int tiempoEnfermedad, String apetito, String sueño, String sed, String estadoAnimo) {
        this.fecha = fecha;
        this.hora = hora;
        this.edad = edad;
        this.motivo = motivo;
        this.tiempoEnfermedad = tiempoEnfermedad;
        this.apetito = apetito;
        this.sueño = sueño;
        this.sed = sed;
        this.estadoAnimo = estadoAnimo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getTiempoEnfermedad() {
        return tiempoEnfermedad;
    }

    public void setTiempoEnfermedad(int tiempoEnfermedad) {
        this.tiempoEnfermedad = tiempoEnfermedad;
    }

    public String getApetito() {
        return apetito;
    }

    public void setApetito(String apetito) {
        this.apetito = apetito;
    }

    public String getSueño() {
        return sueño;
    }

    public void setSueño(String sueño) {
        this.sueño = sueño;
    }

    public String getSed() {
        return sed;
    }

    public void setSed(String sed) {
        this.sed = sed;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public void agregarExamen(Examen examen) {
        examenes.add(examen);
    }

    @Override
    public String toString() {
        return "\nFecha: " + fecha + "\nHora: " + hora + "\nEdad: " + edad + "\nMotivo: " + motivo + "\nTiempo Enfermedad: " + tiempoEnfermedad + "\nApetito: " + apetito + "\nSue\u00f1o: " + sueño + "\nSed=" + sed + "\nEstado Animo: " + estadoAnimo + "\nNro. Examenes: " + examenes.size();
    }

    
}
