package LogicDenganMethod;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal01 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] array = DeretAngka.bilanganAsli(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {

            }
            PrintArray.printArray(array);

        }
    }
}
