package LogicDenganMethod;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal01 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == 8) {
                    array[i][j] = angka;
                } else {
                    array[i][j] = 0;
                }
                angka++;
            }

        }
        PrintArray.printArray(array);

    }
}
