/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_Ordenamiento;

import java.util.Random;

/**
 *
 * @author DanKuzo
 */
public class Radix {

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
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int[] auxiliar = new int[A.length];
            j = 0;
            for (i = 0; i < A.length; i++) {
                boolean mover = A[i] << x >= 0;
                if (x == 0 ? !mover : mover) {//OPERADOR TERNARIO ?
                    auxiliar[j] = A[i];
                    j++;
                } else {
                    A[i - j] = A[i];
                }

            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = A[i - j];
            }
            A = auxiliar;
        }
        System.out.println("\nOrdenado");
        for (int P = 0; P < A.length; P++) {
            System.out.print(A[P] + " ");
        }
        System.out.println();

    }
}
