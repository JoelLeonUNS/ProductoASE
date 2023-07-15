package presentador;

import consultas.ConsultaMedica;
import examenes.*;
import examenesMedico.ExamenMedico;
import historias.HistoriaClinica;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloHistoriaClinica;
import vista.PanelInforme1;

public class PresentadorInforme {

//    private ModeloHistoriaClinica modeloHistoriaClinica;
//    private PanelInforme1 panelInforme1;
//
//    public PresentadorInforme(ModeloHistoriaClinica modeloHistoriaClinica, PanelInforme1 panelInforme1) {
//        this.modeloHistoriaClinica = modeloHistoriaClinica;
//        this.panelInforme1 = panelInforme1;
//    }
//
//    public void mostrarInforme() {
//        ArrayList<HistoriaClinica> historiasCoincidentes = modeloHistoriaClinica.getHistoriasCoincidentesBD();
//
//        // Obtener la tabla de informes desde el panelInforme1
//        JTable tablaInformes = panelInforme1.getTablaInformes();
//
//        // Obtener el modelo de tabla de la tablaInformes
//        DefaultTableModel model = (DefaultTableModel) tablaInformes.getModel();
//
//        // Limpiar la tabla
//        model.setRowCount(0);
//
//        for (HistoriaClinica historiaClinica : historiasCoincidentes) {
//            for (ConsultaMedica consultaMedica : historiaClinica.getConsultasMedicas()) {
//                for (Examen examen : consultaMedica.getExamenes()) {
//                    if (examen instanceof ExamenMedico) {
//                        ExamenMedico examenMedico = (ExamenMedico) examen;
//                        Object[] rowData = {
//                            consultaMedica.getFecha(),
//                            historiaClinica.getPaciente().getNombre(),
//                            historiaClinica.getPaciente().calcularEdad(),
//                            historiaClinica.getPaciente().getSexo(),
//                            examenMedico.getDiagnostico()
//                        };
//                        model.addRow(rowData);
//                    }
//                }
//            }
//
//        }
//        tablaInformes.repaint();
//    }
}
