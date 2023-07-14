package valoresPorDefecto;

import BaseDeDatos.BD;
import consultas.ConsultaMedica;
import examenesClinico.ExamenClinico;
import examenesMedico.ExamenMedico;
import historias.HistoriaClinica;
import pacientes.Alumno;
import pacientes.Paciente;

public class HistoriasPorDefecto {
    public static void poblar() {
        HistoriaClinica historia = new HistoriaClinica(4, new Alumno("Sistemas", "98563274", "Luka", "Modric", "M", "14/06/2000", "Lima", "Chimbote", "Ancash", "Trapecio", 976805287, "Soltero", "Karim", "Hermano", "Los Héroes", 976802405), "");
        //ConsultaMedica consulta = new ConsultaMedica("02/06/2023", "12:40", 23, "Dolor de estómago", 1, "Si", "Si", "No", "Regular");
        //ExamenClinico examen = new ExamenClinico(true, true, BD.consultarMedico("usr1", "pass1"));
        //consulta.agregarExamen(examen);
        //historia.agregarConsulta(consulta);
        //BD.insertarHistoriaClinica(historia);
        
        //
        
        Paciente alumno = new Paciente("12345678", "Juan", "Pérez", "M", "01/01/2000", "Lima", "Chimbote", "Ancash", "Escuela Primaria", 987654321, "Soltero", "Pedro", "Padre", "Los Héroes", 987654321);
        HistoriaClinica historia2 =new HistoriaClinica(5, alumno, "");
        //ConsultaMedica consulta2 = new ConsultaMedica("02/06/2023", "10:00 AM", 23, "Dolor abdominal", 5, "Normal", "Bueno", "Normal", "Triste");
        //ExamenMedico examen2 = new ExamenMedico("Diagnostico", "Tratamiento", "Examenes adicionales", "Observacion", BD.consultarMedico("usr1", "pass1"));
//        consulta2.agregarExamen(examen);
//        consulta2.agregarExamen(examen2);
        //historia2.agregarConsulta(consulta2); 
        //BD.insertarHistoriaClinica(historia2);
    }
}
