public class MethodParameter1 {
    public static void main(String[] args) {

        panggilNama("Mesut ", "Ozil");
        panggilNama("Alex ", "Pereira");

        value(18,16,17);

        System.out.println(penjumlahan(12, 15));

        System.out.println(namaLengkap("Dani", "Pedrosa"));

    }


    static void panggilNama(String firstName, String lastName) {
        System.out.println("Selamat Siang " + firstName + lastName);
    }

    static void value(int nilai1, int nilai2, int nilai3) {
         if (nilai1 > nilai2) {
            System.out.println("Nilai 1 Lebih Baik dari Nilai 2");
        } else if (nilai1 > nilai3) {
            System.out.println("Nilai 1 Lebih Baik dari Nilai 3");
        } else if (nilai2 > nilai1) {
            System.out.println("Nilai 2 Lebih Baik dari Nilai 1");
        } else if (nilai2 > nilai3) {
            System.out.println("Nilai 2 Lebih Baik dari Nilai 3");
        } else {
            System.out.println("Kamu belum mengerjakan Ujian");
        }
    }

    static int penjumlahan (int nilai1, int nilai2){
       int tambah = nilai1 + nilai2;
       return tambah;
    }

    static String namaLengkap (String namaPertama, String namaKedua){
        String namaLengkap = namaPertama + namaKedua;
        return namaLengkap;
    }
}
