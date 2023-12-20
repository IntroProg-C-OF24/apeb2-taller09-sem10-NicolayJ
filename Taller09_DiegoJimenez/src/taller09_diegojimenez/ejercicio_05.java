package taller09_diegojimenez;
public class ejercicio_05 {
    public static void main(String[] args) {
        int cantidadEstudiantes = 28;
        double[] notasEst = new double[cantidadEstudiantes];
        double sumaNotas = 0, promedio, notaMayor, notaMenor;
        int mejorEstudiante = 0, peorEstudiante = 0;

        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double) (Math.random() * (9 - 0 + 1) + 0);
            sumaNotas += notasEst[i];
        }

        System.out.println("LISTADO DE NOTAS DEL PRIMER CICLO PARALELO C DE COMPUTACION");
        System.out.println("------------------------");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("Nota del Estudiante %d: %.2f \n", (i + 1), notasEst[i]);
        }

        promedio = sumaNotas / cantidadEstudiantes;
        System.out.println("==================================");
        System.out.printf("Promedio: %.2f \n", promedio);
        System.out.println("==================================");
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];

        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > notaMayor) {
                notaMayor = notasEst[i];
                mejorEstudiante = i;
            }
            if (notasEst[i] < notaMenor) {
                notaMenor = notasEst[i];
                peorEstudiante = i;
            }
        }
     
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > promedio) {
                System.out.printf("Estudiante %d: %.2f\n", (i + 1), notasEst[i]);
            }
        }
        System.out.println("--------------------------------------------------------------------------");        
        System.out.println("Estudiantes con nota menor al promedio:");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] < promedio) {
                System.out.printf("Estudiante %d: %.2f\n", (i + 1), notasEst[i]);
            }
        }
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("El estudiante con la mejor nota es el numero %d con una nota de: %.2f \n", (mejorEstudiante + 1), notaMayor);
        System.out.printf("El estudiante con la peor nota es el numero %d con una nota de: %.2f \n", (peorEstudiante + 1), notaMenor);
    
    }
}
