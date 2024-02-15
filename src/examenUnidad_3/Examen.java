package examenUnidad_3;

import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Examen{

    class nodo {

        int inf;
        nodo ligaIzq;
        nodo ligaDer;
    }
    nodo uno = new nodo();
    nodo dos = new nodo();
    nodo tres = new nodo();
    nodo cuatro = new nodo();
    nodo cinco = new nodo();
    int dato;
    boolean existe = false;
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Examen ExamenLista = new Examen();
        int i = 0;
        int opc;
        System.out.println("Bienvenido (a) al menú");
        do {
            System.out.println("1.- Crear lista");
            System.out.println("2.- Insertar Datos");
            System.out.println("3.- Eliminar negativos");
            System.out.println("4.- Imprimir");
            System.out.println("5.- Salir");
            System.out.println("¿Que opcion desea escoger?");
            opc = ExamenLista.leer.nextInt();
            switch (opc) {
                case 1:
                    ExamenLista.creaLista();
                    i++;
                    break;
                case 2:
                    ExamenLista.inserta();
                    i++;
                    break;
                case 3:
                    ExamenLista.eliminarNegativos(i);
                    break;
                case 4:
                    ExamenLista.imprimir();
                    break;
                default:
                    if (opc == 5) {
                        System.out.println("Saliendo...");
                    } else {
                        System.out.println("Opcion invalida");

                    }
                    break;
            }
        } while (opc != 5);
    }

    public void creaLista() {
        System.out.println("inserte el primer valor de la lista");
        int valor = leer.nextInt();
        uno.inf = valor;
        uno.ligaIzq = null;
        uno.ligaDer = null;
        dos = uno;
    }

    public void inserta() {
        if (!existe) {
            System.out.println("La lista esta vacia");
        } else {
            existe = true;
            nodo nuevo = new nodo();
            System.out.println("inserte un dato");
            dato = leer.nextInt();
            nuevo.inf = dato;
            nuevo.ligaDer = uno;
            uno.ligaIzq = nuevo;
            nuevo.ligaIzq = null;
            uno = nuevo;
        }
        System.out.println("Dato insertado correctamente");
        System.out.println();
    }

    public void eliminarNegativos(int contador) {
        if (!existe) {
            System.out.println("La lista esta vacia");
        } else {
            for (int i = 0; i < contador; i++) {

                tres = uno;
                while (tres.ligaDer != null && tres.inf >= 0) {
                    tres = tres.ligaDer;
                }
                if (tres.inf <= 0) {
                    if (tres == uno && tres == dos) {
                        uno = null;
                        dos = null;
                    } else if (tres == uno) {
                        uno = tres.ligaDer;
                        uno.ligaIzq = null;
                    } else if (tres == dos) {
                        dos = tres.ligaIzq;
                        dos.ligaDer = null;
                    } else {
                        cinco = tres.ligaIzq;
                        cuatro = tres.ligaDer;
                        cinco.ligaDer = cuatro;
                        cuatro.ligaIzq = cinco;

                    }
                } else {
                    System.out.println("No se encontro elementos enegativos");
                    break;
                }
            }
        }
    }

    public void imprimir() {
        nodo nuevo = new nodo();
        if (uno == null) {
            System.out.println("No hay valores en la lista para imprimir");
        } else {
            nuevo = uno;
            do {
                System.out.print("Valor: " + nuevo.inf);
                System.out.println();
                nuevo = nuevo.ligaDer;
            } while (nuevo != null);
        }
    }
}
