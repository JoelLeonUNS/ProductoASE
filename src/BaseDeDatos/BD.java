package BaseDeDatos;

import examenes.Examen;
import historias.HistoriaClinica;
import java.util.HashMap;
import java.util.Map;
import medicos.Medico;
import medicos.Usuario;

public class BD {

    private static int idMedico;
    private static int idUsuario;
    private static int idExamen;
    private static int idHistoriaClinica;
    private static final Map<Integer, Medico> medicos = new HashMap<>();
    private static final Map<Integer, Usuario> usuarios = new HashMap<>();
    private static final Map<Integer, Examen> examenes = new HashMap<>();
    private static final Map<Integer, HistoriaClinica> historia= new HashMap<>();

    public static Map<Integer, Medico> getMedicos() {
        return medicos;
    }
    
    public static int IdMedico() {
        return idMedico++;
    }
    
    public static Map<Integer, Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static int IdUsuario(){
        return idUsuario++;
    }
    
    public static Map<Integer, Examen> getExamenes() {
        return examenes;
    }
    
    public static int IdExamen(){
        return idExamen++;
    }

    public static Map<Integer, HistoriaClinica> getHistoria() {
        return historia;
    }
    
        public static int IdHistoriaClinica(){
        return idHistoriaClinica++;
    }
            
}
