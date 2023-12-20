package taller09_diegojimenez;
public class ejercicio_02 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double sum = 0.0;
        for (int i = 0; i < arreglo.length; i++) {
            sum += arreglo[i];
        }
        double mediaArit = sum / arreglo.length;
        System.out.printf("La media aritmetica es: %.2f%n", mediaArit);

        int arribaMediaArit = 0;
        int abajoMediaArit = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mediaArit) {
                arribaMediaArit++;
            } else if (arreglo[i] < mediaArit) {
                abajoMediaArit++;
            }
        }

        System.out.println("Los elementos que estan por encima de la media aritmetica son: " + arribaMediaArit);
        System.out.println("Los elementos que estan por debajo de la media aritmetica son: " + abajoMediaArit);
    }
}

