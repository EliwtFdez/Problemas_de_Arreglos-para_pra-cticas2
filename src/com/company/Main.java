/*
2.-) Se tiene un Arreglo de “N” posiciones que almacenará datos enteros positivos (pares e impares)
     y se desea hacer lo siguiente:
                     Cambiar los números impares de positivo a negativo.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int [] ArrayDataPositive = new int[5];

        for (int i = 0; i <5 ; i++)
        {
            System.out.println("ingrese los numeros: ");
            ArrayDataPositive[i] = teclado.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println("========== Arreglo Original ==========");
            System.out.println("valor en pocicion [" + i + "]");
            System.out.println(ArrayDataPositive[i]);
        }
        System.out.println("==============================================================================");
        for (int i = 0; i <5 ; i++)
        {
            if (ArrayDataPositive[i] % 2 != 0)
            {
                ArrayDataPositive[i] = ArrayDataPositive [i] * -1;
            }
            System.out.println("/n");
            System.out.println("========== Arreglo con impares positivos ==========");
            System.out.println("valor en pocicion [" + i + "]");
            System.out.println(ArrayDataPositive[i]);
        }

    }
}
