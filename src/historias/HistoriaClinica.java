package historias;

import consultas.ConsultaMedica;
import java.util.ArrayList;
import pacientes.Paciente;

public class HistoriaClinica {

    private int numeroHistoriaClinica;
    private Paciente paciente;
    private String antecedentesPatologicos;
    private ArrayList<String> antecedentesFamiliares = new ArrayList<>();
    private ArrayList<ConsultaMedica> consultasMedicas = new ArrayList<>();

    public HistoriaClinica() {
    }

    // solo para los valores por defecto.
    public HistoriaClinica(int numeroHistoriaClinica, Paciente paciente, String antecedentesPatologicos) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.paciente = paciente;
        this.antecedentesPatologicos = antecedentesPatologicos;
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

    public String getAntecedentesPatologicos() {
        return antecedentesPatologicos;
    }

    public void setAntecedentesPatologicos(String antecedentesPatologicos) {
        this.antecedentesPatologicos = antecedentesPatologicos;
    }

    public ArrayList<String> getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void agregarAntecedenteFamiliar(String antecedente) {
        antecedentesFamiliares.add(antecedente);
    }

    public void setAntecedentesFamiliares(ArrayList<String> antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
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

    @Override
    public String toString() {
        return "\nNro. Historia Clinica: " + numeroHistoriaClinica + "\n__________________________________" + paciente + "\nAntecedentes Patologicos: " + antecedentesPatologicos + "\nAntecedentes Familiares: " + antecedentesFamiliares + listarConsultas();
    }

    private String listarConsultas() {
        String lista = "";
        if (!consultasMedicas.isEmpty()) {
            lista = "\n__________________________________";
            for (ConsultaMedica consulta : consultasMedicas) {
                lista += consulta;
            }
        }
        return lista;
    }

}
