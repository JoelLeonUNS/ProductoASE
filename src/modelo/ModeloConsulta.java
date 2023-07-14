package modelo;

import consultas.ConsultaMedica;
import java.util.Scanner;

public class ModeloConsulta {

    private final Scanner input = new Scanner(System.in);

    public ConsultaMedica registrar() {
        ConsultaMedica nuevaConsulta = new ConsultaMedica();
        setDatos(nuevaConsulta);
        
        System.out.println(nuevaConsulta);
        
        return nuevaConsulta;
    }

    private void setDatos(ConsultaMedica consulta) {
        System.out.print("\nFecha: ");
        consulta.setFecha(input.next());
        System.out.print("Hora: ");
        consulta.setHora(input.next());
        System.out.print("Edad: ");
        consulta.setEdad(input.nextInt());
        System.out.print("Motivo: ");
        input.nextLine();
        consulta.setMotivo(input.nextLine());
        System.out.print("Tiempo de Enfermedad: ");
        consulta.setTiempoEnfermedad(input.nextInt());
        System.out.print("Apetito: ");
        consulta.setApetito(input.next());
        System.out.print("Sueño: ");
        consulta.setSueño(input.next());
        System.out.print("Sed: ");
        consulta.setSed(input.next());
        System.out.print("Estado de Animo: ");
        consulta.setEstadoAnimo(input.next());
    }

}
