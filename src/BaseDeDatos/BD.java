package BaseDeDatos;

import java.util.HashMap;
import java.util.Map;
import medicos.Medico;
import medicos.Usuario;

public class BD {

    private static int idMedico;
    private static int idUsuario;
    private static final Map<Integer, Medico> medicos = new HashMap<>();
    private static final Map<Integer, Usuario> usuarios = new HashMap<>();

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
}
