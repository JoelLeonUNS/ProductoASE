package medicos;

public class Medico {

    private String usuario;
    private String clave;
    private String apellidoMedico;
    private String nombreMedico;
    private String telefonoMedico;
    private String DNI;
    private boolean estado;

    public Medico() {
    }

    public Medico(String usuario, String clave, String apellidoMedico, String nombreMedico, String telefonoMedico, String DNI, boolean estado) {
        this.usuario = usuario;
        this.clave = clave;
        this.apellidoMedico = apellidoMedico;
        this.nombreMedico = nombreMedico;
        this.telefonoMedico = telefonoMedico;
        this.DNI = DNI;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getTelefonoMedico() {
        return telefonoMedico;
    }

    public void setTelefonoMedico(String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
