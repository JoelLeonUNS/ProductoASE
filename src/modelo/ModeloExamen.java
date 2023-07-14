
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

    public ModeloExamen() {
        //this.examen = new Examen();
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
    
    
    
}
