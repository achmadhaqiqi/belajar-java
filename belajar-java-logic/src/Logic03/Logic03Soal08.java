package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal08 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = DeretAngka.ganjil(n);

        int[][] array = new int[2][n];

        for (int i = 0; i < n; i++) {
            array[0][i] = ganjil[i];
            if (i % 3 == 2){
                array[0][i] *= array[0][i];
            } if ( i % 4 == 0){
                array[1][i] = 9;
            } if (i % 4 == 1){
                array[1][i] = 99;
            } if (i % 4 == 2){
                array[1][i] = 999;
            } if (i % 4 == 3){
                array[1][i] = 9999;
            } if (i % 3 == 0){
                array[1][i]  = array[0][i] * i;
            }
        }
        PrintArray.printArray0(array);
    }
}
