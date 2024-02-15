/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4A;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DanKuzo
 */
public class Chef {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Ingresa los valores");
                matriz[x][y] = leer.nextInt();
            }
            System.out.println();
        }
        impNeg(matriz);
        impPos(matriz);
    }

    public static void impNeg(int matriz[][]) {
        int neg = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (matriz[x][y] < 0) {
                    System.out.print(matriz[x][y] + " ");
                    neg++;
                }
            }
        }
        System.out.println();
        System.out.println("los negativos son: " + neg);
    }

    public static void impPos(int matriz[][]) {
        int pos = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (matriz[x][y] >= 0) {
                    System.out.print(matriz[x][y] + " ");
                    pos++;
                }
            }

        }
        System.out.println();
        System.out.println("los positivos son: " + pos + " ");
    }
}
