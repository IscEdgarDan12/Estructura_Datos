package uniadad3;

import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class pila {

    int pila[] = new int[10];
    int tope = -1;
    boolean band = false;
    Scanner entrada = new Scanner(System.in);
    int dato = 0;

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        pila p = new pila();
        int opc = 0;
        System.out.println("Menu\n seleccione la opcion deceada");
        do {
            System.out.println("1.- Poner un Dato");
            System.out.println("2.- Quitar el ultimo Dato");
            System.out.println("3.- Imprimir Datos");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opcion");
            opc = entrada.nextByte();
            switch (opc) {
                case 1:
                    p.pone();
                    break;
                case 2:
                    p.quita();
                    break;
                case 3:
                    p.imprimirPila();
                    break;
                case 4:
                    System.out.print("Salienedo");
                    break;
                default:
                    System.out.println("Opcion invalida intente de nuevo");
            }
        } while (opc != 4);
    }

    public boolean pila_llena() {
        if (tope == pila.length - 1) {
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

    public void pone() {
        if (pila_llena()) {
            System.out.println("Desbordamiento ");
        } else {
            System.out.println("Ingresa un dato");
            dato = entrada.nextInt();
            System.out.println("dato agregado exitosamente");
            tope = tope + 1;
            pila[tope] = dato;
        }
    }

    public void quita() {

        if (pila_vacia()) {
            System.out.println("Subdesbordamiento");
        } else {
            dato = pila[tope];
            pila[tope] = 00;
            tope = tope - 1;
            System.out.println("elemento que salio: " + dato);
        }
    }

    public void imprimirPila() {
        int j = 0;
        if (pila_vacia()) {
            System.out.println("No hay datos que mostrar");
        } else {
            for (int i = 0; i < pila.length; i++) {
                if (pila[i] > 0) {
                    System.out.println("Posicion " + (i + 1) + ": " + pila[i]);
                    j++;
                }
            }
            System.out.println("Espcios disponibles: " + (pila.length - j));
        }
    }
}
