package metodos_Ordenamiento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class MenuOrdenamiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        int I = 0, IZQ = 0, DER = 0, K = 0, AUX = 0, INT = 0, N = 0, x = 0, j = 0;
        boolean BAND = false, hay = false;
        Random rnd = new Random();
        int a[] = new int[20];
        int b[] = new int[20];

        System.out.println("Bienvenido");
        do {
            System.out.println("¿Qué es lo que desea hacer?");
            System.out.println("1. Burbuja Menor\n"
                    + "2. Burbuja Mayor\n"
                    + "3. Burbuja con señal\n"
                    + "4. Sacudida\n"
                    + "5. Shell Sort\n"
                    + "6. Radix\n"
                    + "7. Quick Sort\n"
                    + "8. Imprimir vector desarreglado\n"
                    + "9. Nuevo vector\n"
                    + "10. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    if (hay) {
                        System.out.println("Metodo Burbuja Menor");
                        burbujaMenor(AUX, I, j, a);
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;
                case 2:
                    if (hay) {
                        System.out.println("Metodo Burbuja Mayor");
                        burbujaMayor(AUX, I, j, a);
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;
                case 3:
                    if (hay) {
                        System.out.println("Metodo Burbuja con Señal");
                        burbujaSenal(AUX, I, j, a, BAND);
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;
                case 4:
                    if (hay) {
                        sacudida(a, I, IZQ, DER, K, AUX);
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;
                case 5:
                    if (hay) {
                        System.out.println("Metodo Shell");
                        shell(INT, N, AUX, I, a);
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;
                case 6:
                    if (hay) {
                        System.out.println("Metodo Radix");
                        radix(x, I, j, a);
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;
                case 7:
                    if (hay) {
                        System.out.println("Metodo QuickSort");
                        quicksort(a, 0, a.length - 1);
                        for (int n = 0; n < a.length; n++) {
                            System.out.print(a[n] + " ");
                        }
                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;

                case 8:
                    if (hay) {
                        System.out.println("Vector Desordenado");
                        imprimirVectorDesordenado(b);
                        System.out.println();

                    } else {
                        System.out.println("Vector no creado");
                    }
                    break;

                case 9:
                    for (int i = 0; i < a.length; i++) {
                        a[i] = rnd.nextInt(100) + 1;
                        b[i] = a[i];
                    }
                    hay = true;
                    System.out.println("Nuevo vector creado");
                    break;
                default:
                    if (opc != 10) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Saliendo...");
                    }
                    break;
            }
        } while (opc != 10);

    }

    public static void burbujaMenor(int aux, int i, int j, int a[]) {

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
        for (int p = 0; p < a.length; p++) {
            System.out.print(" " + a[p] + " ");
        }
        System.out.println();

    }

    public static void imprimirVectorDesordenado(int b[]) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i] + " ");
        }
    }

    public static void burbujaMayor(int aux, int i, int j, int a[]) {
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        for (int p = 0; p < a.length; p++) {
            System.out.print(" " + a[p] + " ");
        }
        System.out.println();

    }

    public static void burbujaSenal(int aux, int i, int j, int a[], boolean BAND) {
        i = 0;
        BAND = false;
        while ((i <= a.length - 1) && BAND == false) {
            BAND = true;
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                    BAND = false;
                }
            }
        }
        for (j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public static void sacudida(int A[], int I, int IZQ, int DER, int K, int AUX) {
        IZQ = 1;
        DER = A.length - 1;
        K = A.length - 1;
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
            for (I = IZQ; I <= DER; I++) {
                if (A[I - 1] > A[I]) {
                    AUX = A[I - 1];
                    A[I - 1] = A[I];
                    A[I] = AUX;
                    K = I;
                }
            }
            DER = K - 1;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void shell(int INT, int N, int AUX, int I, int A[]) {
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
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }

    public static void radix(int x, int i, int j, int A[]) {
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
        for (int P = 0; P < A.length; P++) {
            System.out.print(A[P] + " ");
        }
        System.out.println();

    }

    public static void quicksort(int A[], int izq, int der) {
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
