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
        int indexTengah = n/2;

        for (int i = 0; i < n; i++) {
           array[i][i] = asli[indexTengah];
           array[n-1-i][i] = asli[indexTengah];
           array[0][i] = asli[indexTengah];
           array[i][0] = asli[indexTengah];
           array[n-1-i][n-1] = asli[indexTengah];
           array[n-1][n-1-i] = asli[indexTengah];


        }
        PrintArray.printArray(array);

    }
}
