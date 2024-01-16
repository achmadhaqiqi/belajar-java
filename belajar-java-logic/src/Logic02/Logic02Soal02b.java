package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal02b {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[][] array = new int[n][n];
        int[] asli = DeretAngka.bilanganAsli(n);

        for (int i = 0; i < n; i++) {
        //    array[i][i] = asli[i];
            array[n-1-i][n-1-i] = asli[i];


        }
        PrintArray.printArray(array);

    }
}
