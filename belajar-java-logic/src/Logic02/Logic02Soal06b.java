package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal06b {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n, 3);

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i + j <= n-1 && j >= i){
                    array[i][j] = fibo[i];
                } else if (i + j >= n-1 && j <= i){
                    array[i][j] = fibo[i];
                } else {
                    array[i][j] = 0;
                }

            }


        }
        PrintArray.printArray(array);
    }
}
