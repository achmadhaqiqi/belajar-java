package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal07a {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int nTengah = n/2;
        int p = (n*(n-1))+1;
        int[][] array = new int[n][p];
        int[] deret = DeretAngka.ganjilPrefix(n*n*n, n, 999);
        int index = 0;
        int geser = 0;
        for (int b = 1; b <= n ; b++) {
            // kiri bawah atau kiri atas
            int start = b== 1 ? 0 : 1;

            for (int i = start; i <= nTengah; i++) {
                if (b%2 ==1) {
                    array[nTengah-i][0 + geser] = deret[index];
                } else {
                    array[nTengah+i][0 + geser] = deret[index];
                }

                index++;
            }

            //atas atau bawah
            for (int i = 1; i < n ; i++) {
                if (b%2 == 1 ){
                    array[0][i + geser] = deret[index];
                } else {
                    array[n - 1][i + geser] = deret[index];
                }

                index ++;

            }
            //kanan atas atau kanan bawah
            for (int i = 1; i <= nTengah ; i++) {
                if (b%2 == 1){
                    array[i][n -1 + geser] = deret[index];
                } else {
                    array[n -1 - i][n -1 + geser] = deret[index];
                }
                index ++;

            }
            geser+= n-1;

        }
        PrintArray.printArray(array);
    }
}
