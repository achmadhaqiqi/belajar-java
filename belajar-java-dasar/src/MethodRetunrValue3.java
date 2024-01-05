public class MethodRetunrValue3 {
    public static void main(String[] args) {

      String namaLengkap = sum("Achmad", "Haqiqi", "Maverick", "Marquez", "Marini");

      System.out.println(hitung(15, "*", 14));
        System.out.println(hitung(10, "+", 10));
        System.out.println(hitung(14, "/", 2));
    }


    static String sum(String nama1, String nama2, String nama3, String nama4, String nama5 ){
        String namaPanjang = nama1 + nama2;
        String namaPendek = nama1;
        String namaPanjangbgt = nama1 + nama3 + nama2 + nama5;

        return namaPanjangbgt;
    }

    static int hitung (int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default :
                return 0;
        }
    }
}
