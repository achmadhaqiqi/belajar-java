package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal05 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n,3);
        char[] huruf = DeretAngka.huruf(n);

        String[][] array = new String[n][n];
        int nTengah = n/2;

        for (int i = 0; i < n; i++) {
            int indexKolom = 0;

            for (int j = 0; j < n; j++) {

            if (i + j <= n-1 && i >= j && j < nTengah){
                array[i][j] = String.valueOf(huruf[j]);
            } else if (i + j >= n-1 && i <= j) {
                array[i][j] = String.valueOf(fibo[j]);
            }
            indexKolom++;

        }

        }
        PrintArray.printArray(array);

    }
}
