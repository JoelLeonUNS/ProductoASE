package modelo;

import BaseDeDatos.HistoriaClinicaDAO;
import historias.HistoriaClinica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
    private Alumno estudiante;
    private Trabajador trabajador;
    private Familiar familiar;
    private Map<Integer, Familiar> familiaresEstudiante;
    private Map<Integer, Familiar> familiaresTrabajador;
    private ArrayList<Enfermedad> antecedentesPatologicos;

    public ModeloHistoriaClinica() {
        this.historiaClinicaEstudiante = new HistoriaClinica();
        this.historiaClinicaTrabajador = new HistoriaClinica();
        this.estudiante = new Alumno();
        this.trabajador = new Trabajador();
        this.familiar = new Familiar();
        this.familiaresEstudiante = new HashMap<>();
        this.familiaresTrabajador = new HashMap<>();
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
        estudiante.setFamiliares(new ArrayList<>(familiaresEstudiante.values()));
        historiaClinicaEstudiante.setPaciente(estudiante);
        historiaClinicaEstudiante.agregarAntecedentesPatologicos(antecedentesPatologicos);
        hcDAO.create(historiaClinicaEstudiante);
    }
    
    public void editarHistoriaEstudiante() {
        
    }
    
    public void registrarHistoriaTrabajador() {
        HistoriaClinicaDAO hcDAO = new HistoriaClinicaDAO();
        trabajador.setFamiliares(new ArrayList<>(familiaresTrabajador.values()));
        historiaClinicaTrabajador.setPaciente(trabajador);
        historiaClinicaTrabajador.agregarAntecedentesPatologicos(antecedentesPatologicos);
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

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Familiar getFamiliar() {
        return familiar;
    }
    
    public void setFamiliar(String nombreFamiliar, String parentesco, String direccionFamiliar, String telefonoFamiliar, String antecedentesPatologicos) {
        this.familiar = new Familiar(nombreFamiliar, parentesco, direccionFamiliar, telefonoFamiliar, antecedentesPatologicos);
    }

    public Familiar getFamiliaresEstudiante(int indice) {
        try {
            return familiaresEstudiante.get(indice);
        } catch (Exception e) {
            return null;
        }
        
    }

    public Familiar getFamiliaresTrabajador(int indice) {
        try {
        return familiaresTrabajador.get(indice);
        } catch (Exception e) {
            return null;
        }
    }

    public void addFamiliaresEstudiante(int indice, Familiar familiar) {
        familiaresEstudiante.put(indice, familiar);
    }

    public void addFamiliaresTrabajador(int indice, Familiar familiar) {
        familiaresTrabajador.put(indice, familiar);
    }
    
    public void agregarAntecedentePatologico(Enfermedad enfermedad) {
        this.antecedentesPatologicos.add(enfermedad);
    }
    
    public void limpiarAntecedentesPatologicos() {
        this.antecedentesPatologicos.clear();
    }
}
