package metodos_Ordenamiento;
import java.util.Random;
/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Burbuja_Senal {

    public static void main(String[] args) {
        int a[] = new int[20];
        int aux;
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100 + 1);
        }
        System.out.println("Arreglo desordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int i = 0;
        boolean BAND = false;
        while ((i <= a.length - 1) && BAND == false) {
            BAND = true;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                    BAND = false;
                }
            }
        }
        System.out.println("Arreglo ordenado");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
    }
}
