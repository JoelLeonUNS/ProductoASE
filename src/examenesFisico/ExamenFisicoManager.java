package examenesFisico;

import examenes.Examen;
import examenes.ExamenManager;
import java.util.Scanner;

public class ExamenFisicoManager extends ExamenManager {

    private final Scanner input = new Scanner(System.in);

    @Override
    public Examen registrar() {
        Examen nuevoExamen = new ExamenFisico();
        setDatos(nuevoExamen);

        return nuevoExamen;
    }

    @Override
    public void setDatos(Examen examen) {
        System.out.print("\nTemperatura: ");
        ((ExamenFisico) examen).setTemperatura(input.nextDouble());
        System.out.print("PA: ");
        ((ExamenFisico) examen).setPA(input.next());
        System.out.print("FR: ");
        ((ExamenFisico) examen).setFR(input.nextDouble());
        System.out.print("SPO2: ");
        ((ExamenFisico) examen).setSPO2(input.nextDouble());
        System.out.print("Peso: ");
        ((ExamenFisico) examen).setPeso(input.nextDouble());
        System.out.print("Talla: ");
        ((ExamenFisico) examen).setTalla(input.nextDouble());
        System.out.print("IMC: ");
        ((ExamenFisico) examen).setIMC(input.nextDouble());
    }

}
