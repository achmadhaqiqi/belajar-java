package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal08b {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] genap = DeretAngka.bilanganAsli(n);
        char[] huruf = DeretAngka.huruf(n);

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                array[i] = String.valueOf(huruf[i]);
            } else {
                array[i] = String.valueOf(genap[i]);
            }

        }
        PrintArray.printArray(array);


    }
}
