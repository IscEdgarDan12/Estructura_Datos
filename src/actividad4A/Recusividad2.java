/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4A;

/**
 *
 * @author DanKuzo
 */
public class Recusividad2 {

    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return 1 + suma(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int a = 4, b = 7;
        System.out.println("los valores son: " + suma(a, b));
    }

}
