package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal01 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = new int[n];

        int value = 0;

        for (int i = 0; i < n; i++) {

            if (value < 3){
                array[i] = i + 1;
                value ++;

            } else {
                array[i] = (i * 1) + (i * 1);
                value = 0;
            }

        }
        PrintArray.printArray(array);


        }
    }

