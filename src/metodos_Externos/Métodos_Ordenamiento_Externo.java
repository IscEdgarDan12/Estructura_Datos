package metodos_Externos;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Métodos_Ordenamiento_Externo {

    public static int a[];
    public static int b[];
    public static int c[];

    public static void main(String[] args) {
        int vector1[] = new int[8];
        int vector2[] = new int[5];
        int vector3[] = new int[14];

        int opc;
        boolean crear = false;
        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar?"
                    + "\n 1.- Metodo de intercalacion"
                    + "\n 2.- Mezcla Directa"
                    + "\n 3.- Mezcla Natural"
                    + "\n 4.- Crear nuevos vectores"
                    + "\n 5.- Imprimir vectores desordenados"
                    + "\n 6.- Salir"));
            switch (opc) {
                case 1:
                    if (crear) {
                        JOptionPane.showMessageDialog(null, "Metodo de intercalacion");
                        JOptionPane.showMessageDialog(null, Arrays.toString(intercalacion(vector1, vector2)));
                    } else {
                        JOptionPane.showMessageDialog(null, "Vectores no creados");

                    }
                    break;

                case 2:
                    if (crear) {
                        JOptionPane.showMessageDialog(null, "Mezcla Directa");
                        JOptionPane.showMessageDialog(null, Arrays.toString(mezcladirecta(vector3)));
                    } else {
                        JOptionPane.showMessageDialog(null, "Vectores no creados");

                    }
                    break;

                case 3:
                    if (crear) {
                        JOptionPane.showMessageDialog(null, "Mezcla Natural");
                        JOptionPane.showMessageDialog(null, Arrays.toString(mezclaNatural(vector3)));
                    } else {
                        JOptionPane.showMessageDialog(null, "Vectores no creados");

                    }
                    break;

                case 4:
                    crearVectores(vector1, vector2, vector3);
                    JOptionPane.showMessageDialog(null, "Vectores creados");
                    crear = true;
                    break;

                case 5:
                    if (crear) {
                        imprimirVectores();
                    } else {
                        JOptionPane.showMessageDialog(null, "Vectores no creados");

                    }
                    break;
                default:
                    if (opc == 6) {
                        JOptionPane.showMessageDialog(null, "Saliendo");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");

                    }
                    break;
            }
        } while (opc != 6);

    }

    public static int[] intercalacion(int f1[], int f2[]) {
        int r1 = 0, r2 = 0, r3 = 0;
        int f3[] = new int[f1.length + f2.length];
        quicksort(f1, 0, f1.length - 1);
        quicksort(f2, 0, f2.length - 1);

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

    public static int[] mezcladirecta(int[] arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];
            //copiando los elementos de la parte primera al arregloIzq
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            //copiando los elementos de la parte primera al arregloDer

            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            //Recusividad
            arregloIzq = mezcladirecta(arregloIzq);
            arregloDer = mezcladirecta(arregloDer);
            i = 0;
            j = 0;
            k = 0;
            //Ordenando los arreglos
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            //arreglo final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                j++;
                i++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                k++;
                i++;
            }

        }//fin if
        return arreglo;
    }

    public static int[] mezclaNatural(int[] arreglo) {
        int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
        boolean ordenado = false;
        do {
            ordenado = true;
            izquierda = 0;
            while (izquierda < derecha) {
                izq = izquierda;
                while (izq < derecha && arreglo[izq] <= arreglo[izq + 1]) {
                    izq++;
                }
                der = izq + 1;
                while (der == derecha - 1 || der < derecha && arreglo[der] <= arreglo[der + 1]) {
                    der++;
                }
                if (der <= derecha) {
                    mezcladirecta(arreglo);
                    ordenado = false;
                }
                izquierda = izq;
            }
        } while (!ordenado);
        return arreglo;
    }

    public static void desarregladoVec(int a[], int b[], int c[]) {

    }

    public static void crearVectores(int vec1[], int vec2[], int vec3[]) {
        Random rnd = new Random();
        a = new int[vec1.length];
        b = new int[vec2.length];
        c = new int[vec3.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100) + 1;
            vec1[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = rnd.nextInt(100) + 1;
            vec2[i] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = rnd.nextInt(100) + 1;
            vec3[i] = c[i];
        }
    }

    public static void imprimirVectores() {
        JOptionPane.showMessageDialog(null, "Vectores desordenados");
        JOptionPane.showMessageDialog(null, "Vector 1");
        JOptionPane.showMessageDialog(null, Arrays.toString(a) + " ");
        JOptionPane.showMessageDialog(null, "Vector 2");
        JOptionPane.showMessageDialog(null, Arrays.toString(b) + " ");
        JOptionPane.showMessageDialog(null, "Vector 3");
        JOptionPane.showMessageDialog(null, Arrays.toString(c) + " ");

    }
}
