
package presentador;

import modelo.ModeloConsulta;
import modelo.ModeloExamen;
import modelo.ModeloHistoriaClinica;

/**
 *
 * @author USER
 */
public class PresentadorExamen {
    private ModeloExamen modeloExamen = new ModeloExamen();
    private ModeloConsulta modeloConsulta = new ModeloConsulta();
    private ModeloHistoriaClinica modeloHistoriaClinica = new ModeloHistoriaClinica();

    public PresentadorExamen() {
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
    
    
    
}
