package metodos_Ordenamiento;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Sacudida {

    public static void main(String[] args) {
        Random rnd = new Random();
        int A[] = new int[20];
        for (int i = 0; i < A.length; i++) {
            A[i] = rnd.nextInt(100 + 1);
        }
        System.out.println("Desordenado");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int I, IZQ, DER, K, AUX;
        IZQ = 1;
        DER = A.length-1;
        K = A.length-1;
        while (DER >= IZQ) {
            for (I = DER; I >= IZQ; I--) {
                if (A[I - 1] > A[I]) {
                    AUX = A[I - 1];
                    A[I - 1] = A[I];
                    A[I] = AUX;
                    K = I;
                }
            }
            IZQ = K + 1;
            for (I = IZQ; I <=DER; I++) {
                if (A[I - 1] > A[I]) {
                    AUX = A[I - 1];
                    A[I - 1] = A[I];
                    A[I] = AUX;
                    K = I;
                }
            }
            DER = K - 1;
        }
        System.out.println("Ordenado");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
