public class Switch {
    public static void main(String[] args) {
        var nilai = "G";

        switch (nilai){
            case "A":
                System.out.println("Nilai Anda Memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup");
                break;
            case "D":
                System.out.println("Nilai Anda Kurang");
                break;
            default:
                System.out.println("Anda Kurang Belajar");

        }
    }
}
