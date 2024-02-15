package uniadad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Menu_lista_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc1, opc2;
        boolean existe = false;
        int crear, dato, nuevo, buscar,tamaxo;
        List<Integer> Numeros = null;
        System.out.println("Bienvenido al menu que es lo que desaea realizar");
        do {

            System.out.println("1.- Creear lista");
            System.out.println("2.- Insertar un nodo al inicio de la lista");
            System.out.println("3.- Insertar un nodo al final de la lista");
            System.out.println("4.- Insertar un nodo antes que otro cuya informacion es X");
            System.out.println("5.- Insertar un nodo despues que otro cuya informacion es X");
            System.out.println("6.- Eliminar un nodo (Se desplegara otro menu)");
            System.out.println("7.- Buscar un elemento");
            System.out.println("8.- imprimir lista");
            System.out.println("9.- Salir");

            opc1 = leer.nextInt();
            switch (opc1) {
                case 1:
                    Numeros = new ArrayList<>();
                    System.out.println("Lista creada");
                    do {
                        System.out.println("¿Desea agregar algun dato? 1.-Si 2.- No");
                        crear = leer.nextInt();
                        if (crear == 1) {
                            System.out.println("Ingrese dato que quiere agregar");
                            dato = leer.nextInt();
                            Numeros.add(dato);
                        } else {
                            System.out.println("Regresando al menu... \n");
                        }
                    } while (crear != 2);

                    existe = true;
                    break;
                case 2:
                    if (existe) {
                        System.out.println("ingrese el dato que desa poner al inicio de la lista");
                        dato = leer.nextInt();
                        Numeros.set(0, dato);
                    } else {
                        System.out.println("No hay listas");
                    }
                    break;

                case 3:
                    if (existe) {
                        System.out.println("ingrese el dato que desa poner al final de la lista");
                        dato = leer.nextInt();
                        if ((Numeros.size() - 1) <= 0) {
                            Numeros.set(0, dato);
                        } else {
                            Numeros.set(Numeros.size() - 1, dato);
                        }
                    } else {
                        System.out.println("No Existe Listas \n");

                    }
                    break;
                case 4:
                    if (existe) {
                        System.out.println("ingresa el dato a buscar para insertar un nodo antes");
                        buscar = leer.nextInt();
                        if (Numeros.indexOf(buscar) != -1) {
                            System.out.println("que elemento quiere agregar");
                            nuevo = leer.nextInt();
                            Numeros.add(Numeros.indexOf(buscar), nuevo);
                        } else {
                            System.out.println("Dato no encontrado \n");
                        }
                    } else {
                        System.out.println("No Existe Listas \n");

                    }
                    break;

                case 5:
                    if (existe) {
                        System.out.println("ingresa el dato a buscar para insertar un nodo despues");
                        buscar = leer.nextInt();
                        if (Numeros.indexOf(buscar) != -1) {
                            System.out.println("que elemento quiere agregar");
                            nuevo = leer.nextInt();
                            Numeros.add(Numeros.indexOf(buscar) + 1, nuevo);
                        } else {
                            System.out.println("Dato no encontrado \n");
                        }
                    } else {
                        System.out.println("No Existe Listas \n");

                    }
                    break;
                case 6:
                    if (existe) {
                        do {

                            System.out.println("    1.- Eliminar el primer nodo\n"
                                    + "    2.- Eliminar el Ultimo nodo\n"
                                    + "    3.- Elimonar un nodo con informacion X\n"
                                    + "    4.- Elimnar el nodo anterir con informacion X\n"
                                    + "    5.- Eliminar e nodo posterior al nodo con informacion x\n"
                                    + "    6.- Imprimir lista\n"
                                    + "    7.- Regresar \n");
                            opc2 = leer.nextInt();
                            switch (opc2) {
                                case 1:
                                    dato = Numeros.get(0);
                                    System.out.println("Elemento a borrar " + dato);
                                    Numeros.remove(0);
                                    System.out.println("Elemento borrado");
                                    break;

                                case 2:
                                    dato = Numeros.get(Numeros.size() - 1);
                                    System.out.println("Elemento a borrar " + dato);
                                    Numeros.remove(Numeros.size() - 1);
                                    System.out.println("Elemento borrado");
                                    break;

                                case 3:
                                    System.out.println("Elemento a eliminar");
                                    buscar = leer.nextInt();
                                    if (Numeros.indexOf(buscar) != -1) {
                                        Numeros.remove(buscar);
                                        System.out.println("El elemento: " + buscar + " a sido eliminado1");
                                    } else {
                                        System.out.println("Dato no encontrado \n");
                                    }
                                    break;

                                case 4:
                                    System.out.println("ingresa el elemento a buscar para eliminar un nodo antes");
                                    buscar = leer.nextInt();
                                    if (Numeros.indexOf(buscar) != -1 && Numeros.indexOf(buscar) != 0) {
                                        dato = Numeros.get(Numeros.indexOf(buscar) - 1);
                                        Numeros.remove(Numeros.indexOf(buscar) - 1);
                                        System.out.println("El elemento: " + dato + " A sido eliminado\n");
                                    } else {
                                        System.out.println("Dato no encontrado \n");
                                    }
                                    break;

                                case 5:
                                    System.out.println("ingresa el elemento a buscar para eliminar un nodo antes");
                                    buscar = leer.nextInt();
                                    if (Numeros.indexOf(buscar) != -1 &&(Numeros.indexOf(buscar)+1)!=Numeros.size()) {
                                        dato = Numeros.get(Numeros.indexOf(buscar)+1);
                                        Numeros.remove(Numeros.indexOf(buscar)+1);
                                        System.out.println("El elemento: " + dato + " A sido eliminado\n");
                                    } else {
                                        System.out.println("Dato no encontrado \n");
                                    }
                                    break;

                                case 6:
                                    for (int i = 0; i < Numeros.size(); i++) {
                                        System.out.println("numero: " + Numeros.get(i) + " Posicion: " + i);
                                    }
                                    System.out.println();
                                    break;

                                case 7:
                                    System.out.println("Regresando\n");
                                    break;

                            }
                        } while (opc2 != 7);

                    } else {
                        System.out.println("No Existe Listas");
                    }
                    break;
                case 7:
                    if (existe) {
                        System.out.println("Elemento que desea buscar");
                        buscar = leer.nextInt();
                        Numeros.contains(buscar);
                        if (Numeros.indexOf(buscar) != -1) {
                            System.out.println("numero encontrado:" + Numeros.get(Numeros.indexOf(buscar)) + " Posicion: " + Numeros.indexOf(buscar) + "\n");
                        } else {
                            System.out.println("Dato no encontrado \n");
                        }
                    } else {
                        System.out.println("No Existe Listas \n");

                    }
                    break;
                case 8:
                    if (existe) {
                        for (int i = 0; i < Numeros.size(); i++) {
                            System.out.println("numero: " + Numeros.get(i) + " Posicion: " + i);
                        }
                    } else {
                        System.out.println("No Existe Listas \n");

                    }
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida \n");
                    break;
            }
        } while (opc1 != 9);
    }
}