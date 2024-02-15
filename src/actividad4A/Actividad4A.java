package actividad4A;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Actividad4A {

    static int size = 50000;

    public static void main(String[] args) {
        int[] vector = new int[size];
        vector = llenaVector(vector);
        imprimeVector(vector);
        OrdenaBurbuja(vector);
        OrdenaBurbujaSeñal(vector);

    }

    public static int[] llenaVector(int[] vector) {
        System.out.println("Llenando vector....");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(100) + 1;
        }
        return vector;
    }

    public static void imprimeVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
    }

    public static void OrdenaBurbuja(int[] vector) {
        int AUX;
        long iniciaTiempo = System.nanoTime();

        for (int I = 1; I <= size; I++) {
            for (int J = size - 1; J >= I; J--) {
                if (vector[J - 1] > vector[J]) {
                    AUX = vector[J - 1];
                    vector[J - 1] = vector[J];
                    vector[J] = AUX;

                }
            }
        }
        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1.0e-9;

        System.out.print("\n EL ARREGLO ORDENADO CON BURBUJA ES: ");
        for (int I = 0; I < size; I++) {
            System.out.print(vector[I] + "      ");
        }
        System.out.println("\n Ordenamiento por Burbuja con señal dura:   " + diferencia + "segundos");

    }

    public static void OrdenaBurbujaSeñal(int[] vector) {
        int aux, i = 0;
        boolean band = false;
        long iniciaTiempo = System.nanoTime();
        while (i < vector.length - 1 && band == false) {
            band = true;
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    band = false;
                }
            }
            i = i + 1;
        }
        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1.0e-9;

        System.out.print("\n EL ARREGLO ORDENADO CON BURBUJA CON SEÑAL ES: ");
        for (int I = 0; I < size; I++) {
            System.out.print(vector[I] + "      ");
        }
        System.out.println("\n Ordenamiento por Burbuja con señal dura:   " + diferencia + "segundos");

    }
}
