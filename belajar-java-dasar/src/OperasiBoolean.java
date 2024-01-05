public class OperasiBoolean {

    public static void main(String[] args) {

        var Absensi = 87;
        var UN = 60;

        boolean LulusAbsen = Absensi<=85;
        boolean LulusUN = UN<70;

        var Lulussekolah = LulusAbsen&&LulusUN;
        System.out.println(Lulussekolah);
    }
}
