package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal10 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = InputData.input(scanner);

        int[] fibo = DeretAngka.fibo(n, 2);

        int [][] array = new int[2][n];
        int index = 1;

        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[i];
            array[1][i] = fibo[index];
                if (i < n/2){
                    index ++;
                } else {
                    index --;
                }
            }
        PrintArray.printArray(array);

        }

    }
