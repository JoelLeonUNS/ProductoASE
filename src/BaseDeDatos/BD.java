package BaseDeDatos;

import java.util.HashMap;
import java.util.Map;
import medicos.Medico;

public class BD {

    private static int idMedico;
    private static final Map<Integer, Medico> medicos = new HashMap<>();

    public static Map<Integer, Medico> getMedicos() {
        return medicos;
    }
    
    public static int IdMedico() {
        return idMedico++;
    } 
}
