package BaseDeDatos;

import historias.HistoriaClinica;
import java.util.ArrayList;
import medicos.Medico;

public class BD {

    private static final ArrayList<HistoriaClinica> historiasClinicas = new ArrayList<>();
    private static final ArrayList<Medico> medicos = new ArrayList<>();

    public static void insertarHistoriaClinica(HistoriaClinica historiaClinica) {
        if (existeHistoria(historiaClinica)) {
            System.out.println("!Error El paciente ya cuenta con una\nHistoria Clinica registrada.");
        } else {
            historiasClinicas.add(historiaClinica);
            System.out.println("Historia Clinica registrada con exito");
        }
    }

    private static boolean existeHistoria(HistoriaClinica historiaClinica) {
        boolean existe = false;
        for (int i = 0; i < historiasClinicas.size(); i++) {
            existe |= historiasClinicas.get(i).getPaciente().getDNI().equals(historiaClinica.getPaciente().getDNI());
        }
        return existe;
    }

    public static HistoriaClinica consultarHistoria(String DNI) {
        HistoriaClinica historiaClinicaConsultado = null;
        for (HistoriaClinica historiaClinica : historiasClinicas) {
            if (historiaClinica.getPaciente().getDNI().equals(DNI)) {
                historiaClinicaConsultado = historiaClinica;
                break;
            }
        }
        return historiaClinicaConsultado;
    }

    public static void insertMedico(Medico medico) {
        if (existeMedico(medico)) {
            System.out.println("!Error Ya existe un medico registrado con\nlos mismos datos.");
        } else {
            medicos.add(medico);
            System.out.println("Medico registrado con exito");
        }
    }
    
    private static boolean existeMedico(Medico medico) {
        boolean existe = false;
        for (int i = 0; i < medicos.size(); i++) {
            existe |= (medicos.get(i).getUsuario().equals(medico.getUsuario()));
        }
        return existe;
    }
    

    public static Medico consultarMedico(String usuario, String clave) {
        Medico medicoConsultado = null;
        for (Medico medico : medicos) {
            if (medico.getUsuario().equals(usuario) && medico.getClave().equals(clave)) {
                medicoConsultado = medico;
                break;
            }
        }
        return medicoConsultado;
    }
}
