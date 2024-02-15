/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4A;

import java.util.Scanner;

/**
 *
 * @author DanKuzo
 */
public class Fibonacci {

    public static int fibo(int y) {
        if (y == 0 || y == 1) {
            return 1;//vuelta 1 y 2 =1
        } else {
            return fibo(y-1)+fibo(y-2);//vuelta 3 en adelante !=1
        }
    }
//8
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int y=0;
        System.out.println("hasta que reango quieres el ciclo");
        int x= leer.nextInt();//x=8
        while (y!=x) {            
            System.out.print("La secuecia fibonacci es: "+fibo(y)+" \n");
            y++;
        }
    }

}
