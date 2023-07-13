package pacientes;

public class Trabajador extends Paciente {

    private String areaTrabajo;

    public Trabajador() {
    }
    
    // Solo para valores por defecto.
    public Trabajador(String areaTrabajo, String DNI, String nombre, String apellido, String sexo, String fechaNac, String lugarNac, String distrito, String departamento, String direccion, int telefono, String estadoCivil, String nombreFamiliar, String parentescoFamiliar, String direccionFamiliar, int telefonoFamiliar) {
        super(DNI, nombre, apellido, sexo, fechaNac, lugarNac, distrito, departamento, direccion, telefono, estadoCivil, nombreFamiliar, parentescoFamiliar, direccionFamiliar, telefonoFamiliar);
        this.areaTrabajo = areaTrabajo;
    }
    
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea de Trabajo: " + areaTrabajo;
    }
    
    
}
