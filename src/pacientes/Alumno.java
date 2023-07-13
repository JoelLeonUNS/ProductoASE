package pacientes;

public class Alumno extends Paciente {

    private String escuela;

    public Alumno() {
    }
    
    // Solo para valores por defecto.
    public Alumno(String escuela, String DNI, String nombre, String apellido, String sexo, String fechaNac, String lugarNac, String distrito, String departamento, String direccion, int telefono, String estadoCivil, String nombreFamiliar, String parentescoFamiliar, String direccionFamiliar, int telefonoFamiliar) {
        super(DNI, nombre, apellido, sexo, fechaNac, lugarNac, distrito, departamento, direccion, telefono, estadoCivil, nombreFamiliar, parentescoFamiliar, direccionFamiliar, telefonoFamiliar);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEscuela: " + escuela;
    }
}
