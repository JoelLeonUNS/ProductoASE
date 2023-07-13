package presentador;

import medicos.Usuario;
import modelo.ModeloUsuario;

public class PresentadorLogin {
    private final ModeloUsuario modeloUsuario;
    
    public PresentadorLogin(ModeloUsuario modeloUsuario) {
        this.modeloUsuario = modeloUsuario;
    }

    public void setModel(String usuario, String clave) {
        modeloUsuario.getUsuario().setUsuario(usuario);
        modeloUsuario.getUsuario().setClave(clave);
    }

    public String getUsuarioRecordado() {
        if (modeloUsuario.getRecuerdoSesion() != null) {
            return modeloUsuario.getRecuerdoSesion().split(";")[0];
        } else {
            return "";
        }
    }

    public String getClaveRecordada() {
        if (modeloUsuario.getRecuerdoSesion() != null) {
            return modeloUsuario.getRecuerdoSesion().split(";")[1];
        } else {
            return "";
        }
    }
    
    public Usuario getUsuarioBD() {
        return modeloUsuario.getUsuarioBD();
    }

    public void iniciarSesion() {
        modeloUsuario.iniciarSesion();
    }

    public void recordarSesion() {
        modeloUsuario.recordarSesion();
    }
    
    public void noRecordarSesion() {
        modeloUsuario.setRecuerdoSesion(null);
    }

    public boolean isRecordado() {
        modeloUsuario.setRecuerdoSesion(modeloUsuario.getUsuario().getUsuario() + ";" + modeloUsuario.getUsuario().getClave());
        return modeloUsuario.getCareTaker().isExiste(modeloUsuario.guardarSesion());
    }
    
    public void cerrarSesion() {
        try {
            modeloUsuario.cerrarSesion();
        } catch (Exception e) {
        }
    }
    
    public void reiniciarNumeroIntentos() {
        modeloUsuario.reiniciarNumeroIntentos();
    }

    public boolean isAcceso() {
        return modeloUsuario.isDatosValido() && modeloUsuario.getNumeroIntentos() < 3;
    }

    public boolean isBloqueado() {
        return modeloUsuario.getNumeroIntentos() > 2;
    }

    public String showMensaje() {
        if (!modeloUsuario.isDatosValido()) {
            return "Datos incorrectos o usuario no encontrado.\nNro Intentos: " + modeloUsuario.getNumeroIntentos();
        } else {
            return "Inicio de Sesion exitoso.";
        }
    }
    
}
