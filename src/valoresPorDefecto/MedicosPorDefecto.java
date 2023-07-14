package valoresPorDefecto;

import BaseDeDatos.MedicoDAO;
import BaseDeDatos.UsuarioDAO;
import medicos.Medico;
import medicos.Usuario;

public class MedicosPorDefecto {
    public static void poblar() {
        
        UsuarioDAO uDAO = new UsuarioDAO();
        MedicoDAO mDAO = new MedicoDAO();
        uDAO.create(new Usuario("Joel", "123", true, "User"));
        uDAO.create(new Usuario("Angie", "123", true, "User"));
        uDAO.create(new Usuario("Abner", "4werA3", true, "Admin"));
        uDAO.create(new Usuario("Alex", "5werA4", true, "Admin"));
        
        mDAO.create(new Medico("Leon", "Joel", "960181410", "73944739", uDAO.read(0)));
//        BD.insertMedico(new Medico("usr1", "pass1", "Lopez", "Juan", "123456789", "11111111", true));
//        BD.insertMedico(new Medico("usr2", "pass2", "Garcia", "Maria", "987654321", "22222222", true));
//        BD.insertMedico(new Medico("usr3", "pass3", "Rodriguez", "Carlos", "555555555", "33333333", false));
//        BD.insertMedico(new Medico("usr4", "pass4", "Martinez", "Ana", "777777777", "44444444", true));
//        BD.insertMedico(new Medico("usr5", "pass5", "Sanchez", "Pedro", "999999999", "55555555", true));
//        BD.insertMedico(new Medico("usr6", "pass6", "Hernandez", "Laura", "222222222", "66666666", false));
//        BD.insertMedico(new Medico("usr7", "pass7", "Gomez", "Miguel", "888888888", "77777777", true));
//        BD.insertMedico(new Medico("usr8", "pass8", "Perez", "Luisa", "111111111", "88888888", true));
//        BD.insertMedico(new Medico("usr9", "pass9", "Romero", "Diego", "444444444", "99999999", false));
//        BD.insertMedico(new Medico("usr10", "pass10", "Fernandez", "Maria", "666666666", "10101010", true));
    }
    
}
