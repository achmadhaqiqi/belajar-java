package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal08 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = InputData.input(scanner);
        if (n < 0){
            n = n *(-1);
        }
        int p = (n*n) + (n-1);
        int[] bilAsli = DeretAngka.asliModif(n*n*n, n, -n);

        int[][] array = new int[n][p];

        int geser = 0;
        for (int b = 1; b <= n ; b++) {
            int index = 0;
            //bawah
            for (int i = 0; i < n; i++) {
                array[n-1] [i+geser] = bilAsli[index];
                index++;

            }
            for (int i = 1; i < n; i++) {
                array[n-i-1][n-1 + geser] = bilAsli[index];
                index++;

            }
            for (int i = 1; i < n; i++) {
                array[0][n-i-1 + geser] = bilAsli[index];
                index++;

            }
            for (int i = 1; i < n-1; i++) {
                array[i][0 + geser] = bilAsli[index];
                index++;

            }
            geser += n+1;

        }
        PrintArray.printArray(array);
        PrintArray.printArray(bilAsli);
    }
}
