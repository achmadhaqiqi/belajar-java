package Logic01;

import java.util.Scanner;

    public class SoalLogicDasar1 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Nilai N");
            int n = input.nextInt();


            int[] fibo = new int[n];

            for (int i = 0; i <= n; i++) {
                fibo[i] = 2 * i - 1;

            }

            int[][] array = new int[n][n];


            int index = 0;
            int nTengah = n / 2;
            for (int i = 0; i < n; i++) {
                int indexKolom = 0;

                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n-1 ) {

                        array[i][j] = fibo[indexKolom];
                    } if ( j == 0 || j == n-1 || i == j || j + i == n-1 ) {
                        array[i][j] = fibo[index];
                    }

                    if (j < nTengah) {
                        indexKolom++;
                    } else {
                        indexKolom--;
                    }
                }

                if (i < nTengah) {
                    index++;
                } else {
                    index--;
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


