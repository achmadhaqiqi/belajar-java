package LogicDenganMethod;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal06 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = DeretAngka.bilanganPrima(n);
        PrintArray.printArray(array);


    }
}
