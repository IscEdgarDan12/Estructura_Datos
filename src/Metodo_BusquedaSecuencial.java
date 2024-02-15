import java.util.Scanner;
/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Metodo_BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int dato;
        boolean indicador=false;
        int arreglo[]={5,6,8,7,9};
        
        System.out.println("Inserte el dato a buscar");
        dato=leer.nextInt();
        int i=0;
        while(i<arreglo.length && !indicador){
            if (arreglo[i]==dato) {
                indicador=true;
            }
            i++;
        }
        
        if (indicador) {
            System.out.println("El dato: "+dato+" Se encuentra em la "
                    + "posicion: "+(i-1));
        }else{
            System.out.println("Dato: "+dato+" no encontrado");
        }
    }
}
