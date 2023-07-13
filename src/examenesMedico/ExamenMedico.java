package examenesMedico;
import examenes.Examen;
import medicos.Medico;


public class ExamenMedico extends Examen {

    private String diagnostico;
    private String tratamiento;
    private String examenesAux;
    private String observacion;

    public ExamenMedico() {
    }
    
    // solo para poblar
    public ExamenMedico(String diagnostico, String tratamiento, String examenesAux, String observacion, Medico atendidoPor) {
        super(atendidoPor);
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.examenesAux = examenesAux;
        this.observacion = observacion;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getExamenesAux() {
        return examenesAux;
    }

    public void setExamenesAux(String examenesAux) {
        this.examenesAux = examenesAux;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observación) {
        this.observacion = observación;
    }
    
    
}
