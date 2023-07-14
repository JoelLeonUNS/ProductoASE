package examenesClinico;
import examenes.Examen;
import examenes.ExamenManager;
import java.util.Scanner;

public class ExamenClinicoManager extends ExamenManager {
    private final Scanner input = new Scanner(System.in);
    
    @Override
    public Examen registrar() {
        Examen nuevoExamen = new ExamenClinico();
        //setDatos(nuevoExamen);
        
        return nuevoExamen;
    }

    @Override
    public void setDatos(Examen examen) {
        System.out.print("\nAP Cardiovascular: SI (1) NO (0)");
        ((ExamenClinico) examen).setAPCardiovascular(estado(input.nextInt()));
        System.out.print("AP Respiratorio: SI (1) NO (0)");
        ((ExamenClinico) examen).setAPRespiratorio(estado(input.nextInt()));
    }
    
    private boolean estado(int respuesta) {
        return respuesta == 1;
    }
}
