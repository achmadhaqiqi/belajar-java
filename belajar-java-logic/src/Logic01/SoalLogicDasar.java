package Logic01;

import java.util.Scanner;

public class SoalLogicDasar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai N");

        int n = input.nextInt();

        //membuat deret fibo
        int[] fibo = new int[n];
        for (int i = 0; i <n ; i++) {
            if (i < 2){
                fibo[i] = 1;
            } else {
                fibo[i] = fibo[i -1] + fibo[i -2];
            }
        }
        int[][] array = new int[n][n];
        int nTengah = n/2;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1){
                    array[i][j] = fibo[indexKolom];
                } if (i + j == n-1 || j == 0 || i == j || j == n-1){
                    array[i][j] = fibo[index];
                } if (indexKolom < nTengah){
                    indexKolom ++;
                } else {
                    indexKolom --;
                }

            }
            if (index < nTengah){
                index ++;
            } else {
                index --;
        }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                } else {
                    System.out.print(array[i][j] + "\t");
                }

            }
            System.out.println();

        }

    }
}
