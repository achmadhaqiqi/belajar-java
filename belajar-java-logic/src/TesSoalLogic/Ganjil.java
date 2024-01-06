package TesSoalLogic;

import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai N");
        int n = scanner.nextInt();

        // Mendeklarasikan array untuk menyimpan bilangan ganjil terbalik
        int[] deretGanjilTerbalik = new int[n];

        // Mengisi array dengan bilangan ganjil terbalik
        for (int i = 0; i < n; i++) {
            deretGanjilTerbalik[i] = 2 * (n - i) - 1;
        }

        // Menampilkan deret bilangan ganjil terbalik dari array
        System.out.println("Deret bilangan ganjil terbalik:");
        for (int i = 0; i < n; i++) {
            System.out.print(deretGanjilTerbalik[i] + " ");
        }

    }

}

