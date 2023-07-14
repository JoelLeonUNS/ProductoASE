package presentador;

import modelo.ModeloMedico;
import modelo.ModeloUsuario;
import vista.VistaAdmin;
import vista.VistaLogin;
import vista.VistaMedico;

public class PresentadorGeneral {
    private PresentadorAdministrarCuentas pAdministrarCuentas;
    private PresentadorMedico pMedico;
    private PresentadorLogin pLogin;
    private static PresentadorGeneral pGeneral;

    public PresentadorGeneral() {
        pAdministrarCuentas = new PresentadorAdministrarCuentas();
        pLogin = new PresentadorLogin();
        pMedico = new PresentadorMedico();
    }
    
    public static PresentadorGeneral getInstancia() {
        if (pGeneral == null) {
            return pGeneral = new PresentadorGeneral();
        } else {
            return pGeneral;
        }
    }
    
    public void mostrarVistaMedico() {
        VistaMedico vistaMedico = new VistaMedico(PresentadorGeneral.getInstancia());
        vistaMedico.iniciar();
    }
    
    public void mostrarVistaAdmin() {
        VistaAdmin vistaAdmin = new VistaAdmin(PresentadorGeneral.getInstancia());
        vistaAdmin.iniciar();
    }
    
    public void mostrarVistaLogin() {
        VistaLogin vistaLogin = new VistaLogin(PresentadorGeneral.getInstancia());
        vistaLogin.iniciar();
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

    public PresentadorMedico getpMedico() {
        return pMedico;
    }

    public void setpMedico(PresentadorMedico pMediCo) {
        this.pMedico = pMediCo;
    }
    
}
