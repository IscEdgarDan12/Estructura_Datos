package programaFinalArboles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Bustos Vega Edgar Danie
 */
public class Arboles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        int agregar;
        ArbolesBi arbol = new ArbolesBi();
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menu"
                    + "\n ¿Que desea realizar?"
                    + "\n 1.- Insertar nodo"
                    + "\n 2.- Imprimir recorrido Preorden"
                    + "\n 3.- Imprimir recorrido Inorden"
                    + "\n 4.- Imprimir recorrido Posorden"
                    + "\n 5.- Salir"));
            switch (opc) {
                case 1:
                    int otro;
                    JOptionPane.showMessageDialog(null, "Insertando Nodos");
                    do {
                        arbol.insertar(agregar = Integer.parseInt(JOptionPane.showInputDialog("Agrege un valor")));
                        otro = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar otro valor"
                                + "\n 1.- Si"
                                + "\n 2.- No"));
                    } while (otro != 2);

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Imprimir recorrido Preorden");
                    arbol.imprimirPre();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Imprimir recorrido Inorden");

                    arbol.imprimirIn();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Imprimir recorrido Posorden");
                    arbol.imprimirPos();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
            }
        } while (opc != 5);

    }

}
