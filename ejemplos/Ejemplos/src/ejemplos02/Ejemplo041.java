/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        //
        int resultado;
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                resultado = obtenerMultiplicacion(arreglo1[f][c], arreglo2[f][c]);
                arreglo3[f][c] = resultado;
            }
        }
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                System.out.printf("%d\t", arreglo1[f][c]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        for (int f = 0; f < arreglo2.length; f++) {
            for (int c = 0; c < arreglo2[f].length; c++) {
                System.out.printf("%d\t", arreglo2[f][c]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        for (int f = 0; f < arreglo3.length; f++) {
            for (int c = 0; c < arreglo3[f].length; c++) {
                System.out.printf("%d\t", arreglo3[f][c]);
            }
            System.out.println("\n");
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int suma;
        suma = a * b;
        return suma;

    }

}
