package metodos_Ordenamiento;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class BurbujaMenor {

    public static void main(String[] args) {
        Random rnd = new Random();
        int a[] = new int[20];
        int aux, i, j;

        for (i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100 + 1);
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
        System.out.println("Valor vector Burbuja: ");

        for (i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }
    }
}
