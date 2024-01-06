package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal02a {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = new int[n];

        int angka = 1;

        for (int i = 0; i < n; i++) {
            if (i % 4 == 3)
                array[i] = 999;
            else if (i % 3 ==2) {
                array[i] = angka * angka;
            } else
                array[i] = angka;

            angka+=2;
        }
        PrintArray.printArray(array);

    }

}