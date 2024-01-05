package LogicDenganMethod;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal10 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] Ganjil = DeretAngka.ganjil(n);

        int[][] array = new int[n][n];
        int nTengah = n/2;
        int indexBaris = 0;


        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (j - i >= nTengah && i <= nTengah && j >= nTengah){
                    array[i][j] = Ganjil[indexBaris];
                } if (j + i <= nTengah && i <= nTengah && j <= nTengah){
                    array[i][j] = Ganjil[indexBaris];
                } if (i - j >= nTengah && i >= nTengah && j <= nTengah){
                    array[i][j] = Ganjil[indexBaris];
                } if (i + j >= n-1 + nTengah && i >= nTengah && j >= nTengah){
                    array[i][j] = Ganjil[indexBaris];
                }

            }

        }
        PrintArray.printArray(array);

    }
}
