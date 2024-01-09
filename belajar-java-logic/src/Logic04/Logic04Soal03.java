package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal03 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] genap = DeretAngka.Genap(n);
        int[][] array = new int[n][n];

        int lastIndex = n-1;

        for (int i = 0; i < n; i++) {
            array[n-1-i][i] = genap[lastIndex];
            array[0][i] = genap[i];
            array[i][0] = genap[i];
            array[n-1][i] = genap[lastIndex];
            array[i][n-1] = genap[lastIndex];
            array[i][i] = genap[i];

            lastIndex--;
        }

        PrintArray.printArray(array);
    }
}
