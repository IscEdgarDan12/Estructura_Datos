package uniadad3;
import java.util.Scanner;
/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Nombre_Alrevez {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre;
        System.out.println("Dame el nombre para invertirlo");
        nombre=leer.nextLine();
        cambiarNombre(nombre);
    }
    static void cambiarNombre(String nombre){
        int numero= nombre.length();
        char cambio[];
        cambio = new char [numero];
        for (int i = 0; i < cambio.length; i++) {
            cambio[i]=nombre.charAt(i);
        }
        for (int i = nombre.length()-1; i >= 0; i--) {
            System.out.print(cambio[i]);
        }   
    }
}
