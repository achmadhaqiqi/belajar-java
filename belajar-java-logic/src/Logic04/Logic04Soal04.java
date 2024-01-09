package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal04 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n, 2);

        int[][] array = new int[n][n];
        int lastIndex = n-1;

        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[i];
            array[i][0] = fibo[i];
            array[n-1][i] = fibo[lastIndex];
            array[i][n-1] = fibo[i];
            array[n/2][i] = fibo[i];
            array[i][n/2] = fibo[i];
            lastIndex--;

        }
        PrintArray.printArray(array);
    }
}
