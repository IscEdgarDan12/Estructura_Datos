package uniadad3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ListaArely {

    static class Nodo {

        String INFO;
        Nodo LIGA;
    }

    public static void main(String[] args) {
        Nodo P = new Nodo();
        Nodo Q = new Nodo();
        Nodo T = new Nodo();
        String DATO = null;
        Scanner leer = new Scanner(System.in);
        ListaArely lis = new ListaArely();
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU  DE LISTA SIMPLE"
                    + "\n1: Crear lista"
                    + "\n2: Insertar un nodo al Inicio de la lista"
                    + "\n3: Inserta un nodo al final de la lista"
                    + "\n4: Inserta un nodo antes que otro cuya informacion es X"
                    + "\n5: Inserta un nodo despues que otro cuya informacion es X"
                    + "\n6: Eliminar nodo"
                    + "\n7: Buscar un elemento"
                    + "\n8: Imprimir la lista"
                    + "\n9: Salir"));
            switch (opc) {
                case 1: {
                    Scanner entrada = new Scanner(System.in);
                    ListaArely lis2 = new ListaArely();
                    int op = 0;
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1: Crea Inicio   \n2: Crea Final"));
                    switch (op) {
                        case 1: {
                            int res;
                            P.INFO = JOptionPane.showInputDialog(null, "Ingresa un nombre: ");
                            P.LIGA = null;
                            res = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea escribir otro nodo en la lista? \n1:Si \n2:No): "));
                            while (res == 1) {
                                Q.INFO = JOptionPane.showInputDialog(null, "Ingresa un nombre: ");
                                Q.LIGA = P;
                                P = Q;
                                res = Integer.parseInt(JOptionPane.showInputDialog("¿Desea escribir otro nodo en la lista? \n1=Si \n2=No): "));
                            }
                        }
                        break;
                        case 2: {
                            int res;
                            P.INFO = JOptionPane.showInputDialog(null, "Ingresa un nombre: ");
                            P.LIGA = null;
                            T = P;
                            res = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea escribir otro nodo en la lista? (\n1:Si \n2:No): "));
                            while (res == 1) {
                                Q.INFO = JOptionPane.showInputDialog("Escribe un nombre: ");
                                Q.LIGA = null;
                                T.LIGA = Q;
                                T = Q;
                                res = Integer.parseInt(JOptionPane.showInputDialog("¿Desea escribir otro nodo en la lista? (\n: Si \n2 No): "));
                            }
                        }
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "opcion incorrecta, Seleccione Nuevamnete");
                    }
                }
                break;
                case 2: {
                    lis.InsertarNodo_Inicio(DATO, P);
                }
                break;
                case 3: {
                    lis.InsertaNodo_Final(P, DATO);
                }
                break;
                case 4: {
                    lis.InsertaNodo_Antes();
                }
                break;
                case 5: {
                    lis.InsertaNodo_Despues();
                }
                break;
                case 6: {
                    lis.Eliminar_Nodo();
                    int o = 0;
                    int op = 0;
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU: ELIMINACION DE NODOS"
                                + "\n1) Eliminar el primer nodo"
                                + "\n2) Eliminar el último nodo"
                                + "\n3) Eliminar un nodo con informacion X"
                                + "\n4) Eliminar el nodo anterior al nodo con informacion X"
                                + "\n5) Eliminar el nodo posterior al nodo con informacion x"
                                + "\n6)Imprimir lista"
                                + "\n7)Regresar al menú principal"));
                        switch (op) {
                            case 1: {
                                lis.Eliminar_primerNodo();
                            }
                            break;
                            case 2: {
                                lis.Eliminar_ultimoNodo();
                            }
                            break;
                            case 3: {
                                lis.Eliminar_InformacionX();
                            }
                            break;
                            case 4: {
                                lis.Eliminar_AnteriorInformacionX();
                            }
                            break;
                            case 5: {
                                lis.Eliminar_PosteriorInformacionX();
                            }
                            break;
                            case 6: {
                                lis.Imprimir_Lista();
                            }
                            break;
                            case 7: {
                                JOptionPane.showMessageDialog(null, "Regresar Al Menú Principal");
                            }
                            break;
                            default: {
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta, Seleccione Nuevamente");
                            }
                        }
                    } while (op != 7);
                }
                break;
                case 7: {
                    lis.Buscar_Elemneto();
                }
                break;
                case 8: {
                    lis.Imprimir_LISTA(P);
                }
                break;
                case 9: {
                    JOptionPane.showMessageDialog(null, "Saliendo........");
                }
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, Seleccione nuevamente ");
            }// fin switch

        } while (opc != 9);
    }// 

    public void InsertarNodo_Inicio(String DATO, Nodo P) {
        Nodo Q = new Nodo();
        DATO = JOptionPane.showInputDialog(null, "Agrege un Nodo al inicio: ");
        Q.INFO = DATO;
        Q.LIGA = P;
        P = Q;
    }

    public void InsertaNodo_Final(Nodo P, String DATO) {
        Nodo T = P;
        while (T.LIGA != null) {
            T = T.LIGA;
        }
        Nodo Q = new Nodo();
        Q.INFO = DATO;
        Q.LIGA = null;
        T.LIGA = Q;
    }

    public void InsertaNodo_Antes() {
    }

    public void InsertaNodo_Despues() {
    }

    public void Eliminar_Nodo() {
    }

    public void Eliminar_primerNodo() {
    }

    public void Eliminar_ultimoNodo() {
    }

    public void Eliminar_InformacionX() {
    }

    public void Eliminar_AnteriorInformacionX() {
    }

    public void Eliminar_PosteriorInformacionX() {
    }

    public void Imprimir_Lista() {
    }

    public void Buscar_Elemneto() {
    }

    public void Imprimir_LISTA(Nodo P) {
        System.out.println("\nLa lista es: ");
        Nodo Q = new Nodo();
        Q = P;
        while (Q != null) {
            System.out.print("[" + Q.INFO + "]-->");
            Q = Q.LIGA;
        }
    }

}
