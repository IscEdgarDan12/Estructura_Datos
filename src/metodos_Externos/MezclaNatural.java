package metodos_Externos;

import java.util.Random;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class MezclaNatural {

    public int [] mezclaNatural(int[] arreglo) {
        int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
        boolean ordenado = false;
        MezclaDirecta mezclar = new MezclaDirecta();
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
                    mezclar.mezcladirecta(arreglo);
                    ordenado = false;
                }
                izquierda = izq;
            }
        } while (!ordenado);
        return arreglo;
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        MezclaNatural metodo3 =new MezclaNatural();
        int vector3[] = new int[10];
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = rnd.nextInt(10)+1;
        }
        System.out.println("Vector desordenado");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i]+" ");
        }
        System.out.println();
        System.out.println("Vector ordenado");
        for (int i = 0; i < metodo3.mezclaNatural(vector3).length; i++) {
            System.out.print(metodo3.mezclaNatural(vector3)[i]+" ");
        }
    }
}
