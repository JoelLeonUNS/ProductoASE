package valoresPorDefecto;

import BaseDeDatos.ConsultaDAO;
import BaseDeDatos.HistoriaClinicaDAO;
import historias.HistoriaClinica;
import modelo.Enfermedad;
import pacientes.Familiar;
import pacientes.Paciente;

public class HistoriasPorDefecto {

    public static void poblar() {
        HistoriaClinicaDAO hDAO = new HistoriaClinicaDAO();
        ConsultaDAO cDAO = new ConsultaDAO();

        Paciente paciente1 = new Paciente("12345678", "Juan", "Pérez", "M", "01/01/2000", "Lima", "Lima", "Lima", "Av. Principal 123", "987654321", "Soltero");
        Familiar familiar1 = new Familiar("María", "Madre", "Av. Los Álamos 456", "987654321", "");
        paciente1.agregarFamiliar(familiar1);

        Paciente paciente2 = new Paciente("87654321", "Ana", "García", "F", "15/05/1998", "Arequipa", "Arequipa", "Arequipa", "Calle Pizarro 789", "987654321", "Soltera");
        Familiar familiar2 = new Familiar("Pedro", "Padre", "Jr. Las Rosas 789", "987654321", "");
        paciente2.agregarFamiliar(familiar2);

        Paciente paciente3 = new Paciente("45678912", "Luis", "Torres", "M", "10/10/1999", "Trujillo", "La Libertad", "La Libertad", "Av. Los Pinos 456", "987654321", "Soltero");
        Familiar familiar3 = new Familiar("Laura", "Hermana", "Calle Principal 456", "987654321", "");
        paciente3.agregarFamiliar(familiar3);

        Paciente paciente4 = new Paciente("98765432", "Carla", "López", "F", "20/03/1997", "Lima", "Lima", "Lima", "Jr. Los Olivos 123", "987654321", "Soltera");
        Familiar familiar4 = new Familiar("Carlos", "Padre", "Av. Los Cerezos 123", "987654321", "");
        paciente4.agregarFamiliar(familiar4);

        Paciente paciente5 = new Paciente("23456789", "Pedro", "Gómez", "M", "05/09/1996", "Cusco", "Cusco", "Cusco", "Av. Los Jazmines 789", "987654321", "Soltero");
        Familiar familiar5 = new Familiar("Martha", "Madre", "Jr. Las Flores 789", "987654321", "");
        paciente5.agregarFamiliar(familiar5);

        Paciente paciente6 = new Paciente("56789123", "Lucía", "Hernández", "F", "12/12/1995", "Piura", "Piura", "Piura", "Calle Principal 789", "987654321", "Soltera");
        Familiar familiar6 = new Familiar("Juan", "Padre", "Av. Las Palmeras 789", "987654321", "");
        paciente6.agregarFamiliar(familiar6);

        Paciente paciente7 = new Paciente("89123456", "María", "Rodríguez", "F", "25/07/1999", "Lima", "Lima", "Lima", "Jr. Los Lirios 123", "987654321", "Soltera");
        Familiar familiar7 = new Familiar("Luis", "Hermano", "Calle Los Pinos 123", "987654321", "");
        paciente7.agregarFamiliar(familiar7);

        Paciente paciente8 = new Paciente("34567891", "Diego", "Martínez", "M", "08/08/1997", "Chiclayo", "Lambayeque", "Lambayeque", "Av. Los Cipreses 456", "987654321", "Soltero");
        Familiar familiar8 = new Familiar("Rosa", "Madre", "Jr. Las Orquídeas 456", "987654321", "");
        paciente8.agregarFamiliar(familiar8);

        Paciente paciente9 = new Paciente("67891234", "Laura", "Sánchez", "F", "03/04/1996", "Lima", "Lima", "Lima", "Calle Los Girasoles 789", "987654321", "Soltera");
        Familiar familiar9 = new Familiar("Miguel", "Padre", "Av. Las Violetas 789", "987654321", "");
        paciente9.agregarFamiliar(familiar9);

        Paciente paciente10 = new Paciente("91234567", "Martín", "Rojas", "M", "17/09/1998", "Arequipa", "Arequipa", "Arequipa", "Jr. Los Narcisos 123", "987654321", "Soltero");
        Familiar familiar10 = new Familiar("Sandra", "Madre", "Calle Los Lirios 123", "987654321", "");
        paciente10.agregarFamiliar(familiar10);

        Paciente paciente11 = new Paciente("123456789", "Mariana", "López", "F", "15/08/2001", "Lima", "Lima", "Lima", "Av. Principal 456", "987654321", "Soltera");
        Familiar familiar11 = new Familiar("Juan", "Padre", "Av. Los Álamos 456", "987654321", "");
        paciente11.agregarFamiliar(familiar11);

        Paciente paciente12 = new Paciente("234567890", "Carlos", "Vega", "M", "20/12/1999", "Arequipa", "Arequipa", "Arequipa", "Calle Pizarro 789", "987654321", "Soltero");
        Familiar familiar12 = new Familiar("Laura", "Madre", "Jr. Las Rosas 789", "987654321", "");
        paciente12.agregarFamiliar(familiar12);

        Paciente paciente13 = new Paciente("345678901", "Julia", "Mendoza", "F", "05/06/1998", "Trujillo", "La Libertad", "La Libertad", "Av. Los Pinos 456", "987654321", "Soltera");
        Familiar familiar13 = new Familiar("Pedro", "Hermano", "Calle Principal 456", "987654321", "");
        paciente13.agregarFamiliar(familiar13);

        Paciente paciente14 = new Paciente("456789012", "Diego", "Ramírez", "M", "10/10/1997", "Lima", "Lima", "Lima", "Jr. Los Olivos 123", "987654321", "Soltero");
        Familiar familiar14 = new Familiar("Rosa", "Madre", "Av. Los Cerezos 123", "987654321", "");
        paciente14.agregarFamiliar(familiar14);

        Paciente paciente15 = new Paciente("567890123", "Ana", "Gómez", "F", "25/09/1996", "Cusco", "Cusco", "Cusco", "Av. Los Jazmines 789", "987654321", "Soltera");
        Familiar familiar15 = new Familiar("Martha", "Madre", "Jr. Las Flores 789", "987654321", "");
        paciente15.agregarFamiliar(familiar15);

        Paciente paciente16 = new Paciente("678901234", "Luis", "Herrera", "M", "12/12/1995", "Piura", "Piura", "Piura", "Calle Principal 789", "987654321", "Soltero");
        Familiar familiar16 = new Familiar("Juan", "Padre", "Av. Las Palmeras 789", "987654321", "");
        paciente16.agregarFamiliar(familiar16);

        Paciente paciente17 = new Paciente("789012345", "María", "Pérez", "F", "20/07/1999", "Lima", "Lima", "Lima", "Jr. Los Lirios 123", "987654321", "Soltera");
        Familiar familiar17 = new Familiar("Luis", "Hermano", "Calle Los Pinos 123", "987654321", "");
        paciente17.agregarFamiliar(familiar17);

        Paciente paciente18 = new Paciente("890123456", "Pedro", "Pulido", "M", "08/08/1997", "Chiclayo", "Lambayeque", "Lambayeque", "Av. Los Cipreses 456", "987654321", "Soltero");
        Familiar familiar18 = new Familiar("Rosa", "Madre", "Jr. Las Orquídeas 456", "987654321", "");
        paciente18.agregarFamiliar(familiar18);

        Paciente paciente19 = new Paciente("901234567", "Laura", "Torres", "F", "03/04/1996", "Lima", "Lima", "Lima", "Calle Los Girasoles 789", "987654321", "Soltera");
        Familiar familiar19 = new Familiar("Miguel", "Padre", "Av. Las Violetas 789", "987654321", "");
        paciente19.agregarFamiliar(familiar19);

        Paciente paciente20 = new Paciente("012345678", "Carlos", "Corpus", "M", "17/09/1998", "Arequipa", "Arequipa", "Arequipa", "Jr. Los Narcisos 123", "987654321", "Soltero");
        Familiar familiar20 = new Familiar("Sandra", "Madre", "Calle Los Lirios 123", "987654321", "");
        paciente20.agregarFamiliar(familiar20);

        //HISTORIAS CLINICAS
        HistoriaClinica historia1 = new HistoriaClinica(1, paciente1, "Asma, Parkinson");
        HistoriaClinica historia2 = new HistoriaClinica(2, paciente2, "");
        HistoriaClinica historia3 = new HistoriaClinica(3, paciente3, "");
        HistoriaClinica historia4 = new HistoriaClinica(4, paciente4, "");
        HistoriaClinica historia5 = new HistoriaClinica(5, paciente5, "");
        HistoriaClinica historia6 = new HistoriaClinica(6, paciente6, "");
        HistoriaClinica historia7 = new HistoriaClinica(7, paciente7, "");
        HistoriaClinica historia8 = new HistoriaClinica(8, paciente8, "");
        HistoriaClinica historia9 = new HistoriaClinica(9, paciente9, "");
        HistoriaClinica historia10 = new HistoriaClinica(10, paciente10, "");
        HistoriaClinica historia11 = new HistoriaClinica(11, paciente11, "");
        HistoriaClinica historia12 = new HistoriaClinica(12, paciente12, "");
        HistoriaClinica historia13 = new HistoriaClinica(13, paciente13, "Asma");
        HistoriaClinica historia14 = new HistoriaClinica(14, paciente14, "");
        HistoriaClinica historia15 = new HistoriaClinica(15, paciente15, "");
        HistoriaClinica historia16 = new HistoriaClinica(16, paciente16, "");
        HistoriaClinica historia17 = new HistoriaClinica(17, paciente17, "");
        HistoriaClinica historia18 = new HistoriaClinica(18, paciente18, "");
        HistoriaClinica historia19 = new HistoriaClinica(19, paciente19, "");
        HistoriaClinica historia20 = new HistoriaClinica(20, paciente20, "");

        // AGREGAR ANTECEDENTES PATOLOGICOS (ENFERMEDADES)
        historia1.agregarAntecedentePatologico(Enfermedad.SARAMPION);
        historia1.agregarAntecedentePatologico(Enfermedad.VARICELA);
        historia2.agregarAntecedentePatologico(Enfermedad.TIFOIDEA);
        historia2.agregarAntecedentePatologico(Enfermedad.HEPATITIS);
        historia3.agregarAntecedentePatologico(Enfermedad.MIOPIA);
        historia4.agregarAntecedentePatologico(Enfermedad.HEPATITIS);
        historia5.agregarAntecedentePatologico(Enfermedad.GONORREA);
        historia6.agregarAntecedentePatologico(Enfermedad.SIFILIS);
        historia7.agregarAntecedentePatologico(Enfermedad.TUBERCULOSIS);
        historia8.agregarAntecedentePatologico(Enfermedad.NEUMONIA);
        historia9.agregarAntecedentePatologico(Enfermedad.FARINGITIS);
        historia10.agregarAntecedentePatologico(Enfermedad.AMIGDALITIS);
        historia11.agregarAntecedentePatologico(Enfermedad.COLERA);
        historia12.agregarAntecedentePatologico(Enfermedad.PARASITOS);
        historia13.agregarAntecedentePatologico(Enfermedad.ALERGIAS);
        historia14.agregarAntecedentePatologico(Enfermedad.ANEMIA);
        historia15.agregarAntecedentePatologico(Enfermedad.FRACTURAS);
        historia16.agregarAntecedentePatologico(Enfermedad.OPERACIONES);
        historia17.agregarAntecedentePatologico(Enfermedad.MIOPIA);
        historia18.agregarAntecedentePatologico(Enfermedad.HIPERTENSION_ARTERIAL);
        historia19.agregarAntecedentePatologico(Enfermedad.SOPLO_CARDIACO);
        historia20.agregarAntecedentePatologico(Enfermedad.INSUFICIENCIA_URINARIA);
        historia20.agregarAntecedentePatologico(Enfermedad.QUISTE_OVARIO);

        historia1.agregarConsulta(cDAO.read(0));
        historia2.agregarConsulta(cDAO.read(1));
        historia3.agregarConsulta(cDAO.read(2));
        historia4.agregarConsulta(cDAO.read(3));
        historia5.agregarConsulta(cDAO.read(4));
        historia6.agregarConsulta(cDAO.read(5));
        historia7.agregarConsulta(cDAO.read(6));
        historia8.agregarConsulta(cDAO.read(7));
        historia9.agregarConsulta(cDAO.read(8));
        historia10.agregarConsulta(cDAO.read(9));
        historia11.agregarConsulta(cDAO.read(10));
        historia12.agregarConsulta(cDAO.read(11));
        historia13.agregarConsulta(cDAO.read(12));
        historia14.agregarConsulta(cDAO.read(13));
        historia15.agregarConsulta(cDAO.read(14));
        historia16.agregarConsulta(cDAO.read(15));
        historia17.agregarConsulta(cDAO.read(16));
        historia18.agregarConsulta(cDAO.read(17));
        historia19.agregarConsulta(cDAO.read(18));
        historia20.agregarConsulta(cDAO.read(19));
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
        hDAO.create(historia11);
        hDAO.create(historia12);
        hDAO.create(historia13);
        hDAO.create(historia14);
        hDAO.create(historia15);
        hDAO.create(historia16);
        hDAO.create(historia17);
        hDAO.create(historia18);
        hDAO.create(historia19);
        hDAO.create(historia20);
    }
}
