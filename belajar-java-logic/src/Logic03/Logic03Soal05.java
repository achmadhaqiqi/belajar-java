package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal05 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n, 3);

        int[][] array = new int[2][n];

        int index = 3;
        int value = 3;

        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[i];
            if (i == index) {
                array[1][i] = 999;
                index = index + value;
                value --;


            } if (value < 2){
                value = 4;

            }
        }
        PrintArray.printArray0(array);
    }
}
