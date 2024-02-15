package uniadad3;
import java.util.Scanner;
/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Nombre_Alrevez_Pila {
    /**
     * @param args the command line arguments
     */
    int tope = -1;
    boolean band = false;
    char cambio[];
    char dato = 0;
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Nombre_Alrevez_Pila nom = new Nombre_Alrevez_Pila();
        String nombre2;
        System.out.println("Dame el nombre alrevez ");
        nombre2 = leer.nextLine();
        nom.cambiarNombre(nombre2);
        System.out.println("imprimiendo el nombre alrevez");
        nom.imprimir(nombre2);
        System.out.println("Quitando");
        nom.quita();
        nom.imprimir(nombre2);
        System.out.println("Poniendo");
        nom.pone();
        System.out.println("Resultado final");
        nom.imprimir(nombre2);
    }
    public boolean pila_llena() {
        if (tope == cambio.length - 1) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }
    public boolean pila_vacia() {
        if (tope == -1) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }
    public void quita() {
        if (pila_vacia()) {
            System.out.println("Subdesbordamiento");
        } else {
            dato = cambio[tope];
            cambio[tope] = ' ';
            tope = tope - 1;
            System.out.println("Elemento que se elimino: " + dato);
        }
    }
    public void pone() {
        if (pila_llena()) {
            System.out.println("Desbordamiento");
        } else {
            System.out.println("Ingresa una letra");
            String letra = leer.nextLine();
            dato = letra.charAt(0);
            System.out.println("Dato agregado exitosamente");
            tope = tope + 1;
            cambio[tope] = dato;
        }
    }
    void cambiarNombre(String nombre) {
        int numero = nombre.length();
        cambio = new char[numero];
        for (int i = 0; i < cambio.length; i++) {
            cambio[i] = nombre.charAt(i);
        }
        tope = cambio.length - 1;
    }
    void imprimir(String nombre) {
        for (int i = nombre.length() - 1; i >= 0; i--) {
            System.out.print("  " + cambio[i]+" ");
        }
        System.out.println();
    }

}
