package TesSoalLogic;

import java.util.Scanner;

public class SoalLogicDasar2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai N");

        int n = input.nextInt();
        int[] deretGanjilTerbalik = new int[n];
        for (int i = 0; i < n; i++) {
            deretGanjilTerbalik[i] = 2 * (n - i) - 1;
        }


        int[][] array = new int[n][n];

        int index = 0;
        int nTengah = n / 2;
        int indexTengah = index + nTengah;


        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            int indexKolomTengah = indexKolom + nTengah;


            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    array[i][j] = deretGanjilTerbalik[indexKolomTengah];
                }
                if (j == 0 || j == n - 1 || i == j || j + i == n - 1) {
                    array[i][j] = deretGanjilTerbalik[indexTengah];
                }

                if (j < nTengah) {
                    indexKolomTengah++;
                } else {
                    indexKolomTengah--;
                }
            }

            if (i < nTengah) {
                indexTengah++;
            } else {
                indexTengah--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (array[i][j] == 0) {
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }


            System.out.println();

        }
    }
}
