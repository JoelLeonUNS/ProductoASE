package presentador;

import historias.HistoriaClinica;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.ModeloHistoriaClinica;

public class PresentadorHistoriaClinica {
    private ModeloHistoriaClinica modeloHistoriaClinica;
    private String tipoHistoria;
    private boolean historiaEstudianteEditable = false;
    private boolean historiaTrabajadorEditable = false;
    
    public PresentadorHistoriaClinica() {    
    }
    
    public void setModelo(ModeloHistoriaClinica mHistoriaClinica) {
        this.modeloHistoriaClinica = mHistoriaClinica;
    }
        
    public void cambiarTipoHistoriaClinica(JPanel base, JPanel siguiente) {
        siguiente.setSize(775, 495);
        siguiente.setLocation(0, 0);
        base.removeAll();
        base.add(siguiente, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }
    
    public HistoriaClinica buscarHistoriaClinicaDNI(String dni){
        return modeloHistoriaClinica.buscarHistoriaClinicaDNI(dni);
    }
    
    public ArrayList<HistoriaClinica> buscarHistoriaClinicaCoincidente(String cadena){
        modeloHistoriaClinica.buscarHistoriaCoincidente(cadena);
        return modeloHistoriaClinica.getHistoriasCoincidentesBD();
    }

    public void setHistoriaEditable(boolean editable) {
        switch (tipoHistoria) {
            case "ESTUDIANTE" -> {
                this.historiaEstudianteEditable = editable;
            }
            case "TRABAJADOR" -> {
                this.historiaTrabajadorEditable = editable;
            }   
        }
    }

    public boolean isHistoriaEditable() {
        switch (tipoHistoria) {
            case "ESTUDIANTE" -> {
                return this.historiaEstudianteEditable;
            }
            case "TRABAJADOR" -> {
                return this.historiaTrabajadorEditable;
            }   
        }
        return false;
    }

    public String getTipoHistoria() {
        return tipoHistoria;
    }

    public void setTipoHistoria(String tipoHistoria) {
        this.tipoHistoria = tipoHistoria;
    }
}
