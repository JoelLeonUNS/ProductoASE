package presentador;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import modelo.ModeloConsulta;
import modelo.ModeloExamen;
import modelo.ModeloHistoriaClinica;

public class PresentadorExamen {
    private ModeloExamen modeloExamen = new ModeloExamen();
    private ModeloConsulta modeloConsulta = new ModeloConsulta();
    private ModeloHistoriaClinica modeloHistoriaClinica = new ModeloHistoriaClinica();

    public PresentadorExamen() {
    }
    
    public void cambiarTipoExamen(JPanel base, JPanel siguiente) {
        siguiente.setSize(764, 250);
        siguiente.setLocation(0, 0);
        base.removeAll();
        base.add(siguiente, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }

    public ModeloExamen getModeloExamen() {
        return modeloExamen;
    }

    public void setModeloExamen(ModeloExamen modeloExamen) {
        this.modeloExamen = modeloExamen;
    }

    public ModeloConsulta getModeloConsulta() {
        return modeloConsulta;
    }

    public void setModeloConsulta(ModeloConsulta modeloConsulta) {
        this.modeloConsulta = modeloConsulta;
    }

    public ModeloHistoriaClinica getModeloHistoriaClinica() {
        return modeloHistoriaClinica;
    }

    public void setModeloHistoriaClinica(ModeloHistoriaClinica modeloHistoriaClinica) {
        this.modeloHistoriaClinica = modeloHistoriaClinica;
    }
    
    public void setTipoExamen(String tipoExamen){
        modeloExamen.setTipoExamen(tipoExamen);
    }
    
    public void setDatosExamen(){
        
    }
    
    
    
}
