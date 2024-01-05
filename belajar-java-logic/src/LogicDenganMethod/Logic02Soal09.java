package LogicDenganMethod;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal09 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] Ganjil = DeretAngka.ganjil(n);

        int[][] array = new int[n][n];
        int indexBaris = 0;
        int nTengah = n / 2;

        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (j - i <= nTengah && i <= nTengah && j >= nTengah) {
                    array[i][j] = Ganjil[indexBaris];
                }
                if (j + i >= nTengah && i <= nTengah && j <= nTengah) {
                    array[i][j] = Ganjil[indexBaris];
                }
                if (i - j <= nTengah && i >= nTengah && j <= nTengah){
                    array[i][j] = Ganjil[indexKolom];
                }
                if (i + j <= n-1 + nTengah && i >= nTengah && j >= nTengah){
                    array[i][j] = Ganjil[indexKolom];
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


