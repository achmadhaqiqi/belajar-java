package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal02b {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = new int[n];

        int angka = 1;

        for (int i = 0; i < n; i++) {
            if (angka % 3 == 0){
                array[i] = angka * angka;
            } else {
                array[i] = angka;
            }
            angka++;
        }
        PrintArray.printArray(array);
    }
}
