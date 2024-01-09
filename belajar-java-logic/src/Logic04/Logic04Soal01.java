package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import javax.swing.*;
import java.util.Scanner;

public class Logic04Soal01 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] bilAsli = DeretAngka.bilanganAsli(n);

        int[][] array = new int[n][n];
        int indexbaris = 0;
        for (int i = 0; i < n; i++) {
            int indexkolom = 0;
            int indexterakhir = n -1;


            for (int j = 0; j < n; j++) {
                if (indexbaris % 2 == 0){
                    array[i][j] = bilAsli[indexkolom];
                    indexkolom++;
                } else {
                    array[i][j] = bilAsli[indexterakhir];
                    indexterakhir--;
                }

            }
            indexbaris ++;


        }
        PrintArray.printArray(array);
    }
}
