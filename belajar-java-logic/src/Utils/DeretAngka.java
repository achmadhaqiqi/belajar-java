package Utils;

public class DeretAngka {
    public static int[] fibo(int n, int t) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < t) {
                array[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= t; j++) {
                result = result + array[i - j];
            }
            array[i] = result;
        }
        return array;
    }

    public static int[] pangkat(int n, int p) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            double angka = (double) i + 1;
            double hasil = Math.pow(angka, (double) p);
            array[i] = (int) hasil;
        }
        return array;
    }

    public static int[] ganjilTerbalik(int n) {
        int[] ganjilTerbalik = new int[n];
        for (int i = 0; i < n; i++) {
            ganjilTerbalik[i] = 2 * (n - i) - 1;
        }
        return ganjilTerbalik;

    }

    public static int[] ganjil(int n) {
        int[] ganjil = new int[n];
        for (int i = 0; i < n; i++) {
            ganjil[i] = 2 * i +1;

        }
        return ganjil;

    }

    public static int[] bilanganAsli(int n) {
        int [] bilanganAsli = new int[n];
        for (int i = 0; i < n; i++) {
            bilanganAsli[i] = i + 1;

        }
        return bilanganAsli;
    }

    public static int[] Genap(int n) {
        int[] Genap = new int[n];
        for (int i = 0; i < n; i++) {
            Genap[i] = 2 * i;
        }
        return Genap;
    }

    public static int[] bilanganPrima(int n) {
        int[] bilPrima = new int[n];
        int index = 0;
        int angka = 2;

        while (index < n){
            if (isiPrima(angka)){
                bilPrima[index] = angka;
                index++;
            }
            angka++;
        }
        return bilPrima;
    }

    public static boolean isiPrima(int angka){
        if (angka < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka) ; i++) {
            if (angka % i == 0){
                return false;
            }
        }
        return true;
    }

    public static char[] huruf (int n){
        char karakter = 'A';
        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            array[i] = karakter;

            karakter ++;

        }
        return array;

    }

    public static String[] hurufDanAngka(int n){
        String[] array = new String[n];
        int angka = 2;
        char huruf = 'A';
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = String.valueOf(huruf);
                huruf+=2;
            } else {
                array[i] = String.valueOf(angka);
                angka+=2;
            }

        }
        return array;




    }

    public static int[] kaliTiga (int n, int t){
        int[] kaliTiga = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0){
                kaliTiga[i] = 1;
            } else {
                kaliTiga[i] = kaliTiga[i -1] *t;
            }

        }
        return kaliTiga;


    }
    public static int[] genapTerbalik(int n) {
        int[] genapTerbalik = new int[n];
        for (int i = 0; i < n; i++) {
            genapTerbalik[i] = 2 * (n - (i +1) );
        }
        return genapTerbalik;

    }

    public static int[] asliTerbalik(int n) {
        int[] asliTerbalik = new int[n];
        for (int i = 0; i < n; i++) {
            asliTerbalik[i] = (i + 1) * n;

        }
        return asliTerbalik;
    }

    public static int[] ganjilPrefix(int n, int position, int prefix){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            if (i % position == position - 1) {
                array[i] = prefix;
            } else {
                array[i] = (i * 2) + 1;
            }
        }
        return array;
    }

    public static int[] asliModif(int n, int position, int prefix){
        int[] array = new int[n];
        int angka = 1;
        for (int i = 0; i <n; i++) {
            if (i%position == position-1){
                array[i] = prefix;
            } else {
                array[i] = angka;
            }
            angka++;

        }
        return array;
    }
    
}



