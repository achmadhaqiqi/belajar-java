package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal07 {
    public static void main(String[] args) {


        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = DeretAngka.ganjil(n*4+1);

        int[][] array = new int[n][n*2];

        for (int i = 0; i < n; i++) {
        }
    }
}
