package Logic02;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal03 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            int angka = 0;
            int bil = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1 || i == j || j + i == n-1) {
                    System.out.print(angka + "\t");
                } else {
                    System.out.print("\t");
                }
                angka += 2;

            }
            System.out.println();
        }
    }
}
