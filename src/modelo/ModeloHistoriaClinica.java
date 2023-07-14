package modelo;

import BaseDeDatos.HistoriaClinicaDAO;
import historias.HistoriaClinica;
import java.util.ArrayList;

public class ModeloHistoriaClinica {
    private int idHistoriaBuscadaDNI;
    private ArrayList<Integer> idHistoriasCoincidentes;
    private HistoriaClinica historiaClinica;

    public ModeloHistoriaClinica() {
        this.historiaClinica = new HistoriaClinica();
    }
    
    public HistoriaClinica buscarHistoriaClinicaDNI(String dni){
        HistoriaClinicaDAO hcDAO = new HistoriaClinicaDAO();
        for (int i = 0; i < hcDAO.count(); i++) {
            if (hcDAO.read(i).getPaciente().getDNI().equals(dni)) {
                idHistoriaBuscadaDNI = i;
                return hcDAO.read(i);
            } 
        }
        return null;
    }
    
    public void buscarHistoriaCoincidente(String cadena) {
        HistoriaClinicaDAO hcDAO = new HistoriaClinicaDAO();
        idHistoriasCoincidentes = new ArrayList<>();   
        for (int i = 0; i < hcDAO.count(); i++) {
            if (hcDAO.read(i).getPaciente().getNombre().toUpperCase().contains(cadena.toUpperCase()) || hcDAO.read(i).getPaciente().getApellido().toUpperCase().contains(cadena.toUpperCase())) {
                idHistoriasCoincidentes.add(i);
            }
        }
    }
    
    public ArrayList<HistoriaClinica> getHistoriasCoincidentesBD() {
        ArrayList<HistoriaClinica> historiaClinicas = new ArrayList<>();
        HistoriaClinicaDAO hcDAO = new HistoriaClinicaDAO();
        for (Integer idHistoria : idHistoriasCoincidentes) {
            historiaClinicas.add(hcDAO.read(idHistoria));
        }
        return historiaClinicas;
    }

    public void registrarHistoriaEstudiante() {
        
    }
    
    public void editarHistoriaEstudiante() {
        
    }
    
    
}
