import java.sql.SQLOutput;

public class IfStatement2 {
    public static void main(String[] args) {

        var nilai = 80;
        var absensi = 75;

        var LulusNilai = nilai >= 75;
        var lulusAbsensi = absensi >= 70;

        var Lulus = LulusNilai && lulusAbsensi;

        if (nilai <=80 && absensi <=75){
            System.out.println("Nilai Baik");
        } else if (nilai <=75 && absensi <=70) {
            System.out.println("Nilai Kurang Baik");
        } else if (nilai <=70 && absensi <=65) {
            System.out.println("Nilai Buruk");
        }
    }
}
