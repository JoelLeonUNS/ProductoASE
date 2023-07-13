package examenesClinico;

import examenes.Examen;
import medicos.Medico;

public class ExamenClinico extends Examen {

    private boolean APCardiovascular;
    private boolean APRespiratorio;

    public ExamenClinico() {
    }

    public ExamenClinico(boolean APCardiovascular, boolean APRespiratorio, Medico atendidoPor) {
        super(atendidoPor);
        this.APCardiovascular = APCardiovascular;
        this.APRespiratorio = APRespiratorio;
    }
    
    
    
    public boolean isAPCardiovascular() {
        return APCardiovascular;
    }

    public void setAPCardiovascular(boolean APCardiovascular) {
        this.APCardiovascular = APCardiovascular;
    }

    public boolean isAPRespiratorio() {
        return APRespiratorio;
    }

    public void setAPRespiratorio(boolean APRespiratorio) {
        this.APRespiratorio = APRespiratorio;
    }
}
