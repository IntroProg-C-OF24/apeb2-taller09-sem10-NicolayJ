package taller09_diegojimenez;
import java.util.Scanner;

public class ejercicio_04 {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String letra;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra");
            letra = tecla.nextLine();
            
            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].startsWith(letra)) {
                    bandera = false;
                    System.out.println("La letra ingresada coincide con la inicial de uno de los estudiantes, la letra ingresada es '" + letra + " coincide con " + estudiantes[i]);
                    System.out.println("Fin del ciclo");
                    break;
                }
            }
        }
    }
}
