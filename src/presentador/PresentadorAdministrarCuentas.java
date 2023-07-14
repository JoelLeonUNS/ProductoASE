
package presentador;

import modelo.ModeloMedico;

public class PresentadorAdministrarCuentas {
    private ModeloMedico modelo;

    public PresentadorAdministrarCuentas() {
       
    }
    
    public void setModelo(ModeloMedico modelo) {
         this.modelo = modelo;
    }
    
    public void setDatosMedico(String dni, String nombre, String apellidos, String telefono){
        modelo.setDatosMedico(dni, nombre, apellidos, telefono);
    }
    
    public void setDatosUsuario(String usuario, String clave){
        modelo.setDatosUsuario(usuario, clave);
    }
    
    public void registrar(){
        modelo.registrar();
    }
    
}
