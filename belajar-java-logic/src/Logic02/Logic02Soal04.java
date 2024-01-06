package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal04 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n,2);

        int[][] array = new int[n][n];
        int nTengah = n/2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == nTengah || i == n-1 || j == 0 || j == nTengah || j == n-1){
                    array[i][j] = fibo[j];
                } else {
                    array[i][j] = 0;
                }

            }

        }
        PrintArray.printArray(array);
    }
}
