package taller09_diegojimenez;
public class ejercicio_03 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        
        for (int i = 0; i < promediosCualitativos.length; i++) {
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else { 
                promediosCualitativos[i] = "Sobresaliente";
            }
            
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s \n", estudiantes[i], promedios[i], promediosCualitativos[i]);
        }       
    }
}
