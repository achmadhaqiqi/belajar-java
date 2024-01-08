package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal06 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] prima = DeretAngka.bilanganPrima(n);

        int[][] array = new int[2][n];

        for (int i = 0; i < n; i++) {
            array[0][i] = prima[i];
            if (i % 3 == 2){
                array[1][i] = 999;
            } else {
                array[1][i] = 33;
            }


        }
        PrintArray.printArray0(array);


    }
}
