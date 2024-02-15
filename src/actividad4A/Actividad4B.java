package actividad4A;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Actividad4B {

    static int size = 50000;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vector = new int[size];
        vector = llenaVector(vector);
        Arrays.sort(vector);

        // imprimeVector(vector);
        BusquedaSecuencial(vector);
        BusquedaBinaria(vector);

    }

    public static int[] llenaVector(int[] vector) {
        System.out.println("Llenando vector....");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(500);
        }
        return vector;
    }

    public static void BusquedaSecuencial(int[] vector) {
        long iniciaTiempo = System.nanoTime();
        boolean esta = false;
        int buscar = new Random().nextInt(500);
        for (int i = 0; i < vector.length; i++) {
            if (buscar == vector[i]) {
                System.out.println("El numero " + buscar + " esta en la posicion: " + (i + 1));
                esta = true;
                break;
            }
        }

        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1.0e-9;
        if (!esta) {
            System.out.println("El número " + buscar + " NO está en el Vector");
        }
        System.out.println("\n duracion:   " + diferencia + "segundos");

    }

    public static void BusquedaBinaria(int[] vector) {
        Arrays.sort(vector);
        int buscar = new Random().nextInt(500);

        long iniciaTiempo = System.nanoTime();
        if (Arrays.binarySearch(vector, buscar) > 0) {
            System.out.println("El número " + buscar + " está en el Vector");
        } else {
            System.out.println("El número " + buscar + " NO está en el Vector");
        }
        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1.0e-9;
        System.out.println("\n duracion:   " + diferencia + "segundos");

    }
}
