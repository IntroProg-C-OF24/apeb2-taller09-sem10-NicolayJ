package taller09_diegojimenez;
import java.util.Scanner;

public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese el numero de marcas de vehiculos:");
        int limit = tecla.nextInt();
        tecla.nextLine();
        String[] nombreM = new String[limit];
        
        System.out.println("----------------------------------------");
        for (int i = 0; i < limit;) {
            System.out.print("Ingrese la marca del vehiculo " + (i + 1) + ": ");
            String marca = tecla.nextLine();
            
            if (! (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")) ) {
                nombreM[i] = marca;
                i++;
            } else {
                System.out.println("        Las letras A, C, T no se contabilizan, escriba otra marca.");
            }
        }
        System.out.println("=======================================");
        System.out.println("Las marcas de vehiculos ingresadas son:");
        for(int i = 0; i < nombreM.length; i++) {
            if (nombreM[i] != null) { 
                System.out.println("> "+ nombreM[i]);
            }
        }
    }
}
