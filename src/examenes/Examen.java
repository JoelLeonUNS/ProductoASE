package examenes;
import medicos.Medico;


public class Examen {
    private Medico atendidoPor;

    public Examen() {
    }
    
    // solo para los valores por defecto.
    public Examen(Medico atendidoPor) {
        this.atendidoPor = atendidoPor;
    }
    
    
    
    public Medico getAtendidoPor() {
        return atendidoPor;
    }

    public void setAtendidoPor(Medico atendidoPor) {
        this.atendidoPor = atendidoPor;
    }    
}
