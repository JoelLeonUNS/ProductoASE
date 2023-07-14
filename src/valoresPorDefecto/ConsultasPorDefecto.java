/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valoresPorDefecto;

import BaseDeDatos.ConsultaDAO;
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

        ConsultaMedica consulta1 = new ConsultaMedica("01/01/2023", "10:00", 20, "Consulta de rutina", 0, "Normal", "Normal", "Normal", "Bueno", mDAO.read(1));
        ConsultaMedica consulta2 = new ConsultaMedica("02/01/2023", "11:00", 21, "Dolor de cabeza", 2, "Normal", "Normal", "Normal", "Regular", mDAO.read(2));
        ConsultaMedica consulta3 = new ConsultaMedica("03/01/2023", "09:30", 22, "Fiebre alta", 5, "Disminuido", "Normal", "Normal", "Mal", mDAO.read(3));
        ConsultaMedica consulta4 = new ConsultaMedica("04/01/2023", "14:15", 18, "Consulta de seguimiento", 1, "Normal", "Normal", "Normal", "Bueno", mDAO.read(4));
        ConsultaMedica consulta5 = new ConsultaMedica("05/01/2023", "16:45", 20, "Dolor abdominal", 3, "Normal", "Disminuido", "Normal", "Regular", mDAO.read(5));
        ConsultaMedica consulta6 = new ConsultaMedica("06/01/2023", "08:30", 17, "Examen de rutina", 0, "Normal", "Normal", "Normal", "Bueno", mDAO.read(6));
        ConsultaMedica consulta7 = new ConsultaMedica("07/01/2023", "13:30", 23, "Dolor en las articulaciones", 4, "Normal", "Normal", "Normal", "Regular", mDAO.read(7));
        ConsultaMedica consulta8 = new ConsultaMedica("08/01/2023", "10:45", 19, "Dolor de garganta", 2, "Disminuido", "Normal", "Normal", "Mal", mDAO.read(8));
        ConsultaMedica consulta9 = new ConsultaMedica("09/01/2023", "15:20", 18, "Consulta de rutina", 0, "Normal", "Normal", "Normal", "Bueno", mDAO.read(9));
        ConsultaMedica consulta10 = new ConsultaMedica("10/01/2023", "11:30", 24, "Presión arterial alta", 1, "Normal", "Normal", "Normal", "Regular", mDAO.read(10));

        consulta1.agregarExamen(new ExamenClinico(true, false));
        consulta2.agregarExamen(new ExamenClinico(false, true));
        consulta3.agregarExamen(new ExamenClinico(true, true));
        consulta4.agregarExamen(new ExamenClinico(false, false));
        consulta5.agregarExamen(new ExamenFisico(36.5, "120/80", 16, 98, 70, 170, 18.6));
        consulta6.agregarExamen(new ExamenFisico(37.2, "110/70", 18, 99, 72, 175, 18.9));
        consulta7.agregarExamen(new ExamenFisico(38.5, "130/85", 14, 97, 68, 168, 23.9));
        consulta8.agregarExamen(new ExamenFisico(35.4, "130/85", 17, 97, 65, 178, 22.5));
        consulta9.agregarExamen(new ExamenFisico(39.2, "130/85", 16, 97, 70, 163, 24.9));
        consulta10.agregarExamen(new ExamenFisico(36.8, "130/85", 14, 97, 68, 168, 25.6));

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
