package metodos_Ordenamiento;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Shell {

    public static void main(String[] args) {
        Random rnd = new Random();
        int A[] = new int[20];
        for (int i = 0; i < A.length; i++) {
            A[i] = rnd.nextInt(100)+1;
        }
        System.out.println("Desordenado");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        int INT, N, AUX, I;
        N = A.length;
        boolean BAND = false;
        INT = N;
        while (INT > 1) {
            INT = INT / 2;
            BAND = true;
            while (BAND == true) {
                BAND = false;
                I = 0;
                while ((I + INT) < N) {
                    if (A[I] > A[I + INT]) {
                        AUX = A[I];
                        A[I] = A[I + INT];
                        A[I + INT] = AUX;
                        BAND = true;
                    }
                    I = I + 1;

                }
            }
        }
        System.out.println("\nOrdenado");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
