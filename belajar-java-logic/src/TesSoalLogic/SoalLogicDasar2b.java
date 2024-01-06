package TesSoalLogic;

import Utils.PrintArray;

import java.util.Scanner;

public class SoalLogicDasar2b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai N");

        int n = input.nextInt();
        int[] ganjilTerbalik = new int[n];
        for (int i = 0; i < n ; i++) {
            ganjilTerbalik[i] = 2 * (n - i) - 1;
        }

        int [][] array = new int[n][n];
        int nTengah = n/2;
        int index = 0;
        int indexTengah = index + nTengah;

        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            int indexKolomTengah = indexKolom + nTengah;

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1){
                    array[i][j] = ganjilTerbalik[indexKolomTengah];
                } if (i + j == n-1 || i == j || j == 0 || j == n-1) {
                    array[i][j] = ganjilTerbalik[indexTengah];
                }
                if (j < nTengah){
                    indexKolomTengah ++;
                } else {
                    indexKolomTengah --;
                }

            }

            if (i < nTengah) {
                indexTengah ++;
            } else {
                indexTengah --;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 if (array[i][j] == 0){
                     System.out.print("\t");
                     continue;
                 }
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();

        }

        PrintArray.printArray(array);




    }
}
