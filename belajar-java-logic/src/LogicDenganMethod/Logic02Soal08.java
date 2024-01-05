package LogicDenganMethod;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal08 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n, 2);

        int[][] array = new int[n][n];
        int indexBaris = 0;
        int nTengah = n/2;

        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i <= j && i <= nTengah && j >=nTengah){
                    array[i][j] = fibo[indexBaris];
                }
                if (i + j >= n-1 && i >= j && i >= nTengah && j <= nTengah){
                    array[i][j] = fibo[indexBaris];
                }
                if (j < nTengah){
                    indexKolom++;
                } else {
                    indexKolom--;
                }

            }
            if (i < nTengah){
                indexBaris++;
            } else {
                indexBaris--;
            }

        }
        PrintArray.printArray(array);
    }
}
