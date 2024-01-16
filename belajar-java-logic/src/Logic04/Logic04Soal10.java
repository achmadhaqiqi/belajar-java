package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal10 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = InputData.input(scanner);
        if (n < 0){
            n = n*(-1);
        }
        int[] fibo = DeretAngka.fibo(n*n*n, 3);
        int[] fiboModif = new int[n*n*n];
        for (int i = 0; i < n*n*n; i++) {
            if (i % n == n-1){
                fiboModif[i] = (-n);
            } else {
                fiboModif[i] = fibo[i];
            }

        }
        int p = (n*n) + (n-1);

        int[][] array = new int[n][p];
        int geser = 0;

        for (int b = 1; b <=n ; b++) {
            int index = 0;
            for (int i = 0; i < n; i++) {
                array[n-1][i + geser] = fiboModif[index];
                index ++;

            }
            for (int i = 1; i < n; i++) {
                array[n-1 - i][n-1 + geser] = fiboModif[index];
                index ++;

            }
            for (int i = 1; i < n; i++) {
                array[0][n-1 -i + geser] = fiboModif[index];
                index++;

            }
            for (int i = 1; i < (n-1) ; i++) {
                array[i][0 + geser] = fiboModif[index];
                index++;

            }
            geser = geser + (n+1);

        }
        PrintArray.printArray(array);
        PrintArray.printArray(fiboModif);


    }
}
