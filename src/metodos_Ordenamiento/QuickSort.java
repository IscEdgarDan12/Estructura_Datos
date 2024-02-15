package metodos_Ordenamiento;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class QuickSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        QuickSort ordenar=new QuickSort();
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100)+1;
        }
        System.out.println("Desordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        ordenar.quicksort(a, 0, a.length-1);
        System.out.println("\nOrdenado");
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n]+" ");
        }
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
