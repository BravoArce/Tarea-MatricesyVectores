/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresymatrices;

/**
 *
 * @author bravo
 */
import java.util.Scanner;

public class VectoresyMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int fil = 0; fil < 3; fil++) {  // fila
            for (int col = 0; col < 3; col++) {  // columna
                matriz[fil][col] = (int) (Math.random() * 98);
                System.out.print(matriz[fil][col] + "  ");
            }
            System.out.println("");
        }
        
        int suma = 0;
        for (int fil = 0; fil < 3; fil++) {
            suma += matriz[fil][fil];
        }
        System.out.println("El total de la diagonal principal es: " + suma);

        int suma2 = 0;
        for (int fil = 0; fil < 3; fil++) {
            for (int col = 0; col < 3; col++) {

                if (fil + col == 3 - 1) {
                    suma2 += matriz[fil][col];
                }
            }
        }
        System.out.println("El total de la diagonal secundaria es: " + suma2);
    }

   /* public static void matriz1() {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        for (int f = 0; f < 2; f++) // filas
        {
            for (int c = 0; c < 2; c++) // columnas
            {
                System.out.println("Ingrese un valor:");
                matriz[f][c] = leer.nextInt();
            }
            System.out.println("");
        }
        System.out.println("***************");
        System.out.println("");
        matriz[1][2] = 5;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public static void Arreglos() {
        Scanner leer = new Scanner(System.in);
        int n;

        String[] nombres = new String[5];
        nombres[0] = "Susana";
        nombres[1] = "Karla";
        nombres[2] = "Marco";
        nombres[3] = "Pedro";
        nombres[4] = "Sergio";

        int[] edad = new int[]{20, 12, 36, 54, 45};

        /*
        System.out.println(edad[2]);
        System.out.println(nombres.length);
         
        while (true) {
            System.out.println("Digite el tamaño del arreglo");
            n = leer.nextInt();
            int[] salario = new int[n];

            for (int i = 0; i < salario.length; i++) {
                System.out.print(salario[i]);
            }

            System.out.println(salario[0]);
            salario[0] = 5;
            System.out.print(salario[0]);
        }
    }*/
}
