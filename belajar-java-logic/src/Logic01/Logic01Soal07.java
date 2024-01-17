package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal07 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        char[] huruf = DeretAngka.huruf(n);

        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            array[i] = huruf[i];

        }
        PrintArray.printArray(array);


    }



}
