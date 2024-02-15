/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniadad3;

import java.util.Scanner;

/**
 *
 * @author DanKuzo
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    Scanner leer = new Scanner(System.in);
    boolean BAND = false;
    String COLA[] = new String[5];
    int FINAL = -1, FRENTE = -1, MAX = 5;
    String DATO = " ";
    boolean cont = true;

    public void Imprime() {
        if (FRENTE == 0) {
            System.out.println("La cola esta vacia");
            for (int i = 0; i < MAX; i++) {
                System.out.println("Posicion [" + i + "]= " + COLA[i]);
            }
        } else {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Posicion [" + i + "]= " + COLA[i]);
            }
        }
    }

    public void Inserta_Cola() {
        //(3<(5-1)&&true)
        //0,1,2,3,4
        if (FINAL < MAX - 1 && cont) {
            System.out.println("Inserte un dato");
            DATO = leer.next();
            FINAL++;//0
            COLA[FINAL] = DATO;
            //2==5
            if (FINAL == MAX - 1) {
                System.out.println("Entra aqui");
                FRENTE = -1;
                cont = false;
            }
        } else {
            System.out.println("Desbordamiento - Cola llena");
        }
    }

    public void Elimina_Cola() {
        if (FRENTE == 0 || FRENTE <= FINAL) {
            FRENTE++;
            DATO = COLA[FRENTE];
            System.out.println("El elemento que sale es: " + DATO);
            DATO = COLA[FRENTE] = " ";
            if (FRENTE == FINAL) {
                FRENTE = -1;
                FINAL = -1;

            }
            System.out.println("Valor de Frente" + FRENTE);
            System.out.println("Valor de final" + FINAL);
        } else {
            System.out.println("Subdesbordamiento - Cola vacia");
        }
    }

    public static void main(String[] args) {
        Colas c = new Colas();
        int opc;

        do {

            System.out.println("Que es lo que desea hacer:");
            System.out.println("1.- insertar un nombre");
            System.out.println("2.- Eliminar un nombre");
            System.out.println("3.- Imprimir");
            System.out.println("4.- Salir");
            opc = c.leer.nextInt();
            switch (opc) {
                case 1:
                    c.Inserta_Cola();
                    break;
                case 2:
                    c.Elimina_Cola();
                    break;
                case 3:
                    c.Imprime();
                    break;
                default:
                    if (opc != 4) {
                        System.out.println("Error opcion invalida");
                    } else {
                        System.out.println("Saliendo");
                    }
                    break;
            }
        } while (opc != 4);

    }
}
