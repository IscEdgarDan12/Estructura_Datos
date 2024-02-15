package uniadad3;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class PilaConDialogos {
    int pila[] = new int[10];
    int tope = -1;
    boolean band = false;
    int dato = 0;
    public static void main(String[] args) {
        PilaConDialogos p = new PilaConDialogos();
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar?"
                    + "\n 1.- Agregar Dato"
                    + "\n 2.- Quitar Dato"
                    + "\n 3.- Imprimir Datos"
                    + "\n 4.- Salir"));
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
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
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
            JOptionPane.showMessageDialog(null, "Desbordamiento");
        } else {
            dato= Integer.parseInt(JOptionPane.showInputDialog("ingresa un dato"));
            JOptionPane.showMessageDialog(null,"Dato ingresado correctamente");
            tope = tope + 1;
            pila[tope] = dato;
        }
    }
    public void quita() {
        if (pila_vacia()) {
            JOptionPane.showMessageDialog(null, "Subdesbordamiento Pila Vacia");
        } else {
            dato = pila[tope];
            pila[tope] = 00;
            tope = tope - 1;
            JOptionPane.showMessageDialog(null, "Dato sacado "+dato);
        }
    }
    public void imprimirPila() {
        if (pila_vacia()) {
            JOptionPane.showMessageDialog(null, "No hay datos que mostrar");
        } else {
            JOptionPane.showMessageDialog(null, Arrays.toString(pila));
        }
    }
}