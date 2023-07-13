package examenesMedico;
import examenes.Examen;
import examenes.ExamenManager;
import java.util.Scanner;


public class ExamenMedicoManager extends ExamenManager {
    private final Scanner input = new Scanner(System.in);
    
    @Override
    public Examen registrar() {
        ExamenMedico nuevoExamen = new ExamenMedico();
        setDatos(nuevoExamen);
        
        return nuevoExamen;
    }

    @Override
    public void setDatos(Examen examen) {
        System.out.print("\nDiagnostico: ");
        ((ExamenMedico) examen).setDiagnostico(input.nextLine());
        System.out.print("Tratamiento: ");
        ((ExamenMedico) examen).setTratamiento(input.nextLine());
        System.out.print("Examenes Auxiliares: ");
        ((ExamenMedico) examen).setExamenesAux(input.nextLine());
        System.out.print("Observaciones: ");
        ((ExamenMedico) examen).setObservacion(input.nextLine());
    }
    
}
