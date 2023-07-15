package modelo;

import BaseDeDatos.HistoriaClinicaDAO;
import historias.HistoriaClinica;
import java.util.ArrayList;
import pacientes.Alumno;
import pacientes.Familiar;
import pacientes.Paciente;
import pacientes.Trabajador;

public class ModeloHistoriaClinica {
    private int idHistoriaBuscadaDNI;
    private HistoriaClinica historiaSeleccionada;
    private ArrayList<Integer> idHistoriasCoincidentes;
    private HistoriaClinica historiaClinicaEstudiante;
    private HistoriaClinica historiaClinicaTrabajador;
    private Paciente estudiante;
    private Paciente trabajador;
    private ArrayList<Familiar> familiaresEstudiante;
    private ArrayList<Familiar> familiaresTrabajador;
    private ArrayList<Enfermedad> antecedentesPatologicos;

    public ModeloHistoriaClinica() {
        this.historiaClinicaEstudiante = new HistoriaClinica();
        this.historiaClinicaTrabajador = new HistoriaClinica();
        this.estudiante = new Alumno();
        this.trabajador = new Trabajador();
        this.familiaresEstudiante = new ArrayList<>();
        this.familiaresTrabajador = new ArrayList<>();
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
        HistoriaClinicaDAO hcDAO = new HistoriaClinicaDAO();
        estudiante.setFamiliares(familiaresEstudiante);
        historiaClinicaEstudiante.setPaciente(estudiante);
        hcDAO.create(historiaClinicaEstudiante);
    }
    
    public void editarHistoriaEstudiante() {
        
    }
    
    public void registrarHistoriaTrabajador() {
        HistoriaClinicaDAO hcDAO = new HistoriaClinicaDAO();
        trabajador.setFamiliares(familiaresTrabajador);
        historiaClinicaTrabajador.setPaciente(trabajador);
        hcDAO.create(historiaClinicaTrabajador);
    }
    
    public void editarHistoriaTrabajador() {
        
    }

    public HistoriaClinica getHistoriaSeleccionada() {
        return historiaSeleccionada;
    }

    public void setHistoriaSeleccionada(HistoriaClinica historiaSeleccionada) {
        this.historiaSeleccionada = historiaSeleccionada;
    }

    public HistoriaClinica getHistoriaClinicaEstudiante() {
        return historiaClinicaEstudiante;
    }

    public void setHistoriaClinicaEstudiante(HistoriaClinica historiaClinicaEstudiante) {
        this.historiaClinicaEstudiante = historiaClinicaEstudiante;
    }

    public HistoriaClinica getHistoriaClinicaTrabajador() {
        return historiaClinicaTrabajador;
    }

    public void setHistoriaClinicaTrabajador(HistoriaClinica historiaClinicaTrabajador) {
        this.historiaClinicaTrabajador = historiaClinicaTrabajador;
    }

    public Paciente getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Paciente estudiante) {
        this.estudiante = estudiante;
    }

    public Paciente getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Paciente trabajador) {
        this.trabajador = trabajador;
    }

    public ArrayList<Familiar> getFamiliaresEstudiante() {
        return familiaresEstudiante;
    }

    public void agregarFamiliarEstudiante(Familiar familiarEstudiante) {
        this.familiaresEstudiante.add(familiarEstudiante);
    }

    public ArrayList<Familiar> getFamiliaresTrabajador() {
        return familiaresTrabajador;
    }

    public void agregarFamiliarTrabajador(Familiar familiarTrabajador) {
        this.familiaresTrabajador.add(familiarTrabajador);
    }
    
    public void agregarAntecedentePatologico(Enfermedad enfermedad) {
        this.antecedentesPatologicos.add(enfermedad);
    }  
}
