package historias;

import consultas.ConsultaMedica;
import java.util.ArrayList;
import modelo.Enfermedad;
import pacientes.Paciente;

public class HistoriaClinica {

    private int numeroHistoriaClinica;
    private Paciente paciente;
    private ArrayList<Enfermedad> antecedentesPatologicos = new ArrayList<>();
    private ArrayList<ConsultaMedica> consultasMedicas = new ArrayList<>();

    public HistoriaClinica() {
    }

    // solo para los valores por defecto.
    public HistoriaClinica(int numeroHistoriaClinica, Paciente paciente) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.paciente = paciente;
    }

    public int getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<ConsultaMedica> getConsultasMedicas() {
        return consultasMedicas;
    }

    public void setConsultasMedicas(ArrayList<ConsultaMedica> consultasMedicas) {
        this.consultasMedicas = consultasMedicas;
    }

    public void agregarConsulta(ConsultaMedica consultaMedica) {
        consultasMedicas.add(consultaMedica);
    }
    
    public void agregarAntecedentePatologico(Enfermedad enfermedad) {
        antecedentesPatologicos.add(enfermedad);
    }
    
    public void agregarAntecedentesPatologicos(ArrayList<Enfermedad> enfermedades) {
        antecedentesPatologicos.addAll(enfermedades);
    }

    @Override
    public String toString() {
//        return "\nNro. Historia Clinica: " + numeroHistoriaClinica + "\n__________________________________" + paciente + "\nAntecedentes Patologicos: " + antecedentesPatologicos + "\nAntecedentes Familiares: " + antecedentesFamiliares + listarConsultas();
        return this.paciente.getDNI();
    }

//    private String listarConsultas() {
//        String lista = "";
//        if (!consultasMedicas.isEmpty()) {
//            lista = "\n__________________________________";
//            for (ConsultaMedica consulta : consultasMedicas) {
//                lista += consulta;
//            }
//        }
//        return lista;
//    }

}
