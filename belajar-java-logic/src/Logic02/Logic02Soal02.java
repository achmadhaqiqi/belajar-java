package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal02 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[][] array = new int[n][n];
        //baris
        for (int i = 0; i < n; i++) {
            int angka = 1;
            // kolom
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == 8 || j == 8) {
                    array[i][j] = angka;

                } else {
                    array[i][j] = 0;
                }
                angka += 2;

            }

        }
        PrintArray.printArray(array);
    }
}