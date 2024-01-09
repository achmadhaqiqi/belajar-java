package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal06 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] bilAsli = DeretAngka.bilanganAsli(n*3-2);

        int[][] array = new int[n][n];
        int index = n-1;
        int lastIndex = n*3-3;

        for (int i = 0; i < n; i++) {
            array[n-1][i] = bilAsli[index];
            array[i][i] = bilAsli[lastIndex];
            array[i][0] = bilAsli[i];
            index++;
            lastIndex--;


        }
        PrintArray.printArray(array);
    }
}
