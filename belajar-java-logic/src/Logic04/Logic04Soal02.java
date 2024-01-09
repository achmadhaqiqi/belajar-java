package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal02 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = InputData.input(scanner);

        int[] ganjil = DeretAngka.ganjil(n);

        int[][] array = new int[n][n];
        int indexTerakhir = n-1;


        for (int i = 0; i < n; i++) {
            array[0][i] = ganjil[i];
            array[i][0] = ganjil[i];
            array[n-1][i] = ganjil[indexTerakhir];
            array[i][n-1] = ganjil[indexTerakhir];
            indexTerakhir--;

        }
        PrintArray.printArray(array);
    }
}

