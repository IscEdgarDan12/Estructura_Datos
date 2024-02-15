package metodos_Externos;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class MezclaDirecta {

    public int[] mezcladirecta(int[] arreglo) {
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

    public static void main(String[] args) {
        MezclaDirecta metodo2 = new MezclaDirecta();
        Random rnd = new Random();
        int vector3[] = new int[10];
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = rnd.nextInt(10)+1;
        }
        System.out.println("vector desordenado");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println();
        metodo2.mezcladirecta(vector3);
        System.out.println("Vector ordenado con mezcla directa");
        for (int i = 0; i < metodo2.mezcladirecta(vector3).length;i++) {
            System.out.print(metodo2.mezcladirecta(vector3)[i]+" ");
        }
        
    }
}
