/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valoresPorDefecto;

import BaseDeDatos.ConsultaDAO;
import BaseDeDatos.ExamenDAO;
import BaseDeDatos.HistoriaClinicaDAO;
import BaseDeDatos.MedicoDAO;
import consultas.ConsultaMedica;
import examenesClinico.ExamenClinico;
import examenesFisico.ExamenFisico;
import historias.HistoriaClinica;
import pacientes.*;

/**
 *
 * @author ANGIE
 */
public class ConsultasPorDefecto {

    public static void poblar() {
        MedicoDAO mDAO = new MedicoDAO();
        ConsultaDAO cDAO = new ConsultaDAO();
        HistoriaClinicaDAO hDAO = new HistoriaClinicaDAO();
        ExamenDAO eDAO = new ExamenDAO();

        ConsultaMedica consulta1 = new ConsultaMedica("01/01/2023", "10:00", 20, "Consulta de rutina", 0, "Normal", "Normal", "Normal", "Bueno", mDAO.read(1));
        ConsultaMedica consulta2 = new ConsultaMedica("02/01/2023", "11:00", 21, "Dolor de cabeza", 2, "Normal", "Normal", "Normal", "Regular", mDAO.read(2));
        ConsultaMedica consulta3 = new ConsultaMedica("03/01/2023", "09:30", 22, "Fiebre alta", 5, "Disminuido", "Normal", "Normal", "Mal", mDAO.read(0));
        ConsultaMedica consulta4 = new ConsultaMedica("04/01/2023", "14:15", 18, "Consulta de seguimiento", 1, "Normal", "Normal", "Normal", "Bueno", mDAO.read(1));
        ConsultaMedica consulta5 = new ConsultaMedica("05/01/2023", "16:45", 20, "Dolor abdominal", 3, "Normal", "Disminuido", "Normal", "Regular", mDAO.read(2));
        ConsultaMedica consulta6 = new ConsultaMedica("06/01/2023", "08:30", 17, "Examen de rutina", 0, "Normal", "Normal", "Normal", "Bueno", mDAO.read(0));
        ConsultaMedica consulta7 = new ConsultaMedica("07/01/2023", "13:30", 23, "Dolor en las articulaciones", 4, "Normal", "Normal", "Normal", "Regular", mDAO.read(2));
        ConsultaMedica consulta8 = new ConsultaMedica("08/01/2023", "10:45", 19, "Dolor de garganta", 2, "Disminuido", "Normal", "Normal", "Mal", mDAO.read(1));
        ConsultaMedica consulta9 = new ConsultaMedica("09/01/2023", "15:20", 18, "Consulta de rutina", 0, "Normal", "Normal", "Normal", "Bueno", mDAO.read(0));
        ConsultaMedica consulta10 = new ConsultaMedica("10/01/2023", "11:30", 24, "Presión arterial alta", 1, "Normal", "Normal", "Normal", "Regular", mDAO.read(0));
        ConsultaMedica consulta11 = new ConsultaMedica("15/11/2023", "09:00", 25, "Dolor de espalda", 3, "Disminuido", "Normal", "Normal", "Regular", mDAO.read(1));
        ConsultaMedica consulta12 = new ConsultaMedica("20/12/2023", "14:30", 22, "Mareos frecuentes", 2, "Normal", "Normal", "Normal", "Bueno", mDAO.read(2));
        ConsultaMedica consulta13 = new ConsultaMedica("25/01/2023", "11:45", 19, "Problemas digestivos", 4, "Normal", "Normal", "Normal", "Regular", mDAO.read(0));
        ConsultaMedica consulta14 = new ConsultaMedica("02/02/2023", "16:15", 21, "Dolor en los ojos", 1, "Normal", "Disminuido", "Normal", "Mal", mDAO.read(1));
        ConsultaMedica consulta15 = new ConsultaMedica("10/03/2023", "08:30", 27, "Dificultad para respirar", 5, "Disminuido", "Normal", "Normal", "Bueno", mDAO.read(0));
        ConsultaMedica consulta16 = new ConsultaMedica("18/04/2023", "12:30", 24, "Picazón en la piel", 3, "Normal", "Normal", "Normal", "Regular", mDAO.read(2));
        ConsultaMedica consulta17 = new ConsultaMedica("25/05/2023", "15:45", 26, "Molestias estomacales", 2, "Normal", "Normal", "Normal", "Bueno", mDAO.read(1));
        ConsultaMedica consulta18 = new ConsultaMedica("03/06/2023", "10:30", 23, "Fatiga crónica", 4, "Disminuido", "Normal", "Normal", "Mal", mDAO.read(2));
        ConsultaMedica consulta19 = new ConsultaMedica("11/07/2023", "14:00", 20, "Dolor de articulaciones", 1, "Normal", "Disminuido", "Normal", "Regular", mDAO.read(0));
        ConsultaMedica consulta20 = new ConsultaMedica("19/08/2023", "11:15", 28, "Dolor de pecho", 5, "Disminuido", "Normal", "Normal", "Bueno", mDAO.read(2));

        consulta1.agregarExamen(eDAO.read(0));
        consulta2.agregarExamen(eDAO.read(1));
        consulta3.agregarExamen(eDAO.read(2));
        consulta4.agregarExamen(eDAO.read(3));
        consulta5.agregarExamen(eDAO.read(4));
        consulta6.agregarExamen(eDAO.read(5));
        consulta7.agregarExamen(eDAO.read(6));
        consulta8.agregarExamen(eDAO.read(7));
        consulta9.agregarExamen(eDAO.read(8));
        consulta10.agregarExamen(eDAO.read(9));
        consulta11.agregarExamen(eDAO.read(10));
        consulta12.agregarExamen(eDAO.read(11));
        consulta13.agregarExamen(eDAO.read(12));
        consulta14.agregarExamen(eDAO.read(13));
        consulta15.agregarExamen(eDAO.read(14));
        consulta16.agregarExamen(eDAO.read(15));
        consulta17.agregarExamen(eDAO.read(16));
        consulta18.agregarExamen(eDAO.read(17));
        consulta19.agregarExamen(eDAO.read(18));
        consulta20.agregarExamen(eDAO.read(19));

        HistoriaClinica historia1 = new HistoriaClinica(1, new Alumno("Sistemas", "12345678", "Juan", "Pérez", "M", "01/01/2000", "Lima", "Lima", "Lima", "Av. Principal 123", 987654321, "Soltero", new Familiar("María", "Madre", "Av. Los Álamos 456", "987654321", "")), "");
        HistoriaClinica historia2 = new HistoriaClinica(2, new Alumno("Derecho", "87654321", "Ana", "García", "F", "15/05/1998", "Arequipa", "Arequipa", "Arequipa", "Calle Pizarro 789", 987654321, "Soltera", new Familiar("Pedro", "Padre", "Jr. Las Rosas 789", "987654321", "")), "");
        HistoriaClinica historia3 = new HistoriaClinica(3, new Alumno("Medicina", "45678912", "Luis", "Torres", "M", "10/10/1999", "Trujillo", "La Libertad", "La Libertad", "Av. Los Pinos 456", 987654321, "Soltero", new Familiar("Laura", "Hermana", "Calle Principal 456", "987654321", "")), "");
        HistoriaClinica historia4 = new HistoriaClinica(4, new Alumno("Sistemas", "98765432", "Carla", "López", "F", "20/03/1997", "Lima", "Lima", "Lima", "Jr. Los Olivos 123", 987654321, "Soltera", new Familiar("Carlos", "Padre", "Av. Los Cerezos 123", "987654321", "")), "");
        HistoriaClinica historia5 = new HistoriaClinica(5, new Alumno("Enfermeria", "23456789", "Pedro", "Gómez", "M", "05/09/1996", "Cusco", "Cusco", "Cusco", "Av. Los Jazmines 789", 987654321, "Soltero", new Familiar("Martha", "Madre", "Jr. Las Flores 789", "987654321", "")), "");
        HistoriaClinica historia6 = new HistoriaClinica(6, new Alumno("Derecho", "56789123", "Lucía", "Hernández", "F", "12/12/1995", "Piura", "Piura", "Piura", "Calle Principal 789", 987654321, "Soltera", new Familiar("Juan", "Padre", "Av. Las Palmeras 789", "987654321", "")), "");
        HistoriaClinica historia7 = new HistoriaClinica(7, new Alumno("Enfermeria", "89123456", "María", "Rodríguez", "F", "25/07/1999", "Lima", "Lima", "Lima", "Jr. Los Lirios 123", 987654321, "Soltera", new Familiar("Luis", "Hermano", "Calle Los Pinos 123", "987654321", "")), "");
        HistoriaClinica historia8 = new HistoriaClinica(8, new Alumno("Sistemas", "34567891", "Diego", "Martínez", "M", "08/08/1997", "Chiclayo", "Lambayeque", "Lambayeque", "Av. Los Cipreses 456", 987654321, "Soltero", new Familiar("Rosa", "Madre", "Jr. Las Orquídeas 456", "987654321", "")), "");
        HistoriaClinica historia9 = new HistoriaClinica(9, new Alumno("Medicina", "67891234", "Laura", "Sánchez", "F", "03/04/1996", "Lima", "Lima", "Lima", "Calle Los Girasoles 789", 987654321, "Soltera", new Familiar("Miguel", "Padre", "Av. Las Violetas 789", "987654321", "")), "");
        HistoriaClinica historia10 = new HistoriaClinica(10, new Alumno("Enfermeria", "91234567", "Martín", "Rojas", "M", "17/09/1998", "Arequipa", "Arequipa", "Arequipa", "Jr. Los Narcisos 123", 987654321, "Soltero", new Familiar("Sandra", "Madre", "Calle Los Lirios 123", "987654321", "")), "");
        HistoriaClinica historia11 = new HistoriaClinica(11, new Trabajador("Administracion", false, "123456789", "Mariana", "López", "F", "15/08/2001", "Lima", "Lima", "Lima", "Av. Principal 456", 987654321, "Soltera", new Familiar("Juan", "Padre", "Av. Los Álamos 456", "987654321", "")), "");
        HistoriaClinica historia12 = new HistoriaClinica(12, new Trabajador("Sistemas", true, "234567890", "Carlos", "Vega", "M", "20/12/1999", "Arequipa", "Arequipa", "Arequipa", "Calle Pizarro 789", 987654321, "Soltero", new Familiar("Laura", "Madre", "Jr. Las Rosas 789", "987654321", "")), "");
        HistoriaClinica historia13 = new HistoriaClinica(13, new Trabajador("Recursos Humanos", false, "345678901", "Julia", "Mendoza", "F", "05/06/1998", "Trujillo", "La Libertad", "La Libertad", "Av. Los Pinos 456", 987654321, "Soltera", new Familiar("Pedro", "Hermano", "Calle Principal 456", "987654321", "")), "");
        HistoriaClinica historia14 = new HistoriaClinica(14, new Trabajador("Civil", true, "456789012", "Diego", "Ramírez", "M", "10/10/1997", "Lima", "Lima", "Lima", "Jr. Los Olivos 123", 987654321, "Soltero", new Familiar("Rosa", "Madre", "Av. Los Cerezos 123", "987654321", "")), "");
        HistoriaClinica historia15 = new HistoriaClinica(15, new Trabajador("Recursos Humanos", false, "567890123", "Ana", "Gómez", "F", "25/09/1996", "Cusco", "Cusco", "Cusco", "Av. Los Jazmines 789", 987654321, "Soltera", new Familiar("Martha", "Madre", "Jr. Las Flores 789", "987654321", "")), "");
        HistoriaClinica historia16 = new HistoriaClinica(16, new Trabajador("Medicina", true, "678901234", "Luis", "Herrera", "M", "12/12/1995", "Piura", "Piura", "Piura", "Calle Principal 789", 987654321, "Soltero", new Familiar("Juan", "Padre", "Av. Las Palmeras 789", "987654321", "")), "");
        HistoriaClinica historia17 = new HistoriaClinica(17, new Trabajador("Recursos Humanos", false, "789012345", "María", "Pérez", "F", "20/07/1999", "Lima", "Lima", "Lima", "Jr. Los Lirios 123", 987654321, "Soltera", new Familiar("Luis", "Hermano", "Calle Los Pinos 123", "987654321", "")), "");
        HistoriaClinica historia18 = new HistoriaClinica(18, new Trabajador("Sistemas", true, "890123456", "Pedro", "Pulido", "M", "08/08/1997", "Chiclayo", "Lambayeque", "Lambayeque", "Av. Los Cipreses 456", 987654321, "Soltero", new Familiar("Rosa", "Madre", "Jr. Las Orquídeas 456", "987654321", "")), "");
        HistoriaClinica historia19 = new HistoriaClinica(19, new Trabajador("Administración", false, "901234567", "Laura", "Torres", "F", "03/04/1996", "Lima", "Lima", "Lima", "Calle Los Girasoles 789", 987654321, "Soltera", new Familiar("Miguel", "Padre", "Av. Las Violetas 789", "987654321", "")), "");
        HistoriaClinica historia20 = new HistoriaClinica(20, new Trabajador("Sistemas", true, "012345678", "Carlos", "Corpus", "M", "17/09/1998", "Arequipa", "Arequipa", "Arequipa", "Jr. Los Narcisos 123", 987654321, "Soltero", new Familiar("Sandra", "Madre", "Calle Los Lirios 123", "987654321", "")), "");

        historia1.agregarConsulta(consulta1);
        historia2.agregarConsulta(consulta2);
        historia3.agregarConsulta(consulta3);
        historia4.agregarConsulta(consulta4);
        historia5.agregarConsulta(consulta5);
        historia6.agregarConsulta(consulta6);
        historia7.agregarConsulta(consulta7);
        historia8.agregarConsulta(consulta8);
        historia9.agregarConsulta(consulta9);
        historia10.agregarConsulta(consulta10);
        historia11.agregarConsulta(consulta11);
        historia12.agregarConsulta(consulta12);
        historia13.agregarConsulta(consulta13);
        historia14.agregarConsulta(consulta14);
        historia15.agregarConsulta(consulta15);
        historia16.agregarConsulta(consulta16);
        historia17.agregarConsulta(consulta17);
        historia18.agregarConsulta(consulta18);
        historia19.agregarConsulta(consulta19);
        historia20.agregarConsulta(consulta20);

        //CREAR CONSULTAS
        cDAO.create(consulta1);
        cDAO.create(consulta2);
        cDAO.create(consulta3);
        cDAO.create(consulta4);
        cDAO.create(consulta5);
        cDAO.create(consulta6);
        cDAO.create(consulta7);
        cDAO.create(consulta8);
        cDAO.create(consulta9);
        cDAO.create(consulta10);
        cDAO.create(consulta11);
        cDAO.create(consulta12);
        cDAO.create(consulta13);
        cDAO.create(consulta14);
        cDAO.create(consulta15);
        cDAO.create(consulta16);
        cDAO.create(consulta17);
        cDAO.create(consulta18);
        cDAO.create(consulta19);
        cDAO.create(consulta20);
        //CREAR HISTORIAS
        hDAO.create(historia1);
        hDAO.create(historia2);
        hDAO.create(historia3);
        hDAO.create(historia4);
        hDAO.create(historia5);
        hDAO.create(historia6);
        hDAO.create(historia7);
        hDAO.create(historia8);
        hDAO.create(historia9);
        hDAO.create(historia10);
    }
}
