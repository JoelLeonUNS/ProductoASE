
package modelo;

import BaseDeDatos.MedicoDAO;
import medicos.Medico;

public class ModeloMedico {
    private Medico medico;
    private int idMedico;

    public ModeloMedico() {
        this.medico = new Medico();
    }
    
    public Medico buscarMedico(String nombre, String apellido){
        MedicoDAO medicoDao = new MedicoDAO();
        for (int i = 0; i < medicoDao.cantidadMedico(); i++) {
            if (medicoDao.read(i).getNombreMedico().equals(nombre)&&(medicoDao.read(i).getApellidoMedico().equals(apellido))) {
                idMedico = i;
                break;
            } 
        }
        return getMedicoBD();
    }
    
    public void registrar(){
        
    }
    
    public void editar(){
        
    }
    
    public void darDeBaja(Medico medico){
        medico.getUsuario().setEstado(false);
    }
    
    public Medico getMedicoBD(){
        MedicoDAO medicoDao = new MedicoDAO();
        return idMedico!=0 ? medicoDao.read(idMedico) : null;
    }
    
    
    
}
