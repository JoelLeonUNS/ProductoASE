package pacientes;

public class Paciente {

    private String DNI;
    private String nombre;
    private String apellido;
    private String sexo;
    private String fechaNac;
    private String lugarNac;
    private String distrito;
    private String departamento;
    private String direccion;
    private int telefono;
    private String estadoCivil;
    private Familiar familiar;

    public Paciente() {
    }

    public Paciente(String DNI, String nombre, String apellido, String sexo, String fechaNac, String lugarNac, String distrito, String departamento, String direccion, int telefono, String estadoCivil, Familiar familiar) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.lugarNac = lugarNac;
        this.distrito = distrito;
        this.departamento = departamento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.familiar = familiar;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }
    
    @Override
    public String toString() {
        return "\nDNI: " + DNI + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nSexo: " + sexo + "\nFecha de Nac.: " + fechaNac + "\nLugar de Nac.: " + lugarNac + "\nDistrito: " + distrito + "\nDepartamento: " + departamento + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nEstado Civil: " + estadoCivil + "\nNombre Familiar: " + familiar.getNombreFamiliar() + "\nParentesco Familiar: " + familiar.getParentesco() + "\nDireccionFamiliar: " + familiar.getDireccionFamiliar() + "\nTelefono Familiar: " + familiar.getTelefonoFamiliar();
    }
    
    
}
