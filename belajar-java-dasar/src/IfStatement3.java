public class IfStatement3 {
    public static void main(String[] args) {

        var nilai = 65;
        var absensi = 65;
        var kedisipiinan = 96;

        if (nilai <=75 || absensi <=75){
            System.out.println("Nilai Baik");
        } else if (nilai<=80 || absensi <=80){
            System.out.println("Nilai Sangat Baik");
        } else if (nilai <=70 || absensi <=70) {
            System.out.println("Nilai Kurang");
        }
    }

}
