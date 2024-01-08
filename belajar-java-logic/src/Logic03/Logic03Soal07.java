package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal07 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] bilAsli = DeretAngka.bilanganAsli(n);

        int[][] array = new int[2][n];


        for (int i = 0; i < n; i++) {
            array[0][i] = bilAsli[i];
            if (i % 3 == 2){
                array[0][i] = bilAsli[i] * bilAsli[i];

            } if ( i % 4 == 0){
                array[1][i] = 9;
            } if (i % 4 == 1){
                array[1][i] = 99;
            } if (i % 4 == 2){
                array[1][i] = 999;
            } if (i % 4 == 3){
                array[1][i] = 9999;
            }

        }
        PrintArray.printArray0(array);
    }
}
