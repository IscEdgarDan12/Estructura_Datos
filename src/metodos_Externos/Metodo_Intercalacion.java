package metodos_Externos;

import java.util.Random;
import metodos_Ordenamiento.QuickSort;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Metodo_Intercalacion {

    public static void main(String[] args) {
        Random rnd = new Random();
        Metodo_Intercalacion metodo1= new Metodo_Intercalacion();
        int f1[] = new int[8];
        int f2[] = new int[5];
        for (int i = 0; i < f1.length; i++) {
            f1[i] = rnd.nextInt(10) + 1;
        }
        for (int i = 0; i < f2.length; i++) {
            f2[i] = rnd.nextInt(10) + 1;
        }
        System.out.println("Vector 1");
        for (int i = 0; i < f1.length; i++) {
            System.out.print(f1[i]+" ");
        }
        System.out.println();
        System.out.println("Vector 2");
        for (int i = 0; i < f2.length; i++) {
            System.out.print(f2[i]+" ");
        }
        System.out.println();
        System.out.println("numeros ordenados");
        for (int i = 0; i < metodo1.intercalacion(f1, f2).length; i++) {
            System.out.print(metodo1.intercalacion(f1, f2)[i]+" ");
        }
    }

    public int[] intercalacion(int f1[], int f2[]) {
        Metodo_Intercalacion ordenar = new Metodo_Intercalacion();
        int r1 = 0, r2 = 0, r3 = 0;
        int f3[] = new int[f1.length + f2.length];
        ordenar.quicksort(f1, 0, f1.length - 1);
        ordenar.quicksort(f2, 0, f2.length - 1);

        while ((r1 < f1.length) && (r2 < f2.length)) {
            if (f1[r1] < f2[r2]) {
                f3[r3] = f1[r1];
                r1++;
                r3++;
            } else {
                f3[r3] = f2[r2];
                r2++;
                r3++;
            }

        }
        while (r1 < f1.length) {
            f3[r3] = f1[r1];
            r1++;
            r3++;
        }
        while (r2 < f2.length) {
            f3[r3] = f2[r2];
            r2++;
            r3++;
        }
        return f3;
    }
    public void quicksort(int A[], int izq, int der) {
        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;
        while (i < j) {

            while (A[i] <= pivote && i < j) {
                i++;
            }

            while (A[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            quicksort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);
        }
    }
}
