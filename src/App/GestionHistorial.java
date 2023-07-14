package App;

import BaseDeDatos.UsuarioDAO;
import medicos.Usuario;
import modelo.ModeloUsuario;
import presentador.PresentadorGeneral;
import vista.VistaLogin;

public class GestionHistorial {

//    private static final Scanner input = new Scanner(System.in);
//    private static Medico medico;
//    private static HistoriaClinica historia;
//    private static ConsultaMedica consulta;
//    private static Examen examen;
//
//    private static final MedicoManager medicoManager = new MedicoManager();
//    private static HistoriaClinicaManager historiaManager;
//    private static final ConsultaManager consultaManager = new ConsultaManager();
//    private static ExamenManager examenManager;
//
    public static void main(String[] args) {
        PresentadorGeneral pg = new PresentadorGeneral();
        pg.setModeloPresentadorLogin(new ModeloUsuario());
        VistaLogin vLogin = new VistaLogin();
        vLogin.setPresentador(pg);
        
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.create(new Usuario("Joel", "2werA1", false, "User"));
        uDAO.create(new Usuario("Angie", "3werA2", true, "User"));
        uDAO.create(new Usuario("Abner", "4werA3", true, "Admin"));
        uDAO.create(new Usuario("Alex", "5werA4", true, "Admin"));
        
        vLogin.iniciar();

    }
//
//    private static void cargarValoresPorDefecto() {
//        MedicosPorDefecto.poblar();
//        HistoriasPorDefecto.poblar();
//    }
//
//    
//    
//    
//    private static int menuLogin() {
//        System.out.println("\t\n\n::: BIENVENIDO :::");
//        System.out.println("1. Iniciar Sesion");
//        System.out.println("2. Cerrar Sesion");
//        System.out.print("Elegir opcion: ");
//        return input.nextInt();
//    }
//
//    private static void mostrarLogin() {
//        if (menuLogin() == 1) {
//            System.out.println("(a) Administrador o (b) Medico");
//            switch (input.next()) {
//                case "a" -> {
//                    administrador();
//                }
//                case "b" -> {
//                    aministradorCase_2();
//                    if (medico != null && medico.isEstado()) {
//                        medico();
//                    }
//                }
//            }
//        }
//    }
//
//    private static int menuAministrador() {
//        System.out.println("\n1. Crear cuenta");
//        System.out.println("2. Buscar cuenta");
//        System.out.println("3. Editar cuenta");
//        System.out.println("4. Dar de baja");
//        System.out.println("5. Salir");
//        System.out.print("Elegir opcion: ");
//        return input.nextInt();
//    }
//
//    private static void administrador() {
//        int opcion;
//        do {
//            opcion = menuAministrador();
//            switch (opcion) {
//                case 1 -> {
//                    aministradorCase_1();
//                }
//                case 2 -> {
//                    aministradorCase_2();
//                }
//                case 3 -> {
//                    aministradorCase_3();
//                }
//                case 4 -> {
//                    aministradorCase_4();
//                }
//            }
//        } while (opcion != 5);
//    }
//
//    private static void aministradorCase_1() {
//        medicoManager.registrar();
//    }
//
//    private static void aministradorCase_2() {
//        String usuario, clave;
//        System.out.print("\nUsuario: ");
//        usuario = input.next();
//        System.out.print("Clave: ");
//        clave = input.next();
//        medico = medicoManager.buscar(usuario, clave);
//    }
//
//    private static void aministradorCase_3() {
//        if (medico == null) {
//            System.out.println("Busque primero al medico.");
//        } else {
//            medicoManager.editar(medico);
//        }
//    }
//
//    private static void aministradorCase_4() {
//        if (medico == null) {
//            System.out.println("Busque primero al medico.");
//        } else {
//            medicoManager.darDeBaja(medico);
//        }
//    }
//
//    private static int menuMedico() {
//        System.out.println("\n1. Registrar historia clinica");
//        System.out.println("2. Buscar historia clinica");
//        System.out.println("3. Editar historia clinica");
//        System.out.println("4. Registrar examen");
//        System.out.println("5. Salir");
//        System.out.print("Elegir opcion: ");
//        return input.nextInt();
//    }
//
//    private static void medico() {
//        int opcion;
//        do {
//            opcion = menuMedico();
//            switch (opcion) {
//                case 1 -> {
//                    medicoCase_1();
//                }
//                case 2 -> {
//                    medicoCase_2();
//                }
//                case 3 -> {
//                    medicoCase_3();
//                }
//                case 4 -> {
//                    medicoCase_4();
//                }
//            }
//        } while (opcion != 5);
//    }
//
//    private static void medicoCase_1() {
//        System.out.println("\nTipo de historia clinica: ");
//        factoryHistoriaClinica();
//        historia = historiaManager.registrar();
//    }
//
//    private static void medicoCase_2() {
//        System.out.println("\nTipo de historia clinica: ");
//        factoryHistoriaClinica();
//        System.out.print("Ingrese el DNI del paciente: ");
//        historia = historiaManager.buscar(input.next());
//    }
//
//    private static void medicoCase_3() {
//        if (historia == null) {
//            System.out.println("Busque primero la historia.");
//        } else {
//            historiaManager.editar(historia);
//        }
//    }
//
//    private static void medicoCase_4() {
//        if (historia == null) {
//            System.out.println("Busque primero la historia.");
//        } else {
//            consulta = consultaManager.registrar();
//            System.out.println("\nTipo de examen: ");
//            agregarExamen();
//            historia.agregarConsulta(consulta);
//        }
//    }
//
//    public static void agregarExamen() {
//        factoryExamen();
//        examen = examenManager.registrar();
//        examen.setAtendidoPor(medico);
//        consulta.agregarExamen(examen);
//        System.out.println("Desea agregar otro examen? SI (1) NO (0)");
//        if (input.nextInt() == 1) {
//            agregarExamen();
//        }
//    }
//
//    public static void factoryExamen() {
//        int opcion;
//        do {
//            System.out.println("1. Examen Medico.");
//            System.out.println("2. Examen Fisico.");
//            System.out.println("3. Examen Clinico.");
//            opcion = input.nextInt();
//            switch (opcion) {
//                case 1 -> {
//                    examenManager = new ExamenMedicoManager();
//                }
//                case 2 -> {
//                    examenManager = new ExamenFisicoManager();
//                }
//                case 3 -> {
//                    examenManager = new ExamenClinicoManager();
//                }
//            }
//        } while (opcion < 1 || opcion > 3);
//    }
//
//    public static void factoryHistoriaClinica() {
//        int opcion;
//        do {
//            System.out.println("1. Alumno.");
//            System.out.println("2. Trabajador.");
//            opcion = input.nextInt();
//            switch (opcion) {
//                case 1 -> {
//                    historiaManager = new HistoriaClinicaManagerAlumno();
//                }
//                case 2 -> {
//                    historiaManager = new HistoriaClinicaManagerTrabajador();
//                }
//            }
//        } while (opcion < 1 || opcion > 2);
//    }
}
