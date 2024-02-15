/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4A;

import java.util.Scanner;

/**
 *
 * @author Bustos Vega Edgar Daniel
 */
public class Recursividad {

     int factorial(int x) {

        if (x != 0) {
            x = x * factorial((x - 1));
            return x;

        } else {
            System.out.println("entro");
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el numero que quieres su factorial");
        int x = leer.nextInt();
        Recursividad recu = new Recursividad();
        System.out.println("El valor de factorial es: " + recu.factorial(x));
//        int aprovado = 0, reporvado = 0, calificacion;
//        Scanner leer = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            calificacion= leer.nextInt();
//            if (calificacion > 69) {
//                aprovado++;
//            } else {
//                reporvado++;
//            }
//
//        }
//        System.out.println("Aprovaron: " + aprovado);
//        System.out.println("Reprovados: " + reporvado);
//
//    }

    }
}
