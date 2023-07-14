package examenesClinico;
import examenes.Examen;
import examenes.ExamenManager;
import java.util.Scanner;

public class ExamenClinicoManager extends ExamenManager {
    private final Scanner input = new Scanner(System.in);
    
    @Override
    public Examen registrar() {
        return new ExamenClinico();
    }

    public void setDatos(Examen exa, String observacion, boolean apCardio, boolean apRespiratorio) {
        ExamenClinico examen = (ExamenClinico) exa;
        examen.setAPCardiovascular(apCardio);
        examen.setAPRespiratorio(apRespiratorio);
        examen.setObservacion(observacion);
        
    }
}
