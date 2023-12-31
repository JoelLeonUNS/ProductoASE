package App;

import BaseDeDatos.SqlServerConexion;
import modelo.ModeloConsulta;
import modelo.ModeloExamen;
import modelo.ModeloHistoriaClinica;
import modelo.ModeloMedico;
import modelo.ModeloUsuario;
import presentador.PresentadorGeneral;
import valoresPorDefecto.ConsultasPorDefecto;
import valoresPorDefecto.ExamenesPorDefecto;
import valoresPorDefecto.HistoriasPorDefecto;
import valoresPorDefecto.MedicosPorDefecto;
import vista.VistaLogin;

public class GestionHistorial {

    public static void main(String[] args) {
        MedicosPorDefecto.poblar();
        ExamenesPorDefecto.poblar();
        ConsultasPorDefecto.poblar();
        HistoriasPorDefecto.poblar();
                
        ModeloHistoriaClinica mHistoriaClinica = new ModeloHistoriaClinica();
        
        PresentadorGeneral.getInstancia().setModeloPresentadorLogin(new ModeloUsuario());
        PresentadorGeneral.getInstancia().setModeloPresentadorInterfazAdmin(new ModeloMedico());
        PresentadorGeneral.getInstancia().setModeloPresentadorHistoriaClinica(mHistoriaClinica);
        PresentadorGeneral.getInstancia().setModeloPresentadorExamen(new ModeloExamen(), new ModeloConsulta(), mHistoriaClinica);
        
        SqlServerConexion.setDatos("localhost", "1433", "alquilerVehiculos", "sa", "02122002");
        SqlServerConexion.getInstance();
        
        VistaLogin vLogin = new VistaLogin(PresentadorGeneral.getInstancia()); 
        vLogin.iniciar();
    }
}
