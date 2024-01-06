package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal09 {
    public static void main(String[] args) {
         int n = InputData.input(new Scanner(System.in));
          int[] kaliTiga = DeretAngka.kaliTiga(n, 5);

        PrintArray.printArray(kaliTiga);
    }
}
