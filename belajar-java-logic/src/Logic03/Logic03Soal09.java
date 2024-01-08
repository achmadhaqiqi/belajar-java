package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal09 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = InputData.input(scanner);

        int[] genap = DeretAngka.Genap(n);
        int[] genapTerbalik = DeretAngka.genapTerbalik(n);
        int[] genapTerbalik1 = new int[n];
        for (int i = 0; i < n; i++) {
            genapTerbalik1[i] = 4 * (n/2 -i);

        }

        int[][] array = new int[2][n];
        int nTengah = n / 2;
        int index = 0;

        for (int i = 0; i < n; i++) {
            array[0][i] = genap[i];
            if (i <= nTengah) {
                array[1][i] = genapTerbalik1[index];
                index ++;

            } else {
                array[1][i] = genapTerbalik1[index];
                index ++;

            }

        }
        PrintArray.printArray0(array);
    }
}