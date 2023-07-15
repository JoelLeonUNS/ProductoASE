package presentador;

import BaseDeDatos.HistoriaClinicaDAO;
import consultas.ConsultaMedica;
import examenes.*;
import examenesMedico.ExamenMedico;
import historias.HistoriaClinica;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloHistoriaClinica;
import pacientes.Alumno;
import vista.PanelInforme1;
import vista.PanelInforme2;

public class PresentadorInforme {

    private ModeloHistoriaClinica modeloHistoriaClinica;
    private PanelInforme1 panelInforme1;
    private PanelInforme2 panelInforme2;

    public PresentadorInforme() {
    }

    public void mostrarInforme1() {
        HistoriaClinicaDAO historiaClinicaDAO = new HistoriaClinicaDAO();

        ArrayList<HistoriaClinica> historiasClinicas = historiaClinicaDAO.obtenerHistoriasClinicas();
        DefaultTableModel model = (DefaultTableModel) panelInforme1.getTablaInformes1().getModel();
        model.setRowCount(0);

        for (HistoriaClinica historiaClinica : historiasClinicas) {
            for (ConsultaMedica consultaMedica : historiaClinica.getConsultasMedicas()) {
                for (Examen examen : consultaMedica.getExamenes()) {
                    if (examen instanceof ExamenMedico) {
                        ExamenMedico examenMedico = (ExamenMedico) examen;
                        Object[] rowData = {
                            consultaMedica.getFecha(),
                            historiaClinica.getPaciente().getNombre(),
                            historiaClinica.getPaciente().calcularEdad(),
                            historiaClinica.getPaciente().getSexo(),
                            examenMedico.getDiagnostico()
                        };
                        model.addRow(rowData);
                    }
                }
            }
        }

        panelInforme1.getTablaInformes1().repaint();
    }

    public void mostrarInforme2() {
        ArrayList<HistoriaClinica> historiasCoincidentes = modeloHistoriaClinica.getHistoriasCoincidentesBD();

        // Obtener la tabla de informes desde el PanelInforme2
        JTable tablaInformes = panelInforme2.getTablaInformes();

        DefaultTableModel model = (DefaultTableModel) tablaInformes.getModel();

        model.setRowCount(0);

        int totalAlumnos = 0;
        HashMap<String, Integer> contadorCarreras = new HashMap<>();

        for (HistoriaClinica historiaClinica : historiasCoincidentes) {
            // Verificar si el paciente es un alumno
            if (historiaClinica.getPaciente() instanceof Alumno) {
                Alumno alumno = (Alumno) historiaClinica.getPaciente();

                String carrera = alumno.getEscuela();
                String sexo = alumno.getSexo();

                contadorCarreras.put(carrera, contadorCarreras.getOrDefault(carrera, 0) + 1);

                // Incrementar el total de alumnos
                totalAlumnos++;
            }
        }

        for (String carrera : contadorCarreras.keySet()) {
            int cantidad = contadorCarreras.get(carrera);
            double porcentaje = (cantidad / (double) totalAlumnos) * 100;

            Object[] rowData = {
                carrera,
                "Alumno",
                cantidad,
                String.format("%.2f%%", porcentaje)
            };
            model.addRow(rowData);
        }

        tablaInformes.repaint();
    }

    public void mostrarInforme3() {

    }
}
