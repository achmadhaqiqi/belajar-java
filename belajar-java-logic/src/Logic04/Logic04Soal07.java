package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal07 {
    public static void main(String[] args) {


        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = DeretAngka.ganjil(n * 4 + 1);
        int angka = 1;
        if (angka % n == 0){
            ganjil[angka] = 999;

        }
        int nTengah = n/2;

        int[][] array = new int[n][n * (n - 1) + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n* (n-1)+1; j++) {

                    array[i][0] = ganjil[n-1-i];
                    array[0][i] = ganjil[n +i] ;
                    array[n-1-i][n - 1] = 33;
                    array[n-1-i][n+n-2] = 2;
                    array[i][n*(n-1)] = 999;
                    array[n-1][i+n-1] = 999;
                    array[0][n+i+n-2] = 999;
                    if (n == 5) {
                        array[i][n*2+2] = 999;
                        array[n-1][n*2+2+i] = 999;
                        array[i][n*3+1] = 999;
                        array[0][n*3+1+i] = 999;
                    }

            }

        }
        PrintArray.printArray(array);
    }
}


