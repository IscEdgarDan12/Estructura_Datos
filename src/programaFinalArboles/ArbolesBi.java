package programaFinalArboles;

import javax.swing.JOptionPane;

/**
 *
 * @author DanKuzo
 */
public class ArbolesBi {

    Nodo raiz;

    public ArbolesBi() {
        raiz = null;
    }

    public void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null) {
                anterior = reco;
                if (info < reco.info) {
                    reco = reco.izq;
                } else {
                    reco = reco.der;

                }
            }
            if (info < anterior.info) {
                anterior.izq = nuevo;

            } else {
                anterior.der = nuevo;
            }
        }
    }

    private void imprimirPre(Nodo reco) {
        if (reco != null) {
            JOptionPane.showMessageDialog(null, " " + reco.info + " ");
            imprimirPre(reco.izq);
            imprimirPre(reco.der);
        }
    }

    public void imprimirPre() {
        imprimirPre(raiz);

    }

    private void imprimirIn(Nodo reco) {
        if (reco != null) {
            imprimirIn(reco.izq);
            JOptionPane.showMessageDialog(null, " " + reco.info + " ");
            imprimirIn(reco.der);
        }
    }

    public void imprimirIn() {
        imprimirIn(raiz);
    }

    private void imprimirPos(Nodo reco) {
        if (reco != null) {
            imprimirPos(reco.izq);
            imprimirPos(reco.der);
            JOptionPane.showMessageDialog(null, " " + reco.info + " ");

        }
    }
    public void imprimirPos(){
        imprimirPos(raiz);
    }
}

class Nodo {

    int info;
    Nodo izq, der;
}
