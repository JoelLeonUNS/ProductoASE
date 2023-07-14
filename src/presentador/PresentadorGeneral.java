package presentador;

import modelo.ModeloMedico;
import modelo.ModeloUsuario;
import vista.VistaMedico;

public class PresentadorGeneral {
    private PresentadorAdministrarCuentas pAdministrarCuentas;
    private PresentadorLogin pLogin;

    public PresentadorGeneral() {
        pAdministrarCuentas = new PresentadorAdministrarCuentas();
        pLogin = new PresentadorLogin();
    }
    
    public void mostrarVistaMedico() {
        VistaMedico vistaMedico = new VistaMedico();
        //vistaMedico.iniciar();
    }
    
    public void setModeloPresentadorAdministrarCuentas(ModeloMedico mMedico) {
        pAdministrarCuentas.setModelo(mMedico);
    }
    
    public void setModeloPresentadorLogin(ModeloUsuario mUsuario) {
        pLogin.setModelo(mUsuario);
    }

    public PresentadorAdministrarCuentas getpAdministrarCuentas() {
        return pAdministrarCuentas;
    }

    public PresentadorLogin getpLogin() {
        return pLogin;
    }
    
    
    
    
    
}
