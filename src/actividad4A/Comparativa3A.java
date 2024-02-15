package actividad4A;

import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Comparativa3A {

    static int size = 40;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombres = new String[size];
        nombres = llenadoNombre(nombres);
        imprimeNombres(nombres);
        ordenarNombres(nombres);
        OrdenaNombreSeñal(nombres);
    }

    public static String[] llenadoNombre(String[] nombres) {
        System.out.println("Dame los " + size + " nombres sin espacios");
        long iniciaTiempo = System.nanoTime();

        for (int i = 0; i < nombres.length; i++) {
            System.out.print((1 + i) + ".- Nombre: ");
            nombres[i] = leer.next();
            System.out.println();
        }
        System.out.println("Nombres llenos");
        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1e+6;
        System.out.println("\n Total de tiempo: " + diferencia + "segundos");

        return nombres;
    }

    public static void imprimeNombres(String[] nombre) {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i] + " ");

        }
    }

    public static void ordenarNombres(String nombres[]) {
        long iniciaTiempo = System.nanoTime();
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length - 1; j++) {
                String PrimerNombre = nombres[j];
                String SegundoNombre = nombres[j + 1];
                if (PrimerNombre.compareToIgnoreCase(SegundoNombre) > 0) {
                    nombres[j] = SegundoNombre;
                    nombres[j + 1] = PrimerNombre;
                }
            }
        }
        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1e+6;

        System.out.print("\n EL ARREGLO SE ORDENO CON METODO BURBUJA : ");
        for (int I = 0; I < nombres.length; I++) {
            System.out.print(nombres[I] + "      ");
        }
        System.out.println("\n Ordenamiento por Metodo Burbuja: " + diferencia + "segundos");

    }

    public static void OrdenaNombreSeñal(String[] nombres) {
        int i = 0;
        boolean band = false;
        long iniciaTiempo = System.nanoTime();
        while (i < nombres.length - 1 && band == false) {
            band = true;
            for (int j = 0; j < nombres.length - 1; j++) {
                String PrimerNombre = nombres[j];
                String SegundoNombre = nombres[j + 1];
                if (PrimerNombre.compareToIgnoreCase(SegundoNombre) > 0) {
                    nombres[j] = SegundoNombre;
                    nombres[j + 1] = PrimerNombre;
                    band = false;
                }
            }
            i = i + 1;
        }
        long finTiempo = System.nanoTime();
        double diferencia = (double) (finTiempo - iniciaTiempo) * 1e+6;

        System.out.print("\n EL ARREGLO ORDENADO CON METODO BURBUJA CON SEÑAL ES: ");
        for (int I = 0; I < nombres.length; I++) {
            System.out.print(nombres[I] + "      ");
        }
        System.out.println("\n Ordenamiento por Metodo Burbuja con señal dura:   " + diferencia + "segundos");

    }

}
