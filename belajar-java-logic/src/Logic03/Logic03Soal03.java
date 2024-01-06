package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal03 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[][] array = new int[2][n];

        int angka = 0;

        for (int i = 0; i < n; i++) {
            array[0][i] = angka;
            angka += 2;

            if (i % 3 == 0) {
                array[1][i] = (i * i) * i;

                } else {
                    array[1][i] = 999;
                }

            }
        PrintArray.printArray0(array);
        }

    }


