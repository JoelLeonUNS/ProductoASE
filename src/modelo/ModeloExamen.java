
package modelo;

import examenes.Examen;
import examenes.ExamenManager;
import examenesClinico.ExamenClinico;
import examenesClinico.ExamenClinicoManager;
import examenesFisico.ExamenFisico;
import examenesFisico.ExamenFisicoManager;
import examenesMedico.ExamenMedico;
import examenesMedico.ExamenMedicoManager;


public class ModeloExamen {
    private ExamenManager examenManager;
    private Examen examen;
    private int idExamen;
    private String examenTmp;
    private ExamenMedico examenMedicoTmp;
    private ExamenFisico examenFisicoTmp;
    private ExamenClinico examenClinicoTmp;

    public ModeloExamen() {
        //this.examen = new Examen();
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }    

    public String getExamenTmp() {
        return examenTmp;
    }

    public void setExamenTmp(String examenTmp) {
        this.examenTmp = examenTmp;
    }

    public ExamenMedico getExamenMedicoTmp() {
        return examenMedicoTmp;
    }

    public void setExamenMedicoTmp(ExamenMedico examenMedicoTmp) {
        this.examenMedicoTmp = examenMedicoTmp;
    }

    public ExamenFisico getExamenFisicoTmp() {
        return examenFisicoTmp;
    }

    public void setExamenFisicoTmp(ExamenFisico examenFisicoTmp) {
        this.examenFisicoTmp = examenFisicoTmp;
    }

    public ExamenClinico getExamenClinicoTmp() {
        return examenClinicoTmp;
    }

    public void setExamenClinicoTmp(ExamenClinico examenClinicoTmp) {
        this.examenClinicoTmp = examenClinicoTmp;
    }
    
    
    public void setTipoExamen(String tipoExamen){
        switch(tipoExamen){
            case "MEDICO" ->{
                this.examenManager = new ExamenMedicoManager();
            }
            case "FISICO" ->{
                this.examenManager = new ExamenFisicoManager();
            }
            case "CLINICO" ->{
                this.examenManager = new ExamenClinicoManager();
            }
        }
        this.examen = examenManager.registrar();
    }
    
    public void setDatosExamenMedico(String diagnostico, String tratamiento, String examAux, String observacion){
        this.examen = ((ExamenMedicoManager) examenManager).setDatos(examen, diagnostico, tratamiento, examAux, observacion);
    }
    
    public void setDatosExamenClinico(String observacion, boolean apCardio, boolean apRespiratorio){
        this.examen = ((ExamenClinicoManager) examenManager).setDatos(examen, observacion, apCardio, apRespiratorio);
    }
    
    public void setDatosExamenFisico(double temp, String PA, double FR, double SPO2, double peso, double talla, double IMC, double FC, double perAbdominal){
        this. examen = ((ExamenFisicoManager) examenManager).setDatos(examen, temp, PA, FR, SPO2, peso, talla, IMC, FC, perAbdominal);
    }
    
    public void getTipoExamen (Examen examen){
        if(examen instanceof ExamenMedico){
            examenMedicoTmp = (ExamenMedico) examen;
            examenTmp = "MEDICO";
        }else if(examen instanceof ExamenFisico){
            examenFisicoTmp = (ExamenFisico) examen;
            examenTmp = "FISICO";
        }else if(examen instanceof ExamenClinico){
            examenClinicoTmp = (ExamenClinico) examen;
            examenTmp = "CLINICO";
        }
    }
    
}
