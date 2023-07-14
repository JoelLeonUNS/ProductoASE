
package modelo;

import BaseDeDatos.MedicoDAO;
import java.util.ArrayList;
import medicos.Medico;

public class ModeloMedico {
    private Medico medico;
    private int idMedico;
    private ArrayList<Integer> idMedicos;

    public ModeloMedico() {
        this.medico = new Medico();
    }
    
    public void setDatosMedico(String dni, String nombre, String apellidos, String telefono){
        medico.setDNI(dni);
        medico.setNombreMedico(nombre);
        medico.setApellidoMedico(apellidos);
        medico.setTelefonoMedico(telefono);
    }
    
    public void setDatosUsuario(String usuario, String clave){
        medico.getUsuario().setUsuario(usuario);
        medico.getUsuario().setClave(clave);
        medico.getUsuario().setEstado(true);
        medico.getUsuario().setRol("Medico");
    }
    
    public Medico buscarMedicoDNI(String dni){
        MedicoDAO medicoDao = new MedicoDAO();
        for (int i = 0; i < medicoDao.count(); i++) {
            if (medicoDao.read(i).getDNI().equals(dni)) {
                idMedico = i;
                return medicoDao.read(i);
            } 
        }
        return null;
    }
    
    public void buscarMedicoCoincidente(String cadena) {
        MedicoDAO medicoDao = new MedicoDAO();
        idMedicos = new ArrayList<>();   
        for (int i = 0; i < medicoDao.count(); i++) {
            if (medicoDao.read(i).getNombreMedico().toUpperCase().contains(cadena.toUpperCase()) || medicoDao.read(i).getApellidoMedico().toUpperCase().contains(cadena.toUpperCase())) {
                idMedicos.add(i);
            }
        }
    }
    
    public ArrayList<Medico> getMedicosCoincidentesBD() {
        ArrayList<Medico> medicos = new ArrayList<>();
        MedicoDAO medicoDao = new MedicoDAO();
        for (Integer idMed : idMedicos) {
            medicos.add(medicoDao.read(idMed));
        }
        return medicos;
    }
    
    public void registrar(){
        MedicoDAO medicoDao = new MedicoDAO();
        medicoDao.create(medico);
    }
    
    public void editar(){
        MedicoDAO medicoDao = new MedicoDAO();
        medicoDao.update(medico, idMedico);
    }
    
    public void darDeBaja(){
        getMedicoBD().getUsuario().setEstado(false);
    }
    
    public Medico getMedicoBD(){
        MedicoDAO medicoDao = new MedicoDAO();
        return idMedico!=0 ? medicoDao.read(idMedico) : null;
    }
}
